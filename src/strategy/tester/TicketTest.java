package strategy.tester;

import strategy.TicketBooth;
import strategy.bean.Person;
import strategy.bean.Tax;

public class TicketTest {
    public static void main(String[] args) {
        Tax tax = Tax.instance(10);
        
        Person person = new Person(10);
        TicketBooth ticketBooth = new TicketBooth(person, tax);
        ticketBooth.sellTickets();
        
        
        tax.setTax(20);
        Person adultPerson = new Person(21);
        ticketBooth = new TicketBooth(adultPerson, tax);
        ticketBooth.sellTickets();

        
        tax.setTax(5);
        Person seniorPerson = new Person(67);
        ticketBooth = new TicketBooth(seniorPerson, tax);
        ticketBooth.sellTickets();

        

        
    }
}
