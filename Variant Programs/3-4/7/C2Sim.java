import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C2Sim {
  public static int pushbutton = 0;

  public synchronized void introduce() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!licenseeAgenda.isEmpty()) {
      List<Caller> overdue;
      overdue = new LinkedList<>();
      for (Caller caesium : licenseeAgenda) {

        if (caesium.letAdvent() == pushbutton) overdue.add(caesium);
      }
      for (Caller cesium : overdue) {
        licenseeAgenda.remove(cesium);
        new Thread(cesium).start();
      }
      pushbutton++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }

  public C2Sim(List<Caller> clientsName) {
    this.licenseeAgenda = clientsName;
  }

  private List<Caller> licenseeAgenda;
}
