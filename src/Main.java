import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double itemCost = 0.0;
        double shippingCost = 0.0; //This is a variable used for shippingCOst
        double costAfterShipping = 0.0;
        double SHIPPING_RATE = 0.02;

        System.out.print("What is the cost of your item?");
        itemCost = in.nextDouble();
        if (itemCost >= 100)
        {

            shippingCost = itemCost * SHIPPING_RATE;
            costAfterShipping = itemCost + shippingCost;
            System.out.println("Your shipping cost is $" +shippingCost);
            System.out.println("Your total cost is $" + costAfterShipping);


        }
        else
        {
            costAfterShipping = itemCost;
            System.out.println("Your shipping cost is " +shippingCost);
            System.out.println("Your total cost is " + costAfterShipping);

        }
    }
}