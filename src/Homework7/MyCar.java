package Homework7;

public class MyCar extends Car {


    private String traction = "4WD";


    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }


    public static void main(String[] args) {
        MyCar gabi = new MyCar();
        gabi.setColor("black");
        gabi.setNrOfWheels(4);
        gabi.setGearboxType("Automatic");
        gabi.setFuelType("gasoline");
        gabi.steering();
        gabi.gearChange();


        System.out.println("The color of my car is " + gabi.getColor());
        System.out.println("The traction of my car is " + gabi.getTraction());
        System.out.println("The speed of my car is " + gabi.moving(100));


    }

}

