import java.util.concurrent.Semaphore;

public class Farming implements Runnable {

  public Farming(String pictures) {
    this.nerfling = pictures;
  }

  private synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }

  public synchronized void run() {

    while (true) {
      System.out.println(nerfling + ": Waiting for bridge.");

      try {
        fh.acquire();
        acceptActions();
        System.out.println(nerfling + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(nerfling + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(nerfling + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(nerfling + ": Across the bridge.");
        glo++;
        System.out.println("NEON = " + glo);
        fh.release();
      } catch (InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  public static Semaphore fh = new Semaphore(1);
  public static int glo = 0;
  private String nerfling;
}
