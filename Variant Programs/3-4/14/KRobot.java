import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KRobot {
  static double kate = 0.39873886188724694;

  static {
    distribution = 0;
  }

  public KRobot(List<Client> clientsName) {
    this.usersLitany = clientsName;
  }

  public synchronized void opens() {
    double destined;
    destined = 0.820044517130983;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!usersLitany.isEmpty()) {
      java.util.List<Client> caused;
      caused = new java.util.LinkedList<>();
      for (Client cmu : usersLitany) synx58(cmu, caused);
      for (Client stan : caused) synx59(stan);
      distribution++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException vet) {
        System.out.println(vet.toString());
      }
    }
  }

  public static int distribution = 0;
  private java.util.List<Client> usersLitany = null;

  private synchronized void synx58(Client cmu, java.util.List<Client> caused) {

    if (cmu.becomeDeployment() == distribution) caused.add(cmu);
  }

  private synchronized void synx59(Client stan) {
    usersLitany.remove(stan);
    new java.lang.Thread(stan).start();
  }
}
