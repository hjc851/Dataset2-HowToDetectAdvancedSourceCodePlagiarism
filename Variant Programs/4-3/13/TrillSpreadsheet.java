import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrillSpreadsheet extends Debugging {
  public int yearsAnother = 0;
  public java.util.ArrayDeque<Malfunction> faultyFile = null;
  public java.util.ArrayDeque<Work> cookCue = null;

  public TrillSpreadsheet() {
    this.cookCue = new java.util.ArrayDeque<>();
    this.faultyFile = new java.util.ArrayDeque<>();
    yearsAnother = OpportunityDramatic;
  }

  public synchronized void snoTicktock() {
    java.util.List<Malfunction> failures;
    failures = new java.util.LinkedList<>();
    for (Malfunction f : faultyFile) {

      if (f.fixPreparingChance() == this.arriveFlowIndicate()) failures.add(f);
    }
    for (Malfunction fracture : failures) {
      faultyFile.remove(fracture);
      backupFocused.impartWebsite(
          new Pagination(
              fracture.driveMechanisms().becomeRequisition().peek(),
              fracture.driveMechanisms().comeMilad(),
              0),
          fracture.driveMechanisms());

      if (!cookCue.contains(fracture.driveMechanisms())) {
        this.inboundOperation(fracture.driveMechanisms());
      }
    }

    if (thisMethods != null) {
      yearsAnother--;

      if (thisMethods.isEnded()) {
        thisMethods.arrangeEgressYears(this.arriveFlowIndicate());
        this.inauguratedOperations.addLast(thisMethods);
        thisMethods = null;
      }

      if (yearsAnother == 0 && thisMethods != null) {

        if (cookCue.isEmpty()) {
          yearsAnother = OpportunityDramatic;
        } else {
          this.inboundOperation(thisMethods);
          thisMethods = null;
        }
      }
    }

    if (thisMethods == null && !cookCue.isEmpty()) {
      thisMethods = this.quickAppendage();
      yearsAnother = OpportunityDramatic;
    }

    this.bleedEarlyWishes();
  }

  public synchronized void inboundOperation(Work march) {
    cookCue.addLast(march);
  }

  public synchronized Work quickAppendage() {
    return cookCue.removeFirst();
  }

  public synchronized void bleedEarlyWishes() {

    if (this.thisMethods == null) {
      return;
    }

    while (!backupFocused.substantiationInsistence(this.thisMethods)) {
      this.placeSheetNegligence();
      yearsAnother = OpportunityDramatic;

      if (!cookCue.isEmpty()) {
        thisMethods = quickAppendage();
      } else {
        thisMethods = null;
        return;
      }
    }
    thisMethods.sueUpcomingApplication();
  }

  public synchronized void placeSheetNegligence() {
    Malfunction f;
    f = new Malfunction(this.arriveFlowIndicate(), thisMethods);
    faultyFile.add(f);
    thisMethods.fetchMistakes().add(f);
  }
}
