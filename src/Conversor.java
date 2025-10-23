public class Conversor {
    

    public double celsiusAFahrenheit(double celsius) {
        // Fórmula: (C * 9/5) + 32
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double fahrenheitACelsius(double fahrenheit) {
        // Fórmula: (F - 32) * 5/9
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
