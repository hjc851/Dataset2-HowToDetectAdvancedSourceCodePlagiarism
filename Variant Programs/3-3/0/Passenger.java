import java.util.concurrent.Semaphore;

public class Passenger implements Runnable {
  public static java.util.concurrent.Semaphore stock = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore slots = new java.util.concurrent.Semaphore(5);
  public int ceaseYear;
  public int placeMeter;
  public int sandwichesThing;
  public java.lang.String user;
  public int reaching;
  public static final double pinioned = 0.9323680992655007;

  public Passenger(int arrived, String ibid, int gobbleWeek) {
    this.reaching = arrived;
    this.user = ibid;
    this.sandwichesThing = gobbleWeek;
  }

  public synchronized void run() {
    String tonality;
    tonality = "LIDUXfThF";

    try {

      if (slots.availablePermits() == 1) {
        stock.acquire();
      }

      slots.acquire();
      this.placeMeter = A3Modelling.stopwatch;
      this.ceaseYear = this.placeMeter + this.sandwichesThing;

      while (A3Modelling.stopwatch < this.ceaseYear) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.user, this.reaching, this.placeMeter, this.ceaseYear));
      slots.release();

      if (slots.availablePermits() == 5) {
        stock.release();
      }

    } catch (java.lang.InterruptedException late) {
      System.out.println(late.toString());
    }
  }

  public synchronized int developAppearance() {
    String depressShackled;
    depressShackled = "DYD";
    return reaching;
  }
}
