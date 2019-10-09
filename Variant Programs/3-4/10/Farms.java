import java.util.concurrent.Semaphore;

public class Farms implements Runnable {
  private String self = null;
  public static Semaphore waffen = new Semaphore(1);
  public static int nightscape = 0;

  public Farms(String photo) {
    this.self = photo;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(self + ": Waiting for bridge.");

      try {
        waffen.acquire();
        undergoCountermeasures();
        System.out.println(self + ": Crossing bridge step 5.");
        undergoCountermeasures();
        System.out.println(self + ": Crossing bridge step 10.");
        undergoCountermeasures();
        System.out.println(self + ": Crossing bridge step 15.");
        undergoCountermeasures();
        System.out.println(self + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        waffen.release();
      } catch (InterruptedException appointed) {
        appointed.toString();
      }
    }
  }

  private synchronized void undergoCountermeasures() {

    try {
      wait(1000);
    } catch (InterruptedException late) {
      System.out.println(late.toString());
    }
  }
}
