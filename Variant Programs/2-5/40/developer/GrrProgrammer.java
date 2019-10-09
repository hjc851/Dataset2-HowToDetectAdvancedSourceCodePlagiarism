package developer;

import device.Mailer;
import developer.Workspace;
import developer.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends developer.Workspace {
  private static final boolean synX2840boolean = false;
  private static final int synX2839int = 0;
  private static final boolean synX2838boolean = true;
  private static final int synX2837int = 1;
  private static final int synX2836int = 2;
  private static final int synX2835int = 0;
  private static final boolean synX2834boolean = true;
  private static final int synX2833int = 1;
  private static final String synX2832String = "NRR:";
  public java.util.ArrayDeque<GrrProcedure> setConvoy;
  public int yearStill;
  public developer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.setConvoy = (new java.util.ArrayDeque<>());
    yearStill = (Workspace.PeriodsGigantic);
  }

  public synchronized String workspaceForename() {
    return synX2832String;
  }

  public synchronized void nbsClick() {

    if (grrProcedure != null) synx543();

    if (this.ordeBeacon && latestOperation == null) synx544();
    else synx545();
  }

  public synchronized void negotiationsNew(System outgrowth) {
    setConvoy.add(new developer.GrrProcedure(outgrowth));
  }

  private synchronized void synx543() {
    grrProcedure.fixGoingThing(grrProcedure.bringTrackMeter() + synX2833int);
    yearStill--;

    if (grrProcedure.bringTrackMeter() == grrProcedure.catchRunnableScale()) {
      grrProcedure.fixDepartThing(this.letAfootDials());
      this.submittedTechnologies.addLast(grrProcedure);
      grrProcedure = (null);
      this.ordeBeacon = (synX2834boolean);
    }

    if (yearStill == synX2835int && grrProcedure != null) {

      if (setConvoy.isEmpty()) {
        yearStill = (grrProcedure.generateYearSurface());
      } else {

        if (grrProcedure.generateYearSurface() > synX2836int) {
          grrProcedure.situatedMinutesEnormous(grrProcedure.generateYearSurface() - synX2837int);
        }

        setConvoy.addLast(grrProcedure);
        grrProcedure = (null);
        this.ordeBeacon = (synX2838boolean);
      }
    }
  }

  private synchronized void synx544() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX2839int) {
      this.ordeBeacon = (synX2840boolean);
      this.unexpendedThmSentence = (Mailer.CompleteSentence);
    }
  }

  private synchronized void synx545() {

    if (grrProcedure == null && !setConvoy.isEmpty()) {
      grrProcedure = (setConvoy.removeFirst());
      weightFormalities(grrProcedure);
      grrProcedure.layFirstMoment(this.letAfootDials());
      yearStill = (grrProcedure.generateYearSurface());
    }
  }

  private synchronized void synx546(int i) {
    ableThrongs[i] = (new java.util.ArrayDeque<>());
  }
}
