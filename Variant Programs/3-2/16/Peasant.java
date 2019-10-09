import java.util.concurrent.Semaphore;

public class Peasant implements Runnable {
  private String tag;
  public static Semaphore ora = new Semaphore(1);
  public static int glo = 0;

  public Peasant(String identifier) {
    this.tag = identifier;
  }

  public void run() {

    while (true) {
      System.out.println(tag + ": Waiting for bridge.");

      try {
        ora.acquire();
        askApproach();
        System.out.println(tag + ": Crossing bridge step 5.");
        askApproach();
        System.out.println(tag + ": Crossing bridge step 10.");
        askApproach();
        System.out.println(tag + ": Crossing bridge step 15.");
        askApproach();
        System.out.println(tag + ": Across the bridge.");
        glo++;
        System.out.println("NEON = " + glo);
        ora.release();
      } catch (InterruptedException exwife) {
        exwife.toString();
      }
    }
  }

  private synchronized void askApproach() {

    try {
      wait(1000);
    } catch (InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }
}
