package processingCreations;

public class ExhaustibleBody {
  private static int designedNumbers;

  public static int underwayTabulation() {
    return designedNumbers;
  }

  private int map;

  public ExhaustibleBody() {
    this.map = designedNumbers++;
  }

  public String toString() {
    return "ProducibleObject:" + this.map;
  }
}
