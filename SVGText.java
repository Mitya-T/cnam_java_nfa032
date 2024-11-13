package cnam;

public class SVGText extends SVGShape {
    private int x;
    private int y;
    private String text;
    private int fontSize; // Add font size attribute

    public SVGText(int x, int y, String text, int fontSize) { // Include font size parameter
        this.x = x;
        this.y = y;
        this.text = text;
        this.fontSize = fontSize; // Set font size
    }

    @Override
    public String toSVGString() {
        return String.format("<text x=\"%d\" y=\"%d\" font-size=\"%d\">%s</text>", x, y, fontSize, text); // Include font size in SVG string
    }
}
