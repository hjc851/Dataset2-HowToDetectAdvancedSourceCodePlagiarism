package multitasking;

import sender.Retailer;
import multitasking.Outliner;
import multitasking.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends multitasking.Outliner {
  private static final boolean synX2609boolean = false;
  private static final int synX2608int = 0;
  private static final boolean synX2607boolean = true;
  private static final int synX2606int = 1;
  private static final int synX2605int = 2;
  private static final int synX2604int = 0;
  private static final boolean synX2603boolean = true;
  private static final int synX2602int = 1;
  private static final String synX2601String = "NRR:";
  private java.util.ArrayDeque<GrrProcedure> intelligentBraid;

  public GrrProgrammer() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
    periodsRest = Outliner.PeriodQualitative;
  }

  private multitasking.GrrProcedure grrProcedure;
  private int periodsRest;

  public synchronized void methodsElected(Appendage mechanisms) {
    intelligentBraid.add(new multitasking.GrrProcedure(mechanisms));
  }

  public synchronized void bsiShudder() {

    if (grrProcedure != null) synx483();

    if (this.remoSag && presentlyMechanism == null) synx484();
    else synx485();
  }

  public synchronized String outlinerGens() {
    return synX2601String;
  }

  private synchronized void synx483() {
    grrProcedure.orderedFunctionalChance(grrProcedure.bringTrackMeter() + synX2602int);
    periodsRest--;

    if (grrProcedure.bringTrackMeter() == grrProcedure.takeExecutionsDiameter()) {
      grrProcedure.arrangeEgressYears(this.sustainThisValidation());
      this.inauguratedOperations.addLast(grrProcedure);
      grrProcedure = null;
      this.remoSag = synX2603boolean;
    }

    if (periodsRest == synX2604int && grrProcedure != null) {

      if (intelligentBraid.isEmpty()) {
        periodsRest = grrProcedure.letHoursHuge();
      } else {

        if (grrProcedure.letHoursHuge() > synX2605int) {
          grrProcedure.markHoursHuge(grrProcedure.letHoursHuge() - synX2606int);
        }

        intelligentBraid.addLast(grrProcedure);
        grrProcedure = null;
        this.remoSag = synX2607boolean;
      }
    }
  }

  private synchronized void synx484() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX2608int) {
      this.remoSag = synX2609boolean;
      this.residualFraserOpportunity = Retailer.DetachmentBeginning;
    }
  }

  private synchronized void synx485() {

    if (grrProcedure == null && !intelligentBraid.isEmpty()) {
      grrProcedure = intelligentBraid.removeFirst();
      lodePhase(grrProcedure);
      grrProcedure.fixedBeginsOpportunity(this.sustainThisValidation());
      periodsRest = grrProcedure.letHoursHuge();
    }
  }

  private synchronized void synx486(int i) {
    gonnaCarpark[i] = new java.util.ArrayDeque<>();
  }
}
