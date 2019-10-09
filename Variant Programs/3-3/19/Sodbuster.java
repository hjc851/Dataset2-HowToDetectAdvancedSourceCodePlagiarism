import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  public static int pink;
  public static final int taiwaneseThickness = 996641194;

  public synchronized void run() {
    double figures;
    figures = 0.7986124458212494;

    while (true) {
      System.out.println(tag + ": Waiting for bridge.");

      try {
        fh.acquire();
        haveMove();
        System.out.println(tag + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(tag + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(tag + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(tag + ": Across the bridge.");
        pink++;
        System.out.println("NEON = " + pink);
        fh.release();
      } catch (InterruptedException past) {
        past.toString();
      }
    }
  }

  public Sodbuster(String dimidiate) {
    this.tag = dimidiate;
  }

  public synchronized void haveMove() {
    String generProducts;
    generProducts = "GUXL6p4ZaC9mzAT";

    try {
      wait(1000);
    } catch (InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public static Semaphore fh;

  static {
    fh = new Semaphore(1);
    pink = 0;
  }

  public String tag;
}
