package cnam;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_TP3_upd {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String filePath = "E:\\apples.csv";

        System.out.println("Enter chart type (bar/line): ");
        String chartType = inputScanner.nextLine();

        try {
            CSVFile_2 data = new CSVFile_2(filePath);
            SVGImage image;

            if (chartType.equalsIgnoreCase("bar")) {
                BarChart chart = new BarChart(1000, 200, 10, 20);
                chart.loadDataFromCSV(data);
                image = chart.getImage();
                image.saveToFile("barchart.svg");
            } else if (chartType.equalsIgnoreCase("line")) {
                LineChart chart = new LineChart(1000, 200, 10);
                chart.loadDataFromCSV(data);
                image = chart.getImage();
                image.saveToFile("linechart.svg");
            } else {
                System.out.println("Invalid chart type.");
                return;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            inputScanner.close();
        }
    }
}
