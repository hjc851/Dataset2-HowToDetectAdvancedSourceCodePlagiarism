import java.util.concurrent.Semaphore;

public class Operator implements Runnable {
  public static int purple;
  public static Semaphore waffen;
  private String peg;
  public static String maineAmount = "qmHC8JEFfUepCN";

  public Operator(String photo) {
    this.peg = photo;
  }

  public synchronized void run() {
    String greaterConstrain;
    greaterConstrain = "7IwDJWe8V8j93VmU";

    while (true) {
      System.out.println(peg + ": Waiting for bridge.");

      try {
        waffen.acquire();
        undergoCountermeasures();
        System.out.println(peg + ": Crossing bridge step 5.");
        undergoCountermeasures();
        System.out.println(peg + ": Crossing bridge step 10.");
        undergoCountermeasures();
        System.out.println(peg + ": Crossing bridge step 15.");
        undergoCountermeasures();
        System.out.println(peg + ": Across the bridge.");
        purple++;
        System.out.println("NEON = " + purple);
        waffen.release();
      } catch (InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  private synchronized void undergoCountermeasures() {
    String little;
    little = "IhXvYk";

    try {
      wait(1000);
    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  static {
    waffen = new Semaphore(1);
    purple = 0;
  }
}
