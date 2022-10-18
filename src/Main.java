import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal nettoPriceLavrinenko = new BigDecimal("9.99");
        BigDecimal bruttoPriceLavrinenko = new BigDecimal ("0");
        BigDecimal vatLavrinenko = new BigDecimal("0.23");
        BigDecimal numberOfSmthLavrinenko = new BigDecimal("10000");
        BigDecimal oneHundredPercent = new BigDecimal("1");
        bruttoPriceLavrinenko = nettoPriceLavrinenko.add(nettoPriceLavrinenko.multiply(vatLavrinenko));
        System.out.println("Netto price is " + nettoPriceLavrinenko);
        System.out.println("Brutto price is " + bruttoPriceLavrinenko);
        BigDecimal bruttoPriceForTTLavrinenko = bruttoPriceLavrinenko.multiply(numberOfSmthLavrinenko);
        BigDecimal nettoPriceForTTLavrinenko = bruttoPriceForTTLavrinenko.multiply(oneHundredPercent.add(vatLavrinenko).multiply(oneHundredPercent.subtract(vatLavrinenko)));
        System.out.println("Brutto price for 10000 copies is " + bruttoPriceForTTLavrinenko);
        System.out.println("Netto price for 10000 copies is " + nettoPriceForTTLavrinenko);
    }
}