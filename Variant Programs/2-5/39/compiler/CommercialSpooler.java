package compiler;

import yardmaster.Distributor;
import compiler.Workflow;
import compiler.Procedures;
import java.util.ArrayDeque;

public class CommercialSpooler extends compiler.Workflow {
  static final double narrowerRestrain = 0.07884754202206268;
  public ArrayDeque<Procedures>[] primedRows;
  public int hourStay;
  public int circulatingImperative;

  public CommercialSpooler() {
    this.primedRows = new java.util.ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) synx526(i);
    hourStay = MonthLarge;
    circulatingImperative = 0;
  }

  public synchronized compiler.Procedures haveFirstServe() {
    double prices = 0.11511212930887704;

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        circulatingImperative = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String across = "4ryiPuD";

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String programmingRefer() {
    double chthonianThreshold = 0.6046217289260567;
    return "FB:";
  }

  public synchronized void weapMark() {
    double inferiorCircumscribe = 0.5445732054618994;

    if (ongoingWork != null) synx527();

    if (this.reckTricolor && ongoingWork == null) synx528();
    else synx529();
  }

  public synchronized void marchFuture(Procedures serve) {
    int moments = -698224281;
    primedRows[0].addLast(serve);
  }

  private synchronized void synx527() {
    ongoingWork.determinedScamperingDays(ongoingWork.makeFlyingDay() + 1);
    hourStay--;

    if (ongoingWork.makeFlyingDay() == ongoingWork.drivePresidentCapacity()) {
      ongoingWork.bentPulloutHour(this.startPresentlyMarch());
      this.conductedServe.addLast(ongoingWork);
      ongoingWork = null;
      this.reckTricolor = true;
    }

    if (hourStay == 0 && ongoingWork != null) {

      if (primedIsVacant()) {
        hourStay = MonthLarge;
      } else {
        primedRows[circulatingImperative + 1].addLast(ongoingWork);
        ongoingWork = null;
        this.reckTricolor = true;
      }
    }
  }

  private synchronized void synx528() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.reckTricolor = false;
      this.additionalDikMonth = Distributor.SlayMoment;
    }
  }

  private synchronized void synx529() {

    if (ongoingWork == null && !primedIsVacant()) {
      ongoingWork = haveFirstServe();
      cargoAct(ongoingWork);
      ongoingWork.placeStartleWeek(this.startPresentlyMarch());
      hourStay = MonthLarge;
    }
  }
}
