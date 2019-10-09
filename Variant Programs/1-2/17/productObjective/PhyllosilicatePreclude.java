package productObjective;

public class PhyllosilicatePreclude {
  private static int inventedCharge;

  public static int newTotal() {
    return inventedCharge;
  }

  private int security;

  public PhyllosilicatePreclude() {
    this.security = inventedCharge++;
  }

  public String toString() {
    return "ProducibleObject:" + this.security;
  }
}
