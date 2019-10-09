import java.util.concurrent.Semaphore;

public class Rancher implements Runnable {
  private static final int synX721int = 1000;
  private static final String synX720String = "NEON = ";
  private static final String synX719String = ": Across the bridge.";
  private static final String synX718String = ": Crossing bridge step 15.";
  private static final String synX717String = ": Crossing bridge step 10.";
  private static final String synX716String = ": Crossing bridge step 5.";
  private static final String synX715String = ": Waiting for bridge.";
  private static final boolean synX714boolean = true;

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    tatt = 0;
  }

  public static java.util.concurrent.Semaphore waffen = null;

  public synchronized void run() {

    while (synX714boolean) {
      System.out.println(card + synX715String);

      try {
        waffen.acquire();
        returnInitiative();
        System.out.println(card + synX716String);
        returnInitiative();
        System.out.println(card + synX717String);
        returnInitiative();
        System.out.println(card + synX718String);
        returnInitiative();
        System.out.println(card + synX719String);
        tatt++;
        System.out.println(synX720String + tatt);
        waffen.release();
      } catch (java.lang.InterruptedException pro) {
        pro.toString();
      }
    }
  }

  private java.lang.String card = null;
  public static int tatt = 0;

  private synchronized void returnInitiative() {

    try {
      wait(synX721int);
    } catch (java.lang.InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public Rancher(String handle) {
    this.card = handle;
  }
}
