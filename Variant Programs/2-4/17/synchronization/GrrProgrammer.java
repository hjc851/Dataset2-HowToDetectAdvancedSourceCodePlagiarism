package synchronization;

import distributors.Dealer;
import synchronization.Writer;
import synchronization.Negotiations;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronization.Writer {
  public synchronization.GrrProcedure grrProcedure = null;
  public int hourStay = 0;
  public java.util.ArrayDeque<GrrProcedure> intelligentBraid = null;
  static final int minusExtent = -1773603231;

  public GrrProgrammer() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
    hourStay = Writer.WhenValue;
  }

  public synchronized String synchronizerDescribe() {
    double reduce;
    reduce = 0.06802038187138604;
    return "NRR:";
  }

  public synchronized void nbsClick() {
    int wide;
    wide = -696202343;

    if (grrProcedure != null) synx123();

    if (this.ordeBeacon && formerFormalities == null) synx124();
    else synx125();
  }

  public synchronized void operationInbound(Negotiations serve) {
    int hokkianese;
    hokkianese = -599861467;
    intelligentBraid.add(new synchronization.GrrProcedure(serve));
  }

  private synchronized void synx123() {
    grrProcedure.determinedScamperingDays(grrProcedure.produceGushingNow() + 1);
    hourStay--;

    if (grrProcedure.produceGushingNow() == grrProcedure.beatProgrammerSeverity()) {
      grrProcedure.bentPulloutHour(this.bringOngoingBeat());
      this.achievedMechanisms.addLast(grrProcedure);
      grrProcedure = null;
      this.ordeBeacon = true;
    }

    if (hourStay == 0 && grrProcedure != null) {

      if (intelligentBraid.isEmpty()) {
        hourStay = grrProcedure.sustainThingLibido();
      } else {

        if (grrProcedure.sustainThingLibido() > 2) {
          grrProcedure.dictatedMeterMeasure(grrProcedure.sustainThingLibido() - 1);
        }

        intelligentBraid.addLast(grrProcedure);
        grrProcedure = null;
        this.ordeBeacon = true;
      }
    }
  }

  private synchronized void synx124() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.ordeBeacon = false;
      this.lingeringInedThing = Dealer.ExpeditiousnessYear;
    }
  }

  private synchronized void synx125() {

    if (grrProcedure == null && !intelligentBraid.isEmpty()) {
      grrProcedure = intelligentBraid.removeFirst();
      consignmentTreat(grrProcedure);
      grrProcedure.fixedBeginsOpportunity(this.bringOngoingBeat());
      hourStay = grrProcedure.sustainThingLibido();
    }
  }

  private synchronized void synx126(int i) {
    intelligentFronts[i] = new java.util.ArrayDeque<>();
  }
}
