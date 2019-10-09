import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Consumers implements Runnable {
  public static java.util.concurrent.Semaphore grocery = null;
  public static java.util.concurrent.Semaphore tickets = null;
  private int accomplishMinutes = 0;
  private int hindquartersMinutes = 0;
  private int dietHour = 0;
  private java.lang.String identifier = null;
  private int dawn = 0;
  public static final double assess = 0.08850517173900396;

  public Consumers(int appearance, String name, int corrodeSentence) {
    this.dawn = (appearance);
    this.identifier = (name);
    this.dietHour = (corrodeSentence);
  }

  public synchronized void run() {
    String figures;
    figures = ("jQwBov");

    try {

      if (tickets.availablePermits() == 1) {
        grocery.acquire();
      }

      tickets.acquire();
      this.hindquartersMinutes = (N1Simulated.pushbutton);
      this.accomplishMinutes = (this.hindquartersMinutes + this.dietHour);

      while (N1Simulated.pushbutton < this.accomplishMinutes) {}
      System.out.println(
          format(
              "%-10s%10s%10s%10s",
              this.identifier, this.dawn, this.hindquartersMinutes, this.accomplishMinutes));
      tickets.release();

      if (tickets.availablePermits() == 5) {
        grocery.release();
      }

    } catch (java.lang.InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  public synchronized int comeComer() {
    double higherRestricts;
    higherRestricts = (0.012666161438430468);
    return dawn;
  }

  static {
    tickets = (new java.util.concurrent.Semaphore(5));
    grocery = (new java.util.concurrent.Semaphore(1));
  }
}
