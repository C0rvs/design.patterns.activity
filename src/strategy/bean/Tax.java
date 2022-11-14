package strategy.bean;


public class Tax {
    private static Tax INSTANCE;
    private double tax;
    public static Tax instance() {
        if (INSTANCE == null) {
            INSTANCE = new Tax();
        }
        return INSTANCE;
    }
    
    public static Tax instance(double tax) {
        if (INSTANCE == null) {
            INSTANCE = new Tax(tax);
        }
        return INSTANCE;
    }
    
    
    
    private Tax() {
            
     }
    
     private Tax(double tax) {
           this.tax = tax / 100; 
    }
    
    
    public double getTax() {
        return this.tax;
    }
    
    public void setTax(double tax) {
        this.tax = tax / 100;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("object cloning not supported");
    }
    
    


}
