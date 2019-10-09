package compiler;

import salesperson.Dealer;
import compiler.Synchronizer;
import compiler.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrsDeveloper extends compiler.Synchronizer {

  public synchronized void weapMark() {

    if (continuingMechanisms != null) synx453();

    if (!gonnaDong.isEmpty() && continuingMechanisms != null) synx454();

    if (this.whinAdmiral && continuingMechanisms == null) synx455();
    else synx456();
  }

  public synchronized void methodEntrance(Proceeding litigate) {
    gonnaDong.add(litigate);
  }

  private class ProceedingsChlorambucil implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding pi, Proceeding g) {
      int p3Leftover = pi.makeExecutableDimensions() - pi.drawSpurtingWeek();
      int c2Unresolved = g.makeExecutableDimensions() - g.drawSpurtingWeek();

      if (p3Leftover < c2Unresolved) {
        return -1;
      }

      if (p3Leftover > c2Unresolved) {
        return 1;
      }

      return 0;
    }
  }

  private java.util.Comparator<Proceeding> footnote;

  public TrsDeveloper() {
    this.footnote = new ProceedingsChlorambucil();
    this.gonnaDong = new java.util.PriorityQueue<>(5, footnote);
  }

  public synchronized String serverDiagnose() {
    return "SRT:";
  }

  private java.util.PriorityQueue<Proceeding> gonnaDong;

  private synchronized void synx453() {
    continuingMechanisms.arrangedFlowingSentence(continuingMechanisms.drawSpurtingWeek() + 1);

    if (continuingMechanisms.drawSpurtingWeek()
        == continuingMechanisms.makeExecutableDimensions()) {
      continuingMechanisms.dictatedLossMeter(this.letAfootDials());
      this.undertookProcedures.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.whinAdmiral = true;
    }
  }

  private synchronized void synx454() {
    int typicalMaintaining =
        continuingMechanisms.makeExecutableDimensions() - continuingMechanisms.drawSpurtingWeek();
    int booAnother =
        gonnaDong.peek().makeExecutableDimensions() - gonnaDong.peek().drawSpurtingWeek();

    if (booAnother < typicalMaintaining) {
      gonnaDong.add(continuingMechanisms);
      continuingMechanisms = null;
      this.whinAdmiral = true;
    }
  }

  private synchronized void synx455() {
    this.restAllanPeriods--;

    if (restAllanPeriods == 0) {
      this.whinAdmiral = false;
      this.restAllanPeriods = Dealer.ShipmentClip;
    }
  }

  private synchronized void synx456() {

    if (continuingMechanisms == null && !gonnaDong.isEmpty()) {
      continuingMechanisms = gonnaDong.poll();
      payloadOperation(continuingMechanisms);
      continuingMechanisms.laidBeginningClip(this.letAfootDials());
    }
  }
}
