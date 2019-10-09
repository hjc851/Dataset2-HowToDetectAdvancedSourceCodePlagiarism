import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ABrake {
  private java.util.List<Buyer> usersLitany;
  public static int developer = 0;

  public ABrake(List<Buyer> subscribersDirectory) {
    this.usersLitany = subscribersDirectory;
  }

  public void commenced() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!usersLitany.isEmpty()) {
      java.util.List<Buyer> collectable = new java.util.LinkedList<>();
      for (Buyer intrasentential : usersLitany) {

        if (intrasentential.fixInauguration() == developer) collectable.add(intrasentential);
      }
      for (Buyer nlsy : collectable) {
        usersLitany.remove(nlsy);
        new java.lang.Thread(nlsy).start();
      }
      developer++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException exwife) {
        System.out.println(exwife.toString());
      }
    }
  }
}
