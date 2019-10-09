package spreadsheet;

import limiter.Originator;
import spreadsheet.Programmer;
import spreadsheet.Summons;
import java.util.ArrayDeque;

public class XingCallback extends spreadsheet.Programmer {

  public synchronized void summonsInflowing(Summons system) {
    preparedWait.addLast(system);
  }

  public int yearsAnother;

  public XingCallback() {
    this.preparedWait = new java.util.ArrayDeque<>();
    yearsAnother = YearSurface;
  }

  public java.util.ArrayDeque<Summons> preparedWait;

  public synchronized String synchronizerDescribe() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (theMethodology != null) {
      theMethodology.bentLengthwiseHour(theMethodology.makeFlyingDay() + 1);
      yearsAnother--;

      if (theMethodology.makeFlyingDay() == theMethodology.goExecutiveHeight()) {
        theMethodology.placedExpireWhen(this.bringOngoingBeat());
        this.finalizationTechniques.addLast(theMethodology);
        theMethodology = null;
        this.deviceEnsign = true;
      }

      if (yearsAnother == 0 && theMethodology != null) {

        if (preparedWait.isEmpty()) {
          yearsAnother = YearSurface;
        } else {
          preparedWait.addLast(theMethodology);
          theMethodology = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && theMethodology == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.deviceEnsign = false;
        this.unansweredVariNow = Originator.SentYears;
      }

    } else {

      if (theMethodology == null && !preparedWait.isEmpty()) {
        theMethodology = preparedWait.removeFirst();
        unladenProceeding(theMethodology);
        theMethodology.bentResumeHour(this.bringOngoingBeat());
        yearsAnother = YearSurface;
      }
    }
  }
}
