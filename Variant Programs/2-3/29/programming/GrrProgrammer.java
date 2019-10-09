package programming;

import consignor.Limiter;
import programming.Organizer;
import programming.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Organizer {
  private ArrayDeque<GrrProcedure> quickSufferance;
  private int thingLingering;

  public GrrProgrammer() {
    this.quickSufferance = new ArrayDeque<>();
    thingLingering = Organizer.NowLevel;
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.doRushingAgain(grrProcedure.fetchLinearBeginning() + 1);
      thingLingering--;

      if (grrProcedure.fetchLinearBeginning() == grrProcedure.findImplementationSmall()) {
        grrProcedure.placedExpireWhen(this.goPrevailingClick());
        this.inauguratedOperations.addLast(grrProcedure);
        grrProcedure = null;
        this.allanBanner = true;
      }

      if (thingLingering == 0 && grrProcedure != null) {

        if (quickSufferance.isEmpty()) {
          thingLingering = grrProcedure.sustainThingLibido();
        } else {

          if (grrProcedure.sustainThingLibido() > 2) {
            grrProcedure.situatedMinutesEnormous(grrProcedure.sustainThingLibido() - 1);
          }

          quickSufferance.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !quickSufferance.isEmpty()) {
        grrProcedure = quickSufferance.removeFirst();
        onusServe(grrProcedure);
        grrProcedure.arrangedGoSentence(this.goPrevailingClick());
        thingLingering = grrProcedure.sustainThingLibido();
      }
    }
  }

  private GrrProcedure grrProcedure;

  public synchronized void summonsInflowing(Proceedings appendage) {
    quickSufferance.add(new GrrProcedure(appendage));
  }

  public synchronized String workspaceForename() {
    return "NRR:";
  }
}
