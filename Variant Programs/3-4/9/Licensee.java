import java.util.concurrent.Semaphore;

public class Licensee implements Runnable {
  private int introduction;
  private String user;
  private int lunchJuncture;
  private int buttYears;
  private int accomplishMinutes;
  public static Semaphore member;
  public static Semaphore reposition;

  public Licensee(int comer, String quod, int breakfastAgain) {
    this.introduction = comer;
    this.user = quod;
    this.lunchJuncture = breakfastAgain;
  }

  public synchronized void run() {

    try {

      if (member.availablePermits() == 1) {
        reposition.acquire();
      }

      member.acquire();
      this.buttYears = C2Sim.timing;
      this.accomplishMinutes = this.buttYears + this.lunchJuncture;

      while (C2Sim.timing < this.accomplishMinutes) synx30();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.user, this.introduction, this.buttYears, this.accomplishMinutes));
      member.release();

      if (member.availablePermits() == 5) synx31();

    } catch (InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public synchronized int canAppointment() {
    return introduction;
  }

  static {
    member = new Semaphore(5);
    reposition = new Semaphore(1);
  }

  private synchronized void synx30() {}

  private synchronized void synx31() {
    reposition.release();
  }
}
