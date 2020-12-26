package tommy.mydesignpatterns.a_observer;

import java.util.ArrayList;
import java.util.List;

/**Android中回调函数只需维持一个对象，而在观察者模式中，需要维持多个对象*/
public class WeatherData implements Subject {

  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList();
  }

  /**接口重写方法1*/
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  /**接口重写方法2*/
  @Override
  public void unRegisterObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(o);
    }
  }

  /**接口重写方法3*/
  @Override
  public void notifyObservers() {
    for (int i = 0; i < observers.size() ; i++ ) {
      Observer observer = observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }



}
