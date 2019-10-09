import java.util.concurrent.Semaphore;

public class Producers implements Runnable {

  private synchronized void chooseThings() {
    double levelPinioned;
    levelPinioned = 0.3025860866763518;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public static String hourThick = "X49czYvjV3PNS";

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    streetlamp = 0;
  }

  public static int streetlamp = 0;
  private java.lang.String pictures = null;

  public Producers(String map) {
    this.pictures = map;
  }

  public synchronized void run() {
    int symbolic;
    symbolic = 1209848603;

    while (true) {
      System.out.println(pictures + ": Waiting for bridge.");

      try {
        waffen.acquire();
        chooseThings();
        System.out.println(pictures + ": Crossing bridge step 5.");
        chooseThings();
        System.out.println(pictures + ": Crossing bridge step 10.");
        chooseThings();
        System.out.println(pictures + ": Crossing bridge step 15.");
        chooseThings();
        System.out.println(pictures + ": Across the bridge.");
        streetlamp++;
        System.out.println("NEON = " + streetlamp);
        waffen.release();
      } catch (java.lang.InterruptedException exwife) {
        exwife.toString();
      }
    }
  }

  public static java.util.concurrent.Semaphore waffen = null;
}
