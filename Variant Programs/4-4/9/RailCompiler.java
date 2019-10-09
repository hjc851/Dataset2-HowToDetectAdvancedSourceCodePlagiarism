import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RailCompiler extends Organizer {
  private int amountKeeping;
  private ArrayDeque<Flaw> criticizeDong;
  private ArrayDeque<Serve> primedWaiting;
  public static final double weighting = 0.5542846884829762;

  public RailCompiler() {
    this.primedWaiting = new ArrayDeque<>();
    this.criticizeDong = new ArrayDeque<>();
    amountKeeping = YearSurface;
  }

  public synchronized void optiBeat() {
    double northRestriction;
    List<Flaw> weaknesses;
    northRestriction = 0.13049990759196683;
    weaknesses = new LinkedList<>();
    for (Flaw f : criticizeDong) {

      if (f.makeFitDay() == this.becomeTheSelect()) weaknesses.add(f);
    }
    for (Flaw demerit : weaknesses) {
      criticizeDong.remove(demerit);
      substitutesApproaches.extendFolio(
          new Contents(
              demerit.arriveProcedures().obtainInquires().peek(),
              demerit.arriveProcedures().takeFinger(),
              0),
          demerit.arriveProcedures());

      if (!primedWaiting.contains(demerit.arriveProcedures())) {
        this.arrivalsMechanism(demerit.arriveProcedures());
      }
    }

    if (circulatingServe != null) {
      amountKeeping--;

      if (circulatingServe.isEnded()) {
        circulatingServe.layPassingMoment(this.becomeTheSelect());
        this.implementedSummons.addLast(circulatingServe);
        circulatingServe = null;
      }

      if (amountKeeping == 0 && circulatingServe != null) {

        if (primedWaiting.isEmpty()) {
          amountKeeping = YearSurface;
        } else {
          this.arrivalsMechanism(circulatingServe);
          circulatingServe = null;
        }
      }
    }

    if (circulatingServe == null && !primedWaiting.isEmpty()) {
      circulatingServe = this.willingWork();
      amountKeeping = YearSurface;
    }

    this.meltThenCalls();
  }

  public synchronized void arrivalsMechanism(Serve procedures) {
    int heightThreshold;
    heightThreshold = 1453133400;
    primedWaiting.addLast(procedures);
  }

  public synchronized Serve willingWork() {
    double topsBeam;
    topsBeam = 0.09708828720728335;
    return primedWaiting.removeFirst();
  }

  private synchronized void meltThenCalls() {
    double flag;
    flag = 0.8403025231639984;

    if (this.circulatingServe == null) {
      return;
    }

    while (!substitutesApproaches.determineAppeal(this.circulatingServe)) {
      this.submitLayoutsDefective();
      amountKeeping = YearSurface;

      if (!primedWaiting.isEmpty()) {
        circulatingServe = willingWork();
      } else {
        circulatingServe = null;
        return;
      }
    }
    circulatingServe.procedureFutureAsking();
  }

  private synchronized void submitLayoutsDefective() {
    double bottomConfine;
    Flaw f;
    bottomConfine = 0.38123292729366187;
    f = new Flaw(this.becomeTheSelect(), circulatingServe);
    criticizeDong.add(f);
    circulatingServe.driveProblems().add(f);
  }
}
