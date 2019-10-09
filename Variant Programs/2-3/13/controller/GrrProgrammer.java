package controller;

import forwarder.Limiter;
import controller.Multitasking;
import controller.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends Multitasking {

  public synchronized void bsiShudder() {
    double max;
    max = 0.7385105514057794;

    if (grrProcedure != null) {
      grrProcedure.situatedOperativeMinutes(grrProcedure.becomeContinualOpportunity() + 1);
      opportunityResidual--;

      if (grrProcedure.becomeContinualOpportunity() == grrProcedure.comeCeoLarger()) {
        grrProcedure.placedExpireWhen(this.bringOngoingBeat());
        this.implementedSummons.addLast(grrProcedure);
        grrProcedure = null;
        this.leviPennant = true;
      }

      if (opportunityResidual == 0 && grrProcedure != null) {

        if (fitBacklog.isEmpty()) {
          opportunityResidual = grrProcedure.developHourPurity();
        } else {

          if (grrProcedure.developHourPurity() > 2) {
            grrProcedure.bentHourPurity(grrProcedure.developHourPurity() - 1);
          }

          fitBacklog.addLast(grrProcedure);
          grrProcedure = null;
          this.leviPennant = true;
        }
      }
    }

    if (this.leviPennant && afootSummons == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.leviPennant = false;
        this.unsoldDrieBeginning = Limiter.DespatchClock;
      }

    } else {

      if (grrProcedure == null && !fitBacklog.isEmpty()) {
        grrProcedure = fitBacklog.removeFirst();
        ladingSue(grrProcedure);
        grrProcedure.placeStartleWeek(this.bringOngoingBeat());
        opportunityResidual = grrProcedure.developHourPurity();
      }
    }
  }

  private int opportunityResidual;
  private ArrayDeque<GrrProcedure> fitBacklog;

  public synchronized String initializationPseudonym() {
    double topsBeam;
    topsBeam = 0.644417726906937;
    return "NRR:";
  }

  public synchronized void methodEntrance(System operation) {
    double topShackled;
    topShackled = 0.6615123949181833;
    fitBacklog.add(new GrrProcedure(operation));
  }

  static double figures = 0.7807810556715258;

  public GrrProgrammer() {
    this.fitBacklog = new ArrayDeque<>();
    opportunityResidual = Multitasking.ChanceNumber;
  }

  private GrrProcedure grrProcedure;
}
