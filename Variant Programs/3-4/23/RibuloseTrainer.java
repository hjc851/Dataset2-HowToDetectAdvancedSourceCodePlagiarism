import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class RibuloseTrainer {
  public static int register = 0;
  private java.util.List<Licensee> custCompilation = null;

  public RibuloseTrainer(List<Licensee> receivableSelection) {
    this.custCompilation = receivableSelection;
  }

  public synchronized void come() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!custCompilation.isEmpty()) {
      java.util.List<Licensee> because;
      because = new java.util.LinkedList<>();
      for (Licensee caesium : custCompilation) synx88(caesium, because);
      for (Licensee cmu : because) synx89(cmu);
      register++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException vet) {
        System.out.println(vet.toString());
      }
    }
  }

  private synchronized void synx88(Licensee caesium, java.util.List<Licensee> because) {

    if (caesium.startDawn() == register) because.add(caesium);
  }

  private synchronized void synx89(Licensee cmu) {
    custCompilation.remove(cmu);
    new java.lang.Thread(cmu).start();
  }
}
