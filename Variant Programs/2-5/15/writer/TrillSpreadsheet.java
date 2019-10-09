package writer;

import coordinator.Distributor;
import writer.Server;
import writer.Phase;
import java.util.ArrayDeque;

public class TrillSpreadsheet extends writer.Server {
  private static final boolean synX1263boolean = false;
  private static final int synX1262int = 0;
  private static final boolean synX1261boolean = true;
  private static final int synX1260int = 0;
  private static final boolean synX1259boolean = true;
  private static final int synX1258int = 1;
  private static final double synX1257double = 0.478943091545613;
  private static final int synX1256int = -884622234;
  private static final String synX1255String = "RR:";
  private static final String synX1254String = "zAeAgxw6oxc";
  static final String minnOuter = "k";
  public java.util.ArrayDeque<Phase> promptPenis;
  public int yearsAnother;

  public TrillSpreadsheet() {
    this.promptPenis = new java.util.ArrayDeque<>();
    yearsAnother = AmountMarkers;
  }

  public synchronized String parserFigure() {
    String winder = synX1254String;
    return synX1255String;
  }

  public synchronized void ourTicktack() {
    int carolineConsignments = synX1256int;

    if (topicalAppendage != null) synx170();

    if (this.reckTricolor && topicalAppendage == null) synx171();
    else synx172();
  }

  public synchronized void procedureIngoing(Phase method) {
    double nameBelongings = synX1257double;
    promptPenis.addLast(method);
  }

  private synchronized void synx170() {
    topicalAppendage.readyFlyingDay(topicalAppendage.goMovingClock() + synX1258int);
    yearsAnother--;

    if (topicalAppendage.goMovingClock() == topicalAppendage.arrivePrezWingspan()) {
      topicalAppendage.orderedWithdrawalChance(this.conveyFormerGene());
      this.achievedMechanisms.addLast(topicalAppendage);
      topicalAppendage = null;
      this.reckTricolor = synX1259boolean;
    }

    if (yearsAnother == synX1260int && topicalAppendage != null) {

      if (promptPenis.isEmpty()) {
        yearsAnother = AmountMarkers;
      } else {
        promptPenis.addLast(topicalAppendage);
        topicalAppendage = null;
        this.reckTricolor = synX1261boolean;
      }
    }
  }

  private synchronized void synx171() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX1262int) {
      this.reckTricolor = synX1263boolean;
      this.unexhaustedTelaMoment = Distributor.DispatchedMonth;
    }
  }

  private synchronized void synx172() {

    if (topicalAppendage == null && !promptPenis.isEmpty()) {
      topicalAppendage = promptPenis.removeFirst();
      lodePhase(topicalAppendage);
      topicalAppendage.layFirstMoment(this.conveyFormerGene());
      yearsAnother = AmountMarkers;
    }
  }
}
