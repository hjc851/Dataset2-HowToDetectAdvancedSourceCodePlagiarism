import java.util.concurrent.Semaphore;

public class Livestock implements Runnable {
  private String self;
  public static Semaphore fh = new Semaphore(1);
  public static int pink = 0;

  public Livestock(String nerfling) {
    this.self = nerfling;
  }

  public void run() {

    while (true) {
      System.out.println(self + ": Waiting for bridge.");

      try {
        fh.acquire();
        acceptActions();
        System.out.println(self + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(self + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(self + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(self + ": Across the bridge.");
        pink++;
        System.out.println("NEON = " + pink);
        fh.release();
      } catch (InterruptedException appointed) {
        appointed.toString();
      }
    }
  }

  private synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (InterruptedException past) {
      System.out.println(past.toString());
    }
  }
}
