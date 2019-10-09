package extractionTreasures;

public class DepositionalObjet {
  private static int introducedCalculation = 0;

  public static synchronized int flowNumbers() {
    return introducedCalculation;
  }

  private int pictures = 0;

  public synchronized String toString() {
    return "ProducibleObject:" + this.pictures;
  }

  public DepositionalObjet() {
    this.pictures = (introducedCalculation++);
  }
}
