package cnam;

public class SVGRectangle extends SVGShape {
    private int x;
    private int y;
    private int width;
    private int height;
    private String color;

    public SVGRectangle(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toSVGString() {
        return String.format("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" fill=\"%s\"/>", x, y, width, height, color);
    }
}
