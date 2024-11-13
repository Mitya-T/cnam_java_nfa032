package cnam;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.IOException;

public class SVGImage {
    private int width;
    private int height;
    private ArrayList<SVGShape> shapes;

    public SVGImage(int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes = new ArrayList<>();
    }

    public void addShape(SVGShape shape) {
        this.shapes.add(shape);
    }

    public void saveToFile(String filename) {
        try (PrintWriter out = new PrintWriter(filename)) {
            out.println("<svg width=\"" + this.width + "\" height=\"" + this.height + "\" xmlns=\"http://www.w3.org/2000/svg\">");
            for (SVGShape shape : this.shapes) {
                out.println(shape.toSVGString());
            }
            out.println("</svg>");
            System.out.println("Saved to C:\\Users\\dmitr\\IdeaProjects\\first");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Add the getWidth method
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
