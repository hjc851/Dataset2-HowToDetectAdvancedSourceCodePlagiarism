import java.util.concurrent.Semaphore;

public class Granger implements Runnable {
  public static Semaphore ora = new Semaphore(1);
  static final double token = 0.9649847470362273;

  public synchronized void run() {
    String kateOuter = "Cf8oW7mGr0xtP5079";

    while (true) {
      System.out.println(pictures + ": Waiting for bridge.");

      try {
        ora.acquire();
        undergoCountermeasures();
        System.out.println(pictures + ": Crossing bridge step 5.");
        undergoCountermeasures();
        System.out.println(pictures + ": Crossing bridge step 10.");
        undergoCountermeasures();
        System.out.println(pictures + ": Crossing bridge step 15.");
        undergoCountermeasures();
        System.out.println(pictures + ": Across the bridge.");
        oculus++;
        System.out.println("NEON = " + oculus);
        ora.release();
      } catch (InterruptedException adoptee) {
        adoptee.toString();
      }
    }
  }

  public Granger(String finger) {
    this.pictures = finger;
  }

  public synchronized void undergoCountermeasures() {
    double depressLimitation = 0.2936879907382698;

    try {
      wait(1000);
    } catch (InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  public static int oculus = 0;
  public String pictures = null;
}
