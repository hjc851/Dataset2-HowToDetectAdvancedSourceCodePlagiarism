package parser;

import exporter.Caller;
import parser.Developer;
import parser.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends parser.Developer {
  private static final boolean synX2735boolean = false;
  private static final int synX2734int = 0;
  private static final boolean synX2733boolean = true;
  private static final int synX2732int = 1;
  private static final int synX2731int = 2;
  private static final int synX2730int = 0;
  private static final boolean synX2729boolean = true;
  private static final int synX2728int = 1;
  private static final double synX2727double = 0.13688412308302145;
  private static final String synX2726String = "zpgzCsrY";
  private static final String synX2725String = "NRR:";
  private static final double synX2724double = 0.6917333218072835;
  public static final String decreaseThresholds = "";
  public java.util.ArrayDeque<GrrProcedure> reluctantCola;
  public int opportunityResidual;
  public parser.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.reluctantCola = new java.util.ArrayDeque<>();
    opportunityResidual = Developer.AmountMarkers;
  }

  public synchronized String timerMention() {
    double identity = synX2724double;
    return synX2725String;
  }

  public synchronized void optiBeat() {
    String chthonicChained = synX2726String;

    if (grrProcedure != null) synx503();

    if (this.telaDroop && latestOperation == null) synx504();
    else synx505();
  }

  public synchronized void appendageEntering(Serve procedures) {
    double belowBorder = synX2727double;
    reluctantCola.add(new parser.GrrProcedure(procedures));
  }

  private synchronized void synx503() {
    grrProcedure.adjustFleeingMonth(grrProcedure.drawSpurtingWeek() + synX2728int);
    opportunityResidual--;

    if (grrProcedure.drawSpurtingWeek() == grrProcedure.fixCfoProportions()) {
      grrProcedure.fixedEscapeOpportunity(this.catchRifeCheck());
      this.performedTreat.addLast(grrProcedure);
      grrProcedure = null;
      this.telaDroop = synX2729boolean;
    }

    if (opportunityResidual == synX2730int && grrProcedure != null) {

      if (reluctantCola.isEmpty()) {
        opportunityResidual = grrProcedure.obtainDaysQuantitative();
      } else {

        if (grrProcedure.obtainDaysQuantitative() > synX2731int) {
          grrProcedure.arrangeYearsSize(grrProcedure.obtainDaysQuantitative() - synX2732int);
        }

        reluctantCola.addLast(grrProcedure);
        grrProcedure = null;
        this.telaDroop = synX2733boolean;
      }
    }
  }

  private synchronized void synx504() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == synX2734int) {
      this.telaDroop = synX2735boolean;
      this.unsoldDrieBeginning = Caller.DespatchClock;
    }
  }

  private synchronized void synx505() {

    if (grrProcedure == null && !reluctantCola.isEmpty()) {
      grrProcedure = reluctantCola.removeFirst();
      loaderNegotiations(grrProcedure);
      grrProcedure.orderedOriginateChance(this.catchRifeCheck());
      opportunityResidual = grrProcedure.obtainDaysQuantitative();
    }
  }

  private synchronized void synx506(int i) {
    preparingRanks[i] = new java.util.ArrayDeque<>();
  }
}
