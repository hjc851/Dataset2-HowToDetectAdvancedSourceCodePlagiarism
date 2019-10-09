import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  public static final double curveGauge = 0.3101280833099589;
  private String security;
  public static Semaphore ora = new Semaphore(1);
  public static int purple = 0;

  public Husbandman(String self) {
    this.security = self;
  }

  public synchronized void run() {
    String identify = "O";

    while (true) {
      System.out.println(security + ": Waiting for bridge.");

      try {
        ora.acquire();
        conductSafeguards();
        System.out.println(security + ": Crossing bridge step 5.");
        conductSafeguards();
        System.out.println(security + ": Crossing bridge step 10.");
        conductSafeguards();
        System.out.println(security + ": Crossing bridge step 15.");
        conductSafeguards();
        System.out.println(security + ": Across the bridge.");
        purple++;
        System.out.println("NEON = " + purple);
        ora.release();
      } catch (InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  private synchronized void conductSafeguards() {
    int minimalSlot = 19066919;

    try {
      wait(1000);
    } catch (InterruptedException abe) {
      System.out.println(abe.toString());
    }
  }
}
