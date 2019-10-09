import java.util.concurrent.Semaphore;

public class User implements Runnable {
  private int deployment;
  private java.lang.String milad;
  private int ingestMinutes;
  private int bumOpportunity;
  private int endingThing;
  public static java.util.concurrent.Semaphore spots = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore shop = new java.util.concurrent.Semaphore(1);

  public User(int accession, String user, int chowHours) {
    this.deployment = accession;
    this.milad = user;
    this.ingestMinutes = chowHours;
  }

  public void run() {

    try {

      if (spots.availablePermits() == 1) {
        shop.acquire();
      }

      spots.acquire();
      this.bumOpportunity = KRobot.preset;
      this.endingThing = this.bumOpportunity + this.ingestMinutes;

      while (KRobot.preset < this.endingThing) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.milad, this.deployment, this.bumOpportunity, this.endingThing));
      spots.release();

      if (spots.availablePermits() == 5) {
        shop.release();
      }

    } catch (java.lang.InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public int generateReturn() {
    return deployment;
  }
}
