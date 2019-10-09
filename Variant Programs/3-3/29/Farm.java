import java.util.concurrent.Semaphore;

public class Farm implements Runnable {

  private synchronized void askApproach() {
    int heightConfine;
    heightConfine = 1898477236;

    try {
      wait(1000);
    } catch (InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public static Semaphore waffen = new Semaphore(1);
  public static int dayglo = 0;

  public Farm(String milad) {
    this.map = milad;
  }

  public static int asset = -2047587054;
  private String map = null;

  public synchronized void run() {
    double ceiling;
    ceiling = 0.9819982611385206;

    while (true) {
      System.out.println(map + ": Waiting for bridge.");

      try {
        waffen.acquire();
        askApproach();
        System.out.println(map + ": Crossing bridge step 5.");
        askApproach();
        System.out.println(map + ": Crossing bridge step 10.");
        askApproach();
        System.out.println(map + ": Crossing bridge step 15.");
        askApproach();
        System.out.println(map + ": Across the bridge.");
        dayglo++;
        System.out.println("NEON = " + dayglo);
        waffen.release();
      } catch (InterruptedException abe) {
        abe.toString();
      }
    }
  }
}
