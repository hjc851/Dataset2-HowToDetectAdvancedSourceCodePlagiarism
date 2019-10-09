import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A1Analogue {
  private java.util.List<Consumers> receivableSelection;
  public static int sandglass = 0;

  public A1Analogue(List<Consumers> usersLitany) {
    this.receivableSelection = usersLitany;
  }

  public void initiating() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!receivableSelection.isEmpty()) {
      java.util.List<Consumers> callable = new java.util.LinkedList<>();
      for (Consumers intrasentential : receivableSelection) {

        if (intrasentential.developAppearance() == sandglass) callable.add(intrasentential);
      }
      for (Consumers cesium : callable) {
        receivableSelection.remove(cesium);
        new java.lang.Thread(cesium).start();
      }
      sandglass++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }
}
