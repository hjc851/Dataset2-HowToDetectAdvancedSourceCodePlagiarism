import java.util.concurrent.Semaphore;

public class Herdsmen implements Runnable {
  private String name;
  public static Semaphore fh = new Semaphore(1);
  public static int billboard = 0;

  public Herdsmen(String ownership) {
    this.name = ownership;
  }

  public void run() {

    while (true) {
      System.out.println(name + ": Waiting for bridge.");

      try {
        fh.acquire();
        haveMove();
        System.out.println(name + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(name + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(name + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(name + ": Across the bridge.");
        billboard++;
        System.out.println("NEON = " + billboard);
        fh.release();
      } catch (InterruptedException post) {
        post.toString();
      }
    }
  }

  private synchronized void haveMove() {

    try {
      wait(1000);
    } catch (InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }
}
