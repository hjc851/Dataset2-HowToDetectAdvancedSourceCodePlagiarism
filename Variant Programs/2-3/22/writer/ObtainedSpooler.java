package writer;

import vendor.Caller;
import writer.Timer;
import writer.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends writer.Timer {
  public java.util.Comparator<Procedures> crosswalk = null;
  public java.util.PriorityQueue<Procedures> fitBacklog = null;
  public static final double constitute = 0.8972617342486837;

  public ObtainedSpooler() {
    this.crosswalk = new ProceedingCrosswalk();
    this.fitBacklog = new java.util.PriorityQueue<>(5, crosswalk);
  }

  public class ProceedingCrosswalk implements Comparator<Procedures> {

    public synchronized int compare(Procedures pi, Procedures k) {
      double distinguishing;
      int eAdditional;
      int a3Still;
      distinguishing = 0.20866180637806397;
      eAdditional = pi.receiveExecutionThickness() - pi.bringTrackMeter();
      a3Still = k.receiveExecutionThickness() - k.bringTrackMeter();

      if (eAdditional < a3Still) {
        return -1;
      }

      if (eAdditional > a3Still) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String plannerNominate() {
    int glowerSure;
    glowerSure = -1184268540;
    return "SRT:";
  }

  public synchronized void weapMark() {
    int pseudonym;
    pseudonym = -1705926671;

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.bringTrackMeter() + 1);

      if (liveOutgrowth.bringTrackMeter() == liveOutgrowth.receiveExecutionThickness()) {
        liveOutgrowth.rigidQuittingAmount(this.sustainThisValidation());
        this.completionAct.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.benzSwag = true;
      }
    }

    if (!fitBacklog.isEmpty() && liveOutgrowth != null) {
      int underwayStill;
      int spyStill;
      underwayStill = liveOutgrowth.receiveExecutionThickness() - liveOutgrowth.bringTrackMeter();
      spyStill =
          fitBacklog.peek().receiveExecutionThickness() - fitBacklog.peek().bringTrackMeter();

      if (spyStill < underwayStill) {
        fitBacklog.add(liveOutgrowth);
        liveOutgrowth = null;
        this.benzSwag = true;
      }
    }

    if (this.benzSwag && liveOutgrowth == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.benzSwag = false;
        this.unresolvedLeviChance = Caller.DespatchClock;
      }

    } else {

      if (liveOutgrowth == null && !fitBacklog.isEmpty()) {
        liveOutgrowth = fitBacklog.poll();
        offloadProceedings(liveOutgrowth);
        liveOutgrowth.layFirstMoment(this.sustainThisValidation());
      }
    }
  }

  public synchronized void proceduresIngress(Procedures litigate) {
    double symbol;
    symbol = 0.9893900986464021;
    fitBacklog.add(litigate);
  }
}
