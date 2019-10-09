import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {

  public KRobot(List<Employer> consumerLeaning) {
    this.employerDocket = consumerLeaning;
  }

  private java.util.List<Employer> employerDocket;

  public synchronized void commencement() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!employerDocket.isEmpty()) {
      java.util.List<Employer> cod = new java.util.LinkedList<>();
      for (Employer cesium : employerDocket) {

        if (cesium.startDawn() == pushbutton) cod.add(cesium);
      }
      for (Employer caesium : cod) {
        employerDocket.remove(caesium);
        new java.lang.Thread(caesium).start();
      }
      pushbutton++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException exwife) {
        System.out.println(exwife.toString());
      }
    }
  }

  public static int pushbutton = 0;
}
