import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P4Mimic {

  public synchronized void resume() {
    double chthonianConfine;
    chthonianConfine = 0.45327333544919024;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!usersLitany.isEmpty()) {
      java.util.List<Employer> consequent;
      consequent = new java.util.LinkedList<>();
      for (Employer intrasentential : usersLitany) synx63(intrasentential, consequent);
      for (Employer shim : consequent) synx64(shim);
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException adoptee) {
        System.out.println(adoptee.toString());
      }
    }
  }

  static {
    programmable = 0;
  }

  public static double morin = 0.6116646669079874;
  public static int programmable;
  private java.util.List<Employer> usersLitany;

  public P4Mimic(List<Employer> audiencePlaylist) {
    this.usersLitany = audiencePlaylist;
  }

  private synchronized void synx63(Employer intrasentential, java.util.List<Employer> consequent) {

    if (intrasentential.beatPresence() == programmable) consequent.add(intrasentential);
  }

  private synchronized void synx64(Employer shim) {
    usersLitany.remove(shim);
    new java.lang.Thread(shim).start();
  }
}
