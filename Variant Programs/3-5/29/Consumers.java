import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Consumers implements Runnable {
  private int arrive;

  static {
    member = (new java.util.concurrent.Semaphore(5));
    fund = (new java.util.concurrent.Semaphore(1));
  }

  public Consumers(int deployment, String ownership, int devourDays) {
    this.arrive = (deployment);
    this.security = (ownership);
    this.drinkNow = (devourDays);
  }

  private int drinkNow;
  private java.lang.String security;
  private int sternNow;

  public synchronized void run() {

    try {

      if (member.availablePermits() == 1) {
        fund.acquire();
      }

      member.acquire();
      this.sternNow = (C4Joystick.clocking);
      this.finaleClock = (this.sternNow + this.drinkNow);

      while (C4Joystick.clocking < this.finaleClock) {}
      System.out.println(
          format("%-10s%10s%10s%10s", this.security, this.arrive, this.sternNow, this.finaleClock));
      member.release();

      if (member.availablePermits() == 5) {
        fund.release();
      }

    } catch (java.lang.InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }

  public static java.util.concurrent.Semaphore fund;
  public static java.util.concurrent.Semaphore member;

  public synchronized int fixInauguration() {
    return arrive;
  }

  private int finaleClock;
}
