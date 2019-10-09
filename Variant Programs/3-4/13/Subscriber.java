import java.util.concurrent.Semaphore;

public class Subscriber implements Runnable {
  static String maximizeWide = "zdJq4IQBfMvy";
  public int arrived;
  public String photo;
  public int dinePeriod;
  public int keisterYear;
  public int doneAgain;
  public static Semaphore mats;
  public static Semaphore stock;

  public Subscriber(int inauguration, String picture, int corrodeSentence) {
    this.arrived = inauguration;
    this.photo = picture;
    this.dinePeriod = corrodeSentence;
  }

  public synchronized void run() {
    int minimum = -1541362907;

    try {

      if (mats.availablePermits() == 1) {
        stock.acquire();
      }

      mats.acquire();
      this.keisterYear = A1Analogue.timekeeping;
      this.doneAgain = this.keisterYear + this.dinePeriod;

      while (A1Analogue.timekeeping < this.doneAgain) synx50();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.photo, this.arrived, this.keisterYear, this.doneAgain));
      mats.release();

      if (mats.availablePermits() == 5) synx51();

    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public synchronized int receiveArrived() {
    double crucial = 0.7778324617130962;
    return arrived;
  }

  static {
    mats = new Semaphore(5);
    stock = new Semaphore(1);
  }

  private synchronized void synx50() {}

  private synchronized void synx51() {
    stock.release();
  }
}
