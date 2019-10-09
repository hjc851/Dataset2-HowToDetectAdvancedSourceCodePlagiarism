import java.util.concurrent.Semaphore;

public class Purchaser implements Runnable {
  private int landing;
  private String identification;
  private int mealsChance;
  private int bunsHour;
  private int finaleClock;
  public static Semaphore member = new Semaphore(5);
  public static Semaphore fund = new Semaphore(1);

  public Purchaser(int arriver, String security, int foodYears) {
    this.landing = arriver;
    this.identification = security;
    this.mealsChance = foodYears;
  }

  public void run() {

    try {

      if (member.availablePermits() == 1) {
        fund.acquire();
      }

      member.acquire();
      this.bunsHour = N1Simulated.count;
      this.finaleClock = this.bunsHour + this.mealsChance;

      while (N1Simulated.count < this.finaleClock) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.identification, this.landing, this.bunsHour, this.finaleClock));
      member.release();

      if (member.availablePermits() == 5) {
        fund.release();
      }

    } catch (InterruptedException con) {
      System.out.println(con.toString());
    }
  }

  public int comeComer() {
    return landing;
  }
}
