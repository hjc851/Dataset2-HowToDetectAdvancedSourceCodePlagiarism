import java.util.concurrent.Semaphore;

public class Producers implements Runnable {
  public java.lang.String card;
  public static java.util.concurrent.Semaphore waffen;
  public static int cityscape;

  public Producers(String identification) {
    this.card = identification;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        waffen.acquire();
        adoptProgress();
        System.out.println(card + ": Crossing bridge step 5.");
        adoptProgress();
        System.out.println(card + ": Crossing bridge step 10.");
        adoptProgress();
        System.out.println(card + ": Crossing bridge step 15.");
        adoptProgress();
        System.out.println(card + ": Across the bridge.");
        cityscape++;
        System.out.println("NEON = " + cityscape);
        waffen.release();
      } catch (java.lang.InterruptedException abe) {
        abe.toString();
      }
    }
  }

  public synchronized void adoptProgress() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    cityscape = 0;
  }
}
