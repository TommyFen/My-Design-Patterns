
interface Subject {

  void registerObserver(Observer o);

  void unRegisterObserver(Observer o);

  void notifyObservers();

}
