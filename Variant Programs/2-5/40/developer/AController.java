package developer;

import device.Mailer;
import developer.Workspace;
import developer.System;
import java.util.ArrayDeque;

public class AController extends developer.Workspace {
  private static final boolean synX2860boolean = false;
  private static final int synX2859int = 0;
  private static final boolean synX2858boolean = true;
  private static final int synX2857int = 0;
  private static final boolean synX2856boolean = true;
  private static final int synX2855int = 1;
  private static final String synX2854String = "RR:";
  public java.util.ArrayDeque<System> willingSpooler;
  public int hoursRetaining;

  public AController() {
    this.willingSpooler = (new java.util.ArrayDeque<>());
    hoursRetaining = (PeriodsGigantic);
  }

  public synchronized String workspaceForename() {
    return synX2854String;
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx550();

    if (this.ordeBeacon && latestOperation == null) synx551();
    else synx552();
  }

  public synchronized void negotiationsNew(System phase) {
    willingSpooler.addLast(phase);
  }

  private synchronized void synx550() {
    latestOperation.fixGoingThing(latestOperation.bringTrackMeter() + synX2855int);
    hoursRetaining--;

    if (latestOperation.bringTrackMeter() == latestOperation.catchRunnableScale()) {
      latestOperation.fixDepartThing(this.letAfootDials());
      this.submittedTechnologies.addLast(latestOperation);
      latestOperation = (null);
      this.ordeBeacon = (synX2856boolean);
    }

    if (hoursRetaining == synX2857int && latestOperation != null) {

      if (willingSpooler.isEmpty()) {
        hoursRetaining = (PeriodsGigantic);
      } else {
        willingSpooler.addLast(latestOperation);
        latestOperation = (null);
        this.ordeBeacon = (synX2858boolean);
      }
    }
  }

  private synchronized void synx551() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX2859int) {
      this.ordeBeacon = (synX2860boolean);
      this.unexpendedThmSentence = (Mailer.CompleteSentence);
    }
  }

  private synchronized void synx552() {

    if (latestOperation == null && !willingSpooler.isEmpty()) {
      latestOperation = (willingSpooler.removeFirst());
      weightFormalities(latestOperation);
      latestOperation.layFirstMoment(this.letAfootDials());
      hoursRetaining = (PeriodsGigantic);
    }
  }
}
