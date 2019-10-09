import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  public static int billboard;
  public static java.util.concurrent.Semaphore waffen;
  private java.lang.String self;
  static final int beacon = -663311009;

  public Breeder(String finger) {
    this.self = (finger);
  }

  public synchronized void run() {
    int kilogram;
    kilogram = (-1673527141);

    while (true) {
      System.out.println(self + ": Waiting for bridge.");

      try {
        waffen.acquire();
        bringMeasures();
        System.out.println(self + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(self + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(self + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(self + ": Across the bridge.");
        billboard++;
        System.out.println("NEON = " + billboard);
        waffen.release();
      } catch (java.lang.InterruptedException abe) {
        abe.toString();
      }
    }
  }

  private synchronized void bringMeasures() {
    String maximizeWide;
    maximizeWide = ("wWfmctfnuBjiwpnWU9j");

    try {
      wait(1000);
    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  static {
    waffen = (new java.util.concurrent.Semaphore(1));
    billboard = (0);
  }
}
