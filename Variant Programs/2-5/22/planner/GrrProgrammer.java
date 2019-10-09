package planner;

import starter.Shipper;
import planner.Organizer;
import planner.Summons;
import java.util.ArrayDeque;

public class GrrProgrammer extends Organizer {
  private static final String synX1921String = "NRR:";
  private static final boolean synX1920boolean = false;
  private static final int synX1919int = 0;
  private static final boolean synX1918boolean = true;
  private static final int synX1917int = 1;
  private static final int synX1916int = 2;
  private static final int synX1915int = 0;
  private static final boolean synX1914boolean = true;
  private static final int synX1913int = 1;
  public int meterLeftover = 0;
  public ArrayDeque<GrrProcedure> makeRow = null;

  public GrrProgrammer() {
    this.makeRow = (new ArrayDeque<>());
    meterLeftover = (Organizer.DaySum);
  }

  public GrrProcedure grrProcedure = null;

  public synchronized void cycleIn(Summons mechanisms) {
    makeRow.add(new GrrProcedure(mechanisms));
  }

  public synchronized void addTock() {

    if (grrProcedure != null) {
      grrProcedure.fixGoingThing(grrProcedure.goMovingClock() + synX1913int);
      meterLeftover--;

      if (grrProcedure.goMovingClock() == grrProcedure.fetchManagerVastness()) {
        grrProcedure.fitDieYear(this.goPrevailingClick());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = (null);
        this.fellyAlert = (synX1914boolean);
      }

      if (meterLeftover == synX1915int && grrProcedure != null) {

        if (makeRow.isEmpty()) {
          meterLeftover = (grrProcedure.letHoursHuge());
        } else {

          if (grrProcedure.letHoursHuge() > synX1916int) {
            grrProcedure.placedWhenValue(grrProcedure.letHoursHuge() - synX1917int);
          }

          makeRow.addLast(grrProcedure);
          grrProcedure = (null);
          this.fellyAlert = (synX1918boolean);
        }
      }
    }

    if (this.fellyAlert && rifeSue == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX1919int) {
        this.fellyAlert = (synX1920boolean);
        this.pendingWhinAgain = (Shipper.ShipmentClip);
      }

    } else {

      if (grrProcedure == null && !makeRow.isEmpty()) {
        grrProcedure = (makeRow.removeFirst());
        warheadMethod(grrProcedure);
        grrProcedure.doRestartAgain(this.goPrevailingClick());
        meterLeftover = (grrProcedure.letHoursHuge());
      }
    }
  }

  public synchronized String timerMention() {
    return synX1921String;
  }
}
