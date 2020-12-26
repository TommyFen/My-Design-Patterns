package tommy.mydesignpatterns.a_observer;

interface Subject {

  void registerObserver(Observer o);

  void unRegisterObserver(Observer o);

  void notifyObservers();

}
