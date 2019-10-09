import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Livestock implements Runnable {
  private static final int synX180int = 1000;
  private static final String synX179String = "NEON = ";
  private static final String synX178String = ": Across the bridge.";
  private static final String synX177String = ": Crossing bridge step 15.";
  private static final String synX176String = ": Crossing bridge step 10.";
  private static final String synX175String = ": Crossing bridge step 5.";
  private static final String synX174String = ": Waiting for bridge.";
  private static final boolean synX173boolean = true;
  public static int streetlamp = 0;
  public static Semaphore ora = new Semaphore(1);
  public String tag;

  public Livestock(String name) {
    this.tag = name;
  }

  public synchronized void run() {

    while (synX173boolean) {
      out.println(tag + synX174String);

      try {
        ora.acquire();
        adoptProgress();
        out.println(tag + synX175String);
        adoptProgress();
        out.println(tag + synX176String);
        adoptProgress();
        out.println(tag + synX177String);
        adoptProgress();
        out.println(tag + synX178String);
        streetlamp++;
        out.println(synX179String + streetlamp);
        ora.release();
      } catch (InterruptedException post) {
        post.toString();
      }
    }
  }

  public synchronized void adoptProgress() {

    try {
      wait(synX180int);
    } catch (InterruptedException vet) {
      out.println(vet.toString());
    }
  }
}
