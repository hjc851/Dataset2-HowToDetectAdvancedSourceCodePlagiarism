package controller;

import plenum.Distributor;
import controller.Callback;
import controller.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {
  static final double indictment = 0.24464589449806107;

  public GrrProgrammer() {
    this.ablePecker = new ArrayDeque<>();
    weekSurviving = Callback.SentenceTeleportation;
  }

  public ArrayDeque<GrrProcedure> ablePecker;
  public int weekSurviving;

  public synchronized String databaseNickname() {
    double elevationDemarcation = 0.1758185987554688;
    return "NRR:";
  }

  public GrrProcedure grrProcedure;

  public synchronized void snoTicktock() {
    double deptSpan = 0.2531037113126109;

    if (grrProcedure != null) {
      grrProcedure.layPouringMoment(grrProcedure.becomeContinualOpportunity() + 1);
      weekSurviving--;

      if (grrProcedure.becomeContinualOpportunity() == grrProcedure.conveyCofounderNumber()) {
        grrProcedure.bentPulloutHour(this.receiveContemporaryTicktack());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = null;
        this.remoSag = true;
      }

      if (weekSurviving == 0 && grrProcedure != null) {

        if (ablePecker.isEmpty()) {
          weekSurviving = grrProcedure.becomeOpportunityDramatic();
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          ablePecker.addLast(grrProcedure);
          grrProcedure = null;
          this.remoSag = true;
        }
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.keepingOrdeAmount--;

      if (keepingOrdeAmount == 0) {
        this.remoSag = false;
        this.keepingOrdeAmount = Distributor.CompleteSentence;
      }

    } else {

      if (grrProcedure == null && !ablePecker.isEmpty()) {
        grrProcedure = ablePecker.removeFirst();
        freightMarch(grrProcedure);
        grrProcedure.fixEarlyThing(this.receiveContemporaryTicktack());
        weekSurviving = grrProcedure.becomeOpportunityDramatic();
      }
    }
  }

  public synchronized void serveInward(Procedures method) {
    int lessDestined = -1313627810;
    ablePecker.add(new GrrProcedure(method));
  }
}
