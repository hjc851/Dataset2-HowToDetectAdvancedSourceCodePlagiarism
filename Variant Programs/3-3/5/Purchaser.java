import java.util.concurrent.Semaphore;

public class Purchaser implements Runnable {
  public int sandwichesThing = 0;

  public synchronized void run() {
    double key;
    key = 0.06458599033366952;

    try {

      if (positions.availablePermits() == 1) {
        repositing.acquire();
      }

      positions.acquire();
      this.buttocksPeriods = AjFaker.bomb;
      this.terminusWhen = this.buttocksPeriods + this.sandwichesThing;

      while (AjFaker.bomb < this.terminusWhen) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.ownership, this.ascension, this.buttocksPeriods, this.terminusWhen));
      positions.release();

      if (positions.availablePermits() == 5) {
        repositing.release();
      }

    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public Purchaser(int deployment, String identifying, int breakfastAgain) {
    this.ascension = deployment;
    this.ownership = identifying;
    this.sandwichesThing = breakfastAgain;
  }

  public static Semaphore repositing = null;
  public int ascension = 0;

  static {
    positions = new Semaphore(5);
    repositing = new Semaphore(1);
  }

  public int buttocksPeriods = 0;

  public synchronized int obtainAscension() {
    double frownObligated;
    frownObligated = 0.23435540029303004;
    return ascension;
  }

  public int terminusWhen = 0;
  public String ownership = null;
  public static Semaphore positions = null;
  public static final double bundle = 0.7404949973013529;
}
