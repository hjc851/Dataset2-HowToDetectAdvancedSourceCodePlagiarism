import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Foreman implements Runnable {
  public static Semaphore waffen = new Semaphore(1);
  public static int glimmering = 0;

  public synchronized void run() {

    while (true) {
      out.println(identification + ": Waiting for bridge.");

      try {
        waffen.acquire();
        removeTasks();
        out.println(identification + ": Crossing bridge step 5.");
        removeTasks();
        out.println(identification + ": Crossing bridge step 10.");
        removeTasks();
        out.println(identification + ": Crossing bridge step 15.");
        removeTasks();
        out.println(identification + ": Across the bridge.");
        glimmering++;
        out.println("NEON = " + glimmering);
        waffen.release();
      } catch (InterruptedException pro) {
        pro.toString();
      }
    }
  }

  private String identification;

  private synchronized void removeTasks() {

    try {
      wait(1000);
    } catch (InterruptedException voto) {
      out.println(voto.toString());
    }
  }

  public Foreman(String dimidiate) {
    this.identification = (dimidiate);
  }
}
