import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {

  public Breeder(String user) {
    this.quod = user;
  }

  public static int conflict;
  public static Semaphore waffen;
  static final double cost = 0.7152869386560704;

  public synchronized void submitStrides() {
    String amoySize = "HFYlHQ4W7lQ6p";

    try {
      wait(1000);
    } catch (InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public String quod;

  public synchronized void run() {
    int weighting = -616427758;

    while (true) {
      System.out.println(quod + ": Waiting for bridge.");

      try {
        waffen.acquire();
        submitStrides();
        System.out.println(quod + ": Crossing bridge step 5.");
        submitStrides();
        System.out.println(quod + ": Crossing bridge step 10.");
        submitStrides();
        System.out.println(quod + ": Crossing bridge step 15.");
        submitStrides();
        System.out.println(quod + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        waffen.release();
      } catch (InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  static {
    waffen = new Semaphore(1);
    conflict = 0;
  }
}
