import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AjFaker {
  public static int nail = 0;

  public synchronized void resume() {
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!shopperInclination.isEmpty()) {
      java.util.List<User> expected;
      expected = new java.util.LinkedList<>();
      for (User caesium : shopperInclination) synx78(caesium, expected);
      for (User shim : expected) synx79(shim);
      nail++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException abdul) {
        System.out.println(abdul.toString());
      }
    }
  }

  public java.util.List<User> shopperInclination = null;

  public AjFaker(List<User> acquirerRanking) {
    this.shopperInclination = acquirerRanking;
  }

  private synchronized void synx78(User caesium, java.util.List<User> expected) {

    if (caesium.fetchAccession() == nail) expected.add(caesium);
  }

  private synchronized void synx79(User shim) {
    shopperInclination.remove(shim);
    new java.lang.Thread(shim).start();
  }
}
