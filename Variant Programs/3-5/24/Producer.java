import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Producer implements Runnable {
  private static final String synX672String = "NEON = ";
  private static final String synX671String = ": Across the bridge.";
  private static final String synX670String = ": Crossing bridge step 15.";
  private static final String synX669String = ": Crossing bridge step 10.";
  private static final String synX668String = ": Crossing bridge step 5.";
  private static final String synX667String = ": Waiting for bridge.";
  private static final boolean synX666boolean = true;
  private static final String synX665String = "H7CRteDko";
  private static final int synX664int = 1000;
  private static final String synX663String = "jFJMuZMdG";
  public static Semaphore fh;
  public static int glow;

  public Producer(String identifier) {
    this.milad = identifier;
  }

  public synchronized void admitActs() {
    String ceiling = synX663String;

    try {
      wait(synX664int);
    } catch (InterruptedException combatants) {
      out.println(combatants.toString());
    }
  }

  public String milad;
  static final double man = 0.8114218113509578;

  static {
    fh = new Semaphore(1);
    glow = 0;
  }

  public synchronized void run() {
    String amphetamineCompelled = synX665String;

    while (synX666boolean) {
      out.println(milad + synX667String);

      try {
        fh.acquire();
        admitActs();
        out.println(milad + synX668String);
        admitActs();
        out.println(milad + synX669String);
        admitActs();
        out.println(milad + synX670String);
        admitActs();
        out.println(milad + synX671String);
        glow++;
        out.println(synX672String + glow);
        fh.release();
      } catch (InterruptedException pro) {
        pro.toString();
      }
    }
  }
}
