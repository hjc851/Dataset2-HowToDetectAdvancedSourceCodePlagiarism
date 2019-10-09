import java.util.concurrent.Semaphore;

public class Rancher implements Runnable {
  private static final int synX926int = 1000;
  private static final String synX925String = "NEON = ";
  private static final String synX924String = ": Across the bridge.";
  private static final String synX923String = ": Crossing bridge step 15.";
  private static final String synX922String = ": Crossing bridge step 10.";
  private static final String synX921String = ": Crossing bridge step 5.";
  private static final String synX920String = ": Waiting for bridge.";
  private static final boolean synX919boolean = true;

  public Rancher(String tag) {
    this.nerfling = tag;
  }

  public synchronized void run() {

    while (synX919boolean) {
      System.out.println(nerfling + synX920String);

      try {
        ora.acquire();
        returnInitiative();
        System.out.println(nerfling + synX921String);
        returnInitiative();
        System.out.println(nerfling + synX922String);
        returnInitiative();
        System.out.println(nerfling + synX923String);
        returnInitiative();
        System.out.println(nerfling + synX924String);
        blue++;
        System.out.println(synX925String + blue);
        ora.release();
      } catch (java.lang.InterruptedException con) {
        con.toString();
      }
    }
  }

  public static int blue;
  public static java.util.concurrent.Semaphore ora;

  static {
    ora = new java.util.concurrent.Semaphore(1);
    blue = 0;
  }

  public synchronized void returnInitiative() {

    try {
      wait(synX926int);
    } catch (java.lang.InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  public java.lang.String nerfling;
}
