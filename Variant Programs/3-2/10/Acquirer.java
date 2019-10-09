import java.util.concurrent.Semaphore;

public class Acquirer implements Runnable {
  private int landing;
  private String finger;
  private int cookPeriods;
  private int derriereDays;
  private int completeMeter;
  public static Semaphore beds = new Semaphore(5);
  public static Semaphore retailer = new Semaphore(1);

  public Acquirer(int arriver, String nerfling, int foodYears) {
    this.landing = arriver;
    this.finger = nerfling;
    this.cookPeriods = foodYears;
  }

  public void run() {

    try {

      if (beds.availablePermits() == 1) {
        retailer.acquire();
      }

      beds.acquire();
      this.derriereDays = P3Mock.beep;
      this.completeMeter = this.derriereDays + this.cookPeriods;

      while (P3Mock.beep < this.completeMeter) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.finger, this.landing, this.derriereDays, this.completeMeter));
      beds.release();

      if (beds.availablePermits() == 5) {
        retailer.release();
      }

    } catch (InterruptedException officio) {
      System.out.println(officio.toString());
    }
  }

  public int drawDisembarkation() {
    return landing;
  }
}
