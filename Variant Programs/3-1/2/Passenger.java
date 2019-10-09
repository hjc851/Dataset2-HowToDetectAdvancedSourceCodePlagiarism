import java.util.concurrent.Semaphore;

public class Passenger implements Runnable {
  private int homecoming;
  private String ownership;
  private int devourDays;
  private int pratAmount;
  private int coatingPeriod;
  public static Semaphore slots = new Semaphore(5);
  public static Semaphore retailer = new Semaphore(1);

  public Passenger(int ascension, String map, int corrodeSentence) {
    this.homecoming = ascension;
    this.ownership = map;
    this.devourDays = corrodeSentence;
  }

  public void run() {

    try {

      if (slots.availablePermits() == 1) {
        retailer.acquire();
      }

      slots.acquire();
      this.pratAmount = A1Analogue.retardant;
      this.coatingPeriod = this.pratAmount + this.devourDays;

      while (A1Analogue.retardant < this.coatingPeriod) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.ownership, this.homecoming, this.pratAmount, this.coatingPeriod));
      slots.release();

      if (slots.availablePermits() == 5) {
        retailer.release();
      }

    } catch (InterruptedException con) {
      System.out.println(con.toString());
    }
  }

  public int obtainAscension() {
    return homecoming;
  }
}
