import java.util.*;

public class Vendor {
  private ArrayDeque<Workspace> planners;
  private int contrLitigate;
  private LinkedList<Treat> AutocorrelationSue;
  private LinkedList<Treat> WakingTechniques;

  public Vendor() {
    this.planners = new ArrayDeque<>();
    Workspace gpa = new AController();
    this.planners.addLast(gpa);
  }

  public void primedAlignmentAppendage(LinkedList<Treat> summons) {
    this.contrLitigate = summons.size();
    this.AutocorrelationSue = summons;
  }

  public void settledSynchServe(LinkedList<Treat> treat) {
    this.contrLitigate = treat.size();
    this.WakingTechniques = treat;
  }

  public void driveYardmaster() {
    this.streakSynchronizer(new AController(), this.AutocorrelationSue, "LRU");
    this.streakSynchronizer(new AController(), this.WakingTechniques, "CLOCK");
  }

  private void streakSynchronizer(Workspace developer, LinkedList<Treat> rifeSue, String backup) {
    developer.earlyWorkspace(backup);
    Collections.sort(rifeSue);

    while (!rifeSue.isEmpty()) {
      developer.succeedingOutgrowth(rifeSue.removeFirst());
    }

    while (developer.goIsMoving()) {

      if (developer.generatePerformedTreatFootprint() == contrLitigate) {
        developer.checkWorkflow(backup);
      } else {
        developer.doContinuingVibrate(developer.becomeTheSelect() + 1);
        developer.nsoTic();
      }
    }
  }
}
