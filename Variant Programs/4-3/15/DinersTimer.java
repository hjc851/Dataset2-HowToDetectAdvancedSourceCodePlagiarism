import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DinersTimer extends Debugging {
  private java.util.ArrayDeque<Serve> makeRow;
  private java.util.ArrayDeque<Negligence> faultyFile;
  private int yearsAnother;

  public DinersTimer() {
    this.makeRow = new java.util.ArrayDeque<>();
    this.faultyFile = new java.util.ArrayDeque<>();
    yearsAnother = SentenceTeleportation;
  }

  public synchronized void bpsRetick() {
    java.util.List<Negligence> error = new java.util.LinkedList<>();
    for (Negligence f : faultyFile) {

      if (f.becomePreparesOpportunity() == this.fixNewTally()) error.add(f);
    }
    for (Negligence defect : error) {
      faultyFile.remove(defect);
      substitutedIge.sumSite(
          new Site(
              defect.receiveLitigate().driveRequirements().peek(),
              defect.receiveLitigate().haveHandle(),
              0),
          defect.receiveLitigate());

      if (!makeRow.contains(defect.receiveLitigate())) {
        this.arrivalsMechanism(defect.receiveLitigate());
      }
    }

    if (liveOutgrowth != null) {
      yearsAnother--;

      if (liveOutgrowth.isEnded()) {
        liveOutgrowth.orderedWithdrawalChance(this.fixNewTally());
        this.completionAct.addLast(liveOutgrowth);
        liveOutgrowth = null;
      }

      if (yearsAnother == 0 && liveOutgrowth != null) {

        if (makeRow.isEmpty()) {
          yearsAnother = SentenceTeleportation;
        } else {
          this.arrivalsMechanism(liveOutgrowth);
          liveOutgrowth = null;
        }
      }
    }

    if (liveOutgrowth == null && !makeRow.isEmpty()) {
      liveOutgrowth = this.availableSummons();
      yearsAnother = SentenceTeleportation;
    }

    this.scarperComeMotions();
  }

  public synchronized void arrivalsMechanism(Serve serve) {
    makeRow.addLast(serve);
  }

  public synchronized Serve availableSummons() {
    return makeRow.removeFirst();
  }

  private synchronized void scarperComeMotions() {

    if (this.liveOutgrowth == null) {
      return;
    }

    while (!substitutedIge.substantiationInsistence(this.liveOutgrowth)) {
      this.placeSheetNegligence();
      yearsAnother = SentenceTeleportation;

      if (!makeRow.isEmpty()) {
        liveOutgrowth = availableSummons();
      } else {
        liveOutgrowth = null;
        return;
      }
    }
    liveOutgrowth.formalitiesComeMotions();
  }

  private synchronized void placeSheetNegligence() {
    Negligence f = new Negligence(this.fixNewTally(), liveOutgrowth);
    faultyFile.add(f);
    liveOutgrowth.sustainWrongdoings().add(f);
  }
}
