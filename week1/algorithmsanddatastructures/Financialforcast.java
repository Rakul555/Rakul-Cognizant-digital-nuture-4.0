package week1.algorithmsanddatastructures;

public class Financialforcast {
    public static void main(String[] args) {
        double principalAmount = 10000;
        double annualIncreaseRate = 0.08;
        int durationYears = 5;

        double projectedValue = Forecast.recursiveForecast(principalAmount, annualIncreaseRate, durationYears);
        System.out.println("Projected Amount After " + durationYears + " Years: " + projectedValue);
    }
}

class Forecast {
    public static double recursiveForecast(double capital, double rate, int time) {
        if (time == 0) return capital;
        return recursiveForecast(capital, rate, time - 1) * (1 + rate);
    }
}
