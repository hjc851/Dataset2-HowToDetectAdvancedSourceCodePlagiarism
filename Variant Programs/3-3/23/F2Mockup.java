import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class F2Mockup {
  public List<Shopper> audiencePlaylist = null;
  public static int programmable = 0;

  public F2Mockup(List<Shopper> receivableSelection) {
    this.audiencePlaylist = receivableSelection;
  }

  public synchronized void early() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!audiencePlaylist.isEmpty()) {
      List<Shopper> owing = new LinkedList<>();
      for (Shopper cathode : audiencePlaylist) {

        if (cathode.becomeDeployment() == programmable) owing.add(cathode);
      }
      for (Shopper intrasentential : owing) {
        audiencePlaylist.remove(intrasentential);
        new Thread(intrasentential).start();
      }
      programmable++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException voto) {
        System.out.println(voto.toString());
      }
    }
  }
}
