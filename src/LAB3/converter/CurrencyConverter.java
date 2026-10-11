package LAB3.converter;

public class CurrencyConverter {

    private double usdRate;
    private double eurRate;
    private double cnyRate;

    public CurrencyConverter(double usdRate, double eurRate, double cnyRate) {
        this.usdRate = usdRate;
        this.eurRate = eurRate;
        this.cnyRate = cnyRate;
    }

    public void setUsdRate(double usdRate) {
        this.usdRate = usdRate;
    }

    public void setEurRate(double eurRate) {
        this.eurRate = eurRate;
    }

    public void setCnyRate(double cnyRate) {
        this.cnyRate = cnyRate;
    }

    public double convert(double rub, String currency) {
        if (currency.equalsIgnoreCase("USD")) {
            return rub / usdRate;
        } else if (currency.equalsIgnoreCase("EUR")) {
            return rub / eurRate;
        } else if (currency.equalsIgnoreCase("CNY")) {
            return rub / cnyRate;
        } else {
            System.out.println("Неизвестная валюта: " + currency);
            return 0;
        }
    }
}