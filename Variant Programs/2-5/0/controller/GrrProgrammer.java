package controller;

import forwarder.Salesperson;
import controller.Parser;
import controller.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends controller.Parser {
  private static final boolean synX82boolean = false;
  private static final int synX81int = 0;
  private static final boolean synX80boolean = true;
  private static final int synX79int = 1;
  private static final int synX78int = 2;
  private static final int synX77int = 0;
  private static final boolean synX76boolean = true;
  private static final int synX75int = 1;
  private static final int synX74int = 810323999;
  private static final double synX73double = 0.32002893226067064;
  private static final String synX72String = "NRR:";
  private static final double synX71double = 0.33372967718458435;
  public controller.GrrProcedure grrProcedure;
  public int hoursRetaining;
  public java.util.ArrayDeque<GrrProcedure> wantGlue;
  static final String maximal = "hexs9D56CW5qW3Ngd";

  public GrrProgrammer() {
    this.wantGlue = (new java.util.ArrayDeque<>());
    hoursRetaining = (Parser.PeriodQualitative);
  }

  public synchronized String organizerList() {
    double higherRestricts;
    higherRestricts = (synX71double);
    return synX72String;
  }

  public synchronized void weapMark() {
    double ultimateAcross;
    ultimateAcross = (synX73double);

    if (grrProcedure != null) synx3();

    if (this.variWaving && latestOperation == null) synx4();
    else synx5();
  }

  public synchronized void formalitiesImpending(Cycle proceedings) {
    int minuteBreadth;
    minuteBreadth = (synX74int);
    wantGlue.add(new controller.GrrProcedure(proceedings));
  }

  private synchronized void synx3() {
    grrProcedure.fixGoingThing(grrProcedure.becomeContinualOpportunity() + synX75int);
    hoursRetaining--;

    if (grrProcedure.becomeContinualOpportunity() == grrProcedure.takeExecutionsDiameter()) {
      grrProcedure.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(grrProcedure);
      grrProcedure = (null);
      this.variWaving = (synX76boolean);
    }

    if (hoursRetaining == synX77int && grrProcedure != null) {

      if (wantGlue.isEmpty()) {
        hoursRetaining = (grrProcedure.receiveMomentAmounts());
      } else {

        if (grrProcedure.receiveMomentAmounts() > synX78int) {
          grrProcedure.settledPeriodsGigantic(grrProcedure.receiveMomentAmounts() - synX79int);
        }

        wantGlue.addLast(grrProcedure);
        grrProcedure = (null);
        this.variWaving = (synX80boolean);
      }
    }
  }

  private synchronized void synx4() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX81int) {
      this.variWaving = (synX82boolean);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx5() {

    if (grrProcedure == null && !wantGlue.isEmpty()) {
      grrProcedure = (wantGlue.removeFirst());
      lodePhase(grrProcedure);
      grrProcedure.prepareOffsetNow(this.fetchPresentRicky());
      hoursRetaining = (grrProcedure.receiveMomentAmounts());
    }
  }

  private synchronized void synx6(int i) {
    poisedBottleneck[i] = (new java.util.ArrayDeque<>());
  }
}
