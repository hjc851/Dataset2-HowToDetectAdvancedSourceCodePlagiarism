package harvestingGoods;

public class HypabyssalTotem {
  private static int formedTally;

  public static int previousCalculate() {
    return formedTally;
  }

  private int security;

  public HypabyssalTotem() {
    this.security = formedTally++;
  }

  public String toString() {
    return "ProducibleObject:" + this.security;
  }
}
