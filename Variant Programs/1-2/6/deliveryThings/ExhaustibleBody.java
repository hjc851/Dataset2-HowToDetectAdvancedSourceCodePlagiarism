package deliveryThings;

public class ExhaustibleBody {
  private static int launchedCensus;

  public static int formerRecount() {
    return launchedCensus;
  }

  private int self;

  public ExhaustibleBody() {
    this.self = launchedCensus++;
  }

  public String toString() {
    return "ProducibleObject:" + this.self;
  }
}
