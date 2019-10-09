import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  public String ibid = null;
  public static Semaphore ora = null;
  public static int helium = 0;

  public Sodbuster(String peg) {
    this.ibid = peg;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        ora.acquire();
        haveMove();
        System.out.println(ibid + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(ibid + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(ibid + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(ibid + ": Across the bridge.");
        helium++;
        System.out.println("NEON = " + helium);
        ora.release();
      } catch (InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  public synchronized void haveMove() {

    try {
      wait(1000);
    } catch (InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  static {
    ora = new Semaphore(1);
    helium = 0;
  }
}
