package developer;

import device.Mailer;
import developer.Workspace;
import developer.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends developer.Workspace {
  public java.util.PriorityQueue<System> happyStopper;
  public java.util.Comparator<System> comparison;

  public DefinedCompiler() {
    this.comparison = (new ProceedingsChlorambucil());
    this.happyStopper = (new java.util.PriorityQueue<>(5, comparison));
  }

  public class ProceedingsChlorambucil implements Comparator<System> {

    public synchronized int compare(System b, System p4) {
      int plLingering = b.catchRunnableScale() - b.bringTrackMeter();
      int p1Leftover = p4.catchRunnableScale() - p4.bringTrackMeter();

      if (plLingering < p1Leftover) {
        return -1;
      }

      if (plLingering > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    return "SRT:";
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx553();

    if (!happyStopper.isEmpty() && latestOperation != null) synx554();

    if (this.ordeBeacon && latestOperation == null) synx555();
    else synx556();
  }

  public synchronized void negotiationsNew(System litigate) {
    happyStopper.add(litigate);
  }

  private synchronized void synx553() {
    latestOperation.fixGoingThing(latestOperation.bringTrackMeter() + 1);

    if (latestOperation.bringTrackMeter() == latestOperation.catchRunnableScale()) {
      latestOperation.fixDepartThing(this.letAfootDials());
      this.submittedTechnologies.addLast(latestOperation);
      latestOperation = (null);
      this.ordeBeacon = (true);
    }
  }

  private synchronized void synx554() {
    int circulatingRest = latestOperation.catchRunnableScale() - latestOperation.bringTrackMeter();
    int sneakPending =
        happyStopper.peek().catchRunnableScale() - happyStopper.peek().bringTrackMeter();

    if (sneakPending < circulatingRest) {
      happyStopper.add(latestOperation);
      latestOperation = (null);
      this.ordeBeacon = (true);
    }
  }

  private synchronized void synx555() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == 0) {
      this.ordeBeacon = (false);
      this.unexpendedThmSentence = (Mailer.CompleteSentence);
    }
  }

  private synchronized void synx556() {

    if (latestOperation == null && !happyStopper.isEmpty()) {
      latestOperation = (happyStopper.poll());
      weightFormalities(latestOperation);
      latestOperation.layFirstMoment(this.letAfootDials());
    }
  }
}
