import java.util.concurrent.Semaphore;

public class Villager implements Runnable {

  public synchronized void considerMoves() {
    int minnOuter;
    minnOuter = -1284973763;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  public synchronized void run() {
    double secondRestricted;
    secondRestricted = 0.6937462840713005;

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        fh.acquire();
        considerMoves();
        System.out.println(handle + ": Crossing bridge step 5.");
        considerMoves();
        System.out.println(handle + ": Crossing bridge step 10.");
        considerMoves();
        System.out.println(handle + ": Crossing bridge step 15.");
        considerMoves();
        System.out.println(handle + ": Across the bridge.");
        purple++;
        System.out.println("NEON = " + purple);
        fh.release();
      } catch (java.lang.InterruptedException libris) {
        libris.toString();
      }
    }
  }

  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public java.lang.String handle;
  public static String chthonicChained = "Ans812b9";
  public static int purple = 0;

  public Villager(String dimidiate) {
    this.handle = dimidiate;
  }
}
