package timer;

import starter.Starter;
import timer.Parser;
import timer.Method;
import java.util.ArrayDeque;

public class FaController extends timer.Parser {

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void ourTicktack() {

    if (latestOperation != null) {
      latestOperation.bentLengthwiseHour(latestOperation.produceGushingNow() + 1);
      againPending--;

      if (latestOperation.produceGushingNow() == latestOperation.obtainTimeoutLength()) {
        latestOperation.markDeceaseHours(this.canExistingDial());
        this.consummatedOperation.addLast(latestOperation);
        latestOperation = null;
        this.sthCloth = true;
      }

      if (againPending == 0 && latestOperation != null) {

        if (primedIsVacant()) {
          againPending = DaySum;
        } else {
          preparesTrollies[prevalentAgenda + 1].addLast(latestOperation);
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

      if (latestOperation == null && !primedIsVacant()) {
        latestOperation = sustainThenMethods();
        loaderNegotiations(latestOperation);
        latestOperation.arrangedGoSentence(this.canExistingDial());
        againPending = DaySum;
      }
    }
  }

  public int prevalentAgenda;

  public synchronized void operationInbound(Method proceedings) {
    preparesTrollies[0].addLast(proceedings);
  }

  public int againPending;

  public synchronized String synchronizationAppoint() {
    return "FB:";
  }

  public synchronized timer.Method sustainThenMethods() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        prevalentAgenda = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  public FaController() {
    this.preparesTrollies = new java.util.ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) {
      preparesTrollies[i] = new java.util.ArrayDeque<>();
    }
    againPending = DaySum;
    prevalentAgenda = 0;
  }

  public ArrayDeque<Method>[] preparesTrollies;
}
