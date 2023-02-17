package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){
        double convertedTempreture = (double)temperatureCelsius * 9 / 5 + 32;
        System.out.println(convertedTempreture);
    }

}
