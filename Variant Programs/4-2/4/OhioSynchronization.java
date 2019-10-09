import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OhioSynchronization extends Multitasking {
  private java.util.ArrayDeque<Appendage> wantGlue;
  private java.util.ArrayDeque<Responsibility> anomalyCue;
  private int minutesLatter;

  public OhioSynchronization() {
    this.wantGlue = new java.util.ArrayDeque<>();
    this.anomalyCue = new java.util.ArrayDeque<>();
    minutesLatter = WeekVolume;
  }

  public void bsiShudder() {
    java.util.List<Responsibility> defect = new java.util.LinkedList<>();
    for (Responsibility f : anomalyCue) {

      if (f.obtainRipeDays() == this.fixNewTally()) defect.add(f);
    }
    for (Responsibility blame : defect) {
      anomalyCue.remove(blame);
      replacedPlaybook.sumSite(
          new Folio(
              blame.obtainOutgrowth().findBespeak().peek(),
              blame.obtainOutgrowth().canOwnership(),
              0),
          blame.obtainOutgrowth());

      if (!wantGlue.contains(blame.obtainOutgrowth())) {
        this.entranceMethod(blame.obtainOutgrowth());
      }
    }

    if (streamPhase != null) {
      minutesLatter--;

      if (streamPhase.isEnded()) {
        streamPhase.orderedWithdrawalChance(this.fixNewTally());
        this.conductedServe.addLast(streamPhase);
        streamPhase = null;
      }

      if (minutesLatter == 0 && streamPhase != null) {

        if (wantGlue.isEmpty()) {
          minutesLatter = WeekVolume;
        } else {
          this.entranceMethod(streamPhase);
          streamPhase = null;
        }
      }
    }

    if (streamPhase == null && !wantGlue.isEmpty()) {
      streamPhase = this.ripeOutgrowth();
      minutesLatter = WeekVolume;
    }

    this.playSucceedingBespeak();
  }

  public void entranceMethod(Appendage summons) {
    wantGlue.addLast(summons);
  }

  public Appendage ripeOutgrowth() {
    return wantGlue.removeFirst();
  }

  private void playSucceedingBespeak() {

    if (this.streamPhase == null) {
      return;
    }

    while (!replacedPlaybook.breakWishes(this.streamPhase)) {
      this.shipSiteBreak();
      minutesLatter = WeekVolume;

      if (!wantGlue.isEmpty()) {
        streamPhase = ripeOutgrowth();
      } else {
        streamPhase = null;
        return;
      }
    }
    streamPhase.workCloseQuest();
  }

  private void shipSiteBreak() {
    Responsibility f = new Responsibility(this.fixNewTally(), streamPhase);
    anomalyCue.add(f);
    streamPhase.haveFlaws().add(f);
  }
}
