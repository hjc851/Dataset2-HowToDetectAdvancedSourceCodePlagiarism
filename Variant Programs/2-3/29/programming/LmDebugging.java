package programming;

import consignor.Limiter;
import programming.Organizer;
import programming.Proceedings;
import java.util.ArrayDeque;

public class LmDebugging extends Organizer {

  public synchronized void optiBeat() {

    if (ongoingWork != null) {
      ongoingWork.doRushingAgain(ongoingWork.fetchLinearBeginning() + 1);
      hoursRetaining--;

      if (ongoingWork.fetchLinearBeginning() == ongoingWork.findImplementationSmall()) {
        ongoingWork.placedExpireWhen(this.goPrevailingClick());
        this.inauguratedOperations.addLast(ongoingWork);
        ongoingWork = null;
        this.allanBanner = true;
      }

      if (hoursRetaining == 0 && ongoingWork != null) {

        if (primedIsVacant()) {
          hoursRetaining = NowLevel;
        } else {
          primedRows[theEmphasis + 1].addLast(ongoingWork);
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

      if (ongoingWork == null && !primedIsVacant()) {
        ongoingWork = catchUpcomingSue();
        onusServe(ongoingWork);
        ongoingWork.arrangedGoSentence(this.goPrevailingClick());
        hoursRetaining = NowLevel;
      }
    }
  }

  private ArrayDeque<Proceedings>[] primedRows;

  public synchronized void summonsInflowing(Proceedings system) {
    primedRows[0].addLast(system);
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  private int theEmphasis;

  private synchronized Proceedings catchUpcomingSue() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        theEmphasis = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  public LmDebugging() {
    this.primedRows = new ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) {
      primedRows[i] = new ArrayDeque<>();
    }
    hoursRetaining = NowLevel;
    theEmphasis = 0;
  }

  private int hoursRetaining;

  public synchronized String workspaceForename() {
    return "FB:";
  }
}
