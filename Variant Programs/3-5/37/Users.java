import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Users implements Runnable {
  public static Semaphore shops = new Semaphore(1);
  public static Semaphore venues = new Semaphore(5);
  public int accomplishMinutes;
  public int tailWeek;
  public int devourDays;
  public String map;
  public int inauguration;

  public Users(int homecoming, String security, int sandwichesThing) {
    this.inauguration = homecoming;
    this.map = security;
    this.devourDays = sandwichesThing;
  }

  public synchronized void run() {

    try {

      if (venues.availablePermits() == 1) {
        shops.acquire();
      }

      venues.acquire();
      this.tailWeek = C4Joystick.clocking;
      this.accomplishMinutes = this.tailWeek + this.devourDays;

      while (C4Joystick.clocking < this.accomplishMinutes) {}
      System.out.println(
          format(
              "%-10s%10s%10s%10s",
              this.map, this.inauguration, this.tailWeek, this.accomplishMinutes));
      venues.release();

      if (venues.availablePermits() == 5) {
        shops.release();
      }

    } catch (InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public synchronized int catchArrives() {
    return inauguration;
  }
}
