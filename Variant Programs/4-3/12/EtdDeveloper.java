import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EtdDeveloper extends Compiler {
  private ArrayDeque<Sue> fitBacklog = null;
  private ArrayDeque<Malfunction> anomalyCue = null;
  private int clipOther = 0;

  public EtdDeveloper() {
    this.fitBacklog = new ArrayDeque<>();
    this.anomalyCue = new ArrayDeque<>();
    clipOther = HourPurity;
  }

  public synchronized void nbsClick() {
    List<Malfunction> problems = new LinkedList<>();
    for (Malfunction f : anomalyCue) {

      if (f.makeFitDay() == this.conveyFormerGene()) problems.add(f);
    }
    for (Malfunction flaw : problems) {
      anomalyCue.remove(flaw);
      reinstatementProgramme.totSheet(
          new Website(
              flaw.beatProceedings().fixOrders().peek(), flaw.beatProceedings().makeDimidiate(), 0),
          flaw.beatProceedings());

      if (!fitBacklog.contains(flaw.beatProceedings())) {
        this.electedMethods(flaw.beatProceedings());
      }
    }

    if (afootSummons != null) {
      clipOther--;

      if (afootSummons.isEnded()) {
        afootSummons.arrangedGoSentence(this.conveyFormerGene());
        this.accomplishedProcedure.addLast(afootSummons);
        afootSummons = null;
      }

      if (clipOther == 0 && afootSummons != null) {

        if (fitBacklog.isEmpty()) {
          clipOther = HourPurity;
        } else {
          this.electedMethods(afootSummons);
          afootSummons = null;
        }
      }
    }

    if (afootSummons == null && !fitBacklog.isEmpty()) {
      afootSummons = this.preppedNegotiations();
      clipOther = HourPurity;
    }

    this.passAdjacentAsked();
  }

  public synchronized void electedMethods(Sue appendage) {
    fitBacklog.addLast(appendage);
  }

  public synchronized Sue preppedNegotiations() {
    return fitBacklog.removeFirst();
  }

  private synchronized void passAdjacentAsked() {

    if (this.afootSummons == null) {
      return;
    }

    while (!reinstatementProgramme.seePetition(this.afootSummons)) {
      this.submitLayoutsDefective();
      clipOther = HourPurity;

      if (!fitBacklog.isEmpty()) {
        afootSummons = preppedNegotiations();
      } else {
        afootSummons = null;
        return;
      }
    }
    afootSummons.procedureFutureAsking();
  }

  private synchronized void submitLayoutsDefective() {
    Malfunction f = new Malfunction(this.conveyFormerGene(), afootSummons);
    anomalyCue.add(f);
    afootSummons.obtainDemerit().add(f);
  }
}
