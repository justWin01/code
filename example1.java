
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class example1 extends JFrame {
    JMenu m;
    JButton b01, b02;

    example1() {
        // Your existing code...

        // Create the table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 3) {
                    return Boolean.class;
                }
                return super.getColumnClass(columnIndex);
            }
        };

        // Button action listener to write data to Excel
        b01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a workbook
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Attendance");

                // Write data to Excel
                for (int i = 0; i < data.length; i++) {
                    XSSFRow row = sheet.createRow(i);
                    for (int j = 0; j < data[i].length; j++) {
                        XSSFCell cell = row.createCell(j);
                        cell.setCellValue(data[i][j].toString());
                    }
                }

                try {
                    // Write the workbook to a file
                    FileOutputStream fileOut = new FileOutputStream("attendance.xlsx");
                    workbook.write(fileOut);
                    fileOut.close();
                    workbook.close();
                    JOptionPane.showMessageDialog(null, "Data has been inserted into Excel sheet.");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Your existing code...
    }

    public static void main(String[] args) {
        new example1();
    }
}
