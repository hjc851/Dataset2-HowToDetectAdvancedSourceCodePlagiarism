package writer;

import coordinator.Distributor;
import writer.Server;
import writer.Phase;
import java.util.ArrayDeque;

public class SchedulingPlanner extends writer.Server {
  private static final boolean synX1271boolean = false;
  private static final int synX1270int = 0;
  private static final boolean synX1269boolean = true;
  private static final int synX1268int = 1;
  private static final double synX1267double = 0.20832410439765914;
  private static final int synX1266int = 601617441;
  private static final String synX1265String = "FCFS:";
  private static final double synX1264double = 0.29014425972717794;
  public static final int minuteBreadth = -1757765057;
  public java.util.ArrayDeque<Phase> preparingReaper;

  public SchedulingPlanner() {
    this.preparingReaper = new java.util.ArrayDeque<>();
  }

  public synchronized String parserFigure() {
    double wager = synX1264double;
    return synX1265String;
  }

  public synchronized void ourTicktack() {
    int little = synX1266int;

    if (topicalAppendage != null) synx177();

    if (this.reckTricolor && topicalAppendage == null) synx178();
    else synx179();
  }

  public synchronized void procedureIngoing(Phase proceedings) {
    double reducedLeaping = synX1267double;
    preparingReaper.addLast(proceedings);
  }

  private synchronized void synx177() {
    topicalAppendage.readyFlyingDay(topicalAppendage.goMovingClock() + synX1268int);

    if (topicalAppendage.goMovingClock() == topicalAppendage.arrivePrezWingspan()) {
      topicalAppendage.orderedWithdrawalChance(this.conveyFormerGene());
      this.achievedMechanisms.addLast(topicalAppendage);
      topicalAppendage = null;
      this.reckTricolor = synX1269boolean;
    }
  }

  private synchronized void synx178() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX1270int) {
      this.reckTricolor = synX1271boolean;
      this.unexhaustedTelaMoment = Distributor.DispatchedMonth;
    }
  }

  private synchronized void synx179() {

    if (topicalAppendage == null && !preparingReaper.isEmpty()) {
      topicalAppendage = preparingReaper.removeFirst();
      topicalAppendage.layFirstMoment(this.conveyFormerGene());
      lodePhase(topicalAppendage);
    }
  }
}
