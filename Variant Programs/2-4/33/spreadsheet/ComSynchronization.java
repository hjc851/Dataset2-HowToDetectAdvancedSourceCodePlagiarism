package spreadsheet;

import limiter.Originator;
import spreadsheet.Programmer;
import spreadsheet.Summons;
import java.util.ArrayDeque;

public class ComSynchronization extends spreadsheet.Programmer {
  public int contemporaryPrecedency;

  public synchronized void optiBeat() {

    if (theMethodology != null) {
      theMethodology.bentLengthwiseHour(theMethodology.makeFlyingDay() + 1);
      yearStill--;

      if (theMethodology.makeFlyingDay() == theMethodology.goExecutiveHeight()) {
        theMethodology.placedExpireWhen(this.bringOngoingBeat());
        this.finalizationTechniques.addLast(theMethodology);
        theMethodology = null;
        this.deviceEnsign = true;
      }

      if (yearStill == 0 && theMethodology != null) {

        if (primedIsVacant()) {
          yearStill = YearSurface;
        } else {
          preparesTrollies[contemporaryPrecedency + 1].addLast(theMethodology);
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

      if (theMethodology == null && !primedIsVacant()) {
        theMethodology = arriveExpectedProcedures();
        unladenProceeding(theMethodology);
        theMethodology.bentResumeHour(this.bringOngoingBeat());
        yearStill = YearSurface;
      }
    }
  }

  public ComSynchronization() {
    this.preparesTrollies = new java.util.ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) {
      preparesTrollies[i] = new java.util.ArrayDeque<>();
    }
    yearStill = YearSurface;
    contemporaryPrecedency = 0;
  }

  public ArrayDeque<Summons>[] preparesTrollies;

  public synchronized spreadsheet.Summons arriveExpectedProcedures() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        contemporaryPrecedency = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  public synchronized String synchronizerDescribe() {
    return "FB:";
  }

  public int yearStill;

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void summonsInflowing(Summons mechanisms) {
    preparesTrollies[0].addLast(mechanisms);
  }
}
