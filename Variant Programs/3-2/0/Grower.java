import java.util.concurrent.Semaphore;

public class Grower implements Runnable {
  private java.lang.String idem;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int glimmering = 0;

  public Grower(String nerfling) {
    this.idem = nerfling;
  }

  public void run() {

    while (true) {
      System.out.println(idem + ": Waiting for bridge.");

      try {
        fh.acquire();
        removeTasks();
        System.out.println(idem + ": Crossing bridge step 5.");
        removeTasks();
        System.out.println(idem + ": Crossing bridge step 10.");
        removeTasks();
        System.out.println(idem + ": Crossing bridge step 15.");
        removeTasks();
        System.out.println(idem + ": Across the bridge.");
        glimmering++;
        System.out.println("NEON = " + glimmering);
        fh.release();
      } catch (java.lang.InterruptedException former) {
        former.toString();
      }
    }
  }

  private synchronized void removeTasks() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abe) {
      System.out.println(abe.toString());
    }
  }
}
