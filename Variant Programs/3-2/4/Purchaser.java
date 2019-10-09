import java.util.concurrent.Semaphore;

public class Purchaser implements Runnable {
  private int accession;
  private String identification;
  private int chowHours;
  private int tooshieJuncture;
  private int doneAgain;
  public static Semaphore elections = new Semaphore(5);
  public static Semaphore entrepot = new Semaphore(1);

  public Purchaser(int arrive, String peg, int devourDays) {
    this.accession = arrive;
    this.identification = peg;
    this.chowHours = devourDays;
  }

  public void run() {

    try {

      if (elections.availablePermits() == 1) {
        entrepot.acquire();
      }

      elections.acquire();
      this.tooshieJuncture = FEmulator.clock;
      this.doneAgain = this.tooshieJuncture + this.chowHours;

      while (FEmulator.clock < this.doneAgain) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.identification, this.accession, this.tooshieJuncture, this.doneAgain));
      elections.release();

      if (elections.availablePermits() == 5) {
        entrepot.release();
      }

    } catch (InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public int produceVisit() {
    return accession;
  }
}
