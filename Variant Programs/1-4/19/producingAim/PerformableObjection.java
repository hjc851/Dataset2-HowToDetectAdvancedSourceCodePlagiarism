package producingAim;

public class PerformableObjection {
  public int milad = 0;
  public static int developedNumber = 0;

  public static synchronized int incumbentEnumeration() {
    return developedNumber;
  }

  public PerformableObjection() {
    this.milad = developedNumber++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.milad;
  }
}
