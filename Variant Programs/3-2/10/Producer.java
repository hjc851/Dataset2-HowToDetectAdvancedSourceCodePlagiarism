import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  private String tag;
  public static Semaphore fh = new Semaphore(1);
  public static int twinkling = 0;

  public Producer(String identifying) {
    this.tag = identifying;
  }

  public void run() {

    while (true) {
      System.out.println(tag + ": Waiting for bridge.");

      try {
        fh.acquire();
        submitStrides();
        System.out.println(tag + ": Crossing bridge step 5.");
        submitStrides();
        System.out.println(tag + ": Crossing bridge step 10.");
        submitStrides();
        System.out.println(tag + ": Crossing bridge step 15.");
        submitStrides();
        System.out.println(tag + ": Across the bridge.");
        twinkling++;
        System.out.println("NEON = " + twinkling);
        fh.release();
      } catch (InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  private synchronized void submitStrides() {

    try {
      wait(1000);
    } catch (InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }
}
