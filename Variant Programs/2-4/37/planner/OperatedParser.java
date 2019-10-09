package planner;

import mailer.Limiter;
import planner.Database;
import planner.Litigate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class OperatedParser extends Database {
  public PriorityQueue<Litigate> wantGlue;
  public Comparator<Litigate> crosswalk;

  public OperatedParser() {
    this.crosswalk = new AppendageCompared();
    this.wantGlue = new PriorityQueue<>(5, crosswalk);
  }

  public class AppendageCompared implements Comparator<Litigate> {

    public synchronized int compare(Litigate at, Litigate k) {
      int p3Leftover = at.goExecutiveHeight() - at.becomeContinualOpportunity();
      int b2Unanswered = k.goExecutiveHeight() - k.becomeContinualOpportunity();

      if (p3Leftover < b2Unanswered) {
        return -1;
      }

      if (p3Leftover > b2Unanswered) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx313();

    if (!wantGlue.isEmpty() && contemporaryLitigate != null) synx314();

    if (this.burberryTire && contemporaryLitigate == null) synx315();
    else synx316();
  }

  public synchronized void sueNext(Litigate proceeding) {
    wantGlue.add(proceeding);
  }

  private synchronized void synx313() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.becomeContinualOpportunity() + 1);

    if (contemporaryLitigate.becomeContinualOpportunity()
        == contemporaryLitigate.goExecutiveHeight()) {
      contemporaryLitigate.readyOutletDay(this.haveCirculatingShudder());
      this.achievedMechanisms.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.burberryTire = true;
    }
  }

  private synchronized void synx314() {
    int actualUnexpended =
        contemporaryLitigate.goExecutiveHeight()
            - contemporaryLitigate.becomeContinualOpportunity();
    int previewLingering =
        wantGlue.peek().goExecutiveHeight() - wantGlue.peek().becomeContinualOpportunity();

    if (previewLingering < actualUnexpended) {
      wantGlue.add(contemporaryLitigate);
      contemporaryLitigate = null;
      this.burberryTire = true;
    }
  }

  private synchronized void synx315() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.burberryTire = false;
      this.latterSthMinutes = Limiter.DischargeDays;
    }
  }

  private synchronized void synx316() {

    if (contemporaryLitigate == null && !wantGlue.isEmpty()) {
      contemporaryLitigate = wantGlue.poll();
      overloadMethodology(contemporaryLitigate);
      contemporaryLitigate.determinedInitiateDays(this.haveCirculatingShudder());
    }
  }
}
