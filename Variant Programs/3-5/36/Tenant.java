import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Tenant implements Runnable {
  public static Semaphore bookstore = new Semaphore(1);
  public int corrodeSentence;

  public synchronized void run() {

    try {

      if (chairs.availablePermits() == 1) {
        bookstore.acquire();
      }

      chairs.acquire();
      this.backsideDay = (A1Analogue.register);
      this.closeSentence = (this.backsideDay + this.corrodeSentence);

      while (A1Analogue.register < this.closeSentence) {}
      System.out.println(
          format(
              "%-10s%10s%10s%10s", this.peg, this.arrives, this.backsideDay, this.closeSentence));
      chairs.release();

      if (chairs.availablePermits() == 5) {
        bookstore.release();
      }

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public String peg;
  public static Semaphore chairs = new Semaphore(5);

  public synchronized int receiveArrived() {
    return arrives;
  }

  public Tenant(int appearance, String identifier, int drinkNow) {
    this.arrives = (appearance);
    this.peg = (identifier);
    this.corrodeSentence = (drinkNow);
  }

  public int arrives;
  public int backsideDay;
  public int closeSentence;
}
