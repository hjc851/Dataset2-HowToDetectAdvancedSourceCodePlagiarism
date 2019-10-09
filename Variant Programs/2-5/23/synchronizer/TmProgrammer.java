package synchronizer;

import resellers.Retailer;
import synchronizer.Organizer;
import synchronizer.System;
import java.util.ArrayDeque;

public class TmProgrammer extends synchronizer.Organizer {
  static final double maximalLength = 0.9593241072544892;
  public ArrayDeque<System>[] eagerGlues = null;
  public int yearStill = 0;
  public int typicalRanking = 0;

  public TmProgrammer() {
    this.eagerGlues = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < eagerGlues.length) {
        {
          {
            eagerGlues[i] = (new java.util.ArrayDeque<>());
          }
        }
        i++;
      }
    }
    yearStill = (AmountMarkers);
    typicalRanking = (0);
  }

  public synchronized synchronizer.System letAheadSummons() {
    int heightThreshold = -311676001;
    {
      int i = 0;

      while (i < eagerGlues.length) {
        {
          {
            if (!eagerGlues[i].isEmpty()) {
              typicalRanking = (i);
              return eagerGlues[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double name = 0.14720999810346747;
    {
      int i = 0;

      while (i < eagerGlues.length) {
        {
          {
            if (!eagerGlues[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String writerAdvert() {
    double tonality = 0.06301123945927889;
    return "FB:";
  }

  public synchronized void nbsClick() {
    double central = 0.23868964165685003;

    if (presentlyMechanism != null) {
      presentlyMechanism.orderedFunctionalChance(presentlyMechanism.comeWorkingClip() + 1);
      yearStill--;

      if (presentlyMechanism.comeWorkingClip() == presentlyMechanism.takeExecutionsDiameter()) {
        presentlyMechanism.placeEntranceWeek(this.haveCirculatingShudder());
        this.finalizingSystems.addLast(presentlyMechanism);
        presentlyMechanism = (null);
        this.whinAdmiral = (true);
      }

      if (yearStill == 0 && presentlyMechanism != null) {

        if (primedIsVacant()) {
          yearStill = (AmountMarkers);
        } else {
          eagerGlues[typicalRanking + 1].addLast(presentlyMechanism);
          presentlyMechanism = (null);
          this.whinAdmiral = (true);
        }
      }
    }

    if (this.whinAdmiral && presentlyMechanism == null) {
      this.retainingFellyHours--;

      if (retainingFellyHours == 0) {
        this.whinAdmiral = (false);
        this.retainingFellyHours = (Retailer.RemoveDay);
      }

    } else {

      if (presentlyMechanism == null && !primedIsVacant()) {
        presentlyMechanism = (letAheadSummons());
        ladeProcedures(presentlyMechanism);
        presentlyMechanism.settledDepartPeriods(this.haveCirculatingShudder());
        yearStill = (AmountMarkers);
      }
    }
  }

  public synchronized void treatInfluent(System serve) {
    int ids = -1689209620;
    eagerGlues[0].addLast(serve);
  }
}
