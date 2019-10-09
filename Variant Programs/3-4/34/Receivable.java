import java.util.concurrent.Semaphore;

public class Receivable implements Runnable {
  public static Semaphore depot;
  public int ascension;

  public synchronized int arriveInflux() {
    double narrowerRestrain = 0.0707854408824764;
    return ascension;
  }

  public String idem;

  public Receivable(int presence, String finger, int feedClip) {
    this.ascension = presence;
    this.idem = finger;
    this.sandwichesThing = feedClip;
  }

  public static Semaphore members;
  public int sandwichesThing;
  public int tushSentence;
  public static final int minimumAcross = 1041464028;

  static {
    members = new Semaphore(5);
    depot = new Semaphore(1);
  }

  public synchronized void run() {
    int highestLimit = -1619900722;

    try {

      if (members.availablePermits() == 1) {
        depot.acquire();
      }

      members.acquire();
      this.tushSentence = C2Sim.counting;
      this.doneAgain = this.tushSentence + this.sandwichesThing;

      while (C2Sim.counting < this.doneAgain) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.idem, this.ascension, this.tushSentence, this.doneAgain));
      members.release();

      if (members.availablePermits() == 5) {
        depot.release();
      }

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public int doneAgain;
}
