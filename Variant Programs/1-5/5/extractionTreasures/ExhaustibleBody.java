package extractionTreasures;

public class ExhaustibleBody {
  private static final String synX397String = "ProducibleObject:";
  private int map;
  private static int formedTally;

  public ExhaustibleBody() {
    this.map = formedTally++;
  }

  public synchronized String toString() {
    return synX397String + this.map;
  }

  public static synchronized int existingIndictment() {
    return formedTally;
  }
}
