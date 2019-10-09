import java.util.concurrent.Semaphore;

public class Farms implements Runnable {
  private java.lang.String milad;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  public static int dayglo = 0;

  public Farms(String finger) {
    this.milad = finger;
  }

  public void run() {

    while (true) {
      System.out.println(milad + ": Waiting for bridge.");

      try {
        waffen.acquire();
        acceptActions();
        System.out.println(milad + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(milad + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(milad + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(milad + ": Across the bridge.");
        dayglo++;
        System.out.println("NEON = " + dayglo);
        waffen.release();
      } catch (java.lang.InterruptedException afterwards) {
        afterwards.toString();
      }
    }
  }

  private synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }
}
