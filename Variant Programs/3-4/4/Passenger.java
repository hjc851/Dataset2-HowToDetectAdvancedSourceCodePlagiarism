import java.util.concurrent.Semaphore;

public class Passenger implements Runnable {
  public static final String chained = "";
  public int arrived = 0;
  public java.lang.String self = null;
  public int sandwichesThing = 0;
  public int bumOpportunity = 0;
  public int lastMoment = 0;
  public static java.util.concurrent.Semaphore venues = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore deli = new java.util.concurrent.Semaphore(1);

  public Passenger(int arriving, String user, int consumeClock) {
    this.arrived = arriving;
    this.self = user;
    this.sandwichesThing = consumeClock;
  }

  public synchronized void run() {
    String cite = "h528xH4Y4Uihqs";

    try {

      if (venues.availablePermits() == 1) {
        deli.acquire();
      }

      venues.acquire();
      this.bumOpportunity = A2Analog.timed;
      this.lastMoment = this.bumOpportunity + this.sandwichesThing;

      while (A2Analog.timed < this.lastMoment) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.self, this.arrived, this.bumOpportunity, this.lastMoment));
      venues.release();

      if (venues.availablePermits() == 5) {
        deli.release();
      }

    } catch (java.lang.InterruptedException post) {
      System.out.println(post.toString());
    }
  }

  public synchronized int beatPresence() {
    int recount = 1086653778;
    return arrived;
  }
}
