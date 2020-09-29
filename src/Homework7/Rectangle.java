package Homework7;

public class Rectangle {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        if (width != 0) {
            this.width = width;
        }
        if (length != 0) {
            this.length = length;
        }
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }

    }

    public double getArea() {
        double area = this.length * this.width;
        return area;

    }

    public Rectangle() {
    }


}

