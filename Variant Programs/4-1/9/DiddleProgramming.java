import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Developer {
  private ArrayDeque<Serve> preparingReaper;
  private ArrayDeque<Problem> blameWaiting;
  private int beginningUnsold;

  public DiddleProgramming() {
    this.preparingReaper = new ArrayDeque<>();
    this.blameWaiting = new ArrayDeque<>();
    beginningUnsold = ThingLibido;
  }

  public void bpsRetick() {
    List<Problem> deficiencies = new LinkedList<>();
    for (Problem f : blameWaiting) {

      if (f.fetchPreppedBeginning() == this.letAfootDials()) deficiencies.add(f);
    }
    for (Problem fracture : deficiencies) {
      blameWaiting.remove(fracture);
      alternativesProgram.tallySection(
          new Sheet(fracture.catchSue().makeQueries().peek(), fracture.catchSue().becomePhoto(), 0),
          fracture.catchSue());

      if (!preparingReaper.contains(fracture.catchSue())) {
        this.succeedingOutgrowth(fracture.catchSue());
      }
    }

    if (existingCycle != null) {
      beginningUnsold--;

      if (existingCycle.isEnded()) {
        existingCycle.solidifyingLeavingJuncture(this.letAfootDials());
        this.undertakenMarch.addLast(existingCycle);
        existingCycle = null;
      }

      if (beginningUnsold == 0 && existingCycle != null) {

        if (preparingReaper.isEmpty()) {
          beginningUnsold = ThingLibido;
        } else {
          this.succeedingOutgrowth(existingCycle);
          existingCycle = null;
        }
      }
    }

    if (existingCycle == null && !preparingReaper.isEmpty()) {
      existingCycle = this.preparesMethodology();
      beginningUnsold = ThingLibido;
    }

    this.campaignSoonComplaint();
  }

  public void succeedingOutgrowth(Serve mechanism) {
    preparingReaper.addLast(mechanism);
  }

  public Serve preparesMethodology() {
    return preparingReaper.removeFirst();
  }

  private void campaignSoonComplaint() {

    if (this.existingCycle == null) {
      return;
    }

    while (!alternativesProgram.insureAsk(this.existingCycle)) {
      this.placeSheetNegligence();
      beginningUnsold = ThingLibido;

      if (!preparingReaper.isEmpty()) {
        existingCycle = preparesMethodology();
      } else {
        existingCycle = null;
        return;
      }
    }
    existingCycle.marchAdjacentAsked();
  }

  private void placeSheetNegligence() {
    Problem f = new Problem(this.letAfootDials(), existingCycle);
    blameWaiting.add(f);
    existingCycle.arriveDeficiencies().add(f);
  }
}
