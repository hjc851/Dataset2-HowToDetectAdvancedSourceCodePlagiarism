import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  private java.lang.String caller;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int helium = 0;

  public Harvester(String tag) {
    this.caller = tag;
  }

  public void run() {

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        fh.acquire();
        considerMoves();
        System.out.println(caller + ": Crossing bridge step 5.");
        considerMoves();
        System.out.println(caller + ": Crossing bridge step 10.");
        considerMoves();
        System.out.println(caller + ": Crossing bridge step 15.");
        considerMoves();
        System.out.println(caller + ": Across the bridge.");
        helium++;
        System.out.println("NEON = " + helium);
        fh.release();
      } catch (java.lang.InterruptedException exwife) {
        exwife.toString();
      }
    }
  }

  private synchronized void considerMoves() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }
}
