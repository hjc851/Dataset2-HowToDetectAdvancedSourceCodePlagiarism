package planner;

import mailer.Limiter;
import planner.Database;
import planner.Litigate;
import java.util.ArrayDeque;

public class CommercialSpooler extends Database {
  public ArrayDeque<Litigate>[] preparesTrollies;
  public int againPending;
  public int streamImportance;

  public CommercialSpooler() {
    this.preparesTrollies = new ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) synx306(i);
    againPending = JunctureTremendous;
    streamImportance = 0;
  }

  public synchronized Litigate developNewProceeding() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        streamImportance = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    return "FB:";
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx307();

    if (this.burberryTire && contemporaryLitigate == null) synx308();
    else synx309();
  }

  public synchronized void sueNext(Litigate phase) {
    preparesTrollies[0].addLast(phase);
  }

  private synchronized void synx307() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.becomeContinualOpportunity() + 1);
    againPending--;

    if (contemporaryLitigate.becomeContinualOpportunity()
        == contemporaryLitigate.goExecutiveHeight()) {
      contemporaryLitigate.readyOutletDay(this.haveCirculatingShudder());
      this.achievedMechanisms.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.burberryTire = true;
    }

    if (againPending == 0 && contemporaryLitigate != null) {

      if (primedIsVacant()) {
        againPending = JunctureTremendous;
      } else {
        preparesTrollies[streamImportance + 1].addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.burberryTire = true;
      }
    }
  }

  private synchronized void synx308() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.burberryTire = false;
      this.latterSthMinutes = Limiter.DischargeDays;
    }
  }

  private synchronized void synx309() {

    if (contemporaryLitigate == null && !primedIsVacant()) {
      contemporaryLitigate = developNewProceeding();
      overloadMethodology(contemporaryLitigate);
      contemporaryLitigate.determinedInitiateDays(this.haveCirculatingShudder());
      againPending = JunctureTremendous;
    }
  }
}
