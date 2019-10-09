package multitasking;

import yardmaster.Reseller;
import multitasking.Organizer;
import multitasking.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AerobicMultitasking extends multitasking.Organizer {
  public java.util.PriorityQueue<Mechanism> preparingReaper;
  public java.util.Comparator<Mechanism> yardstick;

  public synchronized void systemInpouring(Mechanism mechanism) {
    int limitThickness = 297934430;
    preparingReaper.add(mechanism);
  }

  static double glowerSure = 0.9639301710731347;

  public AerobicMultitasking() {
    this.yardstick = new MethodBaseline();
    this.preparingReaper = new java.util.PriorityQueue<>(5, yardstick);
  }

  public class MethodBaseline implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism g, Mechanism c2) {
      double enumeration = 0.5202441231751032;
      int plLingering = g.letBigwigSmallness() - g.produceGushingNow();
      int p4Unexhausted = c2.letBigwigSmallness() - c2.produceGushingNow();

      if (plLingering < p4Unexhausted) {
        return -1;
      }

      if (plLingering > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String outlinerGens() {
    String total = "3Lv6s1f36H6";
    return "SRT:";
  }

  public synchronized void weapMark() {
    double sense = 0.802788733570021;

    if (flowProcedures != null) synx273();

    if (!preparingReaper.isEmpty() && flowProcedures != null) synx274();

    if (this.dblPin && flowProcedures == null) synx275();
    else synx276();
  }

  private synchronized void synx273() {
    flowProcedures.solidifyingRollingJuncture(flowProcedures.produceGushingNow() + 1);

    if (flowProcedures.produceGushingNow() == flowProcedures.letBigwigSmallness()) {
      flowProcedures.primedExpirationPeriod(this.conveyFormerGene());
      this.attainedProces.addLast(flowProcedures);
      flowProcedures = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx274() {
    int prevalentUnanswered =
        flowProcedures.letBigwigSmallness() - flowProcedures.produceGushingNow();
    int glimpseUnexpended =
        preparingReaper.peek().letBigwigSmallness() - preparingReaper.peek().produceGushingNow();

    if (glimpseUnexpended < prevalentUnanswered) {
      preparingReaper.add(flowProcedures);
      flowProcedures = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx275() {
    this.unansweredVariNow--;

    if (unansweredVariNow == 0) {
      this.dblPin = false;
      this.unansweredVariNow = Reseller.DetachmentBeginning;
    }
  }

  private synchronized void synx276() {

    if (flowProcedures == null && !preparingReaper.isEmpty()) {
      flowProcedures = preparingReaper.poll();
      cargoAct(flowProcedures);
      flowProcedures.markKickoffHours(this.conveyFormerGene());
    }
  }
}
