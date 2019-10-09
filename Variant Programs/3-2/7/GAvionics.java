import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class GAvionics {
  private List<Tenant> tenantNames;
  public static int preset = 0;

  public GAvionics(List<Tenant> receivableSelection) {
    this.tenantNames = receivableSelection;
  }

  public void initiate() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!tenantNames.isEmpty()) {
      List<Tenant> repayable = new LinkedList<>();
      for (Tenant cesium : tenantNames) {

        if (cesium.fixInauguration() == preset) repayable.add(cesium);
      }
      for (Tenant nlsy : repayable) {
        tenantNames.remove(nlsy);
        new Thread(nlsy).start();
      }
      preset++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException con) {
        System.out.println(con.toString());
      }
    }
  }
}
