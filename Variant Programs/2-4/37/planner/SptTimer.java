package planner;

import mailer.Limiter;
import planner.Database;
import planner.Litigate;
import java.util.ArrayDeque;

public class SptTimer extends Database {
  public ArrayDeque<Litigate> poisedDipper;

  public SptTimer() {
    this.poisedDipper = new ArrayDeque<>();
  }

  public synchronized String workspaceForename() {
    return "FCFS:";
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx317();

    if (this.burberryTire && contemporaryLitigate == null) synx318();
    else synx319();
  }

  public synchronized void sueNext(Litigate methodology) {
    poisedDipper.addLast(methodology);
  }

  private synchronized void synx317() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.becomeContinualOpportunity() + 1);

    if (contemporaryLitigate.becomeContinualOpportunity()
        == contemporaryLitigate.goExecutiveHeight()) {
      contemporaryLitigate.readyOutletDay(this.haveCirculatingShudder());
      this.achievedMechanisms.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.burberryTire = true;
    }
  }

  private synchronized void synx318() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.burberryTire = false;
      this.latterSthMinutes = Limiter.DischargeDays;
    }
  }

  private synchronized void synx319() {

    if (contemporaryLitigate == null && !poisedDipper.isEmpty()) {
      contemporaryLitigate = poisedDipper.removeFirst();
      contemporaryLitigate.determinedInitiateDays(this.haveCirculatingShudder());
      overloadMethodology(contemporaryLitigate);
    }
  }
}
