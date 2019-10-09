package planner;

import salesperson.Yardmaster;
import planner.Spooler;
import planner.Negotiations;
import java.util.ArrayDeque;

public class LampsProgrammer extends Spooler {
  private static final boolean synX2042boolean = false;
  private static final int synX2041int = 0;
  private static final boolean synX2040boolean = true;
  private static final int synX2039int = 1;
  private static final String synX2038String = "FCFS:";
  public ArrayDeque<Negotiations> setConvoy = null;

  public LampsProgrammer() {
    this.setConvoy = (new ArrayDeque<>());
  }

  public synchronized String spreadsheetKey() {
    return synX2038String;
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) synx277();

    if (this.drieRag && liveOutgrowth == null) synx278();
    else synx279();
  }

  public synchronized void appendageEntering(Negotiations methods) {
    setConvoy.addLast(methods);
  }

  private synchronized void synx277() {
    liveOutgrowth.prepareGushingNow(liveOutgrowth.produceGushingNow() + synX2039int);

    if (liveOutgrowth.produceGushingNow() == liveOutgrowth.goExecutiveHeight()) {
      liveOutgrowth.fixDepartThing(this.startPresentlyMarch());
      this.carriedMechanism.addLast(liveOutgrowth);
      liveOutgrowth = (null);
      this.drieRag = (synX2040boolean);
    }
  }

  private synchronized void synx278() {
    this.retainingFellyHours--;

    if (retainingFellyHours == synX2041int) {
      this.drieRag = (synX2042boolean);
      this.retainingFellyHours = (Yardmaster.MailAmount);
    }
  }

  private synchronized void synx279() {

    if (liveOutgrowth == null && !setConvoy.isEmpty()) {
      liveOutgrowth = (setConvoy.removeFirst());
      liveOutgrowth.orderedOriginateChance(this.startPresentlyMarch());
      burdenProcedure(liveOutgrowth);
    }
  }
}
