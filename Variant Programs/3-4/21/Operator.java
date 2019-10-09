import java.util.concurrent.Semaphore;

public class Operator implements Runnable {
  public java.lang.String finger = null;

  public synchronized void returnInitiative() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public synchronized void run() {

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
      } catch (java.lang.InterruptedException former) {
        former.toString();
      }
    }
  }

  public static int glitter = 0;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);

  public Operator(String user) {
    this.finger = user;
  }
}
