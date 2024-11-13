package cnam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFile_2 {
    private String[] columnHeaders;
    private ArrayList<String> rowHeaders;
    private ArrayList<ArrayList<Integer>> data;

    public CSVFile_2(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        String headersLine = scanner.nextLine();
        this.columnHeaders = headersLine.split(",");

        this.data = new ArrayList<>();
        this.rowHeaders = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            ArrayList<Integer> rowData = new ArrayList<>();

            rowHeaders.add(values[0].trim());

            for (int i = 1; i < values.length; i++) {
                String trimmedValue = values[i].trim();
                int intValue = Integer.parseInt(trimmedValue);
                rowData.add(intValue);
            }

            this.data.add(rowData);
        }

        scanner.close();
    }

    public int getRowCount() {
        return this.data.size();
    }

    public int getColumnCount() {
        return this.columnHeaders.length;
    }

    public String getColumnHeader(int index) {
        return this.columnHeaders[index];
    }

    public String getRowHeader(int index) {
        return this.rowHeaders.get(index);
    }

    public int getData(int rowIndex, int columnIndex) {
        return this.data.get(rowIndex).get(columnIndex);
    }

    public void printData() {
        System.out.println("Column Headers:");
        for (String header : this.columnHeaders) {
            System.out.print(header + "\t");
        }
        System.out.println("\nRow Headers:");
        for (String header : this.rowHeaders) {
            System.out.println(header);
        }
        System.out.println("\nData:");
        for (ArrayList<Integer> row : this.data) {
            for (Integer value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
