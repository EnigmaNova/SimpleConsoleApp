import java.util.HashMap;
import java.util.Map;

public class CurrencyConvertor {
    private Map<String, Double> exchangeRates;

    public CurrencyConvertor(){
        this.exchangeRates = new HashMap<>();

        // Задаем курсы валют относительно доллара США
        exchangeRates.put("USD", 1.0);      // 1 доллар = 1 доллар
        exchangeRates.put("EUR", 0.92);     // 1 доллар = 0.92 евро
        exchangeRates.put("RUB", 95.0);     // 1 доллар = 95 рублей
        exchangeRates.put("GBP", 0.78);     // 1 доллар = 0.78 фунта
        exchangeRates.put("JPY", 148.5);    // 1 доллар = 148.5 йен
    }

    public double convert(String convertFrom, String convertTo, double amount){
        if(!exchangeRates.containsKey(convertFrom) || !exchangeRates.containsKey(convertTo)){
            throw new IllegalArgumentException("This currency is not supported.");
        }

        double amountInUSD = amount / exchangeRates.get(convertFrom);
        return amountInUSD * exchangeRates.get(convertTo);
    }
}
