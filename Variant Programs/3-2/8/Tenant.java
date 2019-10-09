import java.util.concurrent.Semaphore;

public class Tenant implements Runnable {
  private int deployment;
  private String ibid;
  private int devourDays;
  private int bunsHour;
  private int finalHours;
  public static Semaphore passengers = new Semaphore(5);
  public static Semaphore drugstore = new Semaphore(1);

  public Tenant(int arrive, String card, int depleteMeter) {
    this.deployment = arrive;
    this.ibid = card;
    this.devourDays = depleteMeter;
  }

  public void run() {

    try {

      if (passengers.availablePermits() == 1) {
        drugstore.acquire();
      }

      passengers.acquire();
      this.bunsHour = HManikin.bomb;
      this.finalHours = this.bunsHour + this.devourDays;

      while (HManikin.bomb < this.finalHours) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.ibid, this.deployment, this.bunsHour, this.finalHours));
      passengers.release();

      if (passengers.availablePermits() == 5) {
        drugstore.release();
      }

    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public int arriveInflux() {
    return deployment;
  }
}
