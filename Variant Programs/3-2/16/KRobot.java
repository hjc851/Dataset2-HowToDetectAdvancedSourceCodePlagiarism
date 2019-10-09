import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  private List<Clientele> custCompilation;
  public static int nail = 0;

  public KRobot(List<Clientele> clienteleChecklist) {
    this.custCompilation = clienteleChecklist;
  }

  public void come() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!custCompilation.isEmpty()) {
      List<Clientele> caused = new LinkedList<>();
      for (Clientele cathode : custCompilation) {

        if (cathode.sustainLanding() == nail) caused.add(cathode);
      }
      for (Clientele nlsy : caused) {
        custCompilation.remove(nlsy);
        new Thread(nlsy).start();
      }
      nail++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }
}
