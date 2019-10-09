import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrillSpreadsheet extends Outliner {
  public int junctureMaintaining;
  public java.util.ArrayDeque<Accountable> culpabilityConvoy;
  public java.util.ArrayDeque<Methods> happyStopper;

  public TrillSpreadsheet() {
    this.happyStopper = new java.util.ArrayDeque<>();
    this.culpabilityConvoy = new java.util.ArrayDeque<>();
    junctureMaintaining = ClockAmount;
  }

  public synchronized void nbsClick() {
    java.util.List<Accountable> mistake;
    mistake = new java.util.LinkedList<>();
    for (Accountable f : culpabilityConvoy) {

      if (f.beatReluctantJuncture() == this.startPresentlyMarch()) mistake.add(f);
    }
    for (Accountable responsible : mistake) {
      culpabilityConvoy.remove(responsible);
      reinstatementProgramme.sumSite(
          new Pagination(
              responsible.becomeMethodology().letEntreaties().peek(),
              responsible.becomeMethodology().sustainSelf(),
              0),
          responsible.becomeMethodology());

      if (!happyStopper.contains(responsible.becomeMethodology())) {
        this.inboundOperation(responsible.becomeMethodology());
      }
    }

    if (formerFormalities != null) {
      junctureMaintaining--;

      if (formerFormalities.isEnded()) {
        formerFormalities.placedExpireWhen(this.startPresentlyMarch());
        this.submittedTechnologies.addLast(formerFormalities);
        formerFormalities = null;
      }

      if (junctureMaintaining == 0 && formerFormalities != null) {

        if (happyStopper.isEmpty()) {
          junctureMaintaining = ClockAmount;
        } else {
          this.inboundOperation(formerFormalities);
          formerFormalities = null;
        }
      }
    }

    if (formerFormalities == null && !happyStopper.isEmpty()) {
      formerFormalities = this.prepareAct();
      junctureMaintaining = ClockAmount;
    }

    this.operateCloseQuest();
  }

  public synchronized void inboundOperation(Methods method) {
    happyStopper.addLast(method);
  }

  public synchronized Methods prepareAct() {
    return happyStopper.removeFirst();
  }

  public synchronized void operateCloseQuest() {

    if (this.formerFormalities == null) {
      return;
    }

    while (!reinstatementProgramme.chequePetitioning(this.formerFormalities)) {
      this.placeSheetNegligence();
      junctureMaintaining = ClockAmount;

      if (!happyStopper.isEmpty()) {
        formerFormalities = prepareAct();
      } else {
        formerFormalities = null;
        return;
      }
    }
    formerFormalities.actSucceedingBespeak();
  }

  public synchronized void placeSheetNegligence() {
    Accountable f;
    f = new Accountable(this.startPresentlyMarch(), formerFormalities);
    culpabilityConvoy.add(f);
    formerFormalities.developErrors().add(f);
  }
}
