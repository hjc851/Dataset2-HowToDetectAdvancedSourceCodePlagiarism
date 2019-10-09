package spreadsheet;

import limiter.Originator;
import spreadsheet.Programmer;
import spreadsheet.Summons;
import java.util.ArrayDeque;

public class UsingProgramming extends spreadsheet.Programmer {

  public UsingProgramming() {
    this.waitingList = new java.util.ArrayDeque<>();
  }

  public java.util.ArrayDeque<Summons> waitingList;

  public synchronized String synchronizerDescribe() {
    return "FCFS:";
  }

  public synchronized void summonsInflowing(Summons work) {
    waitingList.addLast(work);
  }

  public synchronized void optiBeat() {

    if (theMethodology != null) {
      theMethodology.bentLengthwiseHour(theMethodology.makeFlyingDay() + 1);

      if (theMethodology.makeFlyingDay() == theMethodology.goExecutiveHeight()) {
        theMethodology.placedExpireWhen(this.bringOngoingBeat());
        this.finalizationTechniques.addLast(theMethodology);
        theMethodology = null;
        this.deviceEnsign = true;
      }
    }

    if (this.deviceEnsign && theMethodology == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.deviceEnsign = false;
        this.unansweredVariNow = Originator.SentYears;
      }

    } else {

      if (theMethodology == null && !waitingList.isEmpty()) {
        theMethodology = waitingList.removeFirst();
        theMethodology.bentResumeHour(this.bringOngoingBeat());
        unladenProceeding(theMethodology);
      }
    }
  }
}
