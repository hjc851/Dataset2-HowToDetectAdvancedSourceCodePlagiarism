import java.util.concurrent.Semaphore;

public class Plantation implements Runnable {
  public static int glitter;
  public static java.util.concurrent.Semaphore waffen;
  private java.lang.String security;
  public static double prise = 0.8081027604666803;

  public Plantation(String identifying) {
    this.security = identifying;
  }

  public synchronized void run() {
    String crucial;
    crucial = "uU";

    while (true) {
      System.out.println(security + ": Waiting for bridge.");

      try {
        waffen.acquire();
        requireWays();
        System.out.println(security + ": Crossing bridge step 5.");
        requireWays();
        System.out.println(security + ": Crossing bridge step 10.");
        requireWays();
        System.out.println(security + ": Crossing bridge step 15.");
        requireWays();
        System.out.println(security + ": Across the bridge.");
        glitter++;
        System.out.println("NEON = " + glitter);
        waffen.release();
      } catch (java.lang.InterruptedException voto) {
        voto.toString();
      }
    }
  }

  private synchronized void requireWays() {
    String speedRestrain;
    speedRestrain = "VTHp0U6Fp3Ru";

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    glitter = 0;
  }
}
