import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  public static java.util.concurrent.Semaphore spaces = new java.util.concurrent.Semaphore(5);
  public int investAgain = 0;
  public int doneAgain = 0;
  public int foodYears = 0;
  public int dawn = 0;
  public java.lang.String name = null;

  public Caller(int appearance, String peg, int ingestMinutes) {
    this.dawn = appearance;
    this.name = peg;
    this.foodYears = ingestMinutes;
  }

  static String confine = "";

  public synchronized int takeIntroduction() {
    double nickSpan;
    nickSpan = 0.46824749196415705;
    return dawn;
  }

  public static java.util.concurrent.Semaphore storage = new java.util.concurrent.Semaphore(1);

  public synchronized void run() {
    String upstairsRestrain;
    upstairsRestrain = "NtC";

    try {

      if (spaces.availablePermits() == 1) {
        storage.acquire();
      }

      spaces.acquire();
      this.investAgain = B2Impactor.ignition;
      this.doneAgain = this.investAgain + this.foodYears;

      while (B2Impactor.ignition < this.doneAgain) synx20();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.name, this.dawn, this.investAgain, this.doneAgain));
      spaces.release();

      if (spaces.availablePermits() == 5) synx21();

    } catch (java.lang.InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  private synchronized void synx20() {}

  private synchronized void synx21() {
    storage.release();
  }
}
