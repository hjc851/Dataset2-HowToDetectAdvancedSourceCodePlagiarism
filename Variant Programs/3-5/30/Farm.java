import java.util.concurrent.Semaphore;

public class Farm implements Runnable {
  private static final int synX777int = 0;
  private static final int synX776int = 1;
  private static final int synX775int = 1000;
  private static final double synX774double = 0.07932781200996042;
  private static final String synX773String = "NEON = ";
  private static final String synX772String = ": Across the bridge.";
  private static final String synX771String = ": Crossing bridge step 15.";
  private static final String synX770String = ": Crossing bridge step 10.";
  private static final String synX769String = ": Crossing bridge step 5.";
  private static final String synX768String = ": Waiting for bridge.";
  private static final boolean synX767boolean = true;
  private static final double synX766double = 0.11631466533431256;
  public static int curlicue = 0;
  public static Semaphore ora = null;
  public String self = null;
  public static final double johannes = 0.25089325663329964;

  public Farm(String tag) {
    this.self = (tag);
  }

  public synchronized void run() {
    double marxRoll;
    marxRoll = (synX766double);

    while (synX767boolean) {
      System.out.println(self + synX768String);

      try {
        ora.acquire();
        returnInitiative();
        System.out.println(self + synX769String);
        returnInitiative();
        System.out.println(self + synX770String);
        returnInitiative();
        System.out.println(self + synX771String);
        returnInitiative();
        System.out.println(self + synX772String);
        curlicue++;
        System.out.println(synX773String + curlicue);
        ora.release();
      } catch (InterruptedException adoptee) {
        adoptee.toString();
      }
    }
  }

  public synchronized void returnInitiative() {
    double constrain;
    constrain = (synX774double);

    try {
      wait(synX775int);
    } catch (InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  static {
    ora = (new Semaphore(synX776int));
    curlicue = (synX777int);
  }
}
