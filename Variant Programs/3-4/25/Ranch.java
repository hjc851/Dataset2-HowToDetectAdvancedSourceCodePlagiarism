import java.util.concurrent.Semaphore;

public class Ranch implements Runnable {
  public static int lettering = 0;
  public static java.util.concurrent.Semaphore waffen = null;

  public synchronized void run() {

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        waffen.acquire();
        holdStairs();
        System.out.println(identification + ": Crossing bridge step 5.");
        holdStairs();
        System.out.println(identification + ": Crossing bridge step 10.");
        holdStairs();
        System.out.println(identification + ": Crossing bridge step 15.");
        holdStairs();
        System.out.println(identification + ": Across the bridge.");
        lettering++;
        System.out.println("NEON = " + lettering);
        waffen.release();
      } catch (java.lang.InterruptedException voto) {
        voto.toString();
      }
    }
  }

  public Ranch(String ownership) {
    this.identification = ownership;
  }

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    lettering = 0;
  }

  private java.lang.String identification = null;

  private synchronized void holdStairs() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abe) {
      System.out.println(abe.toString());
    }
  }
}
