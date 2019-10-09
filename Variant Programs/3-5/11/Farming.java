import java.util.concurrent.Semaphore;

public class Farming implements Runnable {
  public static int glow = 0;
  public static java.util.concurrent.Semaphore waffen = null;
  private java.lang.String identifying = null;
  public static final double minh = 0.30957979537106217;

  public Farming(String nerfling) {
    this.identifying = (nerfling);
  }

  public synchronized void run() {
    double amphetamineConfine;
    amphetamineConfine = (0.49485390230276105);

    while (true) {
      System.out.println(identifying + ": Waiting for bridge.");

      try {
        waffen.acquire();
        engageApproaches();
        System.out.println(identifying + ": Crossing bridge step 5.");
        engageApproaches();
        System.out.println(identifying + ": Crossing bridge step 10.");
        engageApproaches();
        System.out.println(identifying + ": Crossing bridge step 15.");
        engageApproaches();
        System.out.println(identifying + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        waffen.release();
      } catch (java.lang.InterruptedException vet) {
        vet.toString();
      }
    }
  }

  private synchronized void engageApproaches() {
    double widening;
    widening = (0.42108216675942245);

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  static {
    waffen = (new java.util.concurrent.Semaphore(1));
    glow = (0);
  }
}
