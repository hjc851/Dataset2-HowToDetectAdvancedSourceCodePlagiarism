package factoryRelics;

public class DepositionalObjet {
  private static int spawnedWeigh;

  public static synchronized int thisGet() {
    return spawnedWeigh;
  }

  private int idem;

  public DepositionalObjet() {
    this.idem = spawnedWeigh++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.idem;
  }
}
