import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0); // Base currency (1 USD = 1 USD)
        exchangeRates.put("EUR", 0.85); // Example exchange rates
        exchangeRates.put("JPY", 110.0);
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);

        return amount * (toRate / fromRate);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available currencies: USD, EUR, JPY");

        System.out.print("Enter the source currency: ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency: ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
        System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);

        scanner.close();
    }
}
