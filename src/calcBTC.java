import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.lang.String;

public class calcBTC {
  public static void main(String[] args) {
    DecimalFormat format = (DecimalFormat) DecimalFormat.getInstance();
    DecimalFormatSymbols symbols = format.getDecimalFormatSymbols();
    char sep=symbols.getDecimalSeparator();
    Scanner scnr = new Scanner(System.in);
    System.out.println(String.format("What is Bitcoin price today? (Pls use '%c' as decimal delimiter)", sep));
    double priceBTCinUSD = scnr.nextDouble();
    System.out.println(String.format("How much $ do you have? (Pls use '%c' as decimal delimiter)", sep));
    double haveUSD = scnr.nextDouble();
    System.out.println(String.format("You can buy %.7f BTC", haveUSD / priceBTCinUSD));
  }
}
