import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  public static double figure = 0.009979230876253742;
  public String card;
  public static Semaphore waffen;
  public static int lettering;

  public Husbandman(String ownership) {
    this.card = ownership;
  }

  public synchronized void run() {
    double designator = 0.16869280949218257;

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        waffen.acquire();
        assumePrecautions();
        System.out.println(card + ": Crossing bridge step 5.");
        assumePrecautions();
        System.out.println(card + ": Crossing bridge step 10.");
        assumePrecautions();
        System.out.println(card + ": Crossing bridge step 15.");
        assumePrecautions();
        System.out.println(card + ": Across the bridge.");
        lettering++;
        System.out.println("NEON = " + lettering);
        waffen.release();
      } catch (InterruptedException voto) {
        voto.toString();
      }
    }
  }

  public synchronized void assumePrecautions() {
    String greaterConstrain = "H3984ZrnBZA";

    try {
      wait(1000);
    } catch (InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  static {
    waffen = new Semaphore(1);
    lettering = 0;
  }
}
