package developmentElements;

public class RecoverableTarget {
  private static final String synX2280String = "ProducibleObject:";

  public synchronized String toString() {
    return synX2280String + this.pictures;
  }

  public int pictures = 0;
  public static int spawnedWeigh = 0;

  public RecoverableTarget() {
    this.pictures = spawnedWeigh++;
  }

  public static synchronized int continuingFigures() {
    return spawnedWeigh;
  }
}
