import java.util.concurrent.Semaphore;

public class Users implements Runnable {
  public int visit = 0;
  public String ibid = null;
  public int chowHours = 0;
  public int tushSentence = 0;
  public int terminatePeriods = 0;
  public static Semaphore mats = new Semaphore(5);
  public static Semaphore garner = new Semaphore(1);

  public Users(int deployment, String idem, int rustDay) {
    this.visit = deployment;
    this.ibid = idem;
    this.chowHours = rustDay;
  }

  public synchronized void run() {

    try {

      if (mats.availablePermits() == 1) {
        garner.acquire();
      }

      mats.acquire();
      this.tushSentence = BlSimulations.timing;
      this.terminatePeriods = this.tushSentence + this.chowHours;

      while (BlSimulations.timing < this.terminatePeriods) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.ibid, this.visit, this.tushSentence, this.terminatePeriods));
      mats.release();

      if (mats.availablePermits() == 5) {
        garner.release();
      }

    } catch (InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }

  public synchronized int canAppointment() {
    return visit;
  }
}
