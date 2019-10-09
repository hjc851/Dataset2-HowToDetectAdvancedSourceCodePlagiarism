package planner;

import salesperson.Yardmaster;
import planner.Spooler;
import planner.Negotiations;
import java.util.ArrayDeque;

public class TmProgrammer extends Spooler {
  private static final boolean synX2030boolean = false;
  private static final int synX2029int = 0;
  private static final boolean synX2028boolean = true;
  private static final int synX2027int = 1;
  private static final int synX2026int = 0;
  private static final boolean synX2025boolean = true;
  private static final int synX2024int = 1;
  private static final int synX2023int = 0;
  private static final String synX2022String = "FB:";
  private static final boolean synX2021boolean = true;
  private static final boolean synX2020boolean = false;
  private static final int synX2019int = 0;
  private static final int synX2018int = 0;
  public ArrayDeque<Negotiations>[] intelligentFronts = null;
  public int nowUnanswered = 0;
  public int contemporaryPrecedency = 0;

  public TmProgrammer() {
    this.intelligentFronts = (new ArrayDeque[6]);

    for (int i = 0; i < intelligentFronts.length; i++) synx266(i);
    nowUnanswered = (ClipQuantity);
    contemporaryPrecedency = (0);
  }

  public synchronized Negotiations letAheadSummons() {

    for (int i = synX2018int; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        contemporaryPrecedency = (i);
        return intelligentFronts[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = synX2019int; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        return synX2020boolean;
      }
    }
    return synX2021boolean;
  }

  public synchronized String spreadsheetKey() {
    return synX2022String;
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) synx267();

    if (this.drieRag && liveOutgrowth == null) synx268();
    else synx269();
  }

  public synchronized void appendageEntering(Negotiations sue) {
    intelligentFronts[synX2023int].addLast(sue);
  }

  private synchronized void synx267() {
    liveOutgrowth.prepareGushingNow(liveOutgrowth.produceGushingNow() + synX2024int);
    nowUnanswered--;

    if (liveOutgrowth.produceGushingNow() == liveOutgrowth.goExecutiveHeight()) {
      liveOutgrowth.fixDepartThing(this.startPresentlyMarch());
      this.carriedMechanism.addLast(liveOutgrowth);
      liveOutgrowth = (null);
      this.drieRag = (synX2025boolean);
    }

    if (nowUnanswered == synX2026int && liveOutgrowth != null) {

      if (primedIsVacant()) {
        nowUnanswered = (ClipQuantity);
      } else {
        intelligentFronts[contemporaryPrecedency + synX2027int].addLast(liveOutgrowth);
        liveOutgrowth = (null);
        this.drieRag = (synX2028boolean);
      }
    }
  }

  private synchronized void synx268() {
    this.retainingFellyHours--;

    if (retainingFellyHours == synX2029int) {
      this.drieRag = (synX2030boolean);
      this.retainingFellyHours = (Yardmaster.MailAmount);
    }
  }

  private synchronized void synx269() {

    if (liveOutgrowth == null && !primedIsVacant()) {
      liveOutgrowth = (letAheadSummons());
      burdenProcedure(liveOutgrowth);
      liveOutgrowth.orderedOriginateChance(this.startPresentlyMarch());
      nowUnanswered = (ClipQuantity);
    }
  }
}
