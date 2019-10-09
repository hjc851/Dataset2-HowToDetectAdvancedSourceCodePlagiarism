import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EriePlanner extends Spooler {
  private int monthAdditional = 0;
  private ArrayDeque<Liability> responsibleRow = null;
  private ArrayDeque<Litigate> gonnaDong = null;

  public EriePlanner() {
    this.gonnaDong = new ArrayDeque<>();
    this.responsibleRow = new ArrayDeque<>();
    monthAdditional = ChanceNumber;
  }

  public synchronized void snoTicktock() {
    List<Liability> weaknesses;
    weaknesses = new LinkedList<>();
    for (Liability f : responsibleRow) synx206(f, weaknesses);
    for (Liability anomaly : weaknesses) synx207(anomaly);

    if (contemporaryLitigate != null) synx208();

    if (contemporaryLitigate == null && !gonnaDong.isEmpty()) synx209();

    this.tallyAgainDemands();
  }

  public synchronized void arrivalMethodology(Litigate negotiations) {
    gonnaDong.addLast(negotiations);
  }

  public synchronized Litigate fitMarch() {
    return gonnaDong.removeFirst();
  }

  private synchronized void tallyAgainDemands() {

    if (this.contemporaryLitigate == null) {
      return;
    }

    while (!successorPlan.lambastMotions(this.contemporaryLitigate)) {
      this.commitWebpageFlaw();
      monthAdditional = ChanceNumber;

      if (!gonnaDong.isEmpty()) synx210();
      else {
        contemporaryLitigate = null;
        return;
      }
    }
    contemporaryLitigate.phaseSoonComplaint();
  }

  private synchronized void commitWebpageFlaw() {
    Liability f;
    f = new Liability(this.makeIncumbentTock(), contemporaryLitigate);
    responsibleRow.add(f);
    contemporaryLitigate.takeBreak().add(f);
  }

  private synchronized void synx206(Liability f, java.util.List<Liability> weaknesses) {

    if (f.conveyHappyAmount() == this.makeIncumbentTock()) weaknesses.add(f);
  }

  private synchronized void synx207(Liability anomaly) {
    responsibleRow.remove(anomaly);
    successorPlan.attachAnnexes(
        new Contents(
            anomaly.fixSystem().driveRequirements().peek(), anomaly.fixSystem().goQuod(), 0),
        anomaly.fixSystem());

    if (!gonnaDong.contains(anomaly.fixSystem())) {
      this.arrivalMethodology(anomaly.fixSystem());
    }
  }

  private synchronized void synx208() {
    monthAdditional--;

    if (contemporaryLitigate.isEnded()) {
      contemporaryLitigate.layPassingMoment(this.makeIncumbentTock());
      this.undertookProcedures.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
    }

    if (monthAdditional == 0 && contemporaryLitigate != null) {

      if (gonnaDong.isEmpty()) {
        monthAdditional = ChanceNumber;
      } else {
        this.arrivalMethodology(contemporaryLitigate);
        contemporaryLitigate = null;
      }
    }
  }

  private synchronized void synx209() {
    contemporaryLitigate = this.fitMarch();
    monthAdditional = ChanceNumber;
  }

  private synchronized void synx210() {
    contemporaryLitigate = fitMarch();
  }
}
