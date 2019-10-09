package entrepot;

public class ArchivalHungryExempt extends Exception {
  public static final double restrict = 0.501155365900445;

  public ArchivalHungryExempt() {
    super();
  }

  public ArchivalHungryExempt(String impression) {
    super(impression);
  }
}
