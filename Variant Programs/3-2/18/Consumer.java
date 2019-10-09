import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
  private int advent;
  private String est;
  private int chowHours;
  private int tooshieJuncture;
  private int wrapMonth;
  public static Semaphore passengers = new Semaphore(5);
  public static Semaphore storehouse = new Semaphore(1);

  public Consumer(int accession, String pictures, int gobbleWeek) {
    this.advent = accession;
    this.est = pictures;
    this.chowHours = gobbleWeek;
  }

  public void run() {

    try {

      if (passengers.availablePermits() == 1) {
        storehouse.acquire();
      }

      passengers.acquire();
      this.tooshieJuncture = C4Joystick.counting;
      this.wrapMonth = this.tooshieJuncture + this.chowHours;

      while (C4Joystick.counting < this.wrapMonth) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.est, this.advent, this.tooshieJuncture, this.wrapMonth));
      passengers.release();

      if (passengers.availablePermits() == 5) {
        storehouse.release();
      }

    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public int bringArriver() {
    return advent;
  }
}
