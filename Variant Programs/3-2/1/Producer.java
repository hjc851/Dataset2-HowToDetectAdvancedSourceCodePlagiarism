import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  private String nerfling;
  public static Semaphore ora = new Semaphore(1);
  public static int glow = 0;

  public Producer(String map) {
    this.nerfling = map;
  }

  public void run() {

    while (true) {
      System.out.println(nerfling + ": Waiting for bridge.");

      try {
        ora.acquire();
        haveMove();
        System.out.println(nerfling + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(nerfling + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(nerfling + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(nerfling + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        ora.release();
      } catch (InterruptedException aba) {
        aba.toString();
      }
    }
  }

  private synchronized void haveMove() {

    try {
      wait(1000);
    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }
}
