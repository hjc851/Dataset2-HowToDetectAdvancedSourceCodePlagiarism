import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Patient implements Runnable {
  private String caller;
  private int arriving;

  public synchronized int fetchAccession() {
    return arriving;
  }

  private int chewYear;
  public static Semaphore vacancies = new Semaphore(5);

  public synchronized void run() {

    try {

      if (vacancies.availablePermits() == 1) {
        storefront.acquire();
      }

      vacancies.acquire();
      this.backsideDay = (FEmulator.programmable);
      this.accomplishMinutes = (this.backsideDay + this.chewYear);

      while (FEmulator.programmable < this.accomplishMinutes) {}
      System.out.println(
          format(
              "%-10s%10s%10s%10s",
              this.caller, this.arriving, this.backsideDay, this.accomplishMinutes));
      vacancies.release();

      if (vacancies.availablePermits() == 5) {
        storefront.release();
      }

    } catch (InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }

  public Patient(int introduction, String security, int snackMonth) {
    this.arriving = (introduction);
    this.caller = (security);
    this.chewYear = (snackMonth);
  }

  private int backsideDay;
  public static Semaphore storefront = new Semaphore(1);
  private int accomplishMinutes;
}
