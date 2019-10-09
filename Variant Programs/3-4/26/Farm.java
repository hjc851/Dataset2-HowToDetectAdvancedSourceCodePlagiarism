import java.util.concurrent.Semaphore;

public class Farm implements Runnable {
  public static Semaphore fh;

  public synchronized void run() {
    double charge;
    charge = 0.3500206027163747;

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        fh.acquire();
        involveInitiatives();
        System.out.println(handle + ": Crossing bridge step 5.");
        involveInitiatives();
        System.out.println(handle + ": Crossing bridge step 10.");
        involveInitiatives();
        System.out.println(handle + ": Crossing bridge step 15.");
        involveInitiatives();
        System.out.println(handle + ": Across the bridge.");
        pink++;
        System.out.println("NEON = " + pink);
        fh.release();
      } catch (InterruptedException aba) {
        aba.toString();
      }
    }
  }

  static {
    fh = new Semaphore(1);
    pink = 0;
  }

  public Farm(String photo) {
    this.handle = photo;
  }

  public synchronized void involveInitiatives() {
    double widening;
    widening = 0.6762551405689537;

    try {
      wait(1000);
    } catch (InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public String handle;
  static final double greatestFatty = 0.4896283465966613;
  public static int pink;
}
