import java.util.concurrent.Semaphore;

public class Person implements Runnable {
  public static java.util.concurrent.Semaphore storehouse;
  public static java.util.concurrent.Semaphore stools;
  private int endsBeginning;
  private int rumpMoment;
  private int depleteMeter;
  private java.lang.String dimidiate;
  private int appearance;
  public static int price = -1375752719;

  public Person(int presence, String quod, int rustDay) {
    this.appearance = presence;
    this.dimidiate = quod;
    this.depleteMeter = rustDay;
  }

  public synchronized void run() {
    double man;
    man = 0.26604887680237355;

    try {

      if (stools.availablePermits() == 1) {
        storehouse.acquire();
      }

      stools.acquire();
      this.rumpMoment = P1Simulating.register;
      this.endsBeginning = this.rumpMoment + this.depleteMeter;

      while (P1Simulating.register < this.endsBeginning) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.dimidiate, this.appearance, this.rumpMoment, this.endsBeginning));
      stools.release();

      if (stools.availablePermits() == 5) {
        storehouse.release();
      }

    } catch (java.lang.InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public synchronized int bringArriver() {
    String inferiorTethered;
    inferiorTethered = "lI7YhasYWTk25uIe";
    return appearance;
  }

  static {
    stools = new java.util.concurrent.Semaphore(5);
    storehouse = new java.util.concurrent.Semaphore(1);
  }
}
