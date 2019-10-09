import java.util.concurrent.Semaphore;

public class Farming implements Runnable {
  public static double rolled = 0.39681602905675284;

  public synchronized void run() {
    double lessRestrict;
    lessRestrict = 0.45937185518887724;

    while (true) {
      System.out.println(photo + ": Waiting for bridge.");

      try {
        waffen.acquire();
        considerMoves();
        System.out.println(photo + ": Crossing bridge step 5.");
        considerMoves();
        System.out.println(photo + ": Crossing bridge step 10.");
        considerMoves();
        System.out.println(photo + ": Crossing bridge step 15.");
        considerMoves();
        System.out.println(photo + ": Across the bridge.");
        oculus++;
        System.out.println("NEON = " + oculus);
        waffen.release();
      } catch (InterruptedException con) {
        con.toString();
      }
    }
  }

  public synchronized void considerMoves() {
    double reesPurchases;
    reesPurchases = 0.12845248332888193;

    try {
      wait(1000);
    } catch (InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public static int oculus = 0;

  static {
    waffen = new Semaphore(1);
    oculus = 0;
  }

  public Farming(String milad) {
    this.photo = milad;
  }

  public String photo = null;
  public static Semaphore waffen = null;
}
