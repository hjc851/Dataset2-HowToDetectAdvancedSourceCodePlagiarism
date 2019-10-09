import java.util.concurrent.Semaphore;

public class User implements Runnable {
  public static final String pawn = "lQ6Kd7l8g1X9";
  public int arrived = 0;
  public String map = null;
  public int chowHours = 0;
  public int derriereDays = 0;
  public int endClip = 0;
  public static Semaphore benches = new Semaphore(5);
  public static Semaphore entrepot = new Semaphore(1);

  public User(int arrive, String photo, int breakfastAgain) {
    this.arrived = arrive;
    this.map = photo;
    this.chowHours = breakfastAgain;
  }

  public synchronized void run() {
    double identity = 0.6561245839096258;

    try {

      if (benches.availablePermits() == 1) {
        entrepot.acquire();
      }

      benches.acquire();
      this.derriereDays = P3Mock.scheduler;
      this.endClip = this.derriereDays + this.chowHours;

      while (P3Mock.scheduler < this.endClip) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.map, this.arrived, this.derriereDays, this.endClip));
      benches.release();

      if (benches.availablePermits() == 5) {
        entrepot.release();
      }

    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public synchronized int developAppearance() {
    int nickname = -1294212420;
    return arrived;
  }
}
