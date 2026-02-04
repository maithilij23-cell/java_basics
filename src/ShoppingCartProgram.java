import java.util.Scanner;

public class ShoppingCartProgram {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '₹';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("At what price will you buy it? : ");
        price = scanner.nextDouble();

        System.out.print("How much of the items will you buy?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("\nYou have bought: " + quantity + " " + item + "/s");
        System.out.println("Your total is: " + total + currency + " , Please Pay full amount.");

        scanner.close();
    }
}
