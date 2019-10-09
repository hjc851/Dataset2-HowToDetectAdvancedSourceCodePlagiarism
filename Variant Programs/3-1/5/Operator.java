import java.util.concurrent.Semaphore;

public class Operator implements Runnable {
  private String tag;
  public static Semaphore waffen = new Semaphore(1);
  public static int helium = 0;

  public Operator(String peg) {
    this.tag = peg;
  }

  public void run() {

    while (true) {
      System.out.println(tag + ": Waiting for bridge.");

      try {
        waffen.acquire();
        haveMove();
        System.out.println(tag + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(tag + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(tag + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(tag + ": Across the bridge.");
        helium++;
        System.out.println("NEON = " + helium);
        waffen.release();
      } catch (InterruptedException past) {
        past.toString();
      }
    }
  }

  private synchronized void haveMove() {

    try {
      wait(1000);
    } catch (InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }
}
