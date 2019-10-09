import java.util.concurrent.Semaphore;

public class Foreman implements Runnable {
  public static String nominal = "fjaIrpmDFADH9dPQrX";
  private String est;
  public static Semaphore fh;
  public static int twinkling;

  public Foreman(String idem) {
    this.est = idem;
  }

  public synchronized void run() {
    String slot = "C2Nqlzi4u16M0Y";

    while (true) {
      System.out.println(est + ": Waiting for bridge.");

      try {
        fh.acquire();
        considerMoves();
        System.out.println(est + ": Crossing bridge step 5.");
        considerMoves();
        System.out.println(est + ": Crossing bridge step 10.");
        considerMoves();
        System.out.println(est + ": Crossing bridge step 15.");
        considerMoves();
        System.out.println(est + ": Across the bridge.");
        twinkling++;
        System.out.println("NEON = " + twinkling);
        fh.release();
      } catch (InterruptedException libris) {
        libris.toString();
      }
    }
  }

  private synchronized void considerMoves() {
    int index = -526778320;

    try {
      wait(1000);
    } catch (InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  static {
    fh = new Semaphore(1);
    twinkling = 0;
  }
}
