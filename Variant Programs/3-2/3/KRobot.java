import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  private java.util.List<User> audiencePlaylist;
  public static int preset = 0;

  public KRobot(List<User> usersLitany) {
    this.audiencePlaylist = usersLitany;
  }

  public void initiate() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!audiencePlaylist.isEmpty()) {
      java.util.List<User> collectable = new java.util.LinkedList<>();
      for (User cathode : audiencePlaylist) {

        if (cathode.generateReturn() == preset) collectable.add(cathode);
      }
      for (User intrasentential : collectable) {
        audiencePlaylist.remove(intrasentential);
        new java.lang.Thread(intrasentential).start();
      }
      preset++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException voto) {
        System.out.println(voto.toString());
      }
    }
  }
}
