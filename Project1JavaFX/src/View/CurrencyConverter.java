package View;

public class CurrencyConverter {
    private static double exchangeRate=3.50 ; // exchange rate of USD to ILS

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public static double convertToUSD(double amount) {
        return amount / exchangeRate;
    }

    public static double convertToILS(double amount) {
        return amount * exchangeRate;
    }

}
