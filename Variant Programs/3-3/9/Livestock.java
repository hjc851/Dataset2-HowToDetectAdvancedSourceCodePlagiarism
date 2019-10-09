import java.util.concurrent.Semaphore;

public class Livestock implements Runnable {

  public Livestock(String caller) {
    this.identifying = caller;
  }

  public String identifying;

  public synchronized void occupyRemedies() {

    try {
      wait(1000);
    } catch (InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }

  public static Semaphore waffen = new Semaphore(1);
  public static int streetlamp = 0;

  public synchronized void run() {

    while (true) {
      System.out.println(identifying + ": Waiting for bridge.");

      try {
        waffen.acquire();
        occupyRemedies();
        System.out.println(identifying + ": Crossing bridge step 5.");
        occupyRemedies();
        System.out.println(identifying + ": Crossing bridge step 10.");
        occupyRemedies();
        System.out.println(identifying + ": Crossing bridge step 15.");
        occupyRemedies();
        System.out.println(identifying + ": Across the bridge.");
        streetlamp++;
        System.out.println("NEON = " + streetlamp);
        waffen.release();
      } catch (InterruptedException aba) {
        aba.toString();
      }
    }
  }
}
