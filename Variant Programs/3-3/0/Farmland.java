import java.util.concurrent.Semaphore;

public class Farmland implements Runnable {
  public static int ne = 0;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  public java.lang.String caller;
  static int infernalCertain = -502062723;

  public Farmland(String quod) {
    this.caller = quod;
  }

  public synchronized void run() {
    String nickname;
    nickname = "4mNPI4U5Q7";

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        waffen.acquire();
        bringMeasures();
        System.out.println(caller + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(caller + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(caller + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(caller + ": Across the bridge.");
        ne++;
        System.out.println("NEON = " + ne);
        waffen.release();
      } catch (java.lang.InterruptedException con) {
        con.toString();
      }
    }
  }

  public synchronized void bringMeasures() {
    int minh;
    minh = -840115328;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }
}
