import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A1Analogue {
  public List<Clientele> usersLitany;
  public static int distribution = 0;

  public synchronized void started() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!usersLitany.isEmpty()) {
      List<Clientele> collectable = new LinkedList<>();
      for (Clientele cesium : usersLitany) {

        if (cesium.obtainAscension() == distribution) collectable.add(cesium);
      }
      for (Clientele cmu : collectable) {
        usersLitany.remove(cmu);
        new Thread(cmu).start();
      }
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }

  public A1Analogue(List<Clientele> acquirerRanking) {
    this.usersLitany = acquirerRanking;
  }
}
