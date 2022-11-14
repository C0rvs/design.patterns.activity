package strategy.interfaces;

import strategy.bean.Tax;

public interface Ticket {
    public static final int CATEGORY_PRICE = 0;
    
     default void viewTicketDetails(Tax tax) {
         System.out.println("Category: " + getCategory());
         System.out.println("Price: " + computeTicketPrice(tax));
         System.out.println("Tax: " + tax.getTax());

    }
     default double computeTicketPrice(Tax tax) {
         return getCategoryPrice() + (getCategoryPrice() * tax.getTax());
     }
    int getCategoryPrice();
    String getCategory();
}
