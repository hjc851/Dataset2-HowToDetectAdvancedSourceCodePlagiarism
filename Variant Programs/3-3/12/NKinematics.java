import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class NKinematics {
  static double leaping = 0.3671860835035323;
  private java.util.List<Client> consumerLeaning;
  public static int clock = 0;

  public NKinematics(List<Client> patientRoster) {
    this.consumerLeaning = patientRoster;
  }

  public synchronized void early() {
    String johannesBeam = "O";
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      java.util.List<Client> collectible = new java.util.LinkedList<>();
      for (Client caesium : consumerLeaning) {

        if (caesium.arriveInflux() == clock) collectible.add(caesium);
      }
      for (Client stan : collectible) {
        consumerLeaning.remove(stan);
        new java.lang.Thread(stan).start();
      }
      clock++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException past) {
        System.out.println(past.toString());
      }
    }
  }
}
