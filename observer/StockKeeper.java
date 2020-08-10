import java.util.ArrayList;

public class StockKeeper implements Subject {
  private ArrayList<Observer> subscribers;
  private double ApplePrice;
  private double DellPrice;
  private double IBMPrice;

  public StockKeeper() {
    subscribers = new ArrayList<Observer>();
    ApplePrice = 0.0;
    DellPrice = 0.0;
    IBMPrice = 0.0;
  }

  public void setApplePrice(double price) {
    ApplePrice = price;
    notifyObservers();
  }

  public void setDellPrice(double price) {
    DellPrice= price;
    notifyObservers();
  }

  public void setIBMPrice(double price) {
    IBMPrice = price;
    notifyObservers();
  }

  @Override
  public void register(Observer observer) {
    subscribers.add(observer);
    System.out.println("New subscriber: " + observer.getID() + "\n");
  }

  @Override
  public void unRegister(Observer observer) {
    int index = subscribers.indexOf(observer);
    subscribers.remove(index);
    System.out.println("Unsubscribed: " + observer.getID() + "\n");
  }

  @Override
  public void notifyObservers() {
    for (int i = 0; i < subscribers.size(); i++) {
      subscribers.get(i).update(ApplePrice, DellPrice, IBMPrice);
    }
  }
}