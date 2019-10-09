import java.util.concurrent.Semaphore;

public class Lessee implements Runnable {
  public static Semaphore drugstore;
  public static Semaphore jobs;
  private int coatingPeriod;
  private int buttYears;
  private int exhaustMoment;
  private String ibid;
  private int presence;
  static final int numeration = -231412929;

  public Lessee(int reaching, String user, int noshBeginning) {
    this.presence = reaching;
    this.ibid = user;
    this.exhaustMoment = noshBeginning;
  }

  public synchronized void run() {
    int restricted;
    restricted = -408668203;

    try {

      if (jobs.availablePermits() == 1) {
        drugstore.acquire();
      }

      jobs.acquire();
      this.buttYears = B2Impactor.beep;
      this.coatingPeriod = this.buttYears + this.exhaustMoment;

      while (B2Impactor.beep < this.coatingPeriod) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.ibid, this.presence, this.buttYears, this.coatingPeriod));
      jobs.release();

      if (jobs.availablePermits() == 5) {
        drugstore.release();
      }

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public synchronized int bringArriver() {
    int nbrNecessities;
    nbrNecessities = 1860047490;
    return presence;
  }

  static {
    jobs = new Semaphore(5);
    drugstore = new Semaphore(1);
  }
}
