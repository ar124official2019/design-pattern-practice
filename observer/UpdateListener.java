public class UpdateListener implements Observer {
  private double ApplePrice, DellPrice, IBMPrice;
  private static int ObserverIDTracker = 0;
  private int id;

  public UpdateListener(Subject subject) {
    ApplePrice = DellPrice = IBMPrice = 0.0;
    id = ++ObserverIDTracker;
    subject.register(this);
  }

  @Override
  public void update(double _ApplePrice, double _DellPrice, double _IBMPrice) {
    ApplePrice = _ApplePrice;
    DellPrice = _DellPrice;
    IBMPrice = _IBMPrice;
    print();
  }

  public int getID() {
    return this.id;
  }
  
  protected void print() {
    System.out.println("Subscriber " + id + ":");
    System.out.println("Apple: " + ApplePrice);
    System.out.println("Dell: " + DellPrice);
    System.out.println("IBM: " + IBMPrice);
    System.out.println();
  }
}