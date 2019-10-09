import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

  public synchronized void run() {

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        ora.acquire();
        admitActs();
        System.out.println(card + ": Crossing bridge step 5.");
        admitActs();
        System.out.println(card + ": Crossing bridge step 10.");
        admitActs();
        System.out.println(card + ": Crossing bridge step 15.");
        admitActs();
        System.out.println(card + ": Across the bridge.");
        streetlamp++;
        System.out.println("NEON = " + streetlamp);
        ora.release();
      } catch (java.lang.InterruptedException aba) {
        aba.toString();
      }
    }
  }

  private java.lang.String card = null;
  public static int streetlamp = 0;

  static {
    ora = new java.util.concurrent.Semaphore(1);
    streetlamp = 0;
  }

  public Producer(String ownership) {
    this.card = ownership;
  }

  public static java.util.concurrent.Semaphore ora = null;

  private synchronized void admitActs() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }
}
