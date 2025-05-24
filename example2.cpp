#include <iostream>

// D.R.Y.  Dont repeat yourself

using namespace std;

class OOP2 {
private:
    int num1;
    int num2;

public:
    OOP2(int num1, int num2) : num1(num1), num2(num2) {}

    int getnum1() const {
        return num1;
    }

    int getnum2() const {
        return num2;
    }

    int getSum() const {
        return num1 + num2;
    }

    int getMinus() const {
        return num1 - num2;
    }

    int getMult() const {
        return num1 * num2;
    }

    int getDiv() const {
        if (num2 == 0) {
            cerr << "Error: Division by zero!" << endl;
            return 0;
        }
        return num1 / num2;
    }

    int getMod() const {
        if (num2 == 0) {
            cerr << "Error: Division by zero!" << endl;
            return 0;
        }
        return num1 % num2;
    }
};

int main() {
    int num1, num2;

    cout << "Enter a First Number: ";
    cin >> num1;

    cout << "Enter a Second Number: ";
    cin >> num2;

    OOP2 obj(num1, num2);
    cout << "num1: " << obj.getnum1() << endl;
    cout << "num2: " << obj.getnum2() << endl;
    cout << "\n";
    cout << "Add all Number: " << obj.getSum() << endl;
    cout << "Minus all Number: " << obj.getMinus() << endl;
    cout << "Mult all Number: " << obj.getMult() << endl;
    cout << "Div all Number: " << obj.getDiv() << endl;
    cout << "Mod all Number: " << obj.getMod() << endl;

    return 0;
}
