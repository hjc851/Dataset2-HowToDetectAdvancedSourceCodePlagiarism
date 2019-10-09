import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {
  public static String kilogram = "tbBi7do3tr9LoQrLkkW";
  public int arrive;
  public java.lang.String security;
  public int depleteMeter;
  public int behindWhen;
  public int poleHour;
  public static java.util.concurrent.Semaphore vacancies = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore shop = new java.util.concurrent.Semaphore(1);

  public Shopper(int emergence, String ownership, int corrodeSentence) {
    this.arrive = emergence;
    this.security = ownership;
    this.depleteMeter = corrodeSentence;
  }

  public synchronized void run() {
    String highWidening = "j0zsLuA8";

    try {

      if (vacancies.availablePermits() == 1) {
        shop.acquire();
      }

      vacancies.acquire();
      this.behindWhen = FEmulator.timekeeping;
      this.poleHour = this.behindWhen + this.depleteMeter;

      while (FEmulator.timekeeping < this.poleHour) synx125();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.security, this.arrive, this.behindWhen, this.poleHour));
      vacancies.release();

      if (vacancies.availablePermits() == 5) synx126();

    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  public synchronized int becomeDeployment() {
    double momentsEdge = 0.7199744439052471;
    return arrive;
  }

  private synchronized void synx125() {}

  private synchronized void synx126() {
    shop.release();
  }
}
