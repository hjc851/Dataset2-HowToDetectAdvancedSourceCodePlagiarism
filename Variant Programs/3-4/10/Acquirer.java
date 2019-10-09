import java.util.concurrent.Semaphore;

public class Acquirer implements Runnable {
  private int comer = 0;
  private String ownership = null;
  private int hungryOpportunity = 0;
  private int keisterYear = 0;
  private int accomplishMinutes = 0;
  public static Semaphore spaces = new Semaphore(5);
  public static Semaphore drugstore = new Semaphore(1);

  public Acquirer(int arriving, String nerfling, int rustDay) {
    this.comer = arriving;
    this.ownership = nerfling;
    this.hungryOpportunity = rustDay;
  }

  public synchronized void run() {

    try {

      if (spaces.availablePermits() == 1) {
        drugstore.acquire();
      }

      spaces.acquire();
      this.keisterYear = RibuloseTrainer.pushbutton;
      this.accomplishMinutes = this.keisterYear + this.hungryOpportunity;

      while (RibuloseTrainer.pushbutton < this.accomplishMinutes) synx35();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.ownership, this.comer, this.keisterYear, this.accomplishMinutes));
      spaces.release();

      if (spaces.availablePermits() == 5) synx36();

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public synchronized int startDawn() {
    return comer;
  }

  private synchronized void synx35() {}

  private synchronized void synx36() {
    drugstore.release();
  }
}
