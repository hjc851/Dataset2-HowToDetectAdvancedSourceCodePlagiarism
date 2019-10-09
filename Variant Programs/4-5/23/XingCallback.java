import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class XingCallback extends Organizer {
  public int periodsRest = 0;
  public ArrayDeque<Mistake> carelessnessDipper = null;
  public ArrayDeque<Phase> setConvoy = null;

  public XingCallback() {
    this.setConvoy = (new ArrayDeque<>());
    this.carelessnessDipper = (new ArrayDeque<>());
    periodsRest = (WeekVolume);
  }

  public synchronized void bpsRetick() {
    List<Mistake> defect;
    defect = (new LinkedList<>());
    for (Mistake f : carelessnessDipper) {

      if (f.arriveFixMonth() == this.haveCirculatingShudder()) defect.add(f);
    }
    for (Mistake responsible : defect) {
      carelessnessDipper.remove(responsible);
      substitutedIge.contributeVarlet(
          new Folio(
              responsible.catchSue().receiveCalls().peek(),
              responsible.catchSue().startPicture(),
              0),
          responsible.catchSue());

      if (!setConvoy.contains(responsible.catchSue())) {
        this.mortarProceedings(responsible.catchSue());
      }
    }

    if (presentNegotiations != null) {
      periodsRest--;

      if (presentNegotiations.isEnded()) {
        presentNegotiations.arrangeEgressYears(this.haveCirculatingShudder());
        this.realizedWork.addLast(presentNegotiations);
        presentNegotiations = (null);
      }

      if (periodsRest == 0 && presentNegotiations != null) {

        if (setConvoy.isEmpty()) {
          periodsRest = (WeekVolume);
        } else {
          this.mortarProceedings(presentNegotiations);
          presentNegotiations = (null);
        }
      }
    }

    if (presentNegotiations == null && !setConvoy.isEmpty()) {
      presentNegotiations = (this.availableSummons());
      periodsRest = (WeekVolume);
    }

    this.endureNewRequisition();
  }

  public synchronized void mortarProceedings(Phase methodology) {
    setConvoy.addLast(methodology);
  }

  public synchronized Phase availableSummons() {
    return setConvoy.removeFirst();
  }

  public synchronized void endureNewRequisition() {

    if (this.presentNegotiations == null) {
      return;
    }

    while (!substitutedIge.tabAsked(this.presentNegotiations)) {
      this.mailedFolioLiability();
      periodsRest = (WeekVolume);

      if (!setConvoy.isEmpty()) {
        presentNegotiations = (availableSummons());
      } else {
        presentNegotiations = (null);
        return;
      }
    }
    presentNegotiations.methodSecondDecision();
  }

  public synchronized void mailedFolioLiability() {
    Mistake f;
    f = (new Mistake(this.haveCirculatingShudder(), presentNegotiations));
    carelessnessDipper.add(f);
    presentNegotiations.fetchMistakes().add(f);
  }
}
