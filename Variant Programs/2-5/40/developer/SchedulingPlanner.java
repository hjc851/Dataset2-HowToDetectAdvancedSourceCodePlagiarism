package developer;

import device.Mailer;
import developer.Workspace;
import developer.System;
import java.util.ArrayDeque;

public class SchedulingPlanner extends developer.Workspace {
  private static final boolean synX2865boolean = false;
  private static final int synX2864int = 0;
  private static final boolean synX2863boolean = true;
  private static final int synX2862int = 1;
  private static final String synX2861String = "FCFS:";
  public java.util.ArrayDeque<System> cookCue;

  public SchedulingPlanner() {
    this.cookCue = (new java.util.ArrayDeque<>());
  }

  public synchronized String workspaceForename() {
    return synX2861String;
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx557();

    if (this.ordeBeacon && latestOperation == null) synx558();
    else synx559();
  }

  public synchronized void negotiationsNew(System proceeding) {
    cookCue.addLast(proceeding);
  }

  private synchronized void synx557() {
    latestOperation.fixGoingThing(latestOperation.bringTrackMeter() + synX2862int);

    if (latestOperation.bringTrackMeter() == latestOperation.catchRunnableScale()) {
      latestOperation.fixDepartThing(this.letAfootDials());
      this.submittedTechnologies.addLast(latestOperation);
      latestOperation = (null);
      this.ordeBeacon = (synX2863boolean);
    }
  }

  private synchronized void synx558() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX2864int) {
      this.ordeBeacon = (synX2865boolean);
      this.unexpendedThmSentence = (Mailer.CompleteSentence);
    }
  }

  private synchronized void synx559() {

    if (latestOperation == null && !cookCue.isEmpty()) {
      latestOperation = (cookCue.removeFirst());
      latestOperation.layFirstMoment(this.letAfootDials());
      weightFormalities(latestOperation);
    }
  }
}
