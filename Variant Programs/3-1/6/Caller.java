import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  private int disembarkation;
  private String nerfling;
  private int devourDays;
  private int tooshieJuncture;
  private int doneAgain;
  public static Semaphore spots = new Semaphore(5);
  public static Semaphore stock = new Semaphore(1);

  public Caller(int appointment, String self, int drinkNow) {
    this.disembarkation = appointment;
    this.nerfling = self;
    this.devourDays = drinkNow;
  }

  public void run() {

    try {

      if (spots.availablePermits() == 1) {
        stock.acquire();
      }

      spots.acquire();
      this.tooshieJuncture = ApMoot.scheduler;
      this.doneAgain = this.tooshieJuncture + this.devourDays;

      while (ApMoot.scheduler < this.doneAgain) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.nerfling, this.disembarkation, this.tooshieJuncture, this.doneAgain));
      spots.release();

      if (spots.availablePermits() == 5) {
        stock.release();
      }

    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public int goReaching() {
    return disembarkation;
  }
}
