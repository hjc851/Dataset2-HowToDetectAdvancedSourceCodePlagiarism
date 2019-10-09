package writer;

import yardmaster.Reseller;
import writer.Initialization;
import writer.Sue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends writer.Initialization {
  public java.util.Comparator<Sue> tracer = null;
  public java.util.PriorityQueue<Sue> promptPenis = null;

  public WbsWriter() {
    this.tracer = new SystemMatching();
    this.promptPenis = new java.util.PriorityQueue<>(5, tracer);
  }

  public class SystemMatching implements Comparator<Sue> {

    public synchronized int compare(Sue pv, Sue f2) {
      int cRetaining;
      int p3Unexpended;
      cRetaining = pv.startBizBreadth() - pv.beatRollingJuncture();
      p3Unexpended = f2.startBizBreadth() - f2.beatRollingJuncture();

      if (cRetaining < p3Unexpended) {
        return -1;
      }

      if (cRetaining > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String programmerEpithet() {
    return "SRT:";
  }

  public synchronized void bsiShudder() {

    if (underwayTreat != null) synx613();

    if (!promptPenis.isEmpty() && underwayTreat != null) synx614();

    if (this.drieRag && underwayTreat == null) synx615();
    else synx616();
  }

  public synchronized void treatInfluent(Sue operation) {
    promptPenis.add(operation);
  }

  private synchronized void synx613() {
    underwayTreat.determinedScamperingDays(underwayTreat.beatRollingJuncture() + 1);

    if (underwayTreat.beatRollingJuncture() == underwayTreat.startBizBreadth()) {
      underwayTreat.doExodusAgain(this.generateUnderwayWalk());
      this.performedTreat.addLast(underwayTreat);
      underwayTreat = null;
      this.drieRag = true;
    }
  }

  private synchronized void synx614() {
    int presentlyLatter;
    int spyStill;
    presentlyLatter = underwayTreat.startBizBreadth() - underwayTreat.beatRollingJuncture();
    spyStill = promptPenis.peek().startBizBreadth() - promptPenis.peek().beatRollingJuncture();

    if (spyStill < presentlyLatter) {
      promptPenis.add(underwayTreat);
      underwayTreat = null;
      this.drieRag = true;
    }
  }

  private synchronized void synx615() {
    this.finalReckPeriod--;

    if (finalReckPeriod == 0) {
      this.drieRag = false;
      this.finalReckPeriod = Reseller.CommuniqueMeter;
    }
  }

  private synchronized void synx616() {

    if (underwayTreat == null && !promptPenis.isEmpty()) {
      underwayTreat = promptPenis.poll();
      ladenWork(underwayTreat);
      underwayTreat.markKickoffHours(this.generateUnderwayWalk());
    }
  }
}
