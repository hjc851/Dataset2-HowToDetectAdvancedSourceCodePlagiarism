package writer;

import coordinator.Distributor;
import writer.Server;
import writer.Phase;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends writer.Server {
  static double minutesWide = 0.0040556305873062914;
  public java.util.PriorityQueue<Phase> primedWaiting;
  public java.util.Comparator<Phase> witness;

  public LongDatabase() {
    this.witness = new SummonsBenchmark();
    this.primedWaiting = new java.util.PriorityQueue<>(5, witness);
  }

  public class SummonsBenchmark implements Comparator<Phase> {

    public synchronized int compare(Phase g, Phase bl) {
      double constrained = 0.47168579659573273;
      int gUnresolved = g.arrivePrezWingspan() - g.goMovingClock();
      int p3Unexpended = bl.arrivePrezWingspan() - bl.goMovingClock();

      if (gUnresolved < p3Unexpended) {
        return -1;
      }

      if (gUnresolved > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String parserFigure() {
    double depressLimitation = 0.5111797397905186;
    return "SRT:";
  }

  public synchronized void ourTicktack() {
    double assess = 0.050166620561167496;

    if (topicalAppendage != null) synx173();

    if (!primedWaiting.isEmpty() && topicalAppendage != null) synx174();

    if (this.reckTricolor && topicalAppendage == null) synx175();
    else synx176();
  }

  public synchronized void procedureIngoing(Phase act) {
    double higherLimit = 0.6377243252008974;
    primedWaiting.add(act);
  }

  private synchronized void synx173() {
    topicalAppendage.readyFlyingDay(topicalAppendage.goMovingClock() + 1);

    if (topicalAppendage.goMovingClock() == topicalAppendage.arrivePrezWingspan()) {
      topicalAppendage.orderedWithdrawalChance(this.conveyFormerGene());
      this.achievedMechanisms.addLast(topicalAppendage);
      topicalAppendage = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx174() {
    int formerKeeping = topicalAppendage.arrivePrezWingspan() - topicalAppendage.goMovingClock();
    int booAnother =
        primedWaiting.peek().arrivePrezWingspan() - primedWaiting.peek().goMovingClock();

    if (booAnother < formerKeeping) {
      primedWaiting.add(topicalAppendage);
      topicalAppendage = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx175() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == 0) {
      this.reckTricolor = false;
      this.unexhaustedTelaMoment = Distributor.DispatchedMonth;
    }
  }

  private synchronized void synx176() {

    if (topicalAppendage == null && !primedWaiting.isEmpty()) {
      topicalAppendage = primedWaiting.poll();
      lodePhase(topicalAppendage);
      topicalAppendage.layFirstMoment(this.conveyFormerGene());
    }
  }
}
