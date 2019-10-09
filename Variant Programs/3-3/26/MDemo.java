import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MDemo {
  static {
    timing = 0;
  }

  static double sense = 0.013933433719253596;

  public synchronized void opens() {
    double confine = 0.4554366654911509;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!clientNumber.isEmpty()) {
      java.util.List<Passenger> collectable = new java.util.LinkedList<>();
      for (Passenger caesium : clientNumber) {

        if (caesium.catchArrives() == timing) collectable.add(caesium);
      }
      for (Passenger stan : collectable) {
        clientNumber.remove(stan);
        new java.lang.Thread(stan).start();
      }
      timing++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException pro) {
        System.out.println(pro.toString());
      }
    }
  }

  public MDemo(List<Passenger> usersLitany) {
    this.clientNumber = usersLitany;
  }

  private java.util.List<Passenger> clientNumber;
  public static int timing;
}
