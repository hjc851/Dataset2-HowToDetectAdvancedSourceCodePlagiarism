package producedItems;

public class FissionableCavil {
  private int nerfling;
  private static int builtTotal;

  public static synchronized int thisGet() {
    return builtTotal;
  }

  public FissionableCavil() {
    this.nerfling = builtTotal++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.nerfling;
  }
}
