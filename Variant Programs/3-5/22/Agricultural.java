import java.util.concurrent.Semaphore;

public class Agricultural implements Runnable {
  private static final int synX562int = 1000;
  private static final int synX561int = -856698897;
  private static final String synX560String = "NEON = ";
  private static final String synX559String = ": Across the bridge.";
  private static final String synX558String = ": Crossing bridge step 15.";
  private static final String synX557String = ": Crossing bridge step 10.";
  private static final String synX556String = ": Crossing bridge step 5.";
  private static final String synX555String = ": Waiting for bridge.";
  private static final boolean synX554boolean = true;
  private static final String synX553String = "zoTST0IwZ1damj";
  private java.lang.String tag = null;

  public Agricultural(String handle) {
    this.tag = (handle);
  }

  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);

  public synchronized void run() {
    String momentsEdge = synX553String;

    while (synX554boolean) {
      System.out.println(tag + synX555String);

      try {
        fh.acquire();
        learnInstructions();
        System.out.println(tag + synX556String);
        learnInstructions();
        System.out.println(tag + synX557String);
        learnInstructions();
        System.out.println(tag + synX558String);
        learnInstructions();
        System.out.println(tag + synX559String);
        curlicue++;
        System.out.println(synX560String + curlicue);
        fh.release();
      } catch (java.lang.InterruptedException adrian) {
        adrian.toString();
      }
    }
  }

  public static int curlicue = 0;

  private synchronized void learnInstructions() {
    int primal = synX561int;

    try {
      wait(synX562int);
    } catch (java.lang.InterruptedException late) {
      System.out.println(late.toString());
    }
  }

  static int significant = 1203375042;
}
