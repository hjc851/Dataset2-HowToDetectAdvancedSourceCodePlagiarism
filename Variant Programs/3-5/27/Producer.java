import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  public static int glow = 0;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public java.lang.String photo;
  public static int circumscribe = 1292829509;

  public Producer(String handle) {
    this.photo = handle;
  }

  public synchronized void run() {
    double identification;
    identification = 0.5106970192793763;

    while (true) {
      System.out.println(photo + ": Waiting for bridge.");

      try {
        fh.acquire();
        carryStaircase();
        System.out.println(photo + ": Crossing bridge step 5.");
        carryStaircase();
        System.out.println(photo + ": Crossing bridge step 10.");
        carryStaircase();
        System.out.println(photo + ": Crossing bridge step 15.");
        carryStaircase();
        System.out.println(photo + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        fh.release();
      } catch (java.lang.InterruptedException late) {
        late.toString();
      }
    }
  }

  public synchronized void carryStaircase() {
    double maximal;
    maximal = 0.6426915662437257;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abe) {
      System.out.println(abe.toString());
    }
  }
}
