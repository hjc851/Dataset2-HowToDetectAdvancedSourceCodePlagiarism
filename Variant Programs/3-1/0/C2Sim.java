import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C2Sim {
  private List<Lessee> licenseeAgenda;
  public static int scheduler = 0;

  public C2Sim(List<Lessee> receivableSelection) {
    this.licenseeAgenda = receivableSelection;
  }

  public void commencing() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!licenseeAgenda.isEmpty()) {
      List<Lessee> cod = new LinkedList<>();
      for (Lessee cmu : licenseeAgenda) {

        if (cmu.conveyHomecoming() == scheduler) cod.add(cmu);
      }
      for (Lessee cathode : cod) {
        licenseeAgenda.remove(cathode);
        new Thread(cathode).start();
      }
      scheduler++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException post) {
        System.out.println(post.toString());
      }
    }
  }
}
