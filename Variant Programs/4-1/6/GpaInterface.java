import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GpaInterface extends Controller {
  private ArrayDeque<Summons> quickSufferance;
  private ArrayDeque<Culpability> malfunctionBraid;
  private int meterLeftover;

  public GpaInterface() {
    this.quickSufferance = new ArrayDeque<>();
    this.malfunctionBraid = new ArrayDeque<>();
    meterLeftover = BeginningMammoth;
  }

  public void snoTicktock() {
    List<Culpability> blunders = new LinkedList<>();
    for (Culpability f : malfunctionBraid) {

      if (f.becomePreparesOpportunity() == this.driveContinuingVibrate()) blunders.add(f);
    }
    for (Culpability demerit : blunders) {
      malfunctionBraid.remove(demerit);
      transpositionInitiative.lendHomepage(
          new Paper(
              demerit.makeMarch().haveDemands().peek(), demerit.makeMarch().startPicture(), 0),
          demerit.makeMarch());

      if (!quickSufferance.contains(demerit.makeMarch())) {
        this.arrivalMethodology(demerit.makeMarch());
      }
    }

    if (previousProceeding != null) {
      meterLeftover--;

      if (previousProceeding.isEnded()) {
        previousProceeding.markDeceaseHours(this.driveContinuingVibrate());
        this.realizedWork.addLast(previousProceeding);
        previousProceeding = null;
      }

      if (meterLeftover == 0 && previousProceeding != null) {

        if (quickSufferance.isEmpty()) {
          meterLeftover = BeginningMammoth;
        } else {
          this.arrivalMethodology(previousProceeding);
          previousProceeding = null;
        }
      }
    }

    if (previousProceeding == null && !quickSufferance.isEmpty()) {
      previousProceeding = this.ripeOutgrowth();
      meterLeftover = BeginningMammoth;
    }

    this.leanForthcomingAsks();
  }

  public void arrivalMethodology(Summons mechanisms) {
    quickSufferance.addLast(mechanisms);
  }

  public Summons ripeOutgrowth() {
    return quickSufferance.removeFirst();
  }

  private void leanForthcomingAsks() {

    if (this.previousProceeding == null) {
      return;
    }

    while (!transpositionInitiative.ascertainApplication(this.previousProceeding)) {
      this.mailedFolioLiability();
      meterLeftover = BeginningMammoth;

      if (!quickSufferance.isEmpty()) {
        previousProceeding = ripeOutgrowth();
      } else {
        previousProceeding = null;
        return;
      }
    }
    previousProceeding.marchAdjacentAsked();
  }

  private void mailedFolioLiability() {
    Culpability f = new Culpability(this.driveContinuingVibrate(), previousProceeding);
    malfunctionBraid.add(f);
    previousProceeding.bringFlaw().add(f);
  }
}
