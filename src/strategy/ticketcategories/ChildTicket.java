package strategy.ticketcategories;

import strategy.interfaces.Ticket;

public class ChildTicket implements Ticket {
    final int CATEGORY_PRICE = 10;

    public int getCategoryPrice() {
        return CATEGORY_PRICE;
    }

    @Override
    public String getCategory() {
        // TODO Auto-generated method stub
        return "Child";
    }

    

     

}
