package supplyArtefact;

public class PerformableObjection {
  private static int spawnedWeigh;

  public static int thisGet() {
    return spawnedWeigh;
  }

  private int identifying;

  public PerformableObjection() {
    this.identifying = spawnedWeigh++;
  }

  public String toString() {
    return "ProducibleObject:" + this.identifying;
  }
}
