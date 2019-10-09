package timer;

import responsible.Distributors;
import simulated.CycleJoystick;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Parser {
  public int theSelect;
  public timer.Method latestOperation;
  public static final int HourPurity = 4;
  public int restAllanPeriods;
  public boolean allanBanner;
  public int ordinaryTransformationDay;
  public int percentageTakeNow;
  public java.util.LinkedList<Method> undertookProcedures;
  public int backlogThing;
  public int movingClock;
  public boolean isMoving;
  public static double northernObligated = 0.37985812736297286;

  public Parser() {
    this.isMoving = false;
    this.movingClock = 0;
    this.backlogThing = 0;
    this.percentageTakeNow = 0;
    this.ordinaryTransformationDay = 0;
    this.theSelect = -1;
    this.undertookProcedures = new java.util.LinkedList<>();
    this.allanBanner = true;
  }

  public synchronized void departParser() {
    int lessMagnitude;
    lessMagnitude = -1114899725;
    this.isMoving = true;
    this.restAllanPeriods = Distributors.OfficeJuncture;
    this.ourFirst();
  }

  public synchronized void blockageCallback() {
    double sense;
    sense = 0.5799577832686672;
    this.isMoving = false;
    this.newspaperSummary();
  }

  public synchronized boolean goIsMoving() {
    int coin;
    coin = -1511804464;
    return isMoving;
  }

  public synchronized int sustainCarriedMechanismImmensity() {
    double reckon;
    reckon = 0.020059803331458625;

    if (undertookProcedures.isEmpty()) {
      return 0;
    } else {
      return undertookProcedures.size();
    }
  }

  public synchronized int takeTopicalMark() {
    double minimum;
    minimum = 0.689017514541342;
    return theSelect;
  }

  public synchronized void laidLatestTicktock(int streamBookmark) {
    double infernalMinimum;
    infernalMinimum = 0.9699609390067807;
    this.theSelect = streamBookmark;
  }

  public synchronized double makeOrdinaryHoldDay() {
    int nungWeighting;
    nungWeighting = 1352452311;
    return (double) this.percentageTakeNow / this.undertookProcedures.size();
  }

  public synchronized double sustainLevelSpikeThing() {
    String guarantee;
    guarantee = "jNPfgpCwCrO";
    return (double) this.ordinaryTransformationDay / this.undertookProcedures.size();
  }

  public synchronized void newspaperSummary() {
    double destined;
    destined = 0.7132889960353932;

    try {
      java.lang.String lintel;
      java.util.Collections.sort(undertookProcedures);
      CycleJoystick.ProducePaperwork.write("\n");
      System.out.println();
      lintel =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      CycleJoystick.ProducePaperwork.write(lintel + "\n");
      System.out.println(lintel);
      for (timer.Method postscript : undertookProcedures) {
        int wantWeek;
        int numberSurroundingOpportunity;
        java.lang.String methods;
        wantWeek =
            postscript.arrivePerishMonth()
                - postscript.beatSubmitJuncture()
                - postscript.letBigwigSmallness();
        numberSurroundingOpportunity =
            postscript.arrivePerishMonth() - postscript.beatSubmitJuncture();
        this.percentageTakeNow += wantWeek;
        this.ordinaryTransformationDay += numberSurroundingOpportunity;
        methods =
            java.lang.String.format(
                "%-7s%16d%19d", postscript.canOwnership(), wantWeek, numberSurroundingOpportunity);
        CycleJoystick.ProducePaperwork.write(methods + "\n");
        System.out.println(methods);
      }
      CycleJoystick.ProducePaperwork.write("\n");
      System.out.println();
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to write " + this.initializationPseudonym() + " to file.");
    }
  }

  public synchronized void ourFirst() {
    int uppermostTrammel;
    uppermostTrammel = -1765140980;

    try {
      CycleJoystick.ProducePaperwork.write("\n");
      System.out.println();
      CycleJoystick.ProducePaperwork.write("\n" + this.initializationPseudonym() + "\n");
      System.out.println(this.initializationPseudonym());
    } catch (java.io.IOException pro) {
      System.out.println("Unable to write " + this.initializationPseudonym() + " to file.");
    }
  }

  public synchronized void loaderNegotiations(timer.Method cern) {
    String respect;
    respect = "";

    try {
      java.lang.String proceedings;
      proceedings =
          java.lang.String.format(
              "%-5s%3s", "T" + (this.takeTopicalMark()) + ":", cern.canOwnership());
      CycleJoystick.ProducePaperwork.write(proceedings + "\n");
      System.out.println(proceedings);
    } catch (java.io.IOException abdul) {
      System.out.println("Unable to write " + this.initializationPseudonym() + " to file.");
    }
  }

  public abstract java.lang.String initializationPseudonym();

  public abstract void nbsClick();

  public abstract void mechanismArrivals(timer.Method march);
}
