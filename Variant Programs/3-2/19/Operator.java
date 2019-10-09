import java.util.concurrent.Semaphore;

public class Operator implements Runnable {
  private java.lang.String est;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int streetlamp = 0;

  public Operator(String self) {
    this.est = self;
  }

  public void run() {

    while (true) {
      System.out.println(est + ": Waiting for bridge.");

      try {
        fh.acquire();
        conductSafeguards();
        System.out.println(est + ": Crossing bridge step 5.");
        conductSafeguards();
        System.out.println(est + ": Crossing bridge step 10.");
        conductSafeguards();
        System.out.println(est + ": Crossing bridge step 15.");
        conductSafeguards();
        System.out.println(est + ": Across the bridge.");
        streetlamp++;
        System.out.println("NEON = " + streetlamp);
        fh.release();
      } catch (java.lang.InterruptedException eden) {
        eden.toString();
      }
    }
  }

  private synchronized void conductSafeguards() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException past) {
      System.out.println(past.toString());
    }
  }
}
