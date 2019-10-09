package productObjective;

public class StorableSubject {
  private static int inventedCharge;

  public static int circulatingReckon() {
    return inventedCharge;
  }

  private int identifier;

  public StorableSubject() {
    this.identifier = inventedCharge++;
  }

  public String toString() {
    return "ProducibleObject:" + this.identifier;
  }
}
