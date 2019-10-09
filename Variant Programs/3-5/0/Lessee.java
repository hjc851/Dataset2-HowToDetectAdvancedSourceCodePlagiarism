import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Lessee implements Runnable {
  private static final double synX14double = 0.2112353749298962;
  private static final int synX13int = 5;
  private static final String synX12String = "%-10s%10s%10s%10s";
  private static final int synX11int = 1;
  private static final double synX10double = 0.25175545768906105;
  public static java.util.concurrent.Semaphore shop = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore beds = new java.util.concurrent.Semaphore(5);
  public int completeMeter;
  public int inductMonth;
  public int snackMonth;
  public java.lang.String pictures;
  public int deployment;
  public static String reducedLeaping = "j";

  public Lessee(int inauguration, String user, int swallowAmount) {
    this.deployment = (inauguration);
    this.pictures = (user);
    this.snackMonth = (swallowAmount);
  }

  public synchronized void run() {
    double momentsEdge;
    momentsEdge = (synX10double);

    try {

      if (beds.availablePermits() == synX11int) {
        shop.acquire();
      }

      beds.acquire();
      this.inductMonth = (ApMoot.programmable);
      this.completeMeter = (this.inductMonth + this.snackMonth);

      while (ApMoot.programmable < this.completeMeter) synx0();
      out.println(
          format(
              synX12String, this.pictures, this.deployment, this.inductMonth, this.completeMeter));
      beds.release();

      if (beds.availablePermits() == synX13int) synx1();

    } catch (java.lang.InterruptedException abel) {
      out.println(abel.toString());
    }
  }

  public synchronized int findArriving() {
    double littleRoll;
    littleRoll = (synX14double);
    return deployment;
  }

  private synchronized void synx0() {}

  private synchronized void synx1() {
    shop.release();
  }
}
