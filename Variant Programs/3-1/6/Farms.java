import java.util.concurrent.Semaphore;

public class Farms implements Runnable {
  private String finger;
  public static Semaphore waffen = new Semaphore(1);
  public static int glitter = 0;

  public Farms(String quod) {
    this.finger = quod;
  }

  public void run() {

    while (true) {
      System.out.println(finger + ": Waiting for bridge.");

      try {
        waffen.acquire();
        returnInitiative();
        System.out.println(finger + ": Crossing bridge step 5.");
        returnInitiative();
        System.out.println(finger + ": Crossing bridge step 10.");
        returnInitiative();
        System.out.println(finger + ": Crossing bridge step 15.");
        returnInitiative();
        System.out.println(finger + ": Across the bridge.");
        glitter++;
        System.out.println("NEON = " + glitter);
        waffen.release();
      } catch (InterruptedException vet) {
        vet.toString();
      }
    }
  }

  private synchronized void returnInitiative() {

    try {
      wait(1000);
    } catch (InterruptedException abe) {
      System.out.println(abe.toString());
    }
  }
}
