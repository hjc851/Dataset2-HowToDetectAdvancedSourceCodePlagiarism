import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class EPrototype {
  private static final int synX288int = 1;
  private static final String synX287String = "Leaves";
  private static final String synX286String = "Seats";
  private static final String synX285String = "Arrives";
  private static final String synX284String = "Customer";
  private static final String synX283String = "%-10s%10s%10s%10s";

  public synchronized void resume() {
    System.out.println(
        format(synX283String, synX284String, synX285String, synX286String, synX287String));

    while (!buyerShortlist.isEmpty()) {
      java.util.List<Users> expected = new java.util.LinkedList<>();
      for (Users intrasentential : buyerShortlist) synx53(intrasentential, expected);
      for (Users caesium : expected) synx54(caesium);
      pushbutton++;

      try {
        TimeUnit.SECONDS.sleep(synX288int);
      } catch (java.lang.InterruptedException combatants) {
        System.out.println(combatants.toString());
      }
    }
  }

  public static int pushbutton = 0;
  private java.util.List<Users> buyerShortlist;

  public EPrototype(List<Users> purchaserCompendium) {
    this.buyerShortlist = purchaserCompendium;
  }

  private synchronized void synx53(Users intrasentential, java.util.List<Users> expected) {

    if (intrasentential.catchArrives() == pushbutton) expected.add(intrasentential);
  }

  private synchronized void synx54(Users caesium) {
    buyerShortlist.remove(caesium);
    new java.lang.Thread(caesium).start();
  }
}
