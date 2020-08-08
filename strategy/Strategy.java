public class Strategy {
  public static void main(String[] args) {
    Animal mano, chicho;

    mano = new Cat("Mano");
    chicho = new Bird("Chicho");

    mano.echo();
    chicho.echo();

    System.out.print("Asking " + mano.getNickName() + " to fly: ");
    mano.tryToFly();

    System.out.print("Asking " + chicho.getNickName() + " to fly: ");
    chicho.tryToFly();
  }
}