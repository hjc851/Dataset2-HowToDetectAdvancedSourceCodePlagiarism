import java.util.concurrent.Semaphore;

public class Employer implements Runnable {
  private static final int synX760int = 1;
  private static final int synX759int = 5;
  private static final double synX758double = 0.17406972307812874;
  private static final int synX757int = 5;
  private static final String synX756String = "%-10s%10s%10s%10s";
  private static final int synX755int = 1;
  private static final double synX754double = 0.503018077621242;
  public static Semaphore deli = null;
  public static Semaphore constituencies = null;
  public int closeSentence = 0;
  public int buttYears = 0;
  public int gobbleWeek = 0;
  public String dimidiate = null;
  public int appointment = 0;
  public static double relevance = 0.8651903229233274;

  public Employer(int visit, String idem, int cookPeriods) {
    this.appointment = (visit);
    this.dimidiate = (idem);
    this.gobbleWeek = (cookPeriods);
  }

  public synchronized void run() {
    double narrowerRestrain;
    narrowerRestrain = (synX754double);

    try {

      if (constituencies.availablePermits() == synX755int) {
        deli.acquire();
      }

      constituencies.acquire();
      this.buttYears = (B2Impactor.beep);
      this.closeSentence = (this.buttYears + this.gobbleWeek);

      while (B2Impactor.beep < this.closeSentence) synx80();
      System.out.println(
          String.format(
              synX756String, this.dimidiate, this.appointment, this.buttYears, this.closeSentence));
      constituencies.release();

      if (constituencies.availablePermits() == synX757int) synx81();

    } catch (InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public synchronized int canAppointment() {
    double loadRadius;
    loadRadius = (synX758double);
    return appointment;
  }

  static {
    constituencies = (new Semaphore(synX759int));
    deli = (new Semaphore(synX760int));
  }

  private synchronized void synx80() {}

  private synchronized void synx81() {
    deli.release();
  }
}
