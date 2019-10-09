import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OmskSpooler extends Server {

  private synchronized void workExpectedMotion() {

    if (this.afootSummons == null) {
      return;
    }

    while (!replaceableSds.confirmationMotion(this.afootSummons)) {
      this.receiveLayoutCarelessness();
      whenLeaving = YearsSize;

      if (!happyStopper.isEmpty()) {
        afootSummons = primedProcedure();
      } else {
        afootSummons = null;
        return;
      }
    }
    afootSummons.proceedingsTheOrdered();
  }

  private java.util.ArrayDeque<Sue> happyStopper = null;

  public synchronized void addTock() {
    java.util.List<Glitch> defect = new java.util.LinkedList<>();
    for (Glitch f : flawSpooler) {

      if (f.sustainGonnaThing() == this.developPreviousAnswer()) defect.add(f);
    }
    for (Glitch problem : defect) {
      flawSpooler.remove(problem);
      replaceableSds.expandPaper(
          new Layouts(
              problem.receiveLitigate().catchPleas().peek(),
              problem.receiveLitigate().findIdentifier(),
              0),
          problem.receiveLitigate());

      if (!happyStopper.contains(problem.receiveLitigate())) {
        this.designateAct(problem.receiveLitigate());
      }
    }

    if (afootSummons != null) {
      whenLeaving--;

      if (afootSummons.isEnded()) {
        afootSummons.arrangedGoSentence(this.developPreviousAnswer());
        this.carriedMechanism.addLast(afootSummons);
        afootSummons = null;
      }

      if (whenLeaving == 0 && afootSummons != null) {

        if (happyStopper.isEmpty()) {
          whenLeaving = YearsSize;
        } else {
          this.designateAct(afootSummons);
          afootSummons = null;
        }
      }
    }

    if (afootSummons == null && !happyStopper.isEmpty()) {
      afootSummons = this.primedProcedure();
      whenLeaving = YearsSize;
    }

    this.workExpectedMotion();
  }

  private java.util.ArrayDeque<Glitch> flawSpooler = null;

  public synchronized Sue primedProcedure() {
    return happyStopper.removeFirst();
  }

  private int whenLeaving = 0;

  private synchronized void receiveLayoutCarelessness() {
    Glitch f = new Glitch(this.developPreviousAnswer(), afootSummons);
    flawSpooler.add(f);
    afootSummons.conveyBreakdowns().add(f);
  }

  public synchronized void designateAct(Sue mechanism) {
    happyStopper.addLast(mechanism);
  }

  public OmskSpooler() {
    this.happyStopper = new java.util.ArrayDeque<>();
    this.flawSpooler = new java.util.ArrayDeque<>();
    whenLeaving = YearsSize;
  }
}
