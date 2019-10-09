package cultivationBodies;

public class SpodumeneThing {
  private static final String synX2056String = "ProducibleObject:";

  public SpodumeneThing() {
    this.name = designedNumbers++;
  }

  public static synchronized int liveMatter() {
    return designedNumbers;
  }

  private static int designedNumbers;

  public synchronized String toString() {
    return synX2056String + this.name;
  }

  private int name;
}
