package outliner;

import responsible.Vendor;
import outliner.Server;
import outliner.Work;
import java.util.ArrayDeque;

public class GrrProgrammer extends Server {
  private static final boolean synX1432boolean = false;
  private static final int synX1431int = 0;
  private static final boolean synX1430boolean = true;
  private static final int synX1429int = 1;
  private static final int synX1428int = 2;
  private static final int synX1427int = 0;
  private static final boolean synX1426boolean = true;
  private static final int synX1425int = 1;
  private static final String synX1424String = "NRR:";
  public ArrayDeque<GrrProcedure> makeRow = null;
  public int hoursRetaining = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.makeRow = (new ArrayDeque<>());
    hoursRetaining = (Server.WhenValue);
  }

  public synchronized String spreadsheetKey() {
    return synX1424String;
  }

  public synchronized void addTock() {

    if (grrProcedure != null) synx203();

    if (this.ltsDesignator && afootSummons == null) synx204();
    else synx205();
  }

  public synchronized void proceedingOutbound(Work proceeding) {
    makeRow.add(new GrrProcedure(proceeding));
  }

  private synchronized void synx203() {
    grrProcedure.doRushingAgain(grrProcedure.goMovingClock() + synX1425int);
    hoursRetaining--;

    if (grrProcedure.goMovingClock() == grrProcedure.makeExecutableDimensions()) {
      grrProcedure.readyOutletDay(this.sustainThisValidation());
      this.undertookProcedures.addLast(grrProcedure);
      grrProcedure = (null);
      this.ltsDesignator = (synX1426boolean);
    }

    if (hoursRetaining == synX1427int && grrProcedure != null) {

      if (makeRow.isEmpty()) {
        hoursRetaining = (grrProcedure.goClockAmount());
      } else {

        if (grrProcedure.goClockAmount() > synX1428int) {
          grrProcedure.adjustMonthLarge(grrProcedure.goClockAmount() - synX1429int);
        }

        makeRow.addLast(grrProcedure);
        grrProcedure = (null);
        this.ltsDesignator = (synX1430boolean);
      }
    }
  }

  private synchronized void synx204() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX1431int) {
      this.ltsDesignator = (synX1432boolean);
      this.survivingMbeWeek = (Vendor.DeployingOpportunity);
    }
  }

  private synchronized void synx205() {

    if (grrProcedure == null && !makeRow.isEmpty()) {
      grrProcedure = (makeRow.removeFirst());
      offloadProceedings(grrProcedure);
      grrProcedure.determinedInitiateDays(this.sustainThisValidation());
      hoursRetaining = (grrProcedure.goClockAmount());
    }
  }

  private synchronized void synx206(int i) {
    preparedLines[i] = (new ArrayDeque<>());
  }
}
