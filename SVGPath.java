package cnam;

public class SVGPath extends SVGShape {
    private String pathData;
    private String color;

    public SVGPath(String pathData, String color) {
        this.pathData = pathData;
        this.color = color;
    }

    @Override
    public String toSVGString() {
        return String.format("<path d=\"%s\" fill=\"none\" stroke=\"%s\" stroke-width=\"2\"/>", pathData, color);
    }
}