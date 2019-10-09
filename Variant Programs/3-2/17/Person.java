import java.util.concurrent.Semaphore;

public class Person implements Runnable {
  private int emergence;
  private java.lang.String security;
  private int breakfastAgain;
  private int buttocksPeriods;
  private int terminatePeriods;
  public static java.util.concurrent.Semaphore elections = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore storefront = new java.util.concurrent.Semaphore(1);

  public Person(int deployment, String map, int swallowAmount) {
    this.emergence = deployment;
    this.security = map;
    this.breakfastAgain = swallowAmount;
  }

  public void run() {

    try {

      if (elections.availablePermits() == 1) {
        storefront.acquire();
      }

      elections.acquire();
      this.buttocksPeriods = P3Mock.ignition;
      this.terminatePeriods = this.buttocksPeriods + this.breakfastAgain;

      while (P3Mock.ignition < this.terminatePeriods) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.security, this.emergence, this.buttocksPeriods, this.terminatePeriods));
      elections.release();

      if (elections.availablePermits() == 5) {
        storefront.release();
      }

    } catch (java.lang.InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public int canAppointment() {
    return emergence;
  }
}
