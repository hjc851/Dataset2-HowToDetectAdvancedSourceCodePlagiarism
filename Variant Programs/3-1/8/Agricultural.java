import java.util.concurrent.Semaphore;

public class Agricultural implements Runnable {
  private String identification;
  public static Semaphore fh = new Semaphore(1);
  public static int conflict = 0;

  public Agricultural(String map) {
    this.identification = map;
  }

  public void run() {

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        fh.acquire();
        adoptProgress();
        System.out.println(identification + ": Crossing bridge step 5.");
        adoptProgress();
        System.out.println(identification + ": Crossing bridge step 10.");
        adoptProgress();
        System.out.println(identification + ": Crossing bridge step 15.");
        adoptProgress();
        System.out.println(identification + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        fh.release();
      } catch (InterruptedException officio) {
        officio.toString();
      }
    }
  }

  private synchronized void adoptProgress() {

    try {
      wait(1000);
    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }
}
