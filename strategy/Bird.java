public class Bird extends Animal {
  public Bird(String _NickName) {
    super(_NickName);

    this.flyingAbility = new CanFly();
  }
}