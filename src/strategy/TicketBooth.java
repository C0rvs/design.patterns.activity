package strategy;

import strategy.bean.Person;
import strategy.bean.Tax;
import strategy.interfaces.Ticket;
import strategy.ticketcategories.AdultTicket;
import strategy.ticketcategories.ChildTicket;
import strategy.ticketcategories.SeniorTicket;

public class TicketBooth {
    double price; 
    Ticket ticket; 
    Person person;
    Tax tax;
    public TicketBooth() {
        // TODO Auto-generated constructor stub
    }
    
    public TicketBooth(Person person, Tax tax) {
        // TODO Auto-generated constructor stub
        this.person = person;
        this.tax = tax;
    }
    
    public void sellTickets() {
        setTicketType();
        showTicketDetail();
        
    }
    private void showTicketDetail() {
        this.ticket.viewTicketDetails(tax);
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public Person getPerson() {
        return this.person;
    }
    
    private void setTicketType() {
        if(person.getAge() <= 16) {
            this.ticket = new ChildTicket();
        }
        else if(person.getAge() > 16 && person.getAge() <= 65) {
            this.ticket = new AdultTicket();

        }
        else {
            this.ticket = new SeniorTicket();

        }
        
    }
    
  
    
    public Ticket getTicket() {
        return this.ticket;
    }

    
}
