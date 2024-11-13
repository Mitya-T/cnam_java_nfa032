package cnam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_TP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chart type (bar/line): ");
        String chartType = scanner.nextLine();

        List<String[]> data = CSVReader_TP3.readCSV("E:\\apples.csv");

        ArrayList<String> labels = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 1; i < data.size(); i++) {
            String[] row = data.get(i);
            labels.add(row[0]);
            values.add(Integer.parseInt(row[1]));
        }

        if (chartType.equalsIgnoreCase("bar")) {
            BarChart chart = new BarChart(1000, 200, 10, 20);
            for (int i = 0; i < labels.size(); i++) {
                chart.addData(labels.get(i), values.get(i));
            }
            SVGImage image = chart.getImage();
            image.saveToFile("chart_bar.svg");
        } else if (chartType.equalsIgnoreCase("line")) {
            LineChart chart = new LineChart(1000, 200, 10);
            chart.addData(labels, values);
            SVGImage image = chart.getImage();
            image.saveToFile("chart_line.svg");
        } else {
            System.out.println("Invalid chart type.");
        }

        scanner.close();
    }
}