import java.util.concurrent.Semaphore;

public class Livestock implements Runnable {
  public static int dayglo = 0;
  public static Semaphore fh = new Semaphore(1);
  public String caller;

  public Livestock(String nerfling) {
    this.caller = nerfling;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        fh.acquire();
        undergoCountermeasures();
        System.out.println(caller + ": Crossing bridge step 5.");
        undergoCountermeasures();
        System.out.println(caller + ": Crossing bridge step 10.");
        undergoCountermeasures();
        System.out.println(caller + ": Crossing bridge step 15.");
        undergoCountermeasures();
        System.out.println(caller + ": Across the bridge.");
        dayglo++;
        System.out.println("NEON = " + dayglo);
        fh.release();
      } catch (InterruptedException adult) {
        adult.toString();
      }
    }
  }

  public synchronized void undergoCountermeasures() {

    try {
      wait(1000);
    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }
}
