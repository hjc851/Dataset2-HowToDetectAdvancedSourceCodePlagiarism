import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class P5Device {
  private List<Person> consumersBlacklist;
  public static int preset = 0;

  public P5Device(List<Person> patronsListings) {
    this.consumersBlacklist = patronsListings;
  }

  public void commencement() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumersBlacklist.isEmpty()) {
      List<Person> owing = new LinkedList<>();
      for (Person cathode : consumersBlacklist) {

        if (cathode.becomeDeployment() == preset) owing.add(cathode);
      }
      for (Person shim : owing) {
        consumersBlacklist.remove(shim);
        new Thread(shim).start();
      }
      preset++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException vet) {
        System.out.println(vet.toString());
      }
    }
  }
}
