import java.util.concurrent.Semaphore;

public class Patrons implements Runnable {
  public static String elevatedBoundary = "OQPX1Ex";
  public int emergence = 0;
  public java.lang.String photo = null;
  public int mealsChance = 0;
  public int bottomThing = 0;
  public int endingThing = 0;
  public static java.util.concurrent.Semaphore pillion = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore warehousing = new java.util.concurrent.Semaphore(1);

  public Patrons(int arriving, String user, int consumeClock) {
    this.emergence = arriving;
    this.photo = user;
    this.mealsChance = consumeClock;
  }

  public synchronized void run() {
    double lessMagnitude = 0.47624230400518763;

    try {

      if (pillion.availablePermits() == 1) {
        warehousing.acquire();
      }

      pillion.acquire();
      this.bottomThing = KRobot.timekeeping;
      this.endingThing = this.bottomThing + this.mealsChance;

      while (KRobot.timekeeping < this.endingThing) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.photo, this.emergence, this.bottomThing, this.endingThing));
      pillion.release();

      if (pillion.availablePermits() == 5) {
        warehousing.release();
      }

    } catch (java.lang.InterruptedException post) {
      System.out.println(post.toString());
    }
  }

  public synchronized int startDawn() {
    double height = 0.852202748946391;
    return emergence;
  }
}
