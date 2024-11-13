package cnam;

import java.util.ArrayList;

public class LineChart {
    private SVGImage image;
    private int margin;
    private int height;
    private int maxValue;
    private int maxLineHeight;
    private ArrayList<SVGShape> shapes;
    private int fontSize;
    private int pointOffset;

    public LineChart(int width, int height, int margin) {
        this.image = new SVGImage(width, height);
        this.margin = margin;
        this.height = height;
        this.shapes = new ArrayList<>();
        this.maxValue = 20;
        this.maxLineHeight = height - 3 * margin;
        this.fontSize = 11;
        this.pointOffset = 20;
    }

    public void addData(ArrayList<String> labels, ArrayList<Integer> values) {
        StringBuilder pathData = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            int x = this.margin + i * (this.pointOffset + this.margin);
            int y = this.height - this.margin - (int) ((double) values.get(i) / this.maxValue * this.maxLineHeight);
            if (i == 0) {
                pathData.append("M").append(x).append(",").append(y);
            } else {
                pathData.append(" L").append(x).append(",").append(y);
            }
            SVGText labelText = new SVGText(x, this.height - this.margin , labels.get(i), this.fontSize);
            this.image.addShape(labelText);
        }
        SVGPath line = new SVGPath(pathData.toString(), "blue");
        this.image.addShape(line);
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
        ArrayList<String> labels = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < csvFile.getRowCount(); i++) {
            labels.add(csvFile.getRowHeader(i));
            values.add(csvFile.getData(i, 0));
        }
        addData(labels, values);
    }
}
