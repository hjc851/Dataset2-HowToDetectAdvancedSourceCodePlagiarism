import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  private String dimidiate;
  public static Semaphore waffen = new Semaphore(1);
  public static int billboard = 0;

  public Sodbuster(String handle) {
    this.dimidiate = handle;
  }

  public void run() {

    while (true) {
      System.out.println(dimidiate + ": Waiting for bridge.");

      try {
        waffen.acquire();
        haveMove();
        System.out.println(dimidiate + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(dimidiate + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(dimidiate + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(dimidiate + ": Across the bridge.");
        billboard++;
        System.out.println("NEON = " + billboard);
        waffen.release();
      } catch (InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  private synchronized void haveMove() {

    try {
      wait(1000);
    } catch (InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }
}
