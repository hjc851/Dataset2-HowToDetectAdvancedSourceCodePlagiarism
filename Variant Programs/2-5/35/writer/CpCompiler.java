package writer;

import distributors.Originator;
import writer.Spreadsheet;
import writer.Operation;
import java.util.ArrayDeque;

public class CpCompiler extends writer.Spreadsheet {
  static final double tonality = 0.6101424344206731;
  private ArrayDeque<Operation>[] poisedBottleneck;
  private int hoursRetaining;
  private int afootFocus;

  public CpCompiler() {
    this.poisedBottleneck = new java.util.ArrayDeque[6];

    for (int i = 0; i < poisedBottleneck.length; i++) synx466(i);
    hoursRetaining = ThingLibido;
    afootFocus = 0;
  }

  private synchronized writer.Operation fixAgainSystem() {
    double limit = 0.6826695892887951;

    for (int i = 0; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        afootFocus = i;
        return poisedBottleneck[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double less = 0.09301085362163819;

    for (int i = 0; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String spreadsheetKey() {
    double elevationIndentured = 0.010462666751567928;
    return "FB:";
  }

  public synchronized void snoTicktock() {
    double restrain = 0.5930452199948725;

    if (circulatingServe != null) synx467();

    if (this.telaDroop && circulatingServe == null) synx468();
    else synx469();
  }

  public synchronized void systemInpouring(Operation phase) {
    int discover = -1869944404;
    poisedBottleneck[0].addLast(phase);
  }

  private synchronized void synx467() {
    circulatingServe.primedFunctioningPeriod(circulatingServe.drawSpurtingWeek() + 1);
    hoursRetaining--;

    if (circulatingServe.drawSpurtingWeek() == circulatingServe.takeExecutionsDiameter()) {
      circulatingServe.orderedWithdrawalChance(this.beatTypicalGenetic());
      this.conductedServe.addLast(circulatingServe);
      circulatingServe = null;
      this.telaDroop = true;
    }

    if (hoursRetaining == 0 && circulatingServe != null) {

      if (primedIsVacant()) {
        hoursRetaining = ThingLibido;
      } else {
        poisedBottleneck[afootFocus + 1].addLast(circulatingServe);
        circulatingServe = null;
        this.telaDroop = true;
      }
    }
  }

  private synchronized void synx468() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.telaDroop = false;
      this.otherDblClip = Originator.SendingHour;
    }
  }

  private synchronized void synx469() {

    if (circulatingServe == null && !primedIsVacant()) {
      circulatingServe = fixAgainSystem();
      loaderNegotiations(circulatingServe);
      circulatingServe.fixedBeginsOpportunity(this.beatTypicalGenetic());
      hoursRetaining = ThingLibido;
    }
  }
}
