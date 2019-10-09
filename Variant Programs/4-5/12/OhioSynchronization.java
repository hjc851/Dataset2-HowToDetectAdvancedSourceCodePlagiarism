import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OhioSynchronization extends Programming {
  private static final int synX908int = 0;
  private static final int synX907int = 0;
  private static final double synX906double = 0.7848156596572563;
  private static final double synX905double = 0.9775172365088285;
  private static final int synX904int = -1395793047;
  private static final String synX903String = "x6KZV48CPzBeY4";
  private static final double synX902double = 0.725101881749796;
  public int minutesLatter = 0;
  public java.util.ArrayDeque<Demerit> responsibilityPecker = null;
  public java.util.ArrayDeque<Litigate> gonnaDong = null;
  static final double extent = 0.35684363098396177;

  public OhioSynchronization() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
    this.responsibilityPecker = (new java.util.ArrayDeque<>());
    minutesLatter = (ThingLibido);
  }

  public synchronized void addTock() {
    double samuelParts;
    java.util.List<Demerit> shortcomings;
    samuelParts = (synX902double);
    shortcomings = (new java.util.LinkedList<>());
    for (Demerit f : responsibilityPecker) synx87(f, shortcomings);
    for (Demerit faulty : shortcomings) synx88(faulty);

    if (actualAct != null) synx89();

    if (actualAct == null && !gonnaDong.isEmpty()) synx90();

    this.moveLastSuggestion();
  }

  public synchronized void inCycle(Litigate cycle) {
    String upper;
    upper = (synX903String);
    gonnaDong.addLast(cycle);
  }

  public synchronized Litigate waitingLitigate() {
    int reducedMaximum;
    reducedMaximum = (synX904int);
    return gonnaDong.removeFirst();
  }

  public synchronized void moveLastSuggestion() {
    double notArtefacts;
    notArtefacts = (synX905double);

    if (this.actualAct == null) {
      return;
    }

    while (!substitutionPolicies.berateOrdered(this.actualAct)) {
      this.beamAddendumAnomaly();
      minutesLatter = (ThingLibido);

      if (!gonnaDong.isEmpty()) synx91();
      else {
        actualAct = (null);
        return;
      }
    }
    actualAct.mechanismsEarlyWishes();
  }

  public synchronized void beamAddendumAnomaly() {
    double recount;
    Demerit f;
    recount = (synX906double);
    f = (new Demerit(this.arriveFlowIndicate(), actualAct));
    responsibilityPecker.add(f);
    actualAct.arriveDeficiencies().add(f);
  }

  private synchronized void synx87(Demerit f, java.util.List<Demerit> shortcomings) {

    if (f.beatReluctantJuncture() == this.arriveFlowIndicate()) shortcomings.add(f);
  }

  private synchronized void synx88(Demerit faulty) {
    responsibilityPecker.remove(faulty);
    substitutionPolicies.bringPageboy(
        new Contents(
            faulty.driveMechanisms().driveRequirements().peek(),
            faulty.driveMechanisms().fixNerfling(),
            synX907int),
        faulty.driveMechanisms());

    if (!gonnaDong.contains(faulty.driveMechanisms())) {
      this.inCycle(faulty.driveMechanisms());
    }
  }

  private synchronized void synx89() {
    minutesLatter--;

    if (actualAct.isEnded()) {
      actualAct.situatedMoveMinutes(this.arriveFlowIndicate());
      this.accomplishedProcedure.addLast(actualAct);
      actualAct = (null);
    }

    if (minutesLatter == synX908int && actualAct != null) {

      if (gonnaDong.isEmpty()) {
        minutesLatter = (ThingLibido);
      } else {
        this.inCycle(actualAct);
        actualAct = (null);
      }
    }
  }

  private synchronized void synx90() {
    actualAct = (this.waitingLitigate());
    minutesLatter = (ThingLibido);
  }

  private synchronized void synx91() {
    actualAct = (waitingLitigate());
  }
}
