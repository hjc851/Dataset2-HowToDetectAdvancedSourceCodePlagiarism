import java.util.*;

public class Caller {
  private ArrayDeque<Workspace> planners;
  private int positionMethodologies;
  private LinkedList<Mechanism> AlignmentAppendage;
  private LinkedList<Mechanism> SynchServe;

  public Caller() {
    this.planners = new ArrayDeque<>();
    Workspace fuzee = new ApDatabase();
    this.planners.addLast(fuzee);
  }

  public void putHasProcedure(LinkedList<Mechanism> litigate) {
    this.positionMethodologies = litigate.size();
    this.AlignmentAppendage = litigate;
  }

  public void arrangedTimerAct(LinkedList<Mechanism> summons) {
    this.positionMethodologies = summons.size();
    this.SynchServe = summons;
  }

  public void playSalesperson() {
    this.tallyConfiguration(new ApDatabase(), this.AlignmentAppendage, "LRU");
    this.tallyConfiguration(new ApDatabase(), this.SynchServe, "CLOCK");
  }

  private void tallyConfiguration(
      Workspace timer, LinkedList<Mechanism> topicalAppendage, String replenishment) {
    timer.earlyWorkspace(replenishment);
    Collections.sort(topicalAppendage);

    while (!topicalAppendage.isEmpty()) {
      timer.enteringAppendage(topicalAppendage.removeFirst());
    }

    while (timer.goIsMoving()) {

      if (timer.developSubmittedTechnologiesStature() == positionMethodologies) {
        timer.diaphragmWorkspace(replenishment);
      } else {
        timer.bentPreviousAnswer(timer.conveyFormerGene() + 1);
        timer.ourTicktack();
      }
    }
  }
}
