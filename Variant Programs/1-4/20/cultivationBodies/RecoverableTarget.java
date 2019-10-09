package cultivationBodies;

public class RecoverableTarget {
  private static int introducedCalculation = 0;

  public static synchronized int flowNumbers() {
    return introducedCalculation;
  }

  private int security = 0;

  public RecoverableTarget() {
    this.security = introducedCalculation++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.security;
  }
}
