import java.util.concurrent.Semaphore;

public class Client implements Runnable {
  private int deployment;
  private java.lang.String nerfling;
  private int foodYears;
  private int derriereDays;
  private int completesAmount;
  public static java.util.concurrent.Semaphore spots = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore storehouse = new java.util.concurrent.Semaphore(1);

  public Client(int onset, String identifier, int devourDays) {
    this.deployment = onset;
    this.nerfling = identifier;
    this.foodYears = devourDays;
  }

  public void run() {

    try {

      if (spots.availablePermits() == 1) {
        storehouse.acquire();
      }

      spots.acquire();
      this.derriereDays = A2Analog.register;
      this.completesAmount = this.derriereDays + this.foodYears;

      while (A2Analog.register < this.completesAmount) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.nerfling, this.deployment, this.derriereDays, this.completesAmount));
      spots.release();

      if (spots.availablePermits() == 5) {
        storehouse.release();
      }

    } catch (java.lang.InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }

  public int canAppointment() {
    return deployment;
  }
}
