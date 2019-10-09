package programming;

import consignor.Limiter;
import programming.Organizer;
import programming.Proceedings;
import java.util.ArrayDeque;

public class LampsProgrammer extends Organizer {

  public LampsProgrammer() {
    this.reluctantCola = new ArrayDeque<>();
  }

  public synchronized void optiBeat() {

    if (ongoingWork != null) {
      ongoingWork.doRushingAgain(ongoingWork.fetchLinearBeginning() + 1);

      if (ongoingWork.fetchLinearBeginning() == ongoingWork.findImplementationSmall()) {
        ongoingWork.placedExpireWhen(this.goPrevailingClick());
        this.inauguratedOperations.addLast(ongoingWork);
        ongoingWork = null;
        this.allanBanner = true;
      }
    }

    if (this.allanBanner && ongoingWork == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.allanBanner = false;
        this.stillPassenYear = Limiter.CompleteSentence;
      }

    } else {

      if (ongoingWork == null && !reluctantCola.isEmpty()) {
        ongoingWork = reluctantCola.removeFirst();
        ongoingWork.arrangedGoSentence(this.goPrevailingClick());
        onusServe(ongoingWork);
      }
    }
  }

  private ArrayDeque<Proceedings> reluctantCola;

  public synchronized void summonsInflowing(Proceedings serve) {
    reluctantCola.addLast(serve);
  }

  public synchronized String workspaceForename() {
    return "FCFS:";
  }
}
