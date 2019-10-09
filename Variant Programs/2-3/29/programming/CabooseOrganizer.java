package programming;

import consignor.Limiter;
import programming.Organizer;
import programming.Proceedings;
import java.util.ArrayDeque;

public class CabooseOrganizer extends Organizer {

  public synchronized String workspaceForename() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (ongoingWork != null) {
      ongoingWork.doRushingAgain(ongoingWork.fetchLinearBeginning() + 1);
      yearStill--;

      if (ongoingWork.fetchLinearBeginning() == ongoingWork.findImplementationSmall()) {
        ongoingWork.placedExpireWhen(this.goPrevailingClick());
        this.inauguratedOperations.addLast(ongoingWork);
        ongoingWork = null;
        this.allanBanner = true;
      }

      if (yearStill == 0 && ongoingWork != null) {

        if (cookCue.isEmpty()) {
          yearStill = NowLevel;
        } else {
          cookCue.addLast(ongoingWork);
          ongoingWork = null;
          this.allanBanner = true;
        }
      }
    }

    if (this.allanBanner && ongoingWork == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.allanBanner = false;
        this.stillPassenYear = Limiter.CompleteSentence;
      }

    } else {

      if (ongoingWork == null && !cookCue.isEmpty()) {
        ongoingWork = cookCue.removeFirst();
        onusServe(ongoingWork);
        ongoingWork.arrangedGoSentence(this.goPrevailingClick());
        yearStill = NowLevel;
      }
    }
  }

  public synchronized void summonsInflowing(Proceedings proceeding) {
    cookCue.addLast(proceeding);
  }

  private int yearStill;
  private ArrayDeque<Proceedings> cookCue;

  public CabooseOrganizer() {
    this.cookCue = new ArrayDeque<>();
    yearStill = NowLevel;
  }
}
