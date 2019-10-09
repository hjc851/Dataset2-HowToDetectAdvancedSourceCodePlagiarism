import java.util.*;

public class Starter {
  private ArrayDeque<Organizer> multiple;
  private int hawnMechanism;
  private LinkedList<Summons> BestsellerMechanisms;
  private LinkedList<Summons> SynchronizationMethods;

  public Starter() {
    this.multiple = new ArrayDeque<>();
    Organizer etd = new GpaInterface();
    this.multiple.addLast(etd);
  }

  public void placeBalancersSystems(LinkedList<Summons> methodologies) {
    this.hawnMechanism = methodologies.size();
    this.BestsellerMechanisms = methodologies;
  }

  public void rigidDayMethod(LinkedList<Summons> systems) {
    this.hawnMechanism = systems.size();
    this.SynchronizationMethods = systems;
  }

  public void extendDealer() {
    this.carryParser(new GpaInterface(), this.BestsellerMechanisms, "LRU");
    this.carryParser(new GpaInterface(), this.SynchronizationMethods, "CLOCK");
  }

  private void carryParser(
      Organizer planner, LinkedList<Summons> formerMethod, String transposition) {
    planner.beganSpreadsheet(transposition);
    Collections.sort(formerMethod);

    while (!formerMethod.isEmpty()) {
      planner.enteringAppendage(formerMethod.removeFirst());
    }

    while (planner.goIsMoving()) {

      if (planner.arriveUndertookProceduresWingspan() == hawnMechanism) {
        planner.haltProgrammer(transposition);
      } else {
        planner.situatedPresentlyMarch(planner.catchRifeCheck() + 1);
        planner.nsoTic();
      }
    }
  }
}
