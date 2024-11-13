package cnam;

import java.util.ArrayList;

public class BarChart {
    private SVGImage image;
    private int margin;
    private int columnWidth;
    private int height;
    private int maxValue;
    private int maxBarHeight;
    private ArrayList<SVGShape> shapes;
    private int fontSize;
    private int barOffset;

    public BarChart(int width, int height, int margin, int columnWidth) {
        this.image = new SVGImage(width, height);
        this.margin = margin;
        this.columnWidth = columnWidth;
        this.height = height;
        this.shapes = new ArrayList<>();
        this.maxValue = 20;
        this.maxBarHeight = height - 3 * margin;
        this.fontSize = 11;
        this.barOffset = 10;
    }

    public void addData(String label, int value) {
        int x = this.margin + this.shapes.size() / 2 * (this.columnWidth + this.margin) + this.barOffset;
        int barHeight = (int) ((double) value / this.maxValue * this.maxBarHeight);
        SVGRectangle bar = new SVGRectangle(x, this.height - this.margin - barHeight - 20, this.columnWidth, barHeight, "red");
        this.image.addShape(bar);
        SVGText labelText = new SVGText(x, this.height - this.margin + 5, label, this.fontSize);
        this.image.addShape(labelText);
        this.shapes.add(bar);
        this.shapes.add(labelText);
    }

    public void addAxes(int xPos, int yPos) {
        SVGLine xAxis = new SVGLine(this.margin, yPos, xPos, yPos, "black");
        this.image.addShape(xAxis);
        SVGLine yAxis = new SVGLine(this.margin, this.margin, this.margin, yPos, "black");
        this.image.addShape(yAxis);
    }

    public SVGImage getImage() {
        addAxes(200, 170);
        return image;
    }

    public void loadDataFromCSV(CSVFile_2 csvFile) {
        for (int i = 0; i < csvFile.getRowCount(); i++) {
            String year = csvFile.getRowHeader(i);
            int value = csvFile.getData(i, 0);
            this.addData(year, value);
        }
    }
}
