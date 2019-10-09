package workflow;

import coordinator.Resellers;
import workflow.Configuration;
import workflow.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends Configuration {
  public Comparator<Cycle> comparison = null;
  public PriorityQueue<Cycle> quickSufferance = null;
  static String calculate = "0S2WANCXBY";

  public TribunalPlanner() {
    this.comparison = new ProceedingsChlorambucil();
    this.quickSufferance = new PriorityQueue<>(5, comparison);
  }

  public class ProceedingsChlorambucil implements Comparator<Cycle> {

    public synchronized int compare(Cycle mi, Cycle f2) {
      double chthonianConfine;
      int eAdditional;
      int blSurviving;
      chthonianConfine = 0.8105378277097962;
      eAdditional = mi.drivePresidentCapacity() - mi.becomeContinualOpportunity();
      blSurviving = f2.drivePresidentCapacity() - f2.becomeContinualOpportunity();

      if (eAdditional < blSurviving) {
        return -1;
      }

      if (eAdditional > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workflowCite() {
    double minutesWide;
    minutesWide = 0.6924866787688526;
    return "SRT:";
  }

  public synchronized void addTock() {
    double highestRestricts;
    highestRestricts = 0.17798954016400748;

    if (contemporaryLitigate != null) {
      contemporaryLitigate.markStreamingHours(
          contemporaryLitigate.becomeContinualOpportunity() + 1);

      if (contemporaryLitigate.becomeContinualOpportunity()
          == contemporaryLitigate.drivePresidentCapacity()) {
        contemporaryLitigate.orderedWithdrawalChance(this.canExistingDial());
        this.attainedProces.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.ballaBrigade = true;
      }
    }

    if (!quickSufferance.isEmpty() && contemporaryLitigate != null) {
      int presentlyLatter;
      int peruseMaintaining;
      presentlyLatter =
          contemporaryLitigate.drivePresidentCapacity()
              - contemporaryLitigate.becomeContinualOpportunity();
      peruseMaintaining =
          quickSufferance.peek().drivePresidentCapacity()
              - quickSufferance.peek().becomeContinualOpportunity();

      if (peruseMaintaining < presentlyLatter) {
        quickSufferance.add(contemporaryLitigate);
        contemporaryLitigate = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && contemporaryLitigate == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.ballaBrigade = false;
        this.oddBenzDay = Resellers.RemoveDay;
      }

    } else {

      if (contemporaryLitigate == null && !quickSufferance.isEmpty()) {
        contemporaryLitigate = quickSufferance.poll();
        consignmentTreat(contemporaryLitigate);
        contemporaryLitigate.placeStartleWeek(this.canExistingDial());
      }
    }
  }

  public synchronized void proceduresIngress(Cycle serve) {
    double quality;
    quality = 0.5738425107212052;
    quickSufferance.add(serve);
  }
}
