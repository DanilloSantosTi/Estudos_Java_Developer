package utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double ValuePaid(double currentQuote, double valueBuy){

        double valueFinalPaid = currentQuote * valueBuy;
        return (valueFinalPaid * IOF) + valueFinalPaid;
    }
}
