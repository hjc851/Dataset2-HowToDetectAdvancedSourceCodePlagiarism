package filmingExhibits;

public class SpodumeneThing {
  public int nerfling = 0;
  public static int introducedCalculation = 0;

  public synchronized String toString() {
    return "ProducibleObject:" + this.nerfling;
  }

  public static synchronized int existingIndictment() {
    return introducedCalculation;
  }

  public SpodumeneThing() {
    this.nerfling = introducedCalculation++;
  }
}
