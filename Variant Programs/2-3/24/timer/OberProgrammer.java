package timer;

import starter.Starter;
import timer.Parser;
import timer.Method;
import java.util.ArrayDeque;

public class OberProgrammer extends timer.Parser {

  public synchronized String synchronizationAppoint() {
    return "RR:";
  }

  public synchronized void operationInbound(Method outgrowth) {
    makeRow.addLast(outgrowth);
  }

  public synchronized void ourTicktack() {

    if (latestOperation != null) {
      latestOperation.bentLengthwiseHour(latestOperation.produceGushingNow() + 1);
      clipOther--;

      if (latestOperation.produceGushingNow() == latestOperation.obtainTimeoutLength()) {
        latestOperation.markDeceaseHours(this.canExistingDial());
        this.consummatedOperation.addLast(latestOperation);
        latestOperation = null;
        this.sthCloth = true;
      }

      if (clipOther == 0 && latestOperation != null) {

        if (makeRow.isEmpty()) {
          clipOther = DaySum;
        } else {
          makeRow.addLast(latestOperation);
          latestOperation = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && latestOperation == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.sthCloth = false;
        this.stillPassenYear = Starter.DetachmentBeginning;
      }

    } else {

      if (latestOperation == null && !makeRow.isEmpty()) {
        latestOperation = makeRow.removeFirst();
        loaderNegotiations(latestOperation);
        latestOperation.arrangedGoSentence(this.canExistingDial());
        clipOther = DaySum;
      }
    }
  }

  public java.util.ArrayDeque<Method> makeRow;
  public int clipOther;

  public OberProgrammer() {
    this.makeRow = new java.util.ArrayDeque<>();
    clipOther = DaySum;
  }
}
