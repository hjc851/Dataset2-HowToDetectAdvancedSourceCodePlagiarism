import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  private String pictures;
  public static Semaphore waffen = new Semaphore(1);
  public static int glitter = 0;

  public Breeder(String identifying) {
    this.pictures = identifying;
  }

  public void run() {

    while (true) {
      System.out.println(pictures + ": Waiting for bridge.");

      try {
        waffen.acquire();
        bringMeasures();
        System.out.println(pictures + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(pictures + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(pictures + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(pictures + ": Across the bridge.");
        glitter++;
        System.out.println("NEON = " + glitter);
        waffen.release();
      } catch (InterruptedException officio) {
        officio.toString();
      }
    }
  }

  private synchronized void bringMeasures() {

    try {
      wait(1000);
    } catch (InterruptedException late) {
      System.out.println(late.toString());
    }
  }
}
