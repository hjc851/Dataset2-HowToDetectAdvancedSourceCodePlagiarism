import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  private static final int synX236int = 0;
  private static final int synX235int = 1;
  private static final int synX234int = 1000;
  private static final int synX233int = 1487210828;
  private static final String synX232String = "NEON = ";
  private static final String synX231String = ": Across the bridge.";
  private static final String synX230String = ": Crossing bridge step 15.";
  private static final String synX229String = ": Crossing bridge step 10.";
  private static final String synX228String = ": Crossing bridge step 5.";
  private static final String synX227String = ": Waiting for bridge.";
  private static final boolean synX226boolean = true;
  private static final String synX225String = "QVmj8lStgDJsOEqT2k";
  static String aboveFettered = "lZjqv9CMl77eKmG";
  public java.lang.String identifier;
  public static java.util.concurrent.Semaphore ora;
  public static int awnings;

  public Producer(String self) {
    this.identifier = self;
  }

  public synchronized void run() {
    String identify = synX225String;

    while (synX226boolean) {
      System.out.println(identifier + synX227String);

      try {
        ora.acquire();
        occupyRemedies();
        System.out.println(identifier + synX228String);
        occupyRemedies();
        System.out.println(identifier + synX229String);
        occupyRemedies();
        System.out.println(identifier + synX230String);
        occupyRemedies();
        System.out.println(identifier + synX231String);
        awnings++;
        System.out.println(synX232String + awnings);
        ora.release();
      } catch (java.lang.InterruptedException past) {
        past.toString();
      }
    }
  }

  public synchronized void occupyRemedies() {
    int highestLimit = synX233int;

    try {
      wait(synX234int);
    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  static {
    ora = new java.util.concurrent.Semaphore(synX235int);
    awnings = synX236int;
  }
}
