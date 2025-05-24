<?php
// Create a TCP/IP socket
$client = socket_create(AF_INET, SOCK_STREAM, SOL_TCP);
if (!$client) {
    die("Socket creation failed: " . socket_strerror(socket_last_error()) . "\n");
}

// Connect to the server
if (!socket_connect($client, "192.168.84.99", 8080)) {
    die("Socket connection failed: " . socket_strerror(socket_last_error($client)) . "\n");
}

// Send message to server
$message = "Hello from client!";
if (!socket_write($client, $message, strlen($message))) {
    die("Socket write failed: " . socket_strerror(socket_last_error($client)) . "\n");
}

// Read response from server
$response = socket_read($client, 1024);
if ($response === false) {
    die("Socket read failed: " . socket_strerror(socket_last_error($client)) . "\n");
}

echo "Received from server: $response\n";

// Close socket
socket_close($client);
?>