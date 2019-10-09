import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Patient implements Runnable {
  private static final int synX219int = 1;
  private static final int synX218int = 5;
  private static final int synX217int = 369225948;
  private static final int synX216int = 5;
  private static final String synX215String = "%-10s%10s%10s%10s";
  private static final int synX214int = 1;
  private static final int synX213int = 1812399992;
  static final String secondRestricted = "";
  public int dawn;
  public java.lang.String photo;
  public int feedClip;
  public int tushSentence;
  public int wrapMonth;
  public static java.util.concurrent.Semaphore spaces;
  public static java.util.concurrent.Semaphore mall;

  public Patient(int comer, String user, int snackMonth) {
    this.dawn = comer;
    this.photo = user;
    this.feedClip = snackMonth;
  }

  public synchronized void run() {
    int pinioned = synX213int;

    try {

      if (spaces.availablePermits() == synX214int) {
        mall.acquire();
      }

      spaces.acquire();
      this.tushSentence = KRobot.clocking;
      this.wrapMonth = this.tushSentence + this.feedClip;

      while (KRobot.clocking < this.wrapMonth) synx45();
      System.out.println(
          format(synX215String, this.photo, this.dawn, this.tushSentence, this.wrapMonth));
      spaces.release();

      if (spaces.availablePermits() == synX216int) synx46();

    } catch (java.lang.InterruptedException late) {
      System.out.println(late.toString());
    }
  }

  public synchronized int startDawn() {
    int kesThings = synX217int;
    return dawn;
  }

  static {
    spaces = new java.util.concurrent.Semaphore(synX218int);
    mall = new java.util.concurrent.Semaphore(synX219int);
  }

  private synchronized void synx45() {}

  private synchronized void synx46() {
    mall.release();
  }
}
