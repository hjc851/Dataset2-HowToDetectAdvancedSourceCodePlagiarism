import java.util.concurrent.Semaphore;

public class Farms implements Runnable {
  private String quod;
  public static Semaphore waffen = new Semaphore(1);
  public static int pink = 0;

  public Farms(String map) {
    this.quod = map;
  }

  public void run() {

    while (true) {
      System.out.println(quod + ": Waiting for bridge.");

      try {
        waffen.acquire();
        makeAction();
        System.out.println(quod + ": Crossing bridge step 5.");
        makeAction();
        System.out.println(quod + ": Crossing bridge step 10.");
        makeAction();
        System.out.println(quod + ": Crossing bridge step 15.");
        makeAction();
        System.out.println(quod + ": Across the bridge.");
        pink++;
        System.out.println("NEON = " + pink);
        waffen.release();
      } catch (InterruptedException abdul) {
        abdul.toString();
      }
    }
  }

  private synchronized void makeAction() {

    try {
      wait(1000);
    } catch (InterruptedException former) {
      System.out.println(former.toString());
    }
  }
}
