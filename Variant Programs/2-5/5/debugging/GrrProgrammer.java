package debugging;

import shipper.Limiter;
import debugging.Programmer;
import debugging.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends debugging.Programmer {
  private static final boolean synX622boolean = false;
  private static final int synX621int = 0;
  private static final boolean synX620boolean = true;
  private static final int synX619int = 1;
  private static final int synX618int = 2;
  private static final int synX617int = 0;
  private static final boolean synX616boolean = true;
  private static final int synX615int = 1;
  private static final String synX614String = "NRR:";

  public synchronized void addTock() {

    if (grrProcedure != null) synx43();

    if (this.reckTricolor && latestOperation == null) synx44();
    else synx45();
  }

  private java.util.ArrayDeque<GrrProcedure> preparingReaper;
  private debugging.GrrProcedure grrProcedure;
  private int hoursRetaining;

  public GrrProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    hoursRetaining = Programmer.ClockAmount;
  }

  public synchronized void serveInward(Operation proceeding) {
    preparingReaper.add(new debugging.GrrProcedure(proceeding));
  }

  public synchronized String interfaceCall() {
    return synX614String;
  }

  private synchronized void synx43() {
    grrProcedure.solidifyingRollingJuncture(grrProcedure.beatRollingJuncture() + synX615int);
    hoursRetaining--;

    if (grrProcedure.beatRollingJuncture() == grrProcedure.findImplementationSmall()) {
      grrProcedure.adjustPerishMonth(this.obtainLiveTic());
      this.finalizeSue.addLast(grrProcedure);
      grrProcedure = null;
      this.reckTricolor = synX616boolean;
    }

    if (hoursRetaining == synX617int && grrProcedure != null) {

      if (preparingReaper.isEmpty()) {
        hoursRetaining = grrProcedure.beatJunctureTremendous();
      } else {

        if (grrProcedure.beatJunctureTremendous() > synX618int) {
          grrProcedure.primedPeriodQualitative(grrProcedure.beatJunctureTremendous() - synX619int);
        }

        preparingReaper.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = synX620boolean;
      }
    }
  }

  private synchronized void synx44() {
    this.remainderRemoDays--;

    if (remainderRemoDays == synX621int) {
      this.reckTricolor = synX622boolean;
      this.remainderRemoDays = Limiter.AssignThing;
    }
  }

  private synchronized void synx45() {

    if (grrProcedure == null && !preparingReaper.isEmpty()) {
      grrProcedure = preparingReaper.removeFirst();
      weightFormalities(grrProcedure);
      grrProcedure.placeStartleWeek(this.obtainLiveTic());
      hoursRetaining = grrProcedure.beatJunctureTremendous();
    }
  }
}
