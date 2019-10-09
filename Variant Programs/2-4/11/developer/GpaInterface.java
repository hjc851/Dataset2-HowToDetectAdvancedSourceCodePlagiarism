package developer;

import sender.Starter;
import developer.Writer;
import developer.Work;
import java.util.ArrayDeque;

public class GpaInterface extends developer.Writer {

  public synchronized void proceedingOutbound(Work cycle) {
    fixJumping.addLast(cycle);
  }

  public java.util.ArrayDeque<Work> fixJumping;
  public int sentenceUnexpended;

  public synchronized String spoolerDistinguish() {
    return "RR:";
  }

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.dictatedTrackMeter(rifeSue.bringTrackMeter() + 1);
      sentenceUnexpended--;

      if (rifeSue.bringTrackMeter() == rifeSue.generateHonchoFootprint()) {
        rifeSue.laidLeaveClip(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(rifeSue);
        rifeSue = null;
        this.malcolmIris = true;
      }

      if (sentenceUnexpended == 0 && rifeSue != null) {

        if (fixJumping.isEmpty()) {
          sentenceUnexpended = SentenceTeleportation;
        } else {
          fixJumping.addLast(rifeSue);
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

      if (rifeSue == null && !fixJumping.isEmpty()) {
        rifeSue = fixJumping.removeFirst();
        lodePhase(rifeSue);
        rifeSue.fixEarlyThing(this.receiveContemporaryTicktack());
        sentenceUnexpended = SentenceTeleportation;
      }
    }
  }

  public GpaInterface() {
    this.fixJumping = new java.util.ArrayDeque<>();
    sentenceUnexpended = SentenceTeleportation;
  }
}
