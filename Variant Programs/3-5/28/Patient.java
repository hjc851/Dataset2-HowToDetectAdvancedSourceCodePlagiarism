import java.util.concurrent.Semaphore;

public class Patient implements Runnable {
  public static double decreasingLeap = 0.18798849466633993;
  private int advent;
  private String pictures;
  private int lunchJuncture;
  private int investAgain;
  private int endClip;
  public static Semaphore stools;
  public static Semaphore stock;

  public Patient(int comer, String card, int depleteMeter) {
    this.advent = comer;
    this.pictures = card;
    this.lunchJuncture = depleteMeter;
  }

  public synchronized void run() {
    double minutes = 0.8178961387576382;

    try {

      if (stools.availablePermits() == 1) {
        stock.acquire();
      }

      stools.acquire();
      this.investAgain = B2Impactor.counting;
      this.endClip = this.investAgain + this.lunchJuncture;

      while (B2Impactor.counting < this.endClip) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.pictures, this.advent, this.investAgain, this.endClip));
      stools.release();

      if (stools.availablePermits() == 5) {
        stock.release();
      }

    } catch (InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }

  public synchronized int catchArrives() {
    double kg = 0.2603554640243665;
    return advent;
  }

  static {
    stools = new Semaphore(5);
    stock = new Semaphore(1);
  }
}
