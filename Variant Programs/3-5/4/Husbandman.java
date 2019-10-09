import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  public static int dayglo = 0;
  public static Semaphore ora = new Semaphore(1);
  public String caller;

  public Husbandman(String ownership) {
    this.caller = (ownership);
  }

  public synchronized void run() {

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        ora.acquire();
        haveMove();
        System.out.println(caller + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(caller + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(caller + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(caller + ": Across the bridge.");
        dayglo++;
        System.out.println("NEON = " + dayglo);
        ora.release();
      } catch (InterruptedException abdul) {
        abdul.toString();
      }
    }
  }

  public synchronized void haveMove() {

    try {
      wait(1000);
    } catch (InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }
}
