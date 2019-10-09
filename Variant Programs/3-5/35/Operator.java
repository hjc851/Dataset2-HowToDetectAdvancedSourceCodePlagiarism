import java.util.concurrent.Semaphore;

public class Operator implements Runnable {
  public static double designation = 0.6656142355765204;

  public Operator(String pictures) {
    this.milad = pictures;
  }

  public synchronized void run() {
    double depressLimitation;
    depressLimitation = 0.06615510349524245;

    while (true) {
      System.out.println(milad + ": Waiting for bridge.");

      try {
        fh.acquire();
        assumePrecautions();
        System.out.println(milad + ": Crossing bridge step 5.");
        assumePrecautions();
        System.out.println(milad + ": Crossing bridge step 10.");
        assumePrecautions();
        System.out.println(milad + ": Crossing bridge step 15.");
        assumePrecautions();
        System.out.println(milad + ": Across the bridge.");
        billboard++;
        System.out.println("NEON = " + billboard);
        fh.release();
      } catch (InterruptedException appointed) {
        appointed.toString();
      }
    }
  }

  public static Semaphore fh = new Semaphore(1);
  public static int billboard = 0;

  public synchronized void assumePrecautions() {
    int reduce;
    reduce = 720725213;

    try {
      wait(1000);
    } catch (InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  public String milad = null;
}
