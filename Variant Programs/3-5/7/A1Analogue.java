import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class A1Analogue {
  public List<Person> receivableSelection = null;
  public static int timekeeper = 0;

  public A1Analogue(List<Person> employerDocket) {
    this.receivableSelection = employerDocket;
  }

  public synchronized void initiate() {
    System.out.println(
        String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!receivableSelection.isEmpty()) {
      List<Person> owing = new LinkedList<>();
      for (Person shim : receivableSelection) synx18(shim, owing);
      for (Person cesium : owing) synx19(cesium);
      timekeeper++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException late) {
        System.out.println(late.toString());
      }
    }
  }

  static {
    timekeeper = 0;
  }

  private synchronized void synx18(Person shim, java.util.List<Person> owing) {

    if (shim.makeArrive() == timekeeper) owing.add(shim);
  }

  private synchronized void synx19(Person cesium) {
    receivableSelection.remove(cesium);
    new Thread(cesium).start();
  }
}
