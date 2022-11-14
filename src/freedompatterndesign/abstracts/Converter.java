package freedompatterndesign.abstracts;

import java.text.DecimalFormat;

public abstract class Converter {
    Converter converter;
    static String numbers [] = {"", "One", "Two", "Three", "Four", 
                                "Five", "Six", "Seven", "Eight", 
                                "Nine", "Ten","Eleven","Tweleve" ,
                                "Thirteen", "Fourteen", "Fifteen", 
                                "Sixteen", "Seventeen", "Eighteen", 
                                "Nineteen"};
                      
    static String tens [] = {"","Ten","Twenty", "Thirty", 
                             "Fourty", "Fifty", "Sixty", 
                             "Seventy", "Eighty", "Ninety"};   
    
    
    public String convertToString(int number, int start, int end, DecimalFormat decimalFormat) {

        String numberString = "";
        String temp = Integer.toString(number);
        temp = decimalFormat.format(number);
        
        int firstThree = Integer.parseInt(temp.substring(start, end));
        int firstThreeTemp = firstThree;
        int placeValue = 1;
        int checkPrevious = 0;
        
        if(firstThree == 0 && start > 0) {
            numberString = this.converter.convertToString(number,start-3, end-3, decimalFormat) 
                    + numberString;
         }
        else {
            while(firstThree > 0 && placeValue <= 100) {
                int remainder = firstThree % 10;
                
                if(placeValue == 1) {
                    numberString  = numberString  + numbers[remainder] + " ";
                }
                else if(placeValue == 10)
                {
                    if(remainder == 1)
                        numberString  =numbers[checkPrevious + 10] ;
                    else
                        numberString  = tens[remainder]  + " " + numberString + " ";
    
                }
                else if (placeValue == 100){
                    numberString  = numbers[remainder] + " " 
                +  "hundred" + " "  + numberString + " ";
                }
                checkPrevious = remainder;
                firstThree /= 10;
                placeValue *= 10;
            }
            
            if(start > 0) {
                numberString = this.converter.convertToString(number,start-3, end-3, decimalFormat) 
                        + " " +  numberString+ " " +  getHolderAmount() + " ";
            }
            
            if(getHolderAmount().equals("Billion") && firstThreeTemp > 0){
                numberString = numberString + " " + getHolderAmount() + " ";
            }
            

        }

       
        
        return numberString;
        
    }
    public void chain(Converter converter) {
        this.converter = converter;
    }
    
    public abstract String getHolderAmount();
    
}
