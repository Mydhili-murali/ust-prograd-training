import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
class CurrencyConverter {
    final double USDININR = 76.08;
    final double AUDININR = 59.21;
    final double CADININR = 59.21;
    final double AEDININR = 20.71;

    public double rupeesToUsDollars(double rupees) {
        return rupees / USDININR;
    }

    public double usDollarsToRupees(double dollars) {
        return dollars * USDININR;
    }

    public double rupeesToAustralianDollars(double rupees) {
        return rupees / AUDININR;
    }

    public double australianDollarsToRupees(double auDollars) {
        return auDollars * AUDININR;
    }

    public double rupeesToCanadianDollars(double rupees) {
        return rupees / CADININR;
    }

    public double canadianDollarsToRupees(double canadianDollars) {
        return canadianDollars * CADININR;
    }

    public double rupeesToArabEmiratesDirhm(double rupees) {
        return rupees / AEDININR;
    }

    public double arabEmiratesDirhamToRupees(double aed) {
        return aed * AEDININR;
    }

    public double round(double value) {

        return (double) Math.round(value * 100) / 100;
    }
}

public class CurrencyConverterApplication {
    public static void main(String[] args)throws IOException {

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Program Started...");
        Scanner scanner = new Scanner(System.in);
        double currencyValue,convertedAmount;
        int choice;
        CurrencyConverter currencyConverter=new CurrencyConverter();
        Amount amount=new Amount();

        do {
            System.out.println("Enter a choice (1-8)");
            System.out.println("1. Rupees to US Dollar, 2.US Dollar to Rupees");
            System.out.println("3. Rupees to Australian Dollars, 4.Australian Dollars to Rupees");
            System.out.println("5. Rupees to Canadian Dollar, 6.Canadian Dollar to Rupees");
            System.out.println("7. Rupees to Arabian Emirate Dirham, 8.Arabian Emirate Dirham to Rupees");

            choice=scanner.nextInt();
            switch(choice){
                case 1:

                    logger.info("User selected Rupees to US Dollar conversion");
                    System.out.println("********Rupees to US Dollar******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.rupeesToUsDollars( currencyValue));
                    System.out.println(convertedAmount);

                    break;
                case 2:
                    logger.info("User selected US Dollar to Rupees conversion");
                    System.out.println("********US Dollar to Rupees******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.usDollarsToRupees(currencyValue));
                    System.out.println(convertedAmount);

                    break;
                case 3:
                    logger.info("User selected Rupees to AUD conversion");
                    System.out.println("********Rupees to AUD******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.rupeesToAustralianDollars(currencyValue));
                    System.out.println(convertedAmount);

                    break;
                case 4:
                    logger.info("User selected AUD To Rupees conversion");
                    System.out.println("********AUD To Rupees******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.australianDollarsToRupees(currencyValue));
                    System.out.println(convertedAmount);

                    break;
                case 5:
                    logger.info("User selected Rupees to Canadian Dollar conversion");
                    System.out.println("********Rupees to Canadian Dollar******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.rupeesToCanadianDollars(currencyValue));
                    System.out.println(convertedAmount);

                    break;
                case 6:
                    logger.info("User selected Canadian Dollars To Rupees conversion");
                    System.out.println("********Canadian Dollars To Rupees******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.canadianDollarsToRupees(currencyValue));
                    System.out.println(convertedAmount);

                    break;
                case 7:
                    logger.info("User selected Rupees to Arab Emirates Dirham conversion");
                    System.out.println("********Rupees to Arab Emirates Dirham******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.rupeesToArabEmiratesDirhm(currencyValue));
                    System.out.println(convertedAmount);
                    break;
                case 8:
                    logger.info("User selected Arab Emirates Dirham To Rupees");
                    System.out.println("********Arab Emirates Dirham To Rupees******");
                    currencyValue=amount.getAmount();
                    logger.info("User entered amount" +currencyValue );
                    convertedAmount=currencyConverter.round(currencyConverter.arabEmiratesDirhamToRupees(currencyValue));
                    System.out.println(convertedAmount);
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }

        } while (choice<9);
        System.out.println("******************* EXIT **********************");
        logger.info("Program Stopped...");
    }
}
