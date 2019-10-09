package planner;

import salesperson.Yardmaster;
import planner.Spooler;
import planner.Negotiations;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spooler {
  private static final boolean synX2017boolean = false;
  private static final int synX2016int = 0;
  private static final boolean synX2015boolean = true;
  private static final int synX2014int = 1;
  private static final int synX2013int = 2;
  private static final int synX2012int = 0;
  private static final boolean synX2011boolean = true;
  private static final int synX2010int = 1;
  private static final String synX2009String = "NRR:";
  public ArrayDeque<GrrProcedure> waitingList = null;
  public int yearsAnother = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.waitingList = (new ArrayDeque<>());
    yearsAnother = (Spooler.ClipQuantity);
  }

  public synchronized String spreadsheetKey() {
    return synX2009String;
  }

  public synchronized void nsoTic() {

    if (grrProcedure != null) synx263();

    if (this.drieRag && liveOutgrowth == null) synx264();
    else synx265();
  }

  public synchronized void appendageEntering(Negotiations phase) {
    waitingList.add(new GrrProcedure(phase));
  }

  private synchronized void synx263() {
    grrProcedure.prepareGushingNow(grrProcedure.produceGushingNow() + synX2010int);
    yearsAnother--;

    if (grrProcedure.produceGushingNow() == grrProcedure.goExecutiveHeight()) {
      grrProcedure.fixDepartThing(this.startPresentlyMarch());
      this.carriedMechanism.addLast(grrProcedure);
      grrProcedure = (null);
      this.drieRag = (synX2011boolean);
    }

    if (yearsAnother == synX2012int && grrProcedure != null) {

      if (waitingList.isEmpty()) {
        yearsAnother = (grrProcedure.produceNowLevel());
      } else {

        if (grrProcedure.produceNowLevel() > synX2013int) {
          grrProcedure.fitYearSurface(grrProcedure.produceNowLevel() - synX2014int);
        }

        waitingList.addLast(grrProcedure);
        grrProcedure = (null);
        this.drieRag = (synX2015boolean);
      }
    }
  }

  private synchronized void synx264() {
    this.retainingFellyHours--;

    if (retainingFellyHours == synX2016int) {
      this.drieRag = (synX2017boolean);
      this.retainingFellyHours = (Yardmaster.MailAmount);
    }
  }

  private synchronized void synx265() {

    if (grrProcedure == null && !waitingList.isEmpty()) {
      grrProcedure = (waitingList.removeFirst());
      burdenProcedure(grrProcedure);
      grrProcedure.orderedOriginateChance(this.startPresentlyMarch());
      yearsAnother = (grrProcedure.produceNowLevel());
    }
  }

  private synchronized void synx266(int i) {
    intelligentFronts[i] = (new ArrayDeque<>());
  }
}
