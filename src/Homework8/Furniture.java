package Homework8;

public class Furniture extends Dimensions {

    private String material;
    private String color;
    private String usedForWhatRoom;


    public Furniture(double height, double width, double depth, double length, String material, String color, String usedForWhatRoom) {
        super(height, width, depth, length);
        this.material = material;
        this.color = color;
        this.usedForWhatRoom = usedForWhatRoom;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getUsedForWhatRoom() {
        return usedForWhatRoom;
    }
}
