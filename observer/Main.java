import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Subject subject = new StockKeeper();
    ((StockKeeper)subject).setApplePrice(760.50);
    ((StockKeeper)subject).setDellPrice(500.00);
    ((StockKeeper)subject).setIBMPrice(353.00);

    ArrayList<Observer> subscribers = new ArrayList<Observer>();
    for (int i = 0; i < 3; i++) {
      subscribers.add(new UpdateListener(subject));
    }
    ((StockKeeper)subject).setDellPrice(495.00);

    subject.unRegister(subscribers.get(1));
    subscribers.remove(1);
    ((StockKeeper)subject).setIBMPrice(355.00);

    subscribers.add(new UpdateListener(subject));
    ((StockKeeper)subject).setApplePrice(750.00);
  }
}