package developer;

import sender.Starter;
import developer.Writer;
import developer.Work;
import java.util.ArrayDeque;

public class LampsProgrammer extends developer.Writer {

  public LampsProgrammer() {
    this.availableFile = new java.util.ArrayDeque<>();
  }

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.dictatedTrackMeter(rifeSue.bringTrackMeter() + 1);

      if (rifeSue.bringTrackMeter() == rifeSue.generateHonchoFootprint()) {
        rifeSue.laidLeaveClip(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(rifeSue);
        rifeSue = null;
        this.malcolmIris = true;
      }
    }

    if (this.malcolmIris && rifeSue == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.malcolmIris = false;
        this.leavingBrinWhen = Starter.SentYears;
      }

    } else {

      if (rifeSue == null && !availableFile.isEmpty()) {
        rifeSue = availableFile.removeFirst();
        rifeSue.fixEarlyThing(this.receiveContemporaryTicktack());
        lodePhase(rifeSue);
      }
    }
  }

  public synchronized void proceedingOutbound(Work procedure) {
    availableFile.addLast(procedure);
  }

  public java.util.ArrayDeque<Work> availableFile;

  public synchronized String spoolerDistinguish() {
    return "FCFS:";
  }
}
