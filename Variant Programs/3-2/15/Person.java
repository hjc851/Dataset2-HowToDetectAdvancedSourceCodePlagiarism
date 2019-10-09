import java.util.concurrent.Semaphore;

public class Person implements Runnable {
  private int advent;
  private java.lang.String picture;
  private int cookPeriods;
  private int rumpMoment;
  private int poleHour;
  public static java.util.concurrent.Semaphore space = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore stow = new java.util.concurrent.Semaphore(1);

  public Person(int presence, String caller, int corrodeSentence) {
    this.advent = presence;
    this.picture = caller;
    this.cookPeriods = corrodeSentence;
  }

  public void run() {

    try {

      if (space.availablePermits() == 1) {
        stow.acquire();
      }

      space.acquire();
      this.rumpMoment = NKinematics.clock;
      this.poleHour = this.rumpMoment + this.cookPeriods;

      while (NKinematics.clock < this.poleHour) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.picture, this.advent, this.rumpMoment, this.poleHour));
      space.release();

      if (space.availablePermits() == 5) {
        stow.release();
      }

    } catch (java.lang.InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public int haveEmergence() {
    return advent;
  }
}
