package Homework8;

public class Doors extends Dimensions {

    private String material;

    public Doors(double height, double width, double depth, double length, String material) {
        super(height, width, depth, length);
        this.material = material;

    }

    public String getMaterial() {
        return material;

    }

}
