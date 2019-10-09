import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StaOutliner extends Outliner {
  private static final int synX1574int = 0;
  private static final int synX1573int = 0;
  public ArrayDeque<Sue> primedWaiting = null;
  public ArrayDeque<Defective> mistakeWait = null;
  public int junctureMaintaining = 0;

  public StaOutliner() {
    this.primedWaiting = (new ArrayDeque<>());
    this.mistakeWait = (new ArrayDeque<>());
    junctureMaintaining = (OpportunityDramatic);
  }

  public synchronized void addTock() {
    List<Defective> flaws = new LinkedList<>();
    for (Defective f : mistakeWait) {

      if (f.obtainRipeDays() == this.fixNewTally()) flaws.add(f);
    }
    for (Defective error : flaws) {
      mistakeWait.remove(error);
      switchApproach.totalWeb(
          new Chapter(
              error.findAct().driveRequirements().peek(), error.findAct().goQuod(), synX1573int),
          error.findAct());

      if (!primedWaiting.contains(error.findAct())) {
        this.ingoingProcedure(error.findAct());
      }
    }

    if (rifeSue != null) {
      junctureMaintaining--;

      if (rifeSue.isEnded()) {
        rifeSue.layPassingMoment(this.fixNewTally());
        this.realizedWork.addLast(rifeSue);
        rifeSue = (null);
      }

      if (junctureMaintaining == synX1574int && rifeSue != null) {

        if (primedWaiting.isEmpty()) {
          junctureMaintaining = (OpportunityDramatic);
        } else {
          this.ingoingProcedure(rifeSue);
          rifeSue = (null);
        }
      }
    }

    if (rifeSue == null && !primedWaiting.isEmpty()) {
      rifeSue = (this.willingWork());
      junctureMaintaining = (OpportunityDramatic);
    }

    this.raceLaterAsk();
  }

  public synchronized void ingoingProcedure(Sue march) {
    primedWaiting.addLast(march);
  }

  public synchronized Sue willingWork() {
    return primedWaiting.removeFirst();
  }

  public synchronized void raceLaterAsk() {

    if (this.rifeSue == null) {
      return;
    }

    while (!switchApproach.ensureAppeals(this.rifeSue)) {
      this.transmitPageboyBlame();
      junctureMaintaining = (OpportunityDramatic);

      if (!primedWaiting.isEmpty()) {
        rifeSue = (willingWork());
      } else {
        rifeSue = (null);
        return;
      }
    }
    rifeSue.systemAgainDemands();
  }

  public synchronized void transmitPageboyBlame() {
    Defective f = new Defective(this.fixNewTally(), rifeSue);
    mistakeWait.add(f);
    rifeSue.haveFlaws().add(f);
  }
}
