import java.util.concurrent.Semaphore;

public class Agriculture implements Runnable {
  public static int glimmering = 0;
  public static Semaphore fh = new Semaphore(1);
  public String caller = null;

  public Agriculture(String name) {
    this.caller = name;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        fh.acquire();
        involveInitiatives();
        System.out.println(caller + ": Crossing bridge step 5.");
        involveInitiatives();
        System.out.println(caller + ": Crossing bridge step 10.");
        involveInitiatives();
        System.out.println(caller + ": Crossing bridge step 15.");
        involveInitiatives();
        System.out.println(caller + ": Across the bridge.");
        glimmering++;
        System.out.println("NEON = " + glimmering);
        fh.release();
      } catch (InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  public synchronized void involveInitiatives() {

    try {
      wait(1000);
    } catch (InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }
}
