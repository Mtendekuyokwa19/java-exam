package Question7;

import java.util.ArrayList;

public class SuperMarket {
    ArrayList<ShopItems> baskets=new ArrayList<>();

    void addToBasket(ShopItems item){
        baskets.add(item);
    }
    double getSubtotal(){
        double total=0;
        for (ShopItems item : baskets) {
           total+=(item.price *item.quantity);
        }
        return total;
    }
    double calculateVat(){
        return getSubtotal()+getSubtotal()*0.08;
    }
    void printReceipt(){
        System.out.println(
               "***********************************************"
        );
        System.out.println("vat is 8%");
        System.out.println("subtotal  "+getSubtotal());
        System.out.println("total to be paid  "+calculateVat());
        System.out.println(
                "***********************************************"
        );
    }


}
