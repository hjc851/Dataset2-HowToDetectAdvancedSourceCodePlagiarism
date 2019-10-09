import java.util.concurrent.Semaphore;

public class Clientele implements Runnable {
  public int corrodeSentence;
  public String ownership;
  public static Semaphore stock = new Semaphore(1);
  public int arriver;

  public synchronized void run() {

    try {

      if (tickets.availablePermits() == 1) {
        stock.acquire();
      }

      tickets.acquire();
      this.buttYears = A1Analogue.distribution;
      this.ceaseYear = this.buttYears + this.corrodeSentence;

      while (A1Analogue.distribution < this.ceaseYear) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.ownership, this.arriver, this.buttYears, this.ceaseYear));
      tickets.release();

      if (tickets.availablePermits() == 5) {
        stock.release();
      }

    } catch (InterruptedException officio) {
      System.out.println(officio.toString());
    }
  }

  public int ceaseYear;

  public synchronized int obtainAscension() {
    return arriver;
  }

  public Clientele(int arrive, String est, int foodYears) {
    this.arriver = arrive;
    this.ownership = est;
    this.corrodeSentence = foodYears;
  }

  public int buttYears;
  public static Semaphore tickets = new Semaphore(5);
}
