package planner;

import mailer.Limiter;
import planner.Database;
import planner.Litigate;
import java.util.ArrayDeque;

public class TrillSpreadsheet extends Database {
  public ArrayDeque<Litigate> prepareLine;
  public int clipOther;

  public TrillSpreadsheet() {
    this.prepareLine = new ArrayDeque<>();
    clipOther = JunctureTremendous;
  }

  public synchronized String workspaceForename() {
    return "RR:";
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx310();

    if (this.burberryTire && contemporaryLitigate == null) synx311();
    else synx312();
  }

  public synchronized void sueNext(Litigate formalities) {
    prepareLine.addLast(formalities);
  }

  private synchronized void synx310() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.becomeContinualOpportunity() + 1);
    clipOther--;

    if (contemporaryLitigate.becomeContinualOpportunity()
        == contemporaryLitigate.goExecutiveHeight()) {
      contemporaryLitigate.readyOutletDay(this.haveCirculatingShudder());
      this.achievedMechanisms.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.burberryTire = true;
    }

    if (clipOther == 0 && contemporaryLitigate != null) {

      if (prepareLine.isEmpty()) {
        clipOther = JunctureTremendous;
      } else {
        prepareLine.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.burberryTire = true;
      }
    }
  }

  private synchronized void synx311() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.burberryTire = false;
      this.latterSthMinutes = Limiter.DischargeDays;
    }
  }

  private synchronized void synx312() {

    if (contemporaryLitigate == null && !prepareLine.isEmpty()) {
      contemporaryLitigate = prepareLine.removeFirst();
      overloadMethodology(contemporaryLitigate);
      contemporaryLitigate.determinedInitiateDays(this.haveCirculatingShudder());
      clipOther = JunctureTremendous;
    }
  }
}
