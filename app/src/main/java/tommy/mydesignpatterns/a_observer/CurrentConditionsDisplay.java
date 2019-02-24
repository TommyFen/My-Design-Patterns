package tommy.mydesignpatterns.a_observer;

/**
 *
 *    @author : Guojin
 *    e-mail : tommyfenv@163.com
 *    time : 2017/10/8
 *    desc:显示当前的内容
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private static final String TAG = "CurrentConditionsDispla";

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }

}
