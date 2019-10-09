import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ApMoot {
  private List<Caller> subscribersDirectory;
  public static int scheduler = 0;

  public ApMoot(List<Caller> audiencePlaylist) {
    this.subscribersDirectory = audiencePlaylist;
  }

  public void early() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!subscribersDirectory.isEmpty()) {
      List<Caller> merited = new LinkedList<>();
      for (Caller cathode : subscribersDirectory) {

        if (cathode.goReaching() == scheduler) merited.add(cathode);
      }
      for (Caller nlsy : merited) {
        subscribersDirectory.remove(nlsy);
        new Thread(nlsy).start();
      }
      scheduler++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }
}
