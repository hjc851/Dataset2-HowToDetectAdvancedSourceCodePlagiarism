import java.util.concurrent.Semaphore;

public class Lessee implements Runnable {
  public static Semaphore stow = new Semaphore(1);
  public static Semaphore constituencies = new Semaphore(5);
  public int ceaseYear;
  public int tailWeek;
  public int mealsChance;
  public String finger;
  public int dawn;
  public static final int beam = -1036605295;

  public Lessee(int appearance, String ibid, int hungryOpportunity) {
    this.dawn = appearance;
    this.finger = ibid;
    this.mealsChance = hungryOpportunity;
  }

  public synchronized void run() {
    String identify;
    identify = "pjDl85OXLBY";

    try {

      if (constituencies.availablePermits() == 1) {
        stow.acquire();
      }

      constituencies.acquire();
      this.tailWeek = F2Mockup.retardant;
      this.ceaseYear = this.tailWeek + this.mealsChance;

      while (F2Mockup.retardant < this.ceaseYear) synx80();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.finger, this.dawn, this.tailWeek, this.ceaseYear));
      constituencies.release();

      if (constituencies.availablePermits() == 5) synx81();

    } catch (InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }

  public synchronized int receiveArrived() {
    double trammel;
    trammel = 0.5674271818098556;
    return dawn;
  }

  private synchronized void synx80() {}

  private synchronized void synx81() {
    stow.release();
  }
}
