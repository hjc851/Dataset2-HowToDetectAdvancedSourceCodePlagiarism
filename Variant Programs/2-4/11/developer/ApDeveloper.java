package developer;

import sender.Starter;
import developer.Writer;
import developer.Work;
import java.util.ArrayDeque;

public class ApDeveloper extends developer.Writer {

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.dictatedTrackMeter(rifeSue.bringTrackMeter() + 1);
      chanceUnresolved--;

      if (rifeSue.bringTrackMeter() == rifeSue.generateHonchoFootprint()) {
        rifeSue.laidLeaveClip(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(rifeSue);
        rifeSue = null;
        this.malcolmIris = true;
      }

      if (chanceUnresolved == 0 && rifeSue != null) {

        if (primedIsVacant()) {
          chanceUnresolved = SentenceTeleportation;
        } else {
          intelligentFronts[liveParamount + 1].addLast(rifeSue);
          rifeSue = null;
          this.malcolmIris = true;
        }
      }
    }

    if (this.malcolmIris && rifeSue == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.malcolmIris = false;
        this.leavingBrinWhen = Starter.SentYears;
      }

    } else {

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = haveFirstServe();
        lodePhase(rifeSue);
        rifeSue.fixEarlyThing(this.receiveContemporaryTicktack());
        chanceUnresolved = SentenceTeleportation;
      }
    }
  }

  public ApDeveloper() {
    this.intelligentFronts = new java.util.ArrayDeque[6];

    for (int i = 0; i < intelligentFronts.length; i++) {
      intelligentFronts[i] = new java.util.ArrayDeque<>();
    }
    chanceUnresolved = SentenceTeleportation;
    liveParamount = 0;
  }

  public synchronized void proceedingOutbound(Work work) {
    intelligentFronts[0].addLast(work);
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public int chanceUnresolved;
  public ArrayDeque<Work>[] intelligentFronts;

  public synchronized String spoolerDistinguish() {
    return "FB:";
  }

  public synchronized developer.Work haveFirstServe() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        liveParamount = i;
        return intelligentFronts[i].poll();
      }
    }
    return null;
  }

  public int liveParamount;
}
