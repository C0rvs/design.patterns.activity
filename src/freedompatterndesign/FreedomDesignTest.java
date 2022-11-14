package freedompatterndesign;

import java.text.DecimalFormat;
import java.util.Scanner;

import freedompatterndesign.abstracts.Converter;
import freedompatterndesign.convertertypes.Billion;
import freedompatterndesign.convertertypes.LessThanOneThousandConverter;
import freedompatterndesign.convertertypes.Million;
import freedompatterndesign.convertertypes.Thousand;


public class FreedomDesignTest {
    private  Converter lessThanOneThousandConverter;
    private  Converter thousand;
    private  Converter million;
    private  Converter billion;
    public FreedomDesignTest() {
        
        this.billion = new Billion();
        this.million = new Million();
        this.thousand = new Thousand();
        this.lessThanOneThousandConverter = new LessThanOneThousandConverter();
        
        this.lessThanOneThousandConverter.chain(thousand);
        this.thousand.chain(million);
        this.million.chain(billion);
        
    }
    
    public String convertNumberToString(int number) {
        String formatString = "000000000000";
        DecimalFormat decimalFormat = new DecimalFormat(formatString);
        String answerString = "";
        boolean isNegative = false;
        if(number == 0 )
            return "Zero";
        if(number < 0) {
            number = Math.abs(number);
            isNegative = true;
        }
        answerString = lessThanOneThousandConverter.convertToString(number,9,12, decimalFormat);
        if(isNegative)
            return "Negative " + answerString;
        return answerString;
               
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            String answersString = "y";
            while(answersString.substring(0,1).equalsIgnoreCase("y")) {
                int number = scanner.nextInt();
                FreedomDesignTest freedomDesignTest = new FreedomDesignTest();
                String answerString = freedomDesignTest.convertNumberToString(number);
                System.out.println(answerString);
                System.out.println("Continue? Y/N");
                answersString = scanner.next();
                
            }
        }
        catch (Exception e) {
           System.out.println(String.format("Error: %s", e.getMessage()));
        }
        scanner.close();
        
        
    }
    


}
