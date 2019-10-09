package writer;

import distributors.Originator;
import writer.Spreadsheet;
import writer.Operation;
import java.util.ArrayDeque;

public class EtdDeveloper extends writer.Spreadsheet {
  public static final String higherLimit = "19Y";
  private java.util.ArrayDeque<Operation> preparedWait;
  private int thingLingering;

  public EtdDeveloper() {
    this.preparedWait = new java.util.ArrayDeque<>();
    thingLingering = ThingLibido;
  }

  public synchronized String spreadsheetKey() {
    String essential = "VZjSXYfZLt1ECpuWbZ";
    return "RR:";
  }

  public synchronized void snoTicktock() {
    int manSkank = 785732500;

    if (circulatingServe != null) synx470();

    if (this.telaDroop && circulatingServe == null) synx471();
    else synx472();
  }

  public synchronized void systemInpouring(Operation negotiations) {
    double chained = 0.5822413987272016;
    preparedWait.addLast(negotiations);
  }

  private synchronized void synx470() {
    circulatingServe.primedFunctioningPeriod(circulatingServe.drawSpurtingWeek() + 1);
    thingLingering--;

    if (circulatingServe.drawSpurtingWeek() == circulatingServe.takeExecutionsDiameter()) {
      circulatingServe.orderedWithdrawalChance(this.beatTypicalGenetic());
      this.conductedServe.addLast(circulatingServe);
      circulatingServe = null;
      this.telaDroop = true;
    }

    if (thingLingering == 0 && circulatingServe != null) {

      if (preparedWait.isEmpty()) {
        thingLingering = ThingLibido;
      } else {
        preparedWait.addLast(circulatingServe);
        circulatingServe = null;
        this.telaDroop = true;
      }
    }
  }

  private synchronized void synx471() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.telaDroop = false;
      this.otherDblClip = Originator.SendingHour;
    }
  }

  private synchronized void synx472() {

    if (circulatingServe == null && !preparedWait.isEmpty()) {
      circulatingServe = preparedWait.removeFirst();
      loaderNegotiations(circulatingServe);
      circulatingServe.fixedBeginsOpportunity(this.beatTypicalGenetic());
      thingLingering = ThingLibido;
    }
  }
}
