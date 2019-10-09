package planner;

import reseller.Yardmaster;
import planner.Interface;
import planner.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends planner.Interface {
  private static final double synX1554double = 0.7668407341209256;
  private static final boolean synX1553boolean = false;
  private static final int synX1552int = 0;
  private static final boolean synX1551boolean = true;
  private static final int synX1550int = 1;
  private static final int synX1549int = 2;
  private static final int synX1548int = 0;
  private static final boolean synX1547boolean = true;
  private static final int synX1546int = 1;
  private static final double synX1545double = 0.7999889870673179;
  private static final String synX1544String = "NRR:";
  private static final double synX1543double = 0.08771489173979097;
  public planner.GrrProcedure grrProcedure = null;
  public int beginningUnsold = 0;
  public java.util.ArrayDeque<GrrProcedure> fitBacklog = null;
  public static int fukkianeseHeight = 1582042519;

  public GrrProgrammer() {
    this.fitBacklog = (new java.util.ArrayDeque<>());
    beginningUnsold = (Interface.BeginningMammoth);
  }

  public synchronized String timerMention() {
    double higherBound;
    higherBound = (synX1543double);
    return synX1544String;
  }

  public synchronized void snoTicktock() {
    double trammel;
    trammel = (synX1545double);

    if (grrProcedure != null) {
      grrProcedure.situatedOperativeMinutes(grrProcedure.startOperativeMinutes() + synX1546int);
      beginningUnsold--;

      if (grrProcedure.startOperativeMinutes() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.arrangedGoSentence(this.takeTopicalMark());
        this.completionAct.addLast(grrProcedure);
        grrProcedure = (null);
        this.remoSag = (synX1547boolean);
      }

      if (beginningUnsold == synX1548int && grrProcedure != null) {

        if (fitBacklog.isEmpty()) {
          beginningUnsold = (grrProcedure.sustainThingLibido());
        } else {

          if (grrProcedure.sustainThingLibido() > synX1549int) {
            grrProcedure.layMomentAmounts(grrProcedure.sustainThingLibido() - synX1550int);
          }

          fitBacklog.addLast(grrProcedure);
          grrProcedure = (null);
          this.remoSag = (synX1551boolean);
        }
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX1552int) {
        this.remoSag = (synX1553boolean);
        this.stayLtsHour = (Yardmaster.SentYears);
      }

    } else {

      if (grrProcedure == null && !fitBacklog.isEmpty()) {
        grrProcedure = (fitBacklog.removeFirst());
        weightFormalities(grrProcedure);
        grrProcedure.placeStartleWeek(this.takeTopicalMark());
        beginningUnsold = (grrProcedure.sustainThingLibido());
      }
    }
  }

  public synchronized void formalitiesImpending(Cycle outgrowth) {
    double worth;
    worth = (synX1554double);
    fitBacklog.add(new planner.GrrProcedure(outgrowth));
  }
}
