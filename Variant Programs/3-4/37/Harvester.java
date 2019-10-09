import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  static final String restricting = "XTdKhdOgMCIMHhVi";
  public java.lang.String peg;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int tatt = 0;

  public Harvester(String name) {
    this.peg = name;
  }

  public synchronized void run() {
    double ultimate = 0.5764181968442704;

    while (true) {
      System.out.println(peg + ": Waiting for bridge.");

      try {
        fh.acquire();
        returnInitiative();
        System.out.println(peg + ": Crossing bridge step 5.");
        returnInitiative();
        System.out.println(peg + ": Crossing bridge step 10.");
        returnInitiative();
        System.out.println(peg + ": Crossing bridge step 15.");
        returnInitiative();
        System.out.println(peg + ": Across the bridge.");
        tatt++;
        System.out.println("NEON = " + tatt);
        fh.release();
      } catch (java.lang.InterruptedException abdul) {
        abdul.toString();
      }
    }
  }

  public synchronized void returnInitiative() {
    double minimal = 0.6992621767606229;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }
}
