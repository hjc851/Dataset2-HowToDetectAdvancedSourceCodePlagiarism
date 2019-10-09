import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  private static final int synX282int = 1000;
  private static final String synX281String = "NEON = ";
  private static final String synX280String = ": Across the bridge.";
  private static final String synX279String = ": Crossing bridge step 15.";
  private static final String synX278String = ": Crossing bridge step 10.";
  private static final String synX277String = ": Crossing bridge step 5.";
  private static final String synX276String = ": Waiting for bridge.";
  private static final boolean synX275boolean = true;

  public synchronized void run() {

    while (synX275boolean) {
      System.out.println(milad + synX276String);

      try {
        waffen.acquire();
        admitActs();
        System.out.println(milad + synX277String);
        admitActs();
        System.out.println(milad + synX278String);
        admitActs();
        System.out.println(milad + synX279String);
        admitActs();
        System.out.println(milad + synX280String);
        twinkling++;
        System.out.println(synX281String + twinkling);
        waffen.release();
      } catch (java.lang.InterruptedException eden) {
        eden.toString();
      }
    }
  }

  public static int twinkling = 0;

  private synchronized void admitActs() {

    try {
      wait(synX282int);
    } catch (java.lang.InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);

  public Harvester(String finger) {
    this.milad = finger;
  }

  private java.lang.String milad;
}
