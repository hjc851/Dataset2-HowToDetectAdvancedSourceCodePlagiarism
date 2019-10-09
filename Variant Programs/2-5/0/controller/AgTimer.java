package controller;

import forwarder.Salesperson;
import controller.Parser;
import controller.Cycle;
import java.util.ArrayDeque;

public class AgTimer extends controller.Parser {
  private static final boolean synX100boolean = false;
  private static final int synX99int = 0;
  private static final boolean synX98boolean = true;
  private static final int synX97int = 1;
  private static final int synX96int = 0;
  private static final boolean synX95boolean = true;
  private static final int synX94int = 1;
  private static final int synX93int = 0;
  private static final String synX92String = "Yr3PRZqNUqydz3CUbe";
  private static final double synX91double = 0.8744754396443489;
  private static final String synX90String = "FB:";
  private static final String synX89String = "hleUUy9X2d41PJ";
  private static final boolean synX88boolean = true;
  private static final boolean synX87boolean = false;
  private static final int synX86int = 0;
  private static final String synX85String = "RPLN1YeAjNEiPIm";
  private static final int synX84int = 0;
  private static final double synX83double = 0.8922236965205332;
  public int liveParamount;
  public int beginningUnsold;
  static String greaterUnfree = "3a1RoqT10";
  public ArrayDeque<Cycle>[] poisedBottleneck;

  public AgTimer() {
    this.poisedBottleneck = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < poisedBottleneck.length; i++) synx6(i);
    beginningUnsold = (PeriodQualitative);
    liveParamount = (0);
  }

  public synchronized controller.Cycle sustainThenMethods() {
    double kesThings;
    kesThings = (synX83double);

    for (int i = synX84int; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        liveParamount = (i);
        return poisedBottleneck[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String restriction;
    restriction = (synX85String);

    for (int i = synX86int; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        return synX87boolean;
      }
    }
    return synX88boolean;
  }

  public synchronized String organizerList() {
    String aboveFettered;
    aboveFettered = (synX89String);
    return synX90String;
  }

  public synchronized void weapMark() {
    double secondRestricted;
    secondRestricted = (synX91double);

    if (latestOperation != null) synx7();

    if (this.variWaving && latestOperation == null) synx8();
    else synx9();
  }

  public synchronized void formalitiesImpending(Cycle act) {
    String glowerRestrictions;
    glowerRestrictions = (synX92String);
    poisedBottleneck[synX93int].addLast(act);
  }

  private synchronized void synx7() {
    latestOperation.fixGoingThing(latestOperation.becomeContinualOpportunity() + synX94int);
    beginningUnsold--;

    if (latestOperation.becomeContinualOpportunity() == latestOperation.takeExecutionsDiameter()) {
      latestOperation.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(latestOperation);
      latestOperation = (null);
      this.variWaving = (synX95boolean);
    }

    if (beginningUnsold == synX96int && latestOperation != null) {

      if (primedIsVacant()) {
        beginningUnsold = (PeriodQualitative);
      } else {
        poisedBottleneck[liveParamount + synX97int].addLast(latestOperation);
        latestOperation = (null);
        this.variWaving = (synX98boolean);
      }
    }
  }

  private synchronized void synx8() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX99int) {
      this.variWaving = (synX100boolean);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx9() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = (sustainThenMethods());
      lodePhase(latestOperation);
      latestOperation.prepareOffsetNow(this.fetchPresentRicky());
      beginningUnsold = (PeriodQualitative);
    }
  }
}
