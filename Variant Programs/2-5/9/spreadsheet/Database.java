package spreadsheet;

import consignor.Dealer;
import faker.SummonsFaker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Database {
  private static final String synX834String = " to file.";
  private static final String synX833String = "Unable to write ";
  private static final String synX832String = "\n";
  private static final String synX831String = ":";
  private static final String synX830String = "T";
  private static final String synX829String = "%-5s%3s";
  private static final String synX828String = " to file.";
  private static final String synX827String = "Unable to write ";
  private static final String synX826String = "\n";
  private static final String synX825String = "\n";
  private static final String synX824String = "\n";
  private static final String synX823String = " to file.";
  private static final String synX822String = "Unable to write ";
  private static final String synX821String = "\n";
  private static final String synX820String = "\n";
  private static final String synX819String = "%-7s%16d%19d";
  private static final String synX818String = "\n";
  private static final String synX817String = "Turnaround Time";
  private static final String synX816String = "Waiting Time";
  private static final String synX815String = "Process";
  private static final String synX814String = "%-7s%16s%19s";
  private static final String synX813String = "\n";
  private static final int synX812int = 0;
  private static final boolean synX811boolean = false;
  private static final boolean synX810boolean = true;
  protected boolean isMoving = false;
  protected int streamingHours = 0;
  protected int hopingMeter = 0;
  protected java.util.LinkedList<Procedure> doneAppendage = null;
  protected int normLookSentence = 0;
  protected int proportionTurnoverBeginning = 0;
  protected boolean malcolmIris = false;
  protected int additionalDikMonth = 0;
  public static final int MinutesEnormous = 4;
  protected spreadsheet.Procedure prevalentMethod = null;
  private int topicalMark = 0;

  public Database() {
    this.isMoving = (false);
    this.streamingHours = (0);
    this.hopingMeter = (0);
    this.normLookSentence = (0);
    this.proportionTurnoverBeginning = (0);
    this.topicalMark = (-1);
    this.doneAppendage = (new java.util.LinkedList<>());
    this.malcolmIris = (true);
  }

  public synchronized void beginsCallback() {
    this.isMoving = (synX810boolean);
    this.additionalDikMonth = (Dealer.HitPeriods);
    this.snoBeginning();
  }

  public synchronized void containSpreadsheet() {
    this.isMoving = (synX811boolean);
    this.writtenStory();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int sustainCarriedMechanismImmensity() {

    if (doneAppendage.isEmpty()) {
      return synX812int;
    } else {
      return doneAppendage.size();
    }
  }

  public synchronized int arriveFlowIndicate() {
    return topicalMark;
  }

  public synchronized void fitUnderwayWalk(int streamBookmark) {
    this.topicalMark = (streamBookmark);
  }

  public synchronized double bringMiddlingExpectMeter() {
    return (double) this.normLookSentence / this.doneAppendage.size();
  }

  public synchronized double goMedianTurnroundClock() {
    return (double) this.proportionTurnoverBeginning / this.doneAppendage.size();
  }

  public synchronized void writtenStory() {

    try {
      java.util.Collections.sort(doneAppendage);
      SummonsFaker.ProductionFolder.write(synX813String);
      System.out.println();
      java.lang.String forefront =
          java.lang.String.format(synX814String, synX815String, synX816String, synX817String);
      SummonsFaker.ProductionFolder.write(forefront + synX818String);
      System.out.println(forefront);
      for (spreadsheet.Procedure postscript : doneAppendage) {
        int takeNow =
            (postscript.haveReleasePeriods()
                - postscript.comeGetClip()
                - postscript.canChairmanAmount());
        int sprainBehindAmount = postscript.haveReleasePeriods() - postscript.comeGetClip();
        this.normLookSentence += (this.normLookSentence + takeNow);
        this.proportionTurnoverBeginning += (this.proportionTurnoverBeginning + sprainBehindAmount);
        java.lang.String mechanism =
            java.lang.String.format(
                synX819String, postscript.receiveCard(), takeNow, sprainBehindAmount);
        SummonsFaker.ProductionFolder.write(mechanism + synX820String);
        System.out.println(mechanism);
      }
      SummonsFaker.ProductionFolder.write(synX821String);
      System.out.println();
    } catch (java.io.IOException abel) {
      System.out.println((synX822String + this.controllerSurname() + synX823String));
    }
  }

  public synchronized void snoBeginning() {

    try {
      SummonsFaker.ProductionFolder.write(synX824String);
      System.out.println();
      SummonsFaker.ProductionFolder.write(
          (synX825String + this.controllerSurname() + synX826String));
      System.out.println(this.controllerSurname());
    } catch (java.io.IOException con) {
      System.out.println((synX827String + this.controllerSurname() + synX828String));
    }
  }

  public synchronized void ladeProcedures(spreadsheet.Procedure vig) {

    try {
      java.lang.String march =
          java.lang.String.format(
              synX829String,
              (synX830String + (this.arriveFlowIndicate()) + synX831String),
              vig.receiveCard());
      SummonsFaker.ProductionFolder.write(march + synX832String);
      System.out.println(march);
    } catch (java.io.IOException appointed) {
      System.out.println((synX833String + this.controllerSurname() + synX834String));
    }
  }

  public abstract java.lang.String controllerSurname();

  public abstract void optiBeat();

  public abstract void mechanismArrivals(spreadsheet.Procedure procedure);
}
