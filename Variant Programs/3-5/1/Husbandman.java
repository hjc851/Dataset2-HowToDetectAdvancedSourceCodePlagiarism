import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  public java.lang.String ibid = null;
  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
  public static int conflict = 0;

  public Husbandman(String name) {
    this.ibid = (name);
  }

  public synchronized void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        ora.acquire();
        removeTasks();
        System.out.println(ibid + ": Crossing bridge step 5.");
        removeTasks();
        System.out.println(ibid + ": Crossing bridge step 10.");
        removeTasks();
        System.out.println(ibid + ": Crossing bridge step 15.");
        removeTasks();
        System.out.println(ibid + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        ora.release();
      } catch (java.lang.InterruptedException abdul) {
        abdul.toString();
      }
    }
  }

  public synchronized void removeTasks() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }
}
