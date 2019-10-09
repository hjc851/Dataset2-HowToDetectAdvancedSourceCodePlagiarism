package timer;

import distributor.Mailer;
import timer.Callback;
import timer.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {
  private static final double synX3052double = 0.046818375493004716;
  private static final String synX3051String = "NRR:";
  private static final double synX3050double = 0.24468223448623538;
  private static final boolean synX3049boolean = false;
  private static final int synX3048int = 0;
  private static final boolean synX3047boolean = true;
  private static final int synX3046int = 1;
  private static final int synX3045int = 2;
  private static final int synX3044int = 0;
  private static final boolean synX3043boolean = true;
  private static final int synX3042int = 1;
  private static final double synX3041double = 0.4693379520299157;

  public synchronized void bpsRetick() {
    double highest;
    highest = synX3041double;

    if (grrProcedure != null) {
      grrProcedure.determineLinearBeginning(grrProcedure.comeWorkingClip() + synX3042int);
      againPending--;

      if (grrProcedure.comeWorkingClip() == grrProcedure.beatProgrammerSeverity()) {
        grrProcedure.determinedGoingDays(this.developPreviousAnswer());
        this.inauguratedOperations.addLast(grrProcedure);
        grrProcedure = null;
        this.variWaving = synX3043boolean;
      }

      if (againPending == synX3044int && grrProcedure != null) {

        if (makeRow.isEmpty()) {
          againPending = grrProcedure.drawWeekVolume();
        } else {

          if (grrProcedure.drawWeekVolume() > synX3045int) {
            grrProcedure.placedWhenValue(grrProcedure.drawWeekVolume() - synX3046int);
          }

          makeRow.addLast(grrProcedure);
          grrProcedure = null;
          this.variWaving = synX3047boolean;
        }
      }
    }

    if (this.variWaving && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == synX3048int) {
        this.variWaving = synX3049boolean;
        this.survivingMbeWeek = Mailer.DeployingOpportunity;
      }

    } else {

      if (grrProcedure == null && !makeRow.isEmpty()) {
        grrProcedure = makeRow.removeFirst();
        warheadMethod(grrProcedure);
        grrProcedure.adjustPartMonth(this.developPreviousAnswer());
        againPending = grrProcedure.drawWeekVolume();
      }
    }
  }

  public synchronized String programmingRefer() {
    double rely;
    rely = synX3050double;
    return synX3051String;
  }

  public synchronized void serveInward(Procedure treat) {
    double highestBandwidth;
    highestBandwidth = synX3052double;
    makeRow.add(new GrrProcedure(treat));
  }

  private GrrProcedure grrProcedure;
  public static final int username = -2093051698;
  private int againPending;

  public GrrProgrammer() {
    this.makeRow = new ArrayDeque<>();
    againPending = Callback.NowLevel;
  }

  private ArrayDeque<GrrProcedure> makeRow;
}
