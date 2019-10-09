package throughputMaterials;

public class FissionableCavil {
  private static final String synX2660String = "ProducibleObject:";
  private static int constructedGet = 0;

  public static synchronized int flowNumbers() {
    return constructedGet;
  }

  public synchronized String toString() {
    return synX2660String + this.self;
  }

  private int self = 0;

  public FissionableCavil() {
    this.self = (constructedGet++);
  }
}
