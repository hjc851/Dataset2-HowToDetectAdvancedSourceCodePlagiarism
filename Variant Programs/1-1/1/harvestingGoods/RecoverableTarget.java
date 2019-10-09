package harvestingGoods;

public class RecoverableTarget {
  private static int constructedGet;

  public static int typicalRely() {
    return constructedGet;
  }

  private int user;

  public RecoverableTarget() {
    this.user = constructedGet++;
  }

  public String toString() {
    return "ProducibleObject:" + this.user;
  }
}
