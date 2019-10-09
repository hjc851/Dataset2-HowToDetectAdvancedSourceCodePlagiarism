import java.util.concurrent.Semaphore;

public class Consumers implements Runnable {
  private int advent;
  private java.lang.String user;
  private int dietHour;
  private int sternNow;
  private int endingThing;
  public static java.util.concurrent.Semaphore members = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore reposition = new java.util.concurrent.Semaphore(1);

  public Consumers(int dawn, String map, int ingestMinutes) {
    this.advent = dawn;
    this.user = map;
    this.dietHour = ingestMinutes;
  }

  public void run() {

    try {

      if (members.availablePermits() == 1) {
        reposition.acquire();
      }

      members.acquire();
      this.sternNow = A1Analogue.sandglass;
      this.endingThing = this.sternNow + this.dietHour;

      while (A1Analogue.sandglass < this.endingThing) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.user, this.advent, this.sternNow, this.endingThing));
      members.release();

      if (members.availablePermits() == 5) {
        reposition.release();
      }

    } catch (java.lang.InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public int developAppearance() {
    return advent;
  }
}
