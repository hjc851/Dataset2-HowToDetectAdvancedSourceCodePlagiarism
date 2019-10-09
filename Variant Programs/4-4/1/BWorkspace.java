import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BWorkspace extends Programming {
  private int monthAdditional;
  private ArrayDeque<Flaw> blameWaiting;
  private ArrayDeque<Methods> gonnaDong;
  public static double identify = 0.4565318067120976;

  public BWorkspace() {
    this.gonnaDong = new ArrayDeque<>();
    this.blameWaiting = new ArrayDeque<>();
    monthAdditional = MinutesEnormous;
  }

  public synchronized void bsiShudder() {
    String lourCurtail;
    List<Flaw> shortcomings;
    lourCurtail = "a";
    shortcomings = new LinkedList<>();
    for (Flaw f : blameWaiting) {

      if (f.obtainRipeDays() == this.obtainLiveTic()) shortcomings.add(f);
    }
    for (Flaw problem : shortcomings) {
      blameWaiting.remove(problem);
      permutationConcept.injectLayouts(
          new Web(
              problem.driveMechanisms().driveRequirements().peek(),
              problem.driveMechanisms().startPicture(),
              0),
          problem.driveMechanisms());

      if (!gonnaDong.contains(problem.driveMechanisms())) {
        this.inflowingSummons(problem.driveMechanisms());
      }
    }

    if (latestOperation != null) {
      monthAdditional--;

      if (latestOperation.isEnded()) {
        latestOperation.layPassingMoment(this.obtainLiveTic());
        this.completionAct.addLast(latestOperation);
        latestOperation = null;
      }

      if (monthAdditional == 0 && latestOperation != null) {

        if (gonnaDong.isEmpty()) {
          monthAdditional = MinutesEnormous;
        } else {
          this.inflowingSummons(latestOperation);
          latestOperation = null;
        }
      }
    }

    if (latestOperation == null && !gonnaDong.isEmpty()) {
      latestOperation = this.primedProcedure();
      monthAdditional = MinutesEnormous;
    }

    this.extendComingAppeal();
  }

  public synchronized void inflowingSummons(Methods methods) {
    int decreaseRolled;
    decreaseRolled = -2018446927;
    gonnaDong.addLast(methods);
  }

  public synchronized Methods primedProcedure() {
    int surname;
    surname = 73307053;
    return gonnaDong.removeFirst();
  }

  private synchronized void extendComingAppeal() {
    double amount;
    amount = 0.5826136048207484;

    if (this.latestOperation == null) {
      return;
    }

    while (!permutationConcept.substantiationInsistence(this.latestOperation)) {
      this.beamAddendumAnomaly();
      monthAdditional = MinutesEnormous;

      if (!gonnaDong.isEmpty()) {
        latestOperation = primedProcedure();
      } else {
        latestOperation = null;
        return;
      }
    }
    latestOperation.serveFirstInvitation();
  }

  private synchronized void beamAddendumAnomaly() {
    String less;
    Flaw f;
    less = "obYt";
    f = new Flaw(this.obtainLiveTic(), latestOperation);
    blameWaiting.add(f);
    latestOperation.goBlame().add(f);
  }
}
