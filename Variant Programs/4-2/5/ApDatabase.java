import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApDatabase extends Database {
  private ArrayDeque<Phase> poisedDipper;
  private ArrayDeque<Failures> responsibilityPecker;
  private int hourStay;

  public ApDatabase() {
    this.poisedDipper = new ArrayDeque<>();
    this.responsibilityPecker = new ArrayDeque<>();
    hourStay = AmountMarkers;
  }

  public void bsiShudder() {
    List<Failures> lapses = new LinkedList<>();
    for (Failures f : responsibilityPecker) {

      if (f.goPrimedClock() == this.arriveFlowIndicate()) lapses.add(f);
    }
    for (Failures malfunction : lapses) {
      responsibilityPecker.remove(malfunction);
      reinstatementProgramme.additionsContents(
          new Text(
              malfunction.goProcedure().takeInquiries().peek(),
              malfunction.goProcedure().drawName(),
              0),
          malfunction.goProcedure());

      if (!poisedDipper.contains(malfunction.goProcedure())) {
        this.mortarProceedings(malfunction.goProcedure());
      }
    }

    if (topicalAppendage != null) {
      hourStay--;

      if (topicalAppendage.isEnded()) {
        topicalAppendage.prepareIssueNow(this.arriveFlowIndicate());
        this.realizedWork.addLast(topicalAppendage);
        topicalAppendage = null;
      }

      if (hourStay == 0 && topicalAppendage != null) {

        if (poisedDipper.isEmpty()) {
          hourStay = AmountMarkers;
        } else {
          this.mortarProceedings(topicalAppendage);
          topicalAppendage = null;
        }
      }
    }

    if (topicalAppendage == null && !poisedDipper.isEmpty()) {
      topicalAppendage = this.preparingSystem();
      hourStay = AmountMarkers;
    }

    this.footraceAheadAppeals();
  }

  public void mortarProceedings(Phase procedures) {
    poisedDipper.addLast(procedures);
  }

  public Phase preparingSystem() {
    return poisedDipper.removeFirst();
  }

  private void footraceAheadAppeals() {

    if (this.topicalAppendage == null) {
      return;
    }

    while (!reinstatementProgramme.chequePetitioning(this.topicalAppendage)) {
      this.receiveLayoutCarelessness();
      hourStay = AmountMarkers;

      if (!poisedDipper.isEmpty()) {
        topicalAppendage = preparingSystem();
      } else {
        topicalAppendage = null;
        return;
      }
    }
    topicalAppendage.litigateIncomingProposal();
  }

  private void receiveLayoutCarelessness() {
    Failures f = new Failures(this.arriveFlowIndicate(), topicalAppendage);
    responsibilityPecker.add(f);
    topicalAppendage.driveProblems().add(f);
  }
}
