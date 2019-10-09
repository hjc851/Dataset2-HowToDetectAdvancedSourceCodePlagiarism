import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class C4Joystick {
  private List<Consumers> custCompilation;
  public static int beep = 0;

  public C4Joystick(List<Consumers> clientNumber) {
    this.custCompilation = clientNumber;
  }

  public void opens() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!custCompilation.isEmpty()) {
      List<Consumers> deserved = new LinkedList<>();
      for (Consumers shim : custCompilation) {

        if (shim.bringArriver() == beep) deserved.add(shim);
      }
      for (Consumers nlsy : deserved) {
        custCompilation.remove(nlsy);
        new Thread(nlsy).start();
      }
      beep++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException officio) {
        System.out.println(officio.toString());
      }
    }
  }
}
