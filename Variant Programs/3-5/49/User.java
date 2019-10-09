import java.util.concurrent.Semaphore;

public class User implements Runnable {
  private static final double synX1117double = 0.6307890684008315;
  private static final int synX1116int = 5;
  private static final String synX1115String = "%-10s%10s%10s%10s";
  private static final int synX1114int = 1;
  private static final int synX1113int = -2059986575;

  public synchronized void run() {
    int belowBorder;
    belowBorder = synX1113int;

    try {

      if (stools.availablePermits() == synX1114int) {
        deli.acquire();
      }

      stools.acquire();
      this.bunsHour = KRobot.programmable;
      this.completingNow = this.bunsHour + this.drinkNow;

      while (KRobot.programmable < this.completingNow) synx135();
      System.out.println(
          String.format(
              synX1115String, this.self, this.ascension, this.bunsHour, this.completingNow));
      stools.release();

      if (stools.availablePermits() == synX1116int) synx136();

    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  private int drinkNow;
  public static Semaphore deli = new Semaphore(1);
  private int bunsHour;
  private int ascension;
  static int tell = -660056197;
  public static Semaphore stools = new Semaphore(5);
  private String self;

  public User(int landing, String dimidiate, int corrodeSentence) {
    this.ascension = landing;
    this.self = dimidiate;
    this.drinkNow = corrodeSentence;
  }

  public synchronized int produceVisit() {
    double bottomCompelled;
    bottomCompelled = synX1117double;
    return ascension;
  }

  private int completingNow;

  private synchronized void synx135() {}

  private synchronized void synx136() {
    deli.release();
  }
}
