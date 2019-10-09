import java.util.concurrent.Semaphore;

public class Plantation implements Runnable {
  private String quod;
  public static Semaphore waffen = new Semaphore(1);
  public static int nightscape = 0;

  public Plantation(String peg) {
    this.quod = peg;
  }

  public void run() {

    while (true) {
      System.out.println(quod + ": Waiting for bridge.");

      try {
        waffen.acquire();
        submitStrides();
        System.out.println(quod + ": Crossing bridge step 5.");
        submitStrides();
        System.out.println(quod + ": Crossing bridge step 10.");
        submitStrides();
        System.out.println(quod + ": Crossing bridge step 15.");
        submitStrides();
        System.out.println(quod + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        waffen.release();
      } catch (InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  private synchronized void submitStrides() {

    try {
      wait(1000);
    } catch (InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }
}
