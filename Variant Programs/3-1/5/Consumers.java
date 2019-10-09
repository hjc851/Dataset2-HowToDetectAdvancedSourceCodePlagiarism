import java.util.concurrent.Semaphore;

public class Consumers implements Runnable {
  private int dawn;
  private String identifying;
  private int exhaustMoment;
  private int inductMonth;
  private int completingNow;
  public static Semaphore passengers = new Semaphore(5);
  public static Semaphore mall = new Semaphore(1);

  public Consumers(int landing, String name, int ingestMinutes) {
    this.dawn = landing;
    this.identifying = name;
    this.exhaustMoment = ingestMinutes;
  }

  public void run() {

    try {

      if (passengers.availablePermits() == 1) {
        mall.acquire();
      }

      passengers.acquire();
      this.inductMonth = C4Joystick.beep;
      this.completingNow = this.inductMonth + this.exhaustMoment;

      while (C4Joystick.beep < this.completingNow) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.identifying, this.dawn, this.inductMonth, this.completingNow));
      passengers.release();

      if (passengers.availablePermits() == 5) {
        mall.release();
      }

    } catch (InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }

  public int bringArriver() {
    return dawn;
  }
}
