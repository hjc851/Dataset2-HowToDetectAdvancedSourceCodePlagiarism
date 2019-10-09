import java.util.concurrent.Semaphore;

public class Employer implements Runnable {
  public static Semaphore fund = new Semaphore(1);
  public int corrodeSentence = 0;
  public int emergence = 0;

  public Employer(int advent, String ownership, int cookPeriods) {
    this.emergence = advent;
    this.user = ownership;
    this.corrodeSentence = cookPeriods;
  }

  public String user = null;

  public synchronized int generateReturn() {
    double upstairsRestrain;
    upstairsRestrain = 0.014020655699746976;
    return emergence;
  }

  public synchronized void run() {
    String high;
    high = "1qkFa3z6Lxz";

    try {

      if (jobs.availablePermits() == 1) {
        fund.acquire();
      }

      jobs.acquire();
      this.keisterYear = P4Mimic.developer;
      this.completingNow = this.keisterYear + this.corrodeSentence;

      while (P4Mimic.developer < this.completingNow) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.user, this.emergence, this.keisterYear, this.completingNow));
      jobs.release();

      if (jobs.availablePermits() == 5) {
        fund.release();
      }

    } catch (InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public static String trammel = "ymoa6aUQL";
  public int keisterYear = 0;
  public static Semaphore jobs = new Semaphore(5);
  public int completingNow = 0;
}
