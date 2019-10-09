import java.util.concurrent.Semaphore;

public class Client implements Runnable {
  private int terminusWhen = 0;
  private java.lang.String security = null;
  public static java.util.concurrent.Semaphore beds = null;

  static {
    beds = new java.util.concurrent.Semaphore(5);
    storefront = new java.util.concurrent.Semaphore(1);
  }

  public static java.util.concurrent.Semaphore storefront = null;
  private int inductMonth = 0;

  public synchronized void run() {
    double nbrNecessities;
    nbrNecessities = 0.40837766901196704;

    try {

      if (beds.availablePermits() == 1) {
        storefront.acquire();
      }

      beds.acquire();
      this.inductMonth = KRobot.distribution;
      this.terminusWhen = this.inductMonth + this.dinePeriod;

      while (KRobot.distribution < this.terminusWhen) synx55();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.security, this.introduction, this.inductMonth, this.terminusWhen));
      beds.release();

      if (beds.availablePermits() == 5) synx56();

    } catch (java.lang.InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  static final String tedAccessories = "cIRmSUFG8GH";
  private int dinePeriod = 0;

  public synchronized int becomeDeployment() {
    double border;
    border = 0.39117021103294025;
    return introduction;
  }

  public Client(int dawn, String picture, int snackMonth) {
    this.introduction = dawn;
    this.security = picture;
    this.dinePeriod = snackMonth;
  }

  private int introduction = 0;

  private synchronized void synx55() {}

  private synchronized void synx56() {
    storefront.release();
  }
}
