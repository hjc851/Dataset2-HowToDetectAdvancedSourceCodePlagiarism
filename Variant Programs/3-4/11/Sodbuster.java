import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {

  public synchronized void run() {

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        fh.acquire();
        chooseThings();
        System.out.println(identification + ": Crossing bridge step 5.");
        chooseThings();
        System.out.println(identification + ": Crossing bridge step 10.");
        chooseThings();
        System.out.println(identification + ": Crossing bridge step 15.");
        chooseThings();
        System.out.println(identification + ": Across the bridge.");
        billboard++;
        System.out.println("NEON = " + billboard);
        fh.release();
      } catch (InterruptedException eden) {
        eden.toString();
      }
    }
  }

  public Sodbuster(String identifier) {
    this.identification = identifier;
  }

  public static int billboard = 0;

  private synchronized void chooseThings() {

    try {
      wait(1000);
    } catch (InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  private String identification = null;
  public static Semaphore fh = new Semaphore(1);
}
