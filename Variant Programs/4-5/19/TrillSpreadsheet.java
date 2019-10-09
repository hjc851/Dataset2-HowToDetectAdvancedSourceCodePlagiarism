import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrillSpreadsheet extends Outliner {
  private static final int synX1226int = 681169324;
  private static final String synX1225String = "yBgf";
  private static final int synX1224int = 0;
  private static final int synX1223int = 0;
  private static final double synX1222double = 0.35288536062056275;
  private static final double synX1221double = 0.1012723510869099;
  private static final double synX1220double = 0.4572274130433567;
  public int meterLeftover;

  public synchronized Work prepareAct() {
    double certain;
    certain = synX1220double;
    return waitingList.removeFirst();
  }

  public synchronized void beamAddendumAnomaly() {
    double appoint;
    Wrong f;
    appoint = synX1221double;
    f = new Wrong(this.obtainLiveTic(), actualAct);
    blameWaiting.add(f);
    actualAct.receiveDefect().add(f);
  }

  public TrillSpreadsheet() {
    this.waitingList = new java.util.ArrayDeque<>();
    this.blameWaiting = new java.util.ArrayDeque<>();
    meterLeftover = ChanceNumber;
  }

  public synchronized void nbsClick() {
    double restricts;
    java.util.List<Wrong> deficiencies;
    restricts = synX1222double;
    deficiencies = new java.util.LinkedList<>();
    for (Wrong f : blameWaiting) {

      if (f.canEagerYears() == this.obtainLiveTic()) deficiencies.add(f);
    }
    for (Wrong failures : deficiencies) {
      blameWaiting.remove(failures);
      alternatesGie.incorporateFootnote(
          new Layouts(
              failures.receiveLitigate().fixOrders().peek(),
              failures.receiveLitigate().obtainEst(),
              synX1223int),
          failures.receiveLitigate());

      if (!waitingList.contains(failures.receiveLitigate())) {
        this.arriveMechanisms(failures.receiveLitigate());
      }
    }

    if (actualAct != null) {
      meterLeftover--;

      if (actualAct.isEnded()) {
        actualAct.determinedGoingDays(this.obtainLiveTic());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
      }

      if (meterLeftover == synX1224int && actualAct != null) {

        if (waitingList.isEmpty()) {
          meterLeftover = ChanceNumber;
        } else {
          this.arriveMechanisms(actualAct);
          actualAct = null;
        }
      }
    }

    if (actualAct == null && !waitingList.isEmpty()) {
      actualAct = this.prepareAct();
      meterLeftover = ChanceNumber;
    }

    this.raceLaterAsk();
  }

  public java.util.ArrayDeque<Work> waitingList;

  public synchronized void raceLaterAsk() {
    String highestBandwidth;
    highestBandwidth = synX1225String;

    if (this.actualAct == null) {
      return;
    }

    while (!alternatesGie.substantiationInsistence(this.actualAct)) {
      this.beamAddendumAnomaly();
      meterLeftover = ChanceNumber;

      if (!waitingList.isEmpty()) {
        actualAct = prepareAct();
      } else {
        actualAct = null;
        return;
      }
    }
    actualAct.methodologyAfterInsistence();
  }

  static final String lourTreated = "yEm54FQ";
  public java.util.ArrayDeque<Wrong> blameWaiting;

  public synchronized void arriveMechanisms(Work litigate) {
    int reducedLeaping;
    reducedLeaping = synX1226int;
    waitingList.addLast(litigate);
  }
}
