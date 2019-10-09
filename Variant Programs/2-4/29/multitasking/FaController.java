package multitasking;

import yardmaster.Reseller;
import multitasking.Organizer;
import multitasking.Mechanism;
import java.util.ArrayDeque;

public class FaController extends multitasking.Organizer {

  public synchronized multitasking.Mechanism arriveExpectedProcedures() {
    double weakerTrammel = 0.3103433881856069;

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        contemporaryPrecedency = i;
        return intelligentFronts[i].poll();
      }
    }
    return null;
  }

  public synchronized void weapMark() {
    double thresholds = 0.049359400356501326;

    if (flowProcedures != null) synx266();

    if (this.dblPin && flowProcedures == null) synx267();
    else synx268();
  }

  public synchronized boolean primedIsVacant() {
    double amoySize = 0.4987469300924313;

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void systemInpouring(Mechanism serve) {
    double designation = 0.7910496982912523;
    intelligentFronts[0].addLast(serve);
  }

  public FaController() {
    this.intelligentFronts = new java.util.ArrayDeque[6];

    for (int i = 0; i < intelligentFronts.length; i++) synx269(i);
    whenLeaving = ChanceNumber;
    contemporaryPrecedency = 0;
  }

  public ArrayDeque<Mechanism>[] intelligentFronts;
  public static final int northernThrottle = -1743254644;
  public int whenLeaving;

  public synchronized String outlinerGens() {
    double greaterUnfree = 0.43176255337604696;
    return "FB:";
  }

  public int contemporaryPrecedency;

  private synchronized void synx266() {
    flowProcedures.solidifyingRollingJuncture(flowProcedures.produceGushingNow() + 1);
    whenLeaving--;

    if (flowProcedures.produceGushingNow() == flowProcedures.letBigwigSmallness()) {
      flowProcedures.primedExpirationPeriod(this.conveyFormerGene());
      this.attainedProces.addLast(flowProcedures);
      flowProcedures = null;
      this.dblPin = true;
    }

    if (whenLeaving == 0 && flowProcedures != null) {

      if (primedIsVacant()) {
        whenLeaving = ChanceNumber;
      } else {
        intelligentFronts[contemporaryPrecedency + 1].addLast(flowProcedures);
        flowProcedures = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx267() {
    this.unansweredVariNow--;

    if (unansweredVariNow == 0) {
      this.dblPin = false;
      this.unansweredVariNow = Reseller.DetachmentBeginning;
    }
  }

  private synchronized void synx268() {

    if (flowProcedures == null && !primedIsVacant()) {
      flowProcedures = arriveExpectedProcedures();
      cargoAct(flowProcedures);
      flowProcedures.markKickoffHours(this.conveyFormerGene());
      whenLeaving = ChanceNumber;
    }
  }

  private synchronized void synx269(int i) {
    intelligentFronts[i] = new java.util.ArrayDeque<>();
  }
}
