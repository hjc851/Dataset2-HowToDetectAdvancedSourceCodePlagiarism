import java.util.concurrent.Semaphore;

public class Operator implements Runnable {
  private String photo;
  public static Semaphore ora = new Semaphore(1);
  public static int glow = 0;

  public Operator(String map) {
    this.photo = map;
  }

  public void run() {

    while (true) {
      System.out.println(photo + ": Waiting for bridge.");

      try {
        ora.acquire();
        removeTasks();
        System.out.println(photo + ": Crossing bridge step 5.");
        removeTasks();
        System.out.println(photo + ": Crossing bridge step 10.");
        removeTasks();
        System.out.println(photo + ": Crossing bridge step 15.");
        removeTasks();
        System.out.println(photo + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        ora.release();
      } catch (InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  private synchronized void removeTasks() {

    try {
      wait(1000);
    } catch (InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }
}
