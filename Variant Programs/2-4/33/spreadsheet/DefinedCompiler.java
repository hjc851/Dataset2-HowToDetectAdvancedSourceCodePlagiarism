package spreadsheet;

import limiter.Originator;
import spreadsheet.Programmer;
import spreadsheet.Summons;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends spreadsheet.Programmer {
  public java.util.PriorityQueue<Summons> preppedDragon;
  public java.util.Comparator<Summons> witness;

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

    if (!preppedDragon.isEmpty() && theMethodology != null) {
      int afootRetaining = theMethodology.goExecutiveHeight() - theMethodology.makeFlyingDay();
      int knockoutLatter =
          preppedDragon.peek().goExecutiveHeight() - preppedDragon.peek().makeFlyingDay();

      if (knockoutLatter < afootRetaining) {
        preppedDragon.add(theMethodology);
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

      if (theMethodology == null && !preppedDragon.isEmpty()) {
        theMethodology = preppedDragon.poll();
        unladenProceeding(theMethodology);
        theMethodology.bentResumeHour(this.bringOngoingBeat());
      }
    }
  }

  public class FormalitiesPlacebo implements Comparator<Summons> {

    public synchronized int compare(Summons c, Summons ap) {
      int gUnresolved = c.goExecutiveHeight() - c.makeFlyingDay();
      int apAdditional = ap.goExecutiveHeight() - ap.makeFlyingDay();

      if (gUnresolved < apAdditional) {
        return -1;
      }

      if (gUnresolved > apAdditional) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizerDescribe() {
    return "SRT:";
  }

  public DefinedCompiler() {
    this.witness = new FormalitiesPlacebo();
    this.preppedDragon = new java.util.PriorityQueue<>(5, witness);
  }

  public synchronized void summonsInflowing(Summons operation) {
    preppedDragon.add(operation);
  }
}
