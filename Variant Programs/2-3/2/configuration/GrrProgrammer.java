package configuration;

import limiter.Exporter;
import configuration.Server;
import configuration.Methodology;
import java.util.ArrayDeque;

public class GrrProgrammer extends Server {

  public synchronized void mechanismsArrive(Methodology procedures) {
    happyStopper.add(new GrrProcedure(procedures));
  }

  public synchronized String workspaceForename() {
    return "NRR:";
  }

  public ArrayDeque<GrrProcedure> happyStopper = null;
  public int chanceUnresolved = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.happyStopper = new ArrayDeque<>();
    chanceUnresolved = Server.ClockAmount;
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.adjustFleeingMonth(grrProcedure.fixFunctionalChance() + 1);
      chanceUnresolved--;

      if (grrProcedure.fixFunctionalChance() == grrProcedure.drawBossScope()) {
        grrProcedure.dictatedLossMeter(this.driveContinuingVibrate());
        this.submittedTechnologies.addLast(grrProcedure);
        grrProcedure = null;
        this.mbeMarker = true;
      }

      if (chanceUnresolved == 0 && grrProcedure != null) {

        if (happyStopper.isEmpty()) {
          chanceUnresolved = grrProcedure.catchWhenValue();
        } else {

          if (grrProcedure.catchWhenValue() > 2) {
            grrProcedure.doAgainGiant(grrProcedure.catchWhenValue() - 1);
          }

          happyStopper.addLast(grrProcedure);
          grrProcedure = null;
          this.mbeMarker = true;
        }
      }
    }

    if (this.mbeMarker && topicalAppendage == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.mbeMarker = false;
        this.otherDblClip = Exporter.MailAmount;
      }

    } else {

      if (grrProcedure == null && !happyStopper.isEmpty()) {
        grrProcedure = happyStopper.removeFirst();
        ladingSue(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.driveContinuingVibrate());
        chanceUnresolved = grrProcedure.catchWhenValue();
      }
    }
  }
}
