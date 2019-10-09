import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  public static int nightscape = 0;
  public static Semaphore fh = new Semaphore(1);
  public String identification;
  public static final String call = "EyVgFGp";

  public Breeder(String quod) {
    this.identification = quod;
  }

  public synchronized void run() {
    String max;
    max = "E2XMsJGEhfaoclg";

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        fh.acquire();
        assumePrecautions();
        System.out.println(identification + ": Crossing bridge step 5.");
        assumePrecautions();
        System.out.println(identification + ": Crossing bridge step 10.");
        assumePrecautions();
        System.out.println(identification + ": Crossing bridge step 15.");
        assumePrecautions();
        System.out.println(identification + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        fh.release();
      } catch (InterruptedException voto) {
        voto.toString();
      }
    }
  }

  public synchronized void assumePrecautions() {
    double name;
    name = 0.8208480316769239;

    try {
      wait(1000);
    } catch (InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }
}
