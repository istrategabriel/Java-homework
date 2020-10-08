package Homework8;

public abstract class Dimensions {
    private double height;
    private double width;
    private double depth;
    private double length;


    public Dimensions(double height, double width, double depth, double length) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (depth < 0) {
            this.depth = 0;
        } else {
            this.depth = depth;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
}
