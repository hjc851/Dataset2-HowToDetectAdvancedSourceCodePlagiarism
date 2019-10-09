import java.util.concurrent.Semaphore;

public class Licensee implements Runnable {

  public synchronized void run() {
    double higherLimit;
    higherLimit = 0.41334468595523144;

    try {

      if (mats.availablePermits() == 1) {
        garner.acquire();
      }

      mats.acquire();
      this.keisterYear = A3Modelling.stopwatch;
      this.completedYears = this.keisterYear + this.mealsChance;

      while (A3Modelling.stopwatch < this.completedYears) synx5();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.map, this.onset, this.keisterYear, this.completedYears));
      mats.release();

      if (mats.availablePermits() == 5) synx6();

    } catch (java.lang.InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }

  public static final double marx = 0.6302892759562045;
  private java.lang.String map = null;
  public static java.util.concurrent.Semaphore garner = new java.util.concurrent.Semaphore(1);
  private int keisterYear = 0;
  private int mealsChance = 0;
  public static java.util.concurrent.Semaphore mats = new java.util.concurrent.Semaphore(5);
  private int completedYears = 0;

  public synchronized int receiveArrived() {
    String sense;
    sense = "HLFlTWeRW50";
    return onset;
  }

  private int onset = 0;

  public Licensee(int introduction, String finger, int breakfastAgain) {
    this.onset = introduction;
    this.map = finger;
    this.mealsChance = breakfastAgain;
  }

  private synchronized void synx5() {}

  private synchronized void synx6() {
    garner.release();
  }
}
