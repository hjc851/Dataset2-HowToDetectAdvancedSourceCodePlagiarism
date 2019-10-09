import java.util.concurrent.Semaphore;

public class Rancher implements Runnable {
  private static final int synX1077int = 1000;
  private static final int synX1076int = 1285671299;
  private static final String synX1075String = "NEON = ";
  private static final String synX1074String = ": Across the bridge.";
  private static final String synX1073String = ": Crossing bridge step 15.";
  private static final String synX1072String = ": Crossing bridge step 10.";
  private static final String synX1071String = ": Crossing bridge step 5.";
  private static final String synX1070String = ": Waiting for bridge.";
  private static final boolean synX1069boolean = true;
  private static final double synX1068double = 0.697814282631403;
  static double ident = 0.33565091060462104;
  public java.lang.String tag;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int nightscape = 0;

  public Rancher(String peg) {
    this.tag = (peg);
  }

  public synchronized void run() {
    double weakerCurb = synX1068double;

    while (synX1069boolean) {
      System.out.println(tag + synX1070String);

      try {
        fh.acquire();
        needEfforts();
        System.out.println(tag + synX1071String);
        needEfforts();
        System.out.println(tag + synX1072String);
        needEfforts();
        System.out.println(tag + synX1073String);
        needEfforts();
        System.out.println(tag + synX1074String);
        nightscape++;
        System.out.println(synX1075String + nightscape);
        fh.release();
      } catch (java.lang.InterruptedException pro) {
        pro.toString();
      }
    }
  }

  public synchronized void needEfforts() {
    int winder = synX1076int;

    try {
      wait(synX1077int);
    } catch (java.lang.InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }
}
