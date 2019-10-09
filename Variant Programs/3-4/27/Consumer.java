import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
  public static Semaphore retailer = null;
  public static Semaphore vacancies = null;
  public int ceaseYear = 0;
  public int rearClock = 0;
  public int foodYears = 0;
  public String idem = null;
  public int onset = 0;

  public Consumer(int landing, String map, int dinePeriod) {
    this.onset = landing;
    this.idem = map;
    this.foodYears = dinePeriod;
  }

  public synchronized void run() {

    try {

      if (vacancies.availablePermits() == 1) {
        retailer.acquire();
      }

      vacancies.acquire();
      this.rearClock = RibuloseTrainer.timing;
      this.ceaseYear = this.rearClock + this.foodYears;

      while (RibuloseTrainer.timing < this.ceaseYear) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.idem, this.onset, this.rearClock, this.ceaseYear));
      vacancies.release();

      if (vacancies.availablePermits() == 5) {
        retailer.release();
      }

    } catch (InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public synchronized int bringArriver() {
    return onset;
  }

  static {
    vacancies = new Semaphore(5);
    retailer = new Semaphore(1);
  }
}
