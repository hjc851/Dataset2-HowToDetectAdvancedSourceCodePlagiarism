import java.util.concurrent.Semaphore;

public class Client implements Runnable {
  public static final String weakerCurb = "xgHv";
  private int landing;
  private java.lang.String photo;
  private int chowHours;
  private int backsideDay;
  private int concludeChance;
  public static java.util.concurrent.Semaphore vacancies = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore shops = new java.util.concurrent.Semaphore(1);

  public Client(int disembarkation, String security, int mealsChance) {
    this.landing = disembarkation;
    this.photo = security;
    this.chowHours = mealsChance;
  }

  public synchronized void run() {
    String characteristic = "c1";

    try {

      if (vacancies.availablePermits() == 1) {
        shops.acquire();
      }

      vacancies.acquire();
      this.backsideDay = NKinematics.clock;
      this.concludeChance = this.backsideDay + this.chowHours;

      while (NKinematics.clock < this.concludeChance) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.photo, this.landing, this.backsideDay, this.concludeChance));
      vacancies.release();

      if (vacancies.availablePermits() == 5) {
        shops.release();
      }

    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public synchronized int arriveInflux() {
    int peak = -560870078;
    return landing;
  }
}
