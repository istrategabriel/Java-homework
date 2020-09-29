package Homework7;

public class Vehicle {

    private String Color;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getNrOfWheels() {
        return nrOfWheels;
    }

    public void setNrOfWheels(int nrOfWheels) {
        this.nrOfWheels = nrOfWheels;
    }

    private int nrOfWheels;

    public void steering() {
        System.out.println("The vehicle steers");
    }

    public void gearChange() {
        System.out.println("The vehicle has changing gears");
    }

    public double moving(double x) {
        return x;
    }

}
