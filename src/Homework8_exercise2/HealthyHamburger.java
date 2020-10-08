package Homework8_exercise2;

public class HealthyHamburger extends BasicHamburger {
    private final String breadRollType = "Brown";
    private String additions5;
    private String additions6;

    public HealthyHamburger(String breadRollType, String mainPart, double basePrice) {
        super(breadRollType, mainPart, basePrice);
            }

    public String getAdditions5() {
        return additions5;
    }

    public String getAdditions6() {
        return additions6;
    }

    public double finalPrice(String additions1, String additions2,
                              String additions3, String additions4,
                              String additions5, String additions6) {
        double price = getBasePrice();
        System.out.println("Base price of the Healthy  hamburger is: " + price);

        if (additions1 == "Letuce" || additions1 == "Carrots" || additions1 == "Cabage" || additions1 == "Onions" || additions1 == "Salad" || additions1 == "Pickles") {
            price += 0.5;
            System.out.println("You selected the following addition: " + additions1 + " and the price for your selection is 0.5");
        }
        if (additions2 == "Letuce" || additions2 == "Carrots" || additions2 == "Cabage" || additions2 == "Onions" || additions2 == "Salad" || additions2 == "Pickles") {
            price += 0.5;
            System.out.println("You selected the following addition: " + additions2 + " and the price for your selection is 0.5");
        }
        if (additions3 == "Letuce" || additions3 == "Carrots" || additions3 == "Cabage" || additions3 == "Onions" || additions3 == "Salad" || additions3 == "Pickles") {
            price += 0.5;
            System.out.println("You selected the following addition: " + additions3 + " and the price for your selection is 0.5");
        }
        if (additions4 == "Letuce" || additions4 == "Carrots" || additions4 == "Cabage" || additions4 == "Onions" || additions4 == "Salad" || additions4 == "Pickles") {
            price += 0.5;
            System.out.println("You selected the following addition: " + additions4 + " and the price for your selection is 0.5");
        }
        if (additions5 == "Letuce" || additions5 == "Carrots" || additions5 == "Cabage" || additions5 == "Onions" || additions5 == "Salad" || additions5 == "Pickles") {
            price += 0.5;
            System.out.println("You selected the following addition: " + additions5 + " and the price for your selection is 0.5");
        }
        if (additions6 == "Letuce" || additions6 == "Carrots" || additions6 == "Cabage" || additions6 == "Onions" || additions6 == "Salad" || additions6 == "Pickles") {
            price += 0.5;
            System.out.println("You selected the following addition: " + additions6 + " and the price for your selection is 0.5");
        }
        System.out.println("Total price for your order is: " + price);
        return price;
    }

    public static void main(String[] args) {
        HealthyHamburger burger2 = new HealthyHamburger("Brown", "Meat", 3.5);
        burger2.finalPrice("Cabage", "Salad", "Pickles", null, null, null);

    }

}

