import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {

  public synchronized void run() {
    double figure;
    figure = 0.20984624890315062;

    while (true) {
      System.out.println(idem + ": Waiting for bridge.");

      try {
        waffen.acquire();
        learnInstructions();
        System.out.println(idem + ": Crossing bridge step 5.");
        learnInstructions();
        System.out.println(idem + ": Crossing bridge step 10.");
        learnInstructions();
        System.out.println(idem + ": Crossing bridge step 15.");
        learnInstructions();
        System.out.println(idem + ": Across the bridge.");
        purple++;
        System.out.println("NEON = " + purple);
        waffen.release();
      } catch (InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  public static Semaphore waffen = null;

  static {
    waffen = new Semaphore(1);
    purple = 0;
  }

  public synchronized void learnInstructions() {
    int atkinsAppliances;
    atkinsAppliances = -101418213;

    try {
      wait(1000);
    } catch (InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }

  public String idem = null;

  public Harvester(String card) {
    this.idem = card;
  }

  public static int purple = 0;
  static double restricts = 0.8335376509566942;
}
