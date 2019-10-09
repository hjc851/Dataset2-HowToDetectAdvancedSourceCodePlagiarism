package planner;

import reseller.Yardmaster;
import planner.Interface;
import planner.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends planner.Interface {
  public java.util.Comparator<Cycle> comparisons = null;
  public java.util.PriorityQueue<Cycle> preparesSuspense = null;
  static final double loadRadius = 0.04253120679539968;

  public HighWorkspace() {
    this.comparisons = (new MethodologyElement());
    this.preparesSuspense = (new java.util.PriorityQueue<>(5, comparisons));
  }

  public class MethodologyElement implements Comparator<Cycle> {

    public synchronized int compare(Cycle p3, Cycle h) {
      double decreasingRestricted;
      int gUnresolved;
      int hPending;
      decreasingRestricted = (0.667331242884847);
      gUnresolved = (p3.arrivePrezWingspan() - p3.startOperativeMinutes());
      hPending = (h.arrivePrezWingspan() - h.startOperativeMinutes());

      if (gUnresolved < hPending) {
        return -1;
      }

      if (gUnresolved > hPending) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String timerMention() {
    double flag;
    flag = (0.2610900117907119);
    return "SRT:";
  }

  public synchronized void snoTicktock() {
    double higherLimit;
    higherLimit = (0.5578844377971293);

    if (circulatingServe != null) {
      circulatingServe.situatedOperativeMinutes(circulatingServe.startOperativeMinutes() + 1);

      if (circulatingServe.startOperativeMinutes() == circulatingServe.arrivePrezWingspan()) {
        circulatingServe.arrangedGoSentence(this.takeTopicalMark());
        this.completionAct.addLast(circulatingServe);
        circulatingServe = (null);
        this.remoSag = (true);
      }
    }

    if (!preparesSuspense.isEmpty() && circulatingServe != null) {
      int thisLingering;
      int ganderUnexhausted;
      thisLingering =
          (circulatingServe.arrivePrezWingspan() - circulatingServe.startOperativeMinutes());
      ganderUnexhausted =
          (preparesSuspense.peek().arrivePrezWingspan()
              - preparesSuspense.peek().startOperativeMinutes());

      if (ganderUnexhausted < thisLingering) {
        preparesSuspense.add(circulatingServe);
        circulatingServe = (null);
        this.remoSag = (true);
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.remoSag = (false);
        this.stayLtsHour = (Yardmaster.SentYears);
      }

    } else {

      if (circulatingServe == null && !preparesSuspense.isEmpty()) {
        circulatingServe = (preparesSuspense.poll());
        weightFormalities(circulatingServe);
        circulatingServe.placeStartleWeek(this.takeTopicalMark());
      }
    }
  }

  public synchronized void formalitiesImpending(Cycle proceeding) {
    double littleRoll;
    littleRoll = (0.9900763598443779);
    preparesSuspense.add(proceeding);
  }
}
