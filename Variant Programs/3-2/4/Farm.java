import java.util.concurrent.Semaphore;

public class Farm implements Runnable {
  private String ibid;
  public static Semaphore ora = new Semaphore(1);
  public static int swoosh = 0;

  public Farm(String tag) {
    this.ibid = tag;
  }

  public void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        ora.acquire();
        learnInstructions();
        System.out.println(ibid + ": Crossing bridge step 5.");
        learnInstructions();
        System.out.println(ibid + ": Crossing bridge step 10.");
        learnInstructions();
        System.out.println(ibid + ": Crossing bridge step 15.");
        learnInstructions();
        System.out.println(ibid + ": Across the bridge.");
        swoosh++;
        System.out.println("NEON = " + swoosh);
        ora.release();
      } catch (InterruptedException vet) {
        vet.toString();
      }
    }
  }

  private synchronized void learnInstructions() {

    try {
      wait(1000);
    } catch (InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }
}
