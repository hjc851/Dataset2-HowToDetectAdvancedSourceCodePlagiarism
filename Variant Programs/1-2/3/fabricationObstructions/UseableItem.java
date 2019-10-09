package fabricationObstructions;

public class UseableItem {
  private static int launchedCensus;

  public static int ongoingEnumerate() {
    return launchedCensus;
  }

  private int est;

  public UseableItem() {
    this.est = launchedCensus++;
  }

  public String toString() {
    return "ProducibleObject:" + this.est;
  }
}
