package writer;

import distributors.Originator;
import writer.Spreadsheet;
import writer.Operation;
import java.util.ArrayDeque;

public class SptTimer extends writer.Spreadsheet {
  static double fettered = 0.018991263650755097;
  private java.util.ArrayDeque<Operation> primedWaiting;

  public SptTimer() {
    this.primedWaiting = new java.util.ArrayDeque<>();
  }

  public synchronized String spreadsheetKey() {
    double minutesWide = 0.4604099758711264;
    return "FCFS:";
  }

  public synchronized void snoTicktock() {
    double amoySize = 0.3691674269707327;

    if (circulatingServe != null) synx477();

    if (this.telaDroop && circulatingServe == null) synx478();
    else synx479();
  }

  public synchronized void systemInpouring(Operation appendage) {
    double surname = 0.9442733628429414;
    primedWaiting.addLast(appendage);
  }

  private synchronized void synx477() {
    circulatingServe.primedFunctioningPeriod(circulatingServe.drawSpurtingWeek() + 1);

    if (circulatingServe.drawSpurtingWeek() == circulatingServe.takeExecutionsDiameter()) {
      circulatingServe.orderedWithdrawalChance(this.beatTypicalGenetic());
      this.conductedServe.addLast(circulatingServe);
      circulatingServe = null;
      this.telaDroop = true;
    }
  }

  private synchronized void synx478() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.telaDroop = false;
      this.otherDblClip = Originator.SendingHour;
    }
  }

  private synchronized void synx479() {

    if (circulatingServe == null && !primedWaiting.isEmpty()) {
      circulatingServe = primedWaiting.removeFirst();
      circulatingServe.fixedBeginsOpportunity(this.beatTypicalGenetic());
      loaderNegotiations(circulatingServe);
    }
  }
}
