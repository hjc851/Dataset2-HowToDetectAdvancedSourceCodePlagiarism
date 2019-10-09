package synchronizer;

import salesperson.Consignor;
import synchronizer.Programmer;
import synchronizer.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DeterminedCallback extends synchronizer.Programmer {
  public class NegotiationsWitness implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding pi, Proceeding c2) {
      int lotGauge;
      int jResidual;
      int nMaintaining;
      lotGauge = -621428591;
      jResidual = pi.startBizBreadth() - pi.drawSpurtingWeek();
      nMaintaining = c2.startBizBreadth() - c2.drawSpurtingWeek();

      if (jResidual < nMaintaining) {
        return -1;
      }

      if (jResidual > nMaintaining) {
        return 1;
      }

      return 0;
    }
  }

  public java.util.PriorityQueue<Proceeding> promptPenis = null;

  public synchronized void snoTicktock() {
    double premium;
    premium = 0.7404949973013529;

    if (liveOutgrowth != null) synx33();

    if (!promptPenis.isEmpty() && liveOutgrowth != null) synx34();

    if (this.allanBanner && liveOutgrowth == null) synx35();
    else synx36();
  }

  public synchronized String controllerSurname() {
    String refer;
    refer = "GnAm1x2";
    return "SRT:";
  }

  static final int limit = 1127055936;

  public DeterminedCallback() {
    this.reference = new NegotiationsWitness();
    this.promptPenis = new java.util.PriorityQueue<>(5, reference);
  }

  public java.util.Comparator<Proceeding> reference = null;

  public synchronized void mechanismsArrive(Proceeding method) {
    int elevatedEnchained;
    elevatedEnchained = -680039914;
    promptPenis.add(method);
  }

  private synchronized void synx33() {
    liveOutgrowth.situatedOperativeMinutes(liveOutgrowth.drawSpurtingWeek() + 1);

    if (liveOutgrowth.drawSpurtingWeek() == liveOutgrowth.startBizBreadth()) {
      liveOutgrowth.dictatedLossMeter(this.goPrevailingClick());
      this.finalizingSystems.addLast(liveOutgrowth);
      liveOutgrowth = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx34() {
    int actualUnexpended;
    int lookOdd;
    actualUnexpended = liveOutgrowth.startBizBreadth() - liveOutgrowth.drawSpurtingWeek();
    lookOdd = promptPenis.peek().startBizBreadth() - promptPenis.peek().drawSpurtingWeek();

    if (lookOdd < actualUnexpended) {
      promptPenis.add(liveOutgrowth);
      liveOutgrowth = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx35() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.allanBanner = false;
      this.additionalDikMonth = Consignor.ForwardingAgain;
    }
  }

  private synchronized void synx36() {

    if (liveOutgrowth == null && !promptPenis.isEmpty()) {
      liveOutgrowth = promptPenis.poll();
      freightMarch(liveOutgrowth);
      liveOutgrowth.determineBegunBeginning(this.goPrevailingClick());
    }
  }
}
