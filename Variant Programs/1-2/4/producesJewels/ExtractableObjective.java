package producesJewels;

public class ExtractableObjective {
  private static int launchedCensus;

  public static int contemporaryReckoning() {
    return launchedCensus;
  }

  private int identifying;

  public ExtractableObjective() {
    this.identifying = launchedCensus++;
  }

  public String toString() {
    return "ProducibleObject:" + this.identifying;
  }
}
