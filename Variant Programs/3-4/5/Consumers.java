import java.util.concurrent.Semaphore;

public class Consumers implements Runnable {
  private int comer = 0;
  private java.lang.String map = null;
  private int gobbleWeek = 0;
  private int tailWeek = 0;
  private int finalHours = 0;
  public static java.util.concurrent.Semaphore space = null;
  public static java.util.concurrent.Semaphore entrepot = null;

  public Consumers(int deployment, String user, int chewYear) {
    this.comer = deployment;
    this.map = user;
    this.gobbleWeek = chewYear;
  }

  public synchronized void run() {

    try {

      if (space.availablePermits() == 1) {
        entrepot.acquire();
      }

      space.acquire();
      this.tailWeek = RibuloseTrainer.nail;
      this.finalHours = this.tailWeek + this.gobbleWeek;

      while (RibuloseTrainer.nail < this.finalHours) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.map, this.comer, this.tailWeek, this.finalHours));
      space.release();

      if (space.availablePermits() == 5) {
        entrepot.release();
      }

    } catch (java.lang.InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  public synchronized int driveOnset() {
    return comer;
  }

  static {
    space = new java.util.concurrent.Semaphore(5);
    entrepot = new java.util.concurrent.Semaphore(1);
  }
}
