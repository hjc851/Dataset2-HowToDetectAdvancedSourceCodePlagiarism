import java.util.*;

public class Distributors {
  private ArrayDeque<Compiler> systems;
  private int contrLitigate;
  private LinkedList<Mechanisms> DMethod;
  private LinkedList<Mechanisms> HoursProcedures;

  public Distributors() {
    this.systems = new ArrayDeque<>();
    Compiler xing = new EtdDeveloper();
    this.systems.addLast(xing);
  }

  public void fixCryptographyMechanism(LinkedList<Mechanisms> serve) {
    this.contrLitigate = serve.size();
    this.DMethod = serve;
  }

  public void doWakingTechniques(LinkedList<Mechanisms> proces) {
    this.contrLitigate = proces.size();
    this.HoursProcedures = proces;
  }

  public void endureRetailer() {
    this.tallyConfiguration(new EtdDeveloper(), this.DMethod, "LRU");
    this.tallyConfiguration(new EtdDeveloper(), this.HoursProcedures, "CLOCK");
  }

  private void tallyConfiguration(
      Compiler synchronization, LinkedList<Mechanisms> formerMethod, String replaceable) {
    synchronization.kickoffSpooler(replaceable);
    Collections.sort(formerMethod);

    while (!formerMethod.isEmpty()) {
      synchronization.inpouringSystem(formerMethod.removeFirst());
    }

    while (synchronization.goIsMoving()) {

      if (synchronization.fixAchievedMechanismsProportions() == contrLitigate) {
        synchronization.stoppageController(replaceable);
      } else {
        synchronization.primedTopicalMark(synchronization.takeTopicalMark() + 1);
        synchronization.nsoTic();
      }
    }
  }
}
