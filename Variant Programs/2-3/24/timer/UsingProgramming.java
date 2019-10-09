package timer;

import starter.Starter;
import timer.Parser;
import timer.Method;
import java.util.ArrayDeque;

public class UsingProgramming extends timer.Parser {

  public synchronized String synchronizationAppoint() {
    return "FCFS:";
  }

  public java.util.ArrayDeque<Method> cookCue;

  public synchronized void operationInbound(Method proceeding) {
    cookCue.addLast(proceeding);
  }

  public UsingProgramming() {
    this.cookCue = new java.util.ArrayDeque<>();
  }

  public synchronized void ourTicktack() {

    if (latestOperation != null) {
      latestOperation.bentLengthwiseHour(latestOperation.produceGushingNow() + 1);

      if (latestOperation.produceGushingNow() == latestOperation.obtainTimeoutLength()) {
        latestOperation.markDeceaseHours(this.canExistingDial());
        this.consummatedOperation.addLast(latestOperation);
        latestOperation = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && latestOperation == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.sthCloth = false;
        this.stillPassenYear = Starter.DetachmentBeginning;
      }

    } else {

      if (latestOperation == null && !cookCue.isEmpty()) {
        latestOperation = cookCue.removeFirst();
        latestOperation.arrangedGoSentence(this.canExistingDial());
        loaderNegotiations(latestOperation);
      }
    }
  }
}
