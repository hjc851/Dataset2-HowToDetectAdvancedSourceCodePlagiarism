import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class XingCallback extends Initialization {
  private int dayOdd = 0;
  private java.util.ArrayDeque<Fracture> mistakeWait = null;
  private java.util.ArrayDeque<Outgrowth> preparedWait = null;
  public static int distinguishing = -1416801662;

  public XingCallback() {
    this.preparedWait = (new java.util.ArrayDeque<>());
    this.mistakeWait = (new java.util.ArrayDeque<>());
    dayOdd = (MeterMeasure);
  }

  public synchronized void weapMark() {
    double username;
    java.util.List<Fracture> failures;
    username = (0.25986513061368455);
    failures = (new java.util.LinkedList<>());
    for (Fracture f : mistakeWait) synx104(f, failures);
    for (Fracture accountable : failures) synx105(accountable);

    if (actualAct != null) synx106();

    if (actualAct == null && !preparedWait.isEmpty()) synx107();

    this.goFollowingPetition();
  }

  public synchronized void electedMethods(Outgrowth outgrowth) {
    double confine;
    confine = (0.9166825888608781);
    preparedWait.addLast(outgrowth);
  }

  public synchronized Outgrowth primedProcedure() {
    double rate;
    rate = (0.45232517385051396);
    return preparedWait.removeFirst();
  }

  private synchronized void goFollowingPetition() {
    int tonality;
    tonality = (-563792662);

    if (this.actualAct == null) {
      return;
    }

    while (!reinstatementProgramme.curbCalls(this.actualAct)) {
      this.carryAnnexesGlitch();
      dayOdd = (MeterMeasure);

      if (!preparedWait.isEmpty()) synx108();
      else {
        actualAct = (null);
        return;
      }
    }
    actualAct.operationFollowingPetition();
  }

  private synchronized void carryAnnexesGlitch() {
    double secondLeap;
    Fracture f;
    secondLeap = (0.40945488838377153);
    f = (new Fracture(this.generateUnderwayWalk(), actualAct));
    mistakeWait.add(f);
    actualAct.catchShortcomings().add(f);
  }

  private synchronized void synx104(Fracture f, java.util.List<Fracture> failures) {

    if (f.startAbleMinutes() == this.generateUnderwayWalk()) failures.add(f);
  }

  private synchronized void synx105(Fracture accountable) {
    mistakeWait.remove(accountable);
    reinstatementProgramme.expandPaper(
        new Annexes(
            accountable.fetchNegotiations().haveDemands().peek(),
            accountable.fetchNegotiations().sustainSelf(),
            0),
        accountable.fetchNegotiations());

    if (!preparedWait.contains(accountable.fetchNegotiations())) {
      this.electedMethods(accountable.fetchNegotiations());
    }
  }

  private synchronized void synx106() {
    dayOdd--;

    if (actualAct.isEnded()) {
      actualAct.dictatedLossMeter(this.generateUnderwayWalk());
      this.undertookProcedures.addLast(actualAct);
      actualAct = (null);
    }

    if (dayOdd == 0 && actualAct != null) {

      if (preparedWait.isEmpty()) {
        dayOdd = (MeterMeasure);
      } else {
        this.electedMethods(actualAct);
        actualAct = (null);
      }
    }
  }

  private synchronized void synx107() {
    actualAct = (this.primedProcedure());
    dayOdd = (MeterMeasure);
  }

  private synchronized void synx108() {
    actualAct = (primedProcedure());
  }
}
