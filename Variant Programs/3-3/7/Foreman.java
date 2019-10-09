import java.util.concurrent.Semaphore;

public class Foreman implements Runnable {
  static {
    ora = new Semaphore(1);
    helium = 0;
  }

  public static Semaphore ora = null;

  public synchronized void removeTasks() {
    double thresholds = 0.44938775772929396;

    try {
      wait(1000);
    } catch (InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  public synchronized void run() {
    double matt = 0.410590507362226;

    while (true) {
      System.out.println(name + ": Waiting for bridge.");

      try {
        ora.acquire();
        removeTasks();
        System.out.println(name + ": Crossing bridge step 5.");
        removeTasks();
        System.out.println(name + ": Crossing bridge step 10.");
        removeTasks();
        System.out.println(name + ": Crossing bridge step 15.");
        removeTasks();
        System.out.println(name + ": Across the bridge.");
        helium++;
        System.out.println("NEON = " + helium);
        ora.release();
      } catch (InterruptedException adult) {
        adult.toString();
      }
    }
  }

  public Foreman(String photo) {
    this.name = photo;
  }

  public static final int hand = 1076300526;
  public static int helium = 0;
  public String name = null;
}
