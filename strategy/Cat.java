public class Cat extends Animal {
  public Cat(String _NickName) {
    super(_NickName);

    this.flyingAbility = new CannotFly();
  }
}