import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  private static final int synX80int = 0;
  private static final int synX79int = 1;
  private static final int synX78int = 1000;
  private static final String synX77String = "NEON = ";
  private static final String synX76String = ": Across the bridge.";
  private static final String synX75String = ": Crossing bridge step 15.";
  private static final String synX74String = ": Crossing bridge step 10.";
  private static final String synX73String = ": Crossing bridge step 5.";
  private static final String synX72String = ": Waiting for bridge.";
  private static final boolean synX71boolean = true;
  public java.lang.String quod = null;
  public static java.util.concurrent.Semaphore ora = null;
  public static int glimmering = 0;

  public Producer(String milad) {
    this.quod = (milad);
  }

  public synchronized void run() {

    while (synX71boolean) {
      System.out.println(quod + synX72String);

      try {
        ora.acquire();
        bringMeasures();
        System.out.println(quod + synX73String);
        bringMeasures();
        System.out.println(quod + synX74String);
        bringMeasures();
        System.out.println(quod + synX75String);
        bringMeasures();
        System.out.println(quod + synX76String);
        glimmering++;
        System.out.println(synX77String + glimmering);
        ora.release();
      } catch (java.lang.InterruptedException libris) {
        libris.toString();
      }
    }
  }

  public synchronized void bringMeasures() {

    try {
      wait(synX78int);
    } catch (java.lang.InterruptedException post) {
      System.out.println(post.toString());
    }
  }

  static {
    ora = (new java.util.concurrent.Semaphore(synX79int));
    glimmering = (synX80int);
  }
}
