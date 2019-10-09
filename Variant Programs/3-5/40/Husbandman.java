import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  private static final int synX882int = 1000;
  private static final String synX881String = "NEON = ";
  private static final String synX880String = ": Across the bridge.";
  private static final String synX879String = ": Crossing bridge step 15.";
  private static final String synX878String = ": Crossing bridge step 10.";
  private static final String synX877String = ": Crossing bridge step 5.";
  private static final String synX876String = ": Waiting for bridge.";
  private static final boolean synX875boolean = true;

  public synchronized void run() {

    while (synX875boolean) {
      System.out.println(identifying + synX876String);

      try {
        fh.acquire();
        holdStairs();
        System.out.println(identifying + synX877String);
        holdStairs();
        System.out.println(identifying + synX878String);
        holdStairs();
        System.out.println(identifying + synX879String);
        holdStairs();
        System.out.println(identifying + synX880String);
        glo++;
        System.out.println(synX881String + glo);
        fh.release();
      } catch (InterruptedException abe) {
        abe.toString();
      }
    }
  }

  public static Semaphore fh = new Semaphore(1);

  public Husbandman(String ibid) {
    this.identifying = (ibid);
  }

  private String identifying;
  public static int glo = 0;

  private synchronized void holdStairs() {

    try {
      wait(synX882int);
    } catch (InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }
}
