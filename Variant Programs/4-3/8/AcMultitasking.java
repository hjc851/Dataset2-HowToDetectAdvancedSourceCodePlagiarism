import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AcMultitasking extends Outliner {
  public java.util.ArrayDeque<Appendage> poisedDipper;
  public java.util.ArrayDeque<Carelessness> failuresCola;
  public int opportunityResidual;

  public AcMultitasking() {
    this.poisedDipper = new java.util.ArrayDeque<>();
    this.failuresCola = new java.util.ArrayDeque<>();
    opportunityResidual = DaySum;
  }

  public synchronized void nbsClick() {
    java.util.List<Carelessness> problems = new java.util.LinkedList<>();
    for (Carelessness f : failuresCola) {

      if (f.beatReluctantJuncture() == this.takeTopicalMark()) problems.add(f);
    }
    for (Carelessness defect : problems) {
      failuresCola.remove(defect);
      alternatePolicy.totalWeb(
          new Website(
              defect.developProceeding().startApplication().peek(),
              defect.developProceeding().beatUser(),
              0),
          defect.developProceeding());

      if (!poisedDipper.contains(defect.developProceeding())) {
        this.inwardServe(defect.developProceeding());
      }
    }

    if (prevailingProcedure != null) {
      opportunityResidual--;

      if (prevailingProcedure.isEnded()) {
        prevailingProcedure.doExodusAgain(this.takeTopicalMark());
        this.consummatedOperation.addLast(prevailingProcedure);
        prevailingProcedure = null;
      }

      if (opportunityResidual == 0 && prevailingProcedure != null) {

        if (poisedDipper.isEmpty()) {
          opportunityResidual = DaySum;
        } else {
          this.inwardServe(prevailingProcedure);
          prevailingProcedure = null;
        }
      }
    }

    if (prevailingProcedure == null && !poisedDipper.isEmpty()) {
      prevailingProcedure = this.preppedNegotiations();
      opportunityResidual = DaySum;
    }

    this.outpouringTheOrdered();
  }

  public synchronized void inwardServe(Appendage act) {
    poisedDipper.addLast(act);
  }

  public synchronized Appendage preppedNegotiations() {
    return poisedDipper.removeFirst();
  }

  public synchronized void outpouringTheOrdered() {

    if (this.prevailingProcedure == null) {
      return;
    }

    while (!alternatePolicy.testProposal(this.prevailingProcedure)) {
      this.institutionalizeSectionCulpability();
      opportunityResidual = DaySum;

      if (!poisedDipper.isEmpty()) {
        prevailingProcedure = preppedNegotiations();
      } else {
        prevailingProcedure = null;
        return;
      }
    }
    prevailingProcedure.operationFollowingPetition();
  }

  public synchronized void institutionalizeSectionCulpability() {
    Carelessness f = new Carelessness(this.takeTopicalMark(), prevailingProcedure);
    failuresCola.add(f);
    prevailingProcedure.startMalfunctions().add(f);
  }
}
