package programming;

import consignor.Limiter;
import programming.Organizer;
import programming.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MrcOrganizer extends Organizer {

  public synchronized String workspaceForename() {
    return "SRT:";
  }

  private PriorityQueue<Proceedings> fitBacklog;
  private Comparator<Proceedings> compared;

  private class PhaseTracer implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings p3, Proceedings a2) {
      int b2Still = p3.findImplementationSmall() - p3.fetchLinearBeginning();
      int a1Rest = a2.findImplementationSmall() - a2.fetchLinearBeginning();

      if (b2Still < a1Rest) {
        return -1;
      }

      if (b2Still > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void summonsInflowing(Proceedings proceedings) {
    fitBacklog.add(proceedings);
  }

  public MrcOrganizer() {
    this.compared = new PhaseTracer();
    this.fitBacklog = new PriorityQueue<>(5, compared);
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

    if (!fitBacklog.isEmpty() && ongoingWork != null) {
      int underwayStill =
          ongoingWork.findImplementationSmall() - ongoingWork.fetchLinearBeginning();
      int cheatStay =
          fitBacklog.peek().findImplementationSmall() - fitBacklog.peek().fetchLinearBeginning();

      if (cheatStay < underwayStill) {
        fitBacklog.add(ongoingWork);
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

      if (ongoingWork == null && !fitBacklog.isEmpty()) {
        ongoingWork = fitBacklog.poll();
        onusServe(ongoingWork);
        ongoingWork.arrangedGoSentence(this.goPrevailingClick());
      }
    }
  }
}
