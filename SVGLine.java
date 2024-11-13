package cnam;

public class SVGLine extends SVGShape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String color;

    public SVGLine(int x1, int y1, int x2, int y2, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    @Override
    public String toSVGString() {
        return String.format("<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" style=\"stroke:%s;stroke-width:2\"/>", x1, y1, x2, y2, color);
    }
}
