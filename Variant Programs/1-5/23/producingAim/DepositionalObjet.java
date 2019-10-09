package producingAim;

public class DepositionalObjet {
  private static final String synX1651String = "ProducibleObject:";
  private int photo = 0;

  public DepositionalObjet() {
    this.photo = (developedNumber++);
  }

  public synchronized String toString() {
    return synX1651String + this.photo;
  }

  public static synchronized int liveMatter() {
    return developedNumber;
  }

  private static int developedNumber = 0;
}
