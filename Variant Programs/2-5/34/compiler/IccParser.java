package compiler;

import salesperson.Dealer;
import compiler.Synchronizer;
import compiler.Proceeding;
import java.util.ArrayDeque;

public class IccParser extends compiler.Synchronizer {
  private static final boolean synX2527boolean = false;
  private static final int synX2526int = 0;
  private static final boolean synX2525boolean = true;
  private static final int synX2524int = 0;
  private static final boolean synX2523boolean = true;
  private static final int synX2522int = 1;
  private static final String synX2521String = "RR:";

  public IccParser() {
    this.prepareLine = new java.util.ArrayDeque<>();
    amountKeeping = WeekVolume;
  }

  private java.util.ArrayDeque<Proceeding> prepareLine;
  private int amountKeeping;

  public synchronized String serverDiagnose() {
    return synX2521String;
  }

  public synchronized void weapMark() {

    if (continuingMechanisms != null) synx450();

    if (this.whinAdmiral && continuingMechanisms == null) synx451();
    else synx452();
  }

  public synchronized void methodEntrance(Proceeding appendage) {
    prepareLine.addLast(appendage);
  }

  private synchronized void synx450() {
    continuingMechanisms.arrangedFlowingSentence(
        continuingMechanisms.drawSpurtingWeek() + synX2522int);
    amountKeeping--;

    if (continuingMechanisms.drawSpurtingWeek()
        == continuingMechanisms.makeExecutableDimensions()) {
      continuingMechanisms.dictatedLossMeter(this.letAfootDials());
      this.undertookProcedures.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.whinAdmiral = synX2523boolean;
    }

    if (amountKeeping == synX2524int && continuingMechanisms != null) {

      if (prepareLine.isEmpty()) {
        amountKeeping = WeekVolume;
      } else {
        prepareLine.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.whinAdmiral = synX2525boolean;
      }
    }
  }

  private synchronized void synx451() {
    this.restAllanPeriods--;

    if (restAllanPeriods == synX2526int) {
      this.whinAdmiral = synX2527boolean;
      this.restAllanPeriods = Dealer.ShipmentClip;
    }
  }

  private synchronized void synx452() {

    if (continuingMechanisms == null && !prepareLine.isEmpty()) {
      continuingMechanisms = prepareLine.removeFirst();
      payloadOperation(continuingMechanisms);
      continuingMechanisms.laidBeginningClip(this.letAfootDials());
      amountKeeping = WeekVolume;
    }
  }
}
