package Homework8_exercise2;

public class Ordering {


    public static void main(String[] args) {
        BasicHamburger basicHamburger = new BasicHamburger("Regular", "Meat", 2.5);
        basicHamburger.finalPrice(null, null, null, null);
        System.out.println();
        HealthyHamburger healthyHamburger= new HealthyHamburger("Brown", "Meat", 3.5);
        healthyHamburger.finalPrice(null, null, null, null, null, "Cabage");
        System.out.println();
        DeLuxeHamburger deLuxeHamburger= new DeLuxeHamburger("Brown", "Meat", 3.0);
        deLuxeHamburger.finalPrice("Chips", "Drinks");

    }

}
