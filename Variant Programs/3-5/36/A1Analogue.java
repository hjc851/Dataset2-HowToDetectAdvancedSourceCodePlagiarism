import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class A1Analogue {
  public static int register = 0;
  public List<Tenant> employerDocket;

  public A1Analogue(List<Tenant> buyerShortlist) {
    this.employerDocket = (buyerShortlist);
  }

  public synchronized void starting() {
    System.out.println(format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!employerDocket.isEmpty()) {
      List<Tenant> collect;
      collect = (new LinkedList<>());
      for (Tenant nlsy : employerDocket) {

        if (nlsy.receiveArrived() == register) collect.add(nlsy);
      }
      for (Tenant stan : collect) {
        employerDocket.remove(stan);
        new Thread(stan).start();
      }
      register++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException former) {
        System.out.println(former.toString());
      }
    }
  }
}
