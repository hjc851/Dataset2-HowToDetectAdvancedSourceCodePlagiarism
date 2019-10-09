import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Employer implements Runnable {
  private static final int synX657int = 5;
  private static final String synX656String = "%-10s%10s%10s%10s";
  private static final int synX655int = 1;
  private static final double synX654double = 0.5034724264563231;
  private static final double synX653double = 0.1571006009896636;
  public int ingestMinutes;
  public int accession;
  public int fannyPeriod;
  public static Semaphore fund;

  public Employer(int arriver, String security, int exhaustMoment) {
    this.accession = arriver;
    this.handle = security;
    this.ingestMinutes = exhaustMoment;
  }

  static double high = 0.22967871350816638;
  public static Semaphore venues;

  public synchronized int bringArriver() {
    double minh = synX653double;
    return accession;
  }

  public int breakOpportunity;

  static {
    venues = new Semaphore(5);
    fund = new Semaphore(1);
  }

  public String handle;

  public synchronized void run() {
    double elevationDemarcation = synX654double;

    try {

      if (venues.availablePermits() == synX655int) {
        fund.acquire();
      }

      venues.acquire();
      this.fannyPeriod = ApMoot.clock;
      this.breakOpportunity = this.fannyPeriod + this.ingestMinutes;

      while (ApMoot.clock < this.breakOpportunity) {}
      out.println(
          String.format(
              synX656String, this.handle, this.accession, this.fannyPeriod, this.breakOpportunity));
      venues.release();

      if (venues.availablePermits() == synX657int) {
        fund.release();
      }

    } catch (InterruptedException former) {
      out.println(former.toString());
    }
  }
}
