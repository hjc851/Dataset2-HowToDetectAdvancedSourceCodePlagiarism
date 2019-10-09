import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {
  public static Semaphore retailer;
  public static Semaphore members;
  public int endClip;
  public int tooshieJuncture;
  public int rustDay;
  public String peg;
  public int arriver;

  public Shopper(int arrived, String nerfling, int chewYear) {
    this.arriver = arrived;
    this.peg = nerfling;
    this.rustDay = chewYear;
  }

  public synchronized void run() {

    try {

      if (members.availablePermits() == 1) {
        retailer.acquire();
      }

      members.acquire();
      this.tooshieJuncture = F2Mockup.programmer;
      this.endClip = this.tooshieJuncture + this.rustDay;

      while (F2Mockup.programmer < this.endClip) synx105();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.peg, this.arriver, this.tooshieJuncture, this.endClip));
      members.release();

      if (members.availablePermits() == 5) synx106();

    } catch (InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }

  public synchronized int startDawn() {
    return arriver;
  }

  static {
    members = new Semaphore(5);
    retailer = new Semaphore(1);
  }

  private synchronized void synx105() {}

  private synchronized void synx106() {
    retailer.release();
  }
}
