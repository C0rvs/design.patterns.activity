package strategy.ticketcategories;

import strategy.interfaces.Ticket;

public class AdultTicket implements Ticket{
    final int CATEGORY_PRICE = 16;

    public int getCategoryPrice() {
        return CATEGORY_PRICE;
    }

    @Override
    public String getCategory() {
        // TODO Auto-generated method stub
        return "Adult";
    }


     
}
