package Question7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SuperMarket superMarket=new SuperMarket();
        boolean addItemsStill=true;

        Scanner continueQuestion=new Scanner(System.in);
        while (addItemsStill){
            String name="";
            int quantity=0;
            double price=0;

            Scanner nameReadline=new Scanner(System.in);
            System.out.println("Enter product name");
name=nameReadline.next();

            System.out.println("Enter quantity");
            Scanner quantityReadline=new Scanner(System.in);
            quantity= quantityReadline.nextInt();

            System.out.println("Enter product price");
            Scanner priceReadline=new Scanner(System.in);
            price=priceReadline.nextDouble();

            superMarket.addToBasket(new ShopItems(name,quantity,price));

            System.out.println("Add  another product ");

            addItemsStill=priceReadline.nextBoolean();
        }
        superMarket.printReceipt();
    }
}
