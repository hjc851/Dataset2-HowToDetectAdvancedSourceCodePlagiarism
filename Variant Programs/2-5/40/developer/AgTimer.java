package developer;

import device.Mailer;
import developer.Workspace;
import developer.System;
import java.util.ArrayDeque;

public class AgTimer extends developer.Workspace {
  private static final boolean synX2853boolean = false;
  private static final int synX2852int = 0;
  private static final boolean synX2851boolean = true;
  private static final int synX2850int = 1;
  private static final int synX2849int = 0;
  private static final boolean synX2848boolean = true;
  private static final int synX2847int = 1;
  private static final int synX2846int = 0;
  private static final String synX2845String = "FB:";
  private static final boolean synX2844boolean = true;
  private static final boolean synX2843boolean = false;
  private static final int synX2842int = 0;
  private static final int synX2841int = 0;
  public ArrayDeque<System>[] ableThrongs;
  public int daysRemainder;
  public int prevailingPrecedence;

  public AgTimer() {
    this.ableThrongs = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < ableThrongs.length; i++) synx546(i);
    daysRemainder = (PeriodsGigantic);
    prevailingPrecedence = (0);
  }

  public synchronized developer.System letAheadSummons() {

    for (int i = synX2841int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        prevailingPrecedence = (i);
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = synX2842int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return synX2843boolean;
      }
    }
    return synX2844boolean;
  }

  public synchronized String workspaceForename() {
    return synX2845String;
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx547();

    if (this.ordeBeacon && latestOperation == null) synx548();
    else synx549();
  }

  public synchronized void negotiationsNew(System sue) {
    ableThrongs[synX2846int].addLast(sue);
  }

  private synchronized void synx547() {
    latestOperation.fixGoingThing(latestOperation.bringTrackMeter() + synX2847int);
    daysRemainder--;

    if (latestOperation.bringTrackMeter() == latestOperation.catchRunnableScale()) {
      latestOperation.fixDepartThing(this.letAfootDials());
      this.submittedTechnologies.addLast(latestOperation);
      latestOperation = (null);
      this.ordeBeacon = (synX2848boolean);
    }

    if (daysRemainder == synX2849int && latestOperation != null) {

      if (primedIsVacant()) {
        daysRemainder = (PeriodsGigantic);
      } else {
        ableThrongs[prevailingPrecedence + synX2850int].addLast(latestOperation);
        latestOperation = (null);
        this.ordeBeacon = (synX2851boolean);
      }
    }
  }

  private synchronized void synx548() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX2852int) {
      this.ordeBeacon = (synX2853boolean);
      this.unexpendedThmSentence = (Mailer.CompleteSentence);
    }
  }

  private synchronized void synx549() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = (letAheadSummons());
      weightFormalities(latestOperation);
      latestOperation.layFirstMoment(this.letAfootDials());
      daysRemainder = (PeriodsGigantic);
    }
  }
}
