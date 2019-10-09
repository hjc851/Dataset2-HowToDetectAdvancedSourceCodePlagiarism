import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P5Device {
  private java.util.List<Cust> patientRoster;
  public static int retardant;

  public P5Device(List<Cust> lesseeCatalog) {
    this.patientRoster = lesseeCatalog;
  }

  public synchronized void undertake() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!patientRoster.isEmpty()) {
      java.util.List<Cust> anticipated = new java.util.LinkedList<>();
      for (Cust intrasentential : patientRoster) synx123(intrasentential, anticipated);
      for (Cust caesium : anticipated) synx124(caesium);
      retardant++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException con) {
        System.out.println(con.toString());
      }
    }
  }

  static {
    retardant = 0;
  }

  private synchronized void synx123(Cust intrasentential, java.util.List<Cust> anticipated) {

    if (intrasentential.haveEmergence() == retardant) anticipated.add(intrasentential);
  }

  private synchronized void synx124(Cust caesium) {
    patientRoster.remove(caesium);
    new java.lang.Thread(caesium).start();
  }
}
