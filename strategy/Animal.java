public class Animal {
  protected String nickName;
  protected Flys flyingAbility;

  public Animal(String _nickName) {
    nickName = _nickName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String _nickName) {
    nickName = _nickName;
  }

  public void echo() {
    System.out.println("Hi I'm an animal & my name is " + nickName);
  }

  public void tryToFly() {
    flyingAbility.fly();
  }
}