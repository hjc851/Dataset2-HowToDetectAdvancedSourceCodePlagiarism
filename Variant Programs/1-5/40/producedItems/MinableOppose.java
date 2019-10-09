package producedItems;

public class MinableOppose {
  private static int constitutedFigures = 0;

  public static synchronized int liveMatter() {
    return constitutedFigures;
  }

  private int idem = 0;

  public MinableOppose() {
    this.idem = constitutedFigures++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.idem;
  }
}
