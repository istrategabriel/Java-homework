package Homework8_exercise2;

public class BasicHamburger {
    private String breadRollType;
    private String mainPart;
    private double basePrice;


    public BasicHamburger(String breadRollType, String mainPart, double basePrice) {
        if (breadRollType == "Italian" || breadRollType == "WithSeeds" || breadRollType == "Black"
                || breadRollType == "Regular") {
            this.breadRollType = breadRollType;
        } else {
            this.breadRollType = "Regular";
        }
        this.mainPart = mainPart;
        this.basePrice = basePrice;
    }


    public double finalPrice(String additions1, String additions2,
                             String additions3, String additions4) {
        System.out.println("Base price of the Basic hamburger is: "+getBasePrice());
        if (additions1 == "Letuce" || additions1 == "Carrots" || additions1 == "Cabage" || additions1 == "Onions") {
            basePrice += 0.5;
            System.out.println("You selected the following addition: " +additions1+ " and the price for your selection is 0.5");
        }

        if (additions2 == "Letuce" || additions2 == "Carrots" || additions2 == "Cabage" || additions2 == "Onions") {
            basePrice += 0.5;
            System.out.println("You selected the following addition: " +additions2+ " and the price for your selection is 0.5");
        }
        if (additions3 == "Letuce" || additions3 == "Carrots" || additions3 == "Cabage" || additions3 == "Onions") {
            basePrice += 0.5;
            System.out.println("You selected the following addition: " +additions3+ " and the price for your selection is 0.5");
        }

        if (additions4 == "Letuce" || additions4 == "Carrots" || additions4 == "Cabage" || additions4 == "Onions") {
            basePrice += 0.5;
            System.out.println("You selected the following addition: " +additions1+ " and the price for your selection is 0.5");
        }
        System.out.println("Total price for your order is: " + basePrice);
        return basePrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMainPart() {
        return mainPart;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public static void main(String[] args) {
        BasicHamburger burger1 = new BasicHamburger("Reg", "Meat", 2.5);
        burger1.finalPrice("Onions", "Carrots", null, null);

    }

}


