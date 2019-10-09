package writer;

import distributors.Originator;
import writer.Spreadsheet;
import writer.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends writer.Spreadsheet {
  static final double appraise = 0.4394721874277706;
  private java.util.ArrayDeque<GrrProcedure> setConvoy;
  private int whenLeaving;
  private writer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.setConvoy = new java.util.ArrayDeque<>();
    whenLeaving = Spreadsheet.ThingLibido;
  }

  public synchronized String spreadsheetKey() {
    double uppermostTrammel = 0.23132186303467805;
    return "NRR:";
  }

  public synchronized void snoTicktock() {
    double minimum = 0.07209093531531352;

    if (grrProcedure != null) synx463();

    if (this.telaDroop && circulatingServe == null) synx464();
    else synx465();
  }

  public synchronized void systemInpouring(Operation mechanism) {
    double minuteBreadth = 0.8233078544088082;
    setConvoy.add(new writer.GrrProcedure(mechanism));
  }

  private synchronized void synx463() {
    grrProcedure.primedFunctioningPeriod(grrProcedure.drawSpurtingWeek() + 1);
    whenLeaving--;

    if (grrProcedure.drawSpurtingWeek() == grrProcedure.takeExecutionsDiameter()) {
      grrProcedure.orderedWithdrawalChance(this.beatTypicalGenetic());
      this.conductedServe.addLast(grrProcedure);
      grrProcedure = null;
      this.telaDroop = true;
    }

    if (whenLeaving == 0 && grrProcedure != null) {

      if (setConvoy.isEmpty()) {
        whenLeaving = grrProcedure.comeClipQuantity();
      } else {

        if (grrProcedure.comeClipQuantity() > 2) {
          grrProcedure.fitYearSurface(grrProcedure.comeClipQuantity() - 1);
        }

        setConvoy.addLast(grrProcedure);
        grrProcedure = null;
        this.telaDroop = true;
      }
    }
  }

  private synchronized void synx464() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.telaDroop = false;
      this.otherDblClip = Originator.SendingHour;
    }
  }

  private synchronized void synx465() {

    if (grrProcedure == null && !setConvoy.isEmpty()) {
      grrProcedure = setConvoy.removeFirst();
      loaderNegotiations(grrProcedure);
      grrProcedure.fixedBeginsOpportunity(this.beatTypicalGenetic());
      whenLeaving = grrProcedure.comeClipQuantity();
    }
  }

  private synchronized void synx466(int i) {
    poisedBottleneck[i] = new java.util.ArrayDeque<>();
  }
}
