import java.util.concurrent.Semaphore;

public class Herdsmen implements Runnable {

  public Herdsmen(String user) {
    this.dimidiate = user;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(dimidiate + ": Waiting for bridge.");

      try {
        ora.acquire();
        getStairway();
        System.out.println(dimidiate + ": Crossing bridge step 5.");
        getStairway();
        System.out.println(dimidiate + ": Crossing bridge step 10.");
        getStairway();
        System.out.println(dimidiate + ": Crossing bridge step 15.");
        getStairway();
        System.out.println(dimidiate + ": Across the bridge.");
        curlicue++;
        System.out.println("NEON = " + curlicue);
        ora.release();
      } catch (InterruptedException adrian) {
        adrian.toString();
      }
    }
  }

  public static int curlicue = 0;
  public String dimidiate = null;

  public synchronized void getStairway() {

    try {
      wait(1000);
    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public static Semaphore ora = new Semaphore(1);
}
