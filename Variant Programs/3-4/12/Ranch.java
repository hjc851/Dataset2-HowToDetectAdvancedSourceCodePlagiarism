import java.util.concurrent.Semaphore;

public class Ranch implements Runnable {
  public static int florescent = 0;
  public java.lang.String milad;

  public synchronized void assumePrecautions() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);

  public synchronized void run() {

    while (true) {
      System.out.println(milad + ": Waiting for bridge.");

      try {
        ora.acquire();
        assumePrecautions();
        System.out.println(milad + ": Crossing bridge step 5.");
        assumePrecautions();
        System.out.println(milad + ": Crossing bridge step 10.");
        assumePrecautions();
        System.out.println(milad + ": Crossing bridge step 15.");
        assumePrecautions();
        System.out.println(milad + ": Across the bridge.");
        florescent++;
        System.out.println("NEON = " + florescent);
        ora.release();
      } catch (java.lang.InterruptedException past) {
        past.toString();
      }
    }
  }

  public Ranch(String self) {
    this.milad = self;
  }
}
