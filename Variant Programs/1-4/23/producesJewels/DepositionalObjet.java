package producesJewels;

public class DepositionalObjet {
  private int peg = 0;
  private static int institutedRely = 0;

  public static synchronized int prevailingTally() {
    return institutedRely;
  }

  public DepositionalObjet() {
    this.peg = institutedRely++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.peg;
  }
}
