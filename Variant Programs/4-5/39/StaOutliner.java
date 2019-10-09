import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StaOutliner extends Workspace {
  private static final int synX2244int = 0;
  private static final int synX2243int = 0;
  private static final double synX2242double = 0.14520066661006426;
  private static final double synX2241double = 0.6353836387425666;
  private static final String synX2240String = "mkrtfb1VMIt";
  private static final int synX2239int = -278652726;
  private static final int synX2238int = -1598512449;

  public synchronized void playSucceedingBespeak() {
    int depressShackled;
    depressShackled = (synX2238int);

    if (this.afootSummons == null) {
      return;
    }

    while (!switchApproach.correspondRequisition(this.afootSummons)) {
      this.mailVarletMistake();
      daysRemainder = (MeterMeasure);

      if (!primedWaiting.isEmpty()) synx308();
      else {
        afootSummons = (null);
        return;
      }
    }
    afootSummons.methodSecondDecision();
  }

  public StaOutliner() {
    this.primedWaiting = (new java.util.ArrayDeque<>());
    this.mistakeWait = (new java.util.ArrayDeque<>());
    daysRemainder = (MeterMeasure);
  }

  public java.util.ArrayDeque<Operation> primedWaiting;
  public java.util.ArrayDeque<Error> mistakeWait;

  public synchronized void mailVarletMistake() {
    int hour;
    Error f;
    hour = (synX2239int);
    f = (new Error(this.goPrevailingClick(), afootSummons));
    mistakeWait.add(f);
    afootSummons.makeFracture().add(f);
  }

  public int daysRemainder;
  public static String frontRolled = "6YPlRjRKa";

  public synchronized void inflowingSummons(Operation system) {
    String handler;
    handler = (synX2240String);
    primedWaiting.addLast(system);
  }

  public synchronized Operation ripeOutgrowth() {
    double price;
    price = (synX2241double);
    return primedWaiting.removeFirst();
  }

  public synchronized void ourTicktack() {
    double esteem;
    java.util.List<Error> lapses;
    esteem = (synX2242double);
    lapses = (new java.util.LinkedList<>());
    for (Error f : mistakeWait) synx309(f, lapses);
    for (Error demerit : lapses) synx310(demerit);

    if (afootSummons != null) synx311();

    if (afootSummons == null && !primedWaiting.isEmpty()) synx312();

    this.playSucceedingBespeak();
  }

  private synchronized void synx308() {
    afootSummons = (ripeOutgrowth());
  }

  private synchronized void synx309(Error f, java.util.List<Error> lapses) {

    if (f.receiveWaitingMoment() == this.goPrevailingClick()) lapses.add(f);
  }

  private synchronized void synx310(Error demerit) {
    mistakeWait.remove(demerit);
    switchApproach.augmentPagination(
        new Sheet(
            demerit.arriveProcedures().driveRequirements().peek(),
            demerit.arriveProcedures().beatUser(),
            synX2243int),
        demerit.arriveProcedures());

    if (!primedWaiting.contains(demerit.arriveProcedures())) {
      this.inflowingSummons(demerit.arriveProcedures());
    }
  }

  private synchronized void synx311() {
    daysRemainder--;

    if (afootSummons.isEnded()) {
      afootSummons.adjustPerishMonth(this.goPrevailingClick());
      this.undertakenMarch.addLast(afootSummons);
      afootSummons = (null);
    }

    if (daysRemainder == synX2244int && afootSummons != null) {

      if (primedWaiting.isEmpty()) {
        daysRemainder = (MeterMeasure);
      } else {
        this.inflowingSummons(afootSummons);
        afootSummons = (null);
      }
    }
  }

  private synchronized void synx312() {
    afootSummons = (this.ripeOutgrowth());
    daysRemainder = (MeterMeasure);
  }
}
