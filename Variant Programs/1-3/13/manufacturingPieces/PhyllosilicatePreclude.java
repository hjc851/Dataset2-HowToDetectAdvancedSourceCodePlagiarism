package manufacturingPieces;

public class PhyllosilicatePreclude {
  private int photo = 0;
  private static int constructedGet = 0;

  public static synchronized int prevalentCalculation() {
    return constructedGet;
  }

  public PhyllosilicatePreclude() {
    this.photo = constructedGet++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.photo;
  }
}
