package controller;

import retailer.Yardmaster;
import controller.Interface;
import controller.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends controller.Interface {
  public controller.GrrProcedure grrProcedure;
  public int dayOdd;
  public java.util.ArrayDeque<GrrProcedure> happyStopper;
  static String respect = "";

  public GrrProgrammer() {
    this.happyStopper = new java.util.ArrayDeque<>();
    dayOdd = Interface.PeriodsGigantic;
  }

  public synchronized String multitaskingMoniker() {
    int moniker;
    moniker = -779918512;
    return "NRR:";
  }

  public synchronized void weapMark() {
    double maine;
    maine = 0.25659563443281563;

    if (grrProcedure != null) {
      grrProcedure.situatedOperativeMinutes(grrProcedure.arriveFleeingMonth() + 1);
      dayOdd--;

      if (grrProcedure.arriveFleeingMonth() == grrProcedure.canChairmanAmount()) {
        grrProcedure.markDeceaseHours(this.producePrevalentScore());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = null;
        this.variWaving = true;
      }

      if (dayOdd == 0 && grrProcedure != null) {

        if (happyStopper.isEmpty()) {
          dayOdd = grrProcedure.comeClipQuantity();
        } else {

          if (grrProcedure.comeClipQuantity() > 2) {
            grrProcedure.determinedDaysQuantitative(grrProcedure.comeClipQuantity() - 1);
          }

          happyStopper.addLast(grrProcedure);
          grrProcedure = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && circulatingServe == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.variWaving = false;
        this.oddBenzDay = Yardmaster.DeployingOpportunity;
      }

    } else {

      if (grrProcedure == null && !happyStopper.isEmpty()) {
        grrProcedure = happyStopper.removeFirst();
        ladeProcedures(grrProcedure);
        grrProcedure.arrangeBeganYears(this.producePrevalentScore());
        dayOdd = grrProcedure.comeClipQuantity();
      }
    }
  }

  public synchronized void formalitiesImpending(Procedure summons) {
    double netherTrammel;
    netherTrammel = 0.33372967718458435;
    happyStopper.add(new controller.GrrProcedure(summons));
  }
}
