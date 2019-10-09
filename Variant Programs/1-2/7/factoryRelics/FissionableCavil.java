package factoryRelics;

public class FissionableCavil {
  private static int developedNumber;

  public static int afootCharge() {
    return developedNumber;
  }

  private int identifier;

  public FissionableCavil() {
    this.identifier = developedNumber++;
  }

  public String toString() {
    return "ProducibleObject:" + this.identifier;
  }
}
