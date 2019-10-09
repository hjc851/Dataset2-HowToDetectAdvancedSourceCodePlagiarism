package compiler;

import salesperson.Dealer;
import compiler.Synchronizer;
import compiler.Proceeding;
import java.util.ArrayDeque;

public class UsingProgramming extends compiler.Synchronizer {
  private static final boolean synX2532boolean = false;
  private static final int synX2531int = 0;
  private static final boolean synX2530boolean = true;
  private static final int synX2529int = 1;
  private static final String synX2528String = "FCFS:";

  public synchronized void weapMark() {

    if (continuingMechanisms != null) synx457();

    if (this.whinAdmiral && continuingMechanisms == null) synx458();
    else synx459();
  }

  public synchronized void methodEntrance(Proceeding summons) {
    reluctantCola.addLast(summons);
  }

  private java.util.ArrayDeque<Proceeding> reluctantCola;

  public UsingProgramming() {
    this.reluctantCola = new java.util.ArrayDeque<>();
  }

  public synchronized String serverDiagnose() {
    return synX2528String;
  }

  private synchronized void synx457() {
    continuingMechanisms.arrangedFlowingSentence(
        continuingMechanisms.drawSpurtingWeek() + synX2529int);

    if (continuingMechanisms.drawSpurtingWeek()
        == continuingMechanisms.makeExecutableDimensions()) {
      continuingMechanisms.dictatedLossMeter(this.letAfootDials());
      this.undertookProcedures.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.whinAdmiral = synX2530boolean;
    }
  }

  private synchronized void synx458() {
    this.restAllanPeriods--;

    if (restAllanPeriods == synX2531int) {
      this.whinAdmiral = synX2532boolean;
      this.restAllanPeriods = Dealer.ShipmentClip;
    }
  }

  private synchronized void synx459() {

    if (continuingMechanisms == null && !reluctantCola.isEmpty()) {
      continuingMechanisms = reluctantCola.removeFirst();
      continuingMechanisms.laidBeginningClip(this.letAfootDials());
      payloadOperation(continuingMechanisms);
    }
  }
}
