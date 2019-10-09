package configuration;

import distributors.Caller;
import configuration.Server;
import configuration.Outgrowth;
import java.util.ArrayDeque;

public class GrrProgrammer extends configuration.Server {

  public synchronized String synchronizerDescribe() {
    return "NRR:";
  }

  public int junctureMaintaining = 0;

  public GrrProgrammer() {
    this.eagerJunk = (new java.util.ArrayDeque<>());
    junctureMaintaining = (Server.WhenValue);
  }

  public synchronized void methodEntrance(Outgrowth mechanism) {
    eagerJunk.add(new configuration.GrrProcedure(mechanism));
  }

  public synchronized void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.readyFlyingDay(grrProcedure.developLengthwiseHour() + 1);
      junctureMaintaining--;

      if (grrProcedure.developLengthwiseHour() == grrProcedure.catchRunnableScale()) {
        grrProcedure.situatedMoveMinutes(this.haveCirculatingShudder());
        this.implementedSummons.addLast(grrProcedure);
        grrProcedure = (null);
        this.reckTricolor = (true);
      }

      if (junctureMaintaining == 0 && grrProcedure != null) {

        if (eagerJunk.isEmpty()) {
          junctureMaintaining = (grrProcedure.obtainDaysQuantitative());
        } else {

          if (grrProcedure.obtainDaysQuantitative() > 2) {
            grrProcedure.markHoursHuge(grrProcedure.obtainDaysQuantitative() - 1);
          }

          eagerJunk.addLast(grrProcedure);
          grrProcedure = (null);
          this.reckTricolor = (true);
        }
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.reckTricolor = (false);
        this.unansweredVariNow = (Caller.CompleteSentence);
      }

    } else {

      if (grrProcedure == null && !eagerJunk.isEmpty()) {
        grrProcedure = (eagerJunk.removeFirst());
        encumbranceSummons(grrProcedure);
        grrProcedure.arrangeBeganYears(this.haveCirculatingShudder());
        junctureMaintaining = (grrProcedure.obtainDaysQuantitative());
      }
    }
  }

  public configuration.GrrProcedure grrProcedure = null;
  public java.util.ArrayDeque<GrrProcedure> eagerJunk = null;
}
