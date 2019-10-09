import java.util.concurrent.Semaphore;

public class Acquirer implements Runnable {
  private static final int synX871int = 5;
  private static final String synX870String = "%-10s%10s%10s%10s";
  private static final int synX869int = 1;

  public Acquirer(int dawn, String dimidiate, int drinkNow) {
    this.accession = (dawn);
    this.identification = (dimidiate);
    this.depleteMeter = (drinkNow);
  }

  private int depleteMeter;
  public static Semaphore votes = new Semaphore(5);

  public synchronized void run() {

    try {

      if (votes.availablePermits() == synX869int) {
        boughten.acquire();
      }

      votes.acquire();
      this.rumpMoment = (RibuloseTrainer.clock);
      this.poleHour = (this.rumpMoment + this.depleteMeter);

      while (RibuloseTrainer.clock < this.poleHour) synx95();
      System.out.println(
          String.format(
              synX870String, this.identification, this.accession, this.rumpMoment, this.poleHour));
      votes.release();

      if (votes.availablePermits() == synX871int) synx96();

    } catch (InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  private int accession;
  private int rumpMoment;
  public static Semaphore boughten = new Semaphore(1);
  private int poleHour;

  public synchronized int haveEmergence() {
    return accession;
  }

  private String identification;

  private synchronized void synx95() {}

  private synchronized void synx96() {
    boughten.release();
  }
}
