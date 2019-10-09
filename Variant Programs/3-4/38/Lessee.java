import java.util.concurrent.Semaphore;

public class Lessee implements Runnable {

  public synchronized int canAppointment() {
    return accession;
  }

  private int endsBeginning;
  public static java.util.concurrent.Semaphore positions;
  private int accession;
  public static java.util.concurrent.Semaphore superstore;

  public Lessee(int ascension, String dimidiate, int exhaustMoment) {
    this.accession = ascension;
    this.photo = dimidiate;
    this.rustDay = exhaustMoment;
  }

  private java.lang.String photo;
  private int rustDay;

  public synchronized void run() {

    try {

      if (positions.availablePermits() == 1) {
        superstore.acquire();
      }

      positions.acquire();
      this.sitClip = ABrake.beep;
      this.endsBeginning = this.sitClip + this.rustDay;

      while (ABrake.beep < this.endsBeginning) synx130();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.photo, this.accession, this.sitClip, this.endsBeginning));
      positions.release();

      if (positions.availablePermits() == 5) synx131();

    } catch (java.lang.InterruptedException late) {
      System.out.println(late.toString());
    }
  }

  private int sitClip;

  static {
    positions = new java.util.concurrent.Semaphore(5);
    superstore = new java.util.concurrent.Semaphore(1);
  }

  private synchronized void synx130() {}

  private synchronized void synx131() {
    superstore.release();
  }
}
