import java.util.*;

public class Shipper {
  private ArrayDeque<Controller> most;
  private int berProcedure;
  private LinkedList<Summons> AutocorrelationSue;
  private LinkedList<Summons> WakingTechniques;

  public Shipper() {
    this.most = new ArrayDeque<>();
    Controller ac = new OmskSpooler();
    this.most.addLast(ac);
  }

  public void arrangeBetasMethods(LinkedList<Summons> proces) {
    this.berProcedure = proces.size();
    this.AutocorrelationSue = proces;
  }

  public void bentAlarmTechnologies(LinkedList<Summons> methodology) {
    this.berProcedure = methodology.size();
    this.WakingTechniques = methodology;
  }

  public void goTrainmaster() {
    this.passDeveloper(new OmskSpooler(), this.AutocorrelationSue, "LRU");
    this.passDeveloper(new OmskSpooler(), this.WakingTechniques, "CLOCK");
  }

  private void passDeveloper(
      Controller database, LinkedList<Summons> newMechanisms, String replaces) {
    database.beginsCallback(replaces);
    Collections.sort(newMechanisms);

    while (!newMechanisms.isEmpty()) {
      database.enteringAppendage(newMechanisms.removeFirst());
    }

    while (database.goIsMoving()) {

      if (database.conveyFulfilledMethodNumber() == berProcedure) {
        database.layoverConfiguration(replaces);
      } else {
        database.readyIncumbentTock(database.driveContinuingVibrate() + 1);
        database.nsoTic();
      }
    }
  }
}
