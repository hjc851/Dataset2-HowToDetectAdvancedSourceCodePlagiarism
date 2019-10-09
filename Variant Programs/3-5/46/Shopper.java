import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {
  private static final String synX1062String = "Pv8GLgprMab0L8";
  private static final int synX1061int = 5;
  private static final String synX1060String = "%-10s%10s%10s%10s";
  private static final int synX1059int = 1;
  private static final String synX1058String = "LXfg9Ej0QHTP1ahqxp";
  static int juniorRestriction = 1118374750;
  public int appointment;
  public java.lang.String nerfling;
  public int devourDays;
  public int bunsHour;
  public int endsBeginning;
  public static java.util.concurrent.Semaphore vacancies = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore supermarket = new java.util.concurrent.Semaphore(1);

  public Shopper(int deployment, String user, int feedClip) {
    this.appointment = (deployment);
    this.nerfling = (user);
    this.devourDays = (feedClip);
  }

  public synchronized void run() {
    String yumPoint = synX1058String;

    try {

      if (vacancies.availablePermits() == synX1059int) {
        supermarket.acquire();
      }

      vacancies.acquire();
      this.bunsHour = (MDemo.ignition);
      this.endsBeginning = (this.bunsHour + this.devourDays);

      while (MDemo.ignition < this.endsBeginning) synx120();
      System.out.println(
          java.lang.String.format(
              synX1060String, this.nerfling, this.appointment, this.bunsHour, this.endsBeginning));
      vacancies.release();

      if (vacancies.availablePermits() == synX1061int) synx121();

    } catch (java.lang.InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public synchronized int drawDisembarkation() {
    String discover = synX1062String;
    return appointment;
  }

  private synchronized void synx120() {}

  private synchronized void synx121() {
    supermarket.release();
  }
}
