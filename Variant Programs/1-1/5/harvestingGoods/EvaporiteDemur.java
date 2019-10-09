package harvestingGoods;

public class EvaporiteDemur {
  private static int devisedEnumeration;

  public static int latestNumber() {
    return devisedEnumeration;
  }

  private int identifying;

  public EvaporiteDemur() {
    this.identifying = devisedEnumeration++;
  }

  public String toString() {
    return "ProducibleObject:" + this.identifying;
  }
}
