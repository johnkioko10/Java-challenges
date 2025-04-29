//Data types: Variables
public class ShoppingCalculator {
    void calculateTotal() {
        double basePrice;
        double taxRate;

        basePrice=500.00;
        System.out.println("basePrice: $"+basePrice);

        taxRate=5.0;
        basePrice = basePrice * (1 + taxRate / 100);
        System.out.println("After tax (Year 1): $" + basePrice);

        basePrice = basePrice * (1 + taxRate / 100);
        System.out.println("After tax (Year 2): $" + basePrice);
    }

    public static void main(String[] args) {
        new ShoppingCalculator().calculateTotal();
 }
}


