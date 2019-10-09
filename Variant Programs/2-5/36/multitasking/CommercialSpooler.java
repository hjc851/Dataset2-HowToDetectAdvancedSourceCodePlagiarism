package multitasking;

import sender.Retailer;
import multitasking.Outliner;
import multitasking.Appendage;
import java.util.ArrayDeque;

public class CommercialSpooler extends multitasking.Outliner {
  private static final boolean synX2625boolean = false;
  private static final int synX2624int = 0;
  private static final boolean synX2623boolean = true;
  private static final int synX2622int = 1;
  private static final int synX2621int = 0;
  private static final boolean synX2620boolean = true;
  private static final int synX2619int = 1;
  private static final String synX2618String = "FB:";
  private static final boolean synX2617boolean = true;
  private static final boolean synX2616boolean = false;
  private static final int synX2615int = 0;
  private static final int synX2614int = 0;
  private static final int synX2613int = 0;
  private static final int synX2612int = 0;
  private static final int synX2611int = 0;
  private static final int synX2610int = 6;

  public CommercialSpooler() {
    this.gonnaCarpark = new java.util.ArrayDeque[synX2610int];
    {
      int i = synX2611int;

      while (i < gonnaCarpark.length) {
        {
          synx486(i);
        }
        i++;
      }
    }
    yearStill = PeriodQualitative;
    thisPrioritization = synX2612int;
  }

  private int yearStill;

  private synchronized multitasking.Appendage startForthcomingMechanism() {
    {
      int i = synX2613int;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              thisPrioritization = i;
              return gonnaCarpark[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private ArrayDeque<Appendage>[] gonnaCarpark;

  public synchronized void methodsElected(Appendage treat) {
    gonnaCarpark[synX2614int].addLast(treat);
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = synX2615int;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              return synX2616boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2617boolean;
  }

  public synchronized String outlinerGens() {
    return synX2618String;
  }

  private int thisPrioritization;

  public synchronized void bsiShudder() {

    if (presentlyMechanism != null) synx487();

    if (this.remoSag && presentlyMechanism == null) synx488();
    else synx489();
  }

  private synchronized void synx487() {
    presentlyMechanism.orderedFunctionalChance(presentlyMechanism.bringTrackMeter() + synX2619int);
    yearStill--;

    if (presentlyMechanism.bringTrackMeter() == presentlyMechanism.takeExecutionsDiameter()) {
      presentlyMechanism.arrangeEgressYears(this.sustainThisValidation());
      this.inauguratedOperations.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.remoSag = synX2620boolean;
    }

    if (yearStill == synX2621int && presentlyMechanism != null) {

      if (primedIsVacant()) {
        yearStill = PeriodQualitative;
      } else {
        gonnaCarpark[thisPrioritization + synX2622int].addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.remoSag = synX2623boolean;
      }
    }
  }

  private synchronized void synx488() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX2624int) {
      this.remoSag = synX2625boolean;
      this.residualFraserOpportunity = Retailer.DetachmentBeginning;
    }
  }

  private synchronized void synx489() {

    if (presentlyMechanism == null && !primedIsVacant()) {
      presentlyMechanism = startForthcomingMechanism();
      lodePhase(presentlyMechanism);
      presentlyMechanism.fixedBeginsOpportunity(this.sustainThisValidation());
      yearStill = PeriodQualitative;
    }
  }
}
