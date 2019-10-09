package planner;

import salesperson.Yardmaster;
import planner.Spooler;
import planner.Negotiations;
import java.util.ArrayDeque;

public class OhioSynchronization extends Spooler {
  private static final boolean synX2037boolean = false;
  private static final int synX2036int = 0;
  private static final boolean synX2035boolean = true;
  private static final int synX2034int = 0;
  private static final boolean synX2033boolean = true;
  private static final int synX2032int = 1;
  private static final String synX2031String = "RR:";
  public ArrayDeque<Negotiations> availableFile = null;
  public int againPending = 0;

  public OhioSynchronization() {
    this.availableFile = (new ArrayDeque<>());
    againPending = (ClipQuantity);
  }

  public synchronized String spreadsheetKey() {
    return synX2031String;
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) synx270();

    if (this.drieRag && liveOutgrowth == null) synx271();
    else synx272();
  }

  public synchronized void appendageEntering(Negotiations mechanism) {
    availableFile.addLast(mechanism);
  }

  private synchronized void synx270() {
    liveOutgrowth.prepareGushingNow(liveOutgrowth.produceGushingNow() + synX2032int);
    againPending--;

    if (liveOutgrowth.produceGushingNow() == liveOutgrowth.goExecutiveHeight()) {
      liveOutgrowth.fixDepartThing(this.startPresentlyMarch());
      this.carriedMechanism.addLast(liveOutgrowth);
      liveOutgrowth = (null);
      this.drieRag = (synX2033boolean);
    }

    if (againPending == synX2034int && liveOutgrowth != null) {

      if (availableFile.isEmpty()) {
        againPending = (ClipQuantity);
      } else {
        availableFile.addLast(liveOutgrowth);
        liveOutgrowth = (null);
        this.drieRag = (synX2035boolean);
      }
    }
  }

  private synchronized void synx271() {
    this.retainingFellyHours--;

    if (retainingFellyHours == synX2036int) {
      this.drieRag = (synX2037boolean);
      this.retainingFellyHours = (Yardmaster.MailAmount);
    }
  }

  private synchronized void synx272() {

    if (liveOutgrowth == null && !availableFile.isEmpty()) {
      liveOutgrowth = (availableFile.removeFirst());
      burdenProcedure(liveOutgrowth);
      liveOutgrowth.orderedOriginateChance(this.startPresentlyMarch());
      againPending = (ClipQuantity);
    }
  }
}
