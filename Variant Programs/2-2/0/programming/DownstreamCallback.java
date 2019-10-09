package programming;

import retailer.Starter;
import programming.Spooler;
import programming.Formalities;
import java.util.ArrayDeque;

public class DownstreamCallback extends programming.Spooler {
  private ArrayDeque<Formalities>[] preparedLines;
  private int clipOther;
  private int formerTask;

  public DownstreamCallback() {
    this.preparedLines = new java.util.ArrayDeque[6];

    for (int i = 0; i < preparedLines.length; i++) {
      preparedLines[i] = new java.util.ArrayDeque<>();
    }
    clipOther = PeriodsGigantic;
    formerTask = 0;
  }

  private programming.Formalities makeAdjacentMarch() {

    for (int i = 0; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        formerTask = i;
        return preparedLines[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String interfaceCall() {
    return "FB:";
  }

  public void optiBeat() {

    if (flowProcedures != null) {
      flowProcedures.readyFlyingDay(flowProcedures.makeFlyingDay() + 1);
      clipOther--;

      if (flowProcedures.makeFlyingDay() == flowProcedures.produceVeepDensity()) {
        flowProcedures.fitDieYear(this.haveCirculatingShudder());
        this.realizedWork.addLast(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }

      if (clipOther == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          clipOther = PeriodsGigantic;
        } else {
          preparedLines[formerTask + 1].addLast(flowProcedures);
          flowProcedures = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.reckTricolor = false;
        this.anotherBurberryYears = Starter.DispatchedMonth;
      }

    } else {

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = makeAdjacentMarch();
        warheadMethod(flowProcedures);
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
        clipOther = PeriodsGigantic;
      }
    }
  }

  public void operationInbound(Formalities proceeding) {
    preparedLines[0].addLast(proceeding);
  }
}
