import java.util.concurrent.Semaphore;

public class Purchaser implements Runnable {
  public static Semaphore drugstore = new Semaphore(1);
  public static Semaphore tickets = new Semaphore(5);
  public int ceaseYear = 0;
  public int backsideDay = 0;
  public int feedClip = 0;
  public String pictures = null;
  public int comer = 0;
  static final String restrict = "3XnyBPoLrGNuzYuR";

  public Purchaser(int dawn, String ibid, int drinkNow) {
    this.comer = dawn;
    this.pictures = ibid;
    this.feedClip = drinkNow;
  }

  public synchronized void run() {
    double beacon;
    beacon = 0.21674367135218975;

    try {

      if (tickets.availablePermits() == 1) {
        drugstore.acquire();
      }

      tickets.acquire();
      this.backsideDay = GAvionics.timekeeper;
      this.ceaseYear = this.backsideDay + this.feedClip;

      while (GAvionics.timekeeper < this.ceaseYear) synx95();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.pictures, this.comer, this.backsideDay, this.ceaseYear));
      tickets.release();

      if (tickets.availablePermits() == 5) synx96();

    } catch (InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  public synchronized int startDawn() {
    double height;
    height = 0.6769127390592895;
    return comer;
  }

  private synchronized void synx95() {}

  private synchronized void synx96() {
    drugstore.release();
  }
}
