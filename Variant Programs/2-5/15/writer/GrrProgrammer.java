package writer;

import coordinator.Distributor;
import writer.Server;
import writer.Phase;
import java.util.ArrayDeque;

public class GrrProgrammer extends writer.Server {
  private static final boolean synX1235boolean = false;
  private static final int synX1234int = 0;
  private static final boolean synX1233boolean = true;
  private static final int synX1232int = 1;
  private static final int synX1231int = 2;
  private static final int synX1230int = 0;
  private static final boolean synX1229boolean = true;
  private static final int synX1228int = 1;
  private static final String synX1227String = "qFOnr9";
  private static final int synX1226int = 179297665;
  private static final String synX1225String = "NRR:";
  private static final double synX1224double = 0.48940466974963526;
  static final double symbol = 0.7398641778307837;
  public java.util.ArrayDeque<GrrProcedure> happyStopper;
  public int meterLeftover;
  public writer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.happyStopper = new java.util.ArrayDeque<>();
    meterLeftover = Server.AmountMarkers;
  }

  public synchronized String parserFigure() {
    double pettyIndentured = synX1224double;
    return synX1225String;
  }

  public synchronized void ourTicktack() {
    int important = synX1226int;

    if (grrProcedure != null) synx163();

    if (this.reckTricolor && topicalAppendage == null) synx164();
    else synx165();
  }

  public synchronized void procedureIngoing(Phase proceeding) {
    String indentured = synX1227String;
    happyStopper.add(new writer.GrrProcedure(proceeding));
  }

  private synchronized void synx163() {
    grrProcedure.readyFlyingDay(grrProcedure.goMovingClock() + synX1228int);
    meterLeftover--;

    if (grrProcedure.goMovingClock() == grrProcedure.arrivePrezWingspan()) {
      grrProcedure.orderedWithdrawalChance(this.conveyFormerGene());
      this.achievedMechanisms.addLast(grrProcedure);
      grrProcedure = null;
      this.reckTricolor = synX1229boolean;
    }

    if (meterLeftover == synX1230int && grrProcedure != null) {

      if (happyStopper.isEmpty()) {
        meterLeftover = grrProcedure.makeDaySum();
      } else {

        if (grrProcedure.makeDaySum() > synX1231int) {
          grrProcedure.fixedOpportunityDramatic(grrProcedure.makeDaySum() - synX1232int);
        }

        happyStopper.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = synX1233boolean;
      }
    }
  }

  private synchronized void synx164() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX1234int) {
      this.reckTricolor = synX1235boolean;
      this.unexhaustedTelaMoment = Distributor.DispatchedMonth;
    }
  }

  private synchronized void synx165() {

    if (grrProcedure == null && !happyStopper.isEmpty()) {
      grrProcedure = happyStopper.removeFirst();
      lodePhase(grrProcedure);
      grrProcedure.layFirstMoment(this.conveyFormerGene());
      meterLeftover = grrProcedure.makeDaySum();
    }
  }

  private synchronized void synx166(int i) {
    willingStalks[i] = new java.util.ArrayDeque<>();
  }
}
