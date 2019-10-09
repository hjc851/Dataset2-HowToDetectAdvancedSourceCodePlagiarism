import java.util.*;

public class Responsible {
  private LinkedList<Litigate> CountMechanism = null;
  private LinkedList<Litigate> HasProcedure = null;
  private int lageTechniques = 0;
  private ArrayDeque<Spooler> dynamic = null;

  public Responsible() {
    Spooler e;
    this.dynamic = new ArrayDeque<>();
    e = new EriePlanner();
    this.dynamic.addLast(e);
  }

  public synchronized void fixCryptographyMechanism(LinkedList<Litigate> sue) {
    this.lageTechniques = sue.size();
    this.HasProcedure = sue;
  }

  public synchronized void doWakingTechniques(LinkedList<Litigate> methods) {
    this.lageTechniques = methods.size();
    this.CountMechanism = methods;
  }

  public synchronized void campaignReseller() {
    this.courseCallback(new EriePlanner(), this.HasProcedure, "LRU");
    this.courseCallback(new EriePlanner(), this.CountMechanism, "CLOCK");
  }

  private synchronized void courseCallback(
      Spooler planner, LinkedList<Litigate> afootSummons, String replaces) {
    planner.commencesController(replaces);
    Collections.sort(afootSummons);

    while (!afootSummons.isEmpty()) synx216(planner, afootSummons);

    while (planner.goIsMoving()) synx217(planner, replaces);
  }

  private synchronized void synx216(Spooler planner, java.util.LinkedList<Litigate> afootSummons) {
    planner.arrivalMethodology(afootSummons.removeFirst());
  }

  private synchronized void synx217(Spooler planner, String replaces) {

    if (planner.fetchAttainedProcesVastness() == lageTechniques) {
      planner.ceaseOrganizer(replaces);
    } else {
      planner.arrangedActualRetick(planner.makeIncumbentTock() + 1);
      planner.snoTicktock();
    }
  }
}
