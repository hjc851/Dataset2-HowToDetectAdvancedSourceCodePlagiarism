import java.util.*;

public class Starter {
  private ArrayDeque<Callback> use;
  private int berProcedure;
  private LinkedList<Procedure> AutomatonTreat;
  private LinkedList<Procedure> TimerAct;

  public Starter() {
    this.use = new ArrayDeque<>();
    Callback trilled = new TrilledServer();
    this.use.addLast(trilled);
  }

  public void fixedBooleanPractices(LinkedList<Procedure> work) {
    this.berProcedure = work.size();
    this.AutomatonTreat = work;
  }

  public void fixedWatchPractices(LinkedList<Procedure> treat) {
    this.berProcedure = treat.size();
    this.TimerAct = treat;
  }

  public void outpouringPlenum() {
    this.ramCompiler(new TrilledServer(), this.AutomatonTreat, "LRU");
    this.ramCompiler(new TrilledServer(), this.TimerAct, "CLOCK");
  }

  private void ramCompiler(
      Callback developer, LinkedList<Procedure> presentlyMethodology, String substitute) {
    developer.offsetCompiler(substitute);
    Collections.sort(presentlyMethodology);

    while (!presentlyMethodology.isEmpty()) {
      developer.designateAct(presentlyMethodology.removeFirst());
    }

    while (developer.goIsMoving()) {

      if (developer.arriveUndertookProceduresWingspan() == berProcedure) {
        developer.catchPlanner(substitute);
      } else {
        developer.dictatedOngoingBeat(developer.receiveContemporaryTicktack() + 1);
        developer.addTock();
      }
    }
  }
}
