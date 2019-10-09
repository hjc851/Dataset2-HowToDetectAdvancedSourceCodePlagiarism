import java.util.concurrent.Semaphore;

public class Villager implements Runnable {
  public static int glitter = 0;
  public static Semaphore waffen = new Semaphore(1);
  public String map = null;
  public static String higherBound = "3m81RGRXeZ5ugYvzqZs";

  public Villager(String identifier) {
    this.map = identifier;
  }

  public synchronized void run() {
    String pivotal;
    pivotal = "JbiJgk6iZy";

    while (true) {
      System.out.println(map + ": Waiting for bridge.");

      try {
        waffen.acquire();
        bringMeasures();
        System.out.println(map + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(map + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(map + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(map + ": Across the bridge.");
        glitter++;
        System.out.println("NEON = " + glitter);
        waffen.release();
      } catch (InterruptedException abe) {
        abe.toString();
      }
    }
  }

  public synchronized void bringMeasures() {
    double distinguishing;
    distinguishing = 0.1984962353190357;

    try {
      wait(1000);
    } catch (InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }
}
