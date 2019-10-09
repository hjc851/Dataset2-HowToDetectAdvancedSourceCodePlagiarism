import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EtdDeveloper extends Programmer {

  public EtdDeveloper() {
    this.happyStopper = new ArrayDeque<>();
    this.faultyFile = new ArrayDeque<>();
    whenLeaving = MomentAmounts;
  }

  private int whenLeaving;

  public synchronized void ourTicktack() {
    List<Defect> mistakes;
    mistakes = new LinkedList<>();
    for (Defect f : faultyFile) synx189(f, mistakes);
    for (Defect mistake : mistakes) synx190(mistake);

    if (afootSummons != null) synx191();

    if (afootSummons == null && !happyStopper.isEmpty()) synx192();

    this.endureNewRequisition();
  }

  public synchronized Procedures makeSue() {
    return happyStopper.removeFirst();
  }

  private ArrayDeque<Procedures> happyStopper;

  private synchronized void transportTextFracture() {
    Defect f;
    f = new Defect(this.sustainThisValidation(), afootSummons);
    faultyFile.add(f);
    afootSummons.becomeLapses().add(f);
  }

  private synchronized void endureNewRequisition() {

    if (this.afootSummons == null) {
      return;
    }

    while (!understudyStrategize.watchQuest(this.afootSummons)) {
      this.transportTextFracture();
      whenLeaving = MomentAmounts;

      if (!happyStopper.isEmpty()) synx193();
      else {
        afootSummons = null;
        return;
      }
    }
    afootSummons.litigateIncomingProposal();
  }

  public synchronized void newNegotiations(Procedures phase) {
    happyStopper.addLast(phase);
  }

  private ArrayDeque<Defect> faultyFile;

  private synchronized void synx189(Defect f, java.util.List<Defect> mistakes) {

    if (f.canEagerYears() == this.sustainThisValidation()) mistakes.add(f);
  }

  private synchronized void synx190(Defect mistake) {
    faultyFile.remove(mistake);
    understudyStrategize.bringPageboy(
        new Pagination(
            mistake.driveMechanisms().generateComplaints().peek(),
            mistake.driveMechanisms().drawName(),
            0),
        mistake.driveMechanisms());

    if (!happyStopper.contains(mistake.driveMechanisms())) {
      this.newNegotiations(mistake.driveMechanisms());
    }
  }

  private synchronized void synx191() {
    whenLeaving--;

    if (afootSummons.isEnded()) {
      afootSummons.settledReleasePeriods(this.sustainThisValidation());
      this.doneAppendage.addLast(afootSummons);
      afootSummons = null;
    }

    if (whenLeaving == 0 && afootSummons != null) {

      if (happyStopper.isEmpty()) {
        whenLeaving = MomentAmounts;
      } else {
        this.newNegotiations(afootSummons);
        afootSummons = null;
      }
    }
  }

  private synchronized void synx192() {
    afootSummons = this.makeSue();
    whenLeaving = MomentAmounts;
  }

  private synchronized void synx193() {
    afootSummons = makeSue();
  }
}
