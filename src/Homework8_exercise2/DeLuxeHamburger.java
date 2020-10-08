package Homework8_exercise2;

public class DeLuxeHamburger extends BasicHamburger {

    private String chips;
    private String drinks;

    public DeLuxeHamburger(String breadRollType, String mainPart, double basePrice) {
        super(breadRollType, mainPart, basePrice);
    }

    public String getChips() {
        return chips;
    }

    public String getDrinks() {
        return drinks;
    }

    public double finalPrice(String chips, String drinks) {
        System.out.println("Base price of the DeLuxe hamburger is: "+getBasePrice());
        double price=getBasePrice();
        if (chips == "Chips" ) {
            price += 0.5;
            System.out.println("You selected the following addition: " +chips+ " and the price for your selection is 0.5");
        }
        if (drinks == "Drinks" ) {
            price += 0.5;
            System.out.println("You selected the following addition: " +drinks+ " and the price for your selection is 0.5");
        }

        System.out.println("Total price for your order is: " + price);
        return price;
    }

    public static void main(String[] args) {
        DeLuxeHamburger burger3 = new DeLuxeHamburger("Italian", "Meat", 3.0);
        burger3.finalPrice("Chips", null);
    }
}

