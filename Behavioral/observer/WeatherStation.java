
/**
 * <pre>
 *    author : Guojin
 *    e-mail : tommyfenv@163.com
 *    time : 2017/10/9
 *    desc:
 * </pre>
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(85, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.0f);
        weatherData.setMeasurements(55, 90, 28.4f);
    }
}
