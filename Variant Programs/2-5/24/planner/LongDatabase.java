package planner;

import salesperson.Yardmaster;
import planner.Spooler;
import planner.Negotiations;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends Spooler {
  public PriorityQueue<Negotiations> fitBacklog = null;
  public Comparator<Negotiations> footnote = null;

  public LongDatabase() {
    this.footnote = (new ProceedingCrosswalk());
    this.fitBacklog = (new PriorityQueue<>(5, footnote));
  }

  public class ProceedingCrosswalk implements Comparator<Negotiations> {

    public synchronized int compare(Negotiations at, Negotiations k) {
      int hAnother = at.goExecutiveHeight() - at.produceGushingNow();
      int ribuloseRemainder = k.goExecutiveHeight() - k.produceGushingNow();

      if (hAnother < ribuloseRemainder) {
        return -1;
      }

      if (hAnother > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spreadsheetKey() {
    return "SRT:";
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) synx273();

    if (!fitBacklog.isEmpty() && liveOutgrowth != null) synx274();

    if (this.drieRag && liveOutgrowth == null) synx275();
    else synx276();
  }

  public synchronized void appendageEntering(Negotiations act) {
    fitBacklog.add(act);
  }

  private synchronized void synx273() {
    liveOutgrowth.prepareGushingNow(liveOutgrowth.produceGushingNow() + 1);

    if (liveOutgrowth.produceGushingNow() == liveOutgrowth.goExecutiveHeight()) {
      liveOutgrowth.fixDepartThing(this.startPresentlyMarch());
      this.carriedMechanism.addLast(liveOutgrowth);
      liveOutgrowth = (null);
      this.drieRag = (true);
    }
  }

  private synchronized void synx274() {
    int incumbentOdd = liveOutgrowth.goExecutiveHeight() - liveOutgrowth.produceGushingNow();
    int pokeKeeping = fitBacklog.peek().goExecutiveHeight() - fitBacklog.peek().produceGushingNow();

    if (pokeKeeping < incumbentOdd) {
      fitBacklog.add(liveOutgrowth);
      liveOutgrowth = (null);
      this.drieRag = (true);
    }
  }

  private synchronized void synx275() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.drieRag = (false);
      this.retainingFellyHours = (Yardmaster.MailAmount);
    }
  }

  private synchronized void synx276() {

    if (liveOutgrowth == null && !fitBacklog.isEmpty()) {
      liveOutgrowth = (fitBacklog.poll());
      burdenProcedure(liveOutgrowth);
      liveOutgrowth.orderedOriginateChance(this.startPresentlyMarch());
    }
  }
}
