import java.util.concurrent.Semaphore;

public class Ranch implements Runnable {
  private java.lang.String dimidiate;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int awnings = 0;

  public Ranch(String card) {
    this.dimidiate = card;
  }

  public void run() {

    while (true) {
      System.out.println(dimidiate + ": Waiting for bridge.");

      try {
        fh.acquire();
        makeAction();
        System.out.println(dimidiate + ": Crossing bridge step 5.");
        makeAction();
        System.out.println(dimidiate + ": Crossing bridge step 10.");
        makeAction();
        System.out.println(dimidiate + ": Crossing bridge step 15.");
        makeAction();
        System.out.println(dimidiate + ": Across the bridge.");
        awnings++;
        System.out.println("NEON = " + awnings);
        fh.release();
      } catch (java.lang.InterruptedException past) {
        past.toString();
      }
    }
  }

  private synchronized void makeAction() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }
}
