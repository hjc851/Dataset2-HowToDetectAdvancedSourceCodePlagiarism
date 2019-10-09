package configuration;

import limiter.Exporter;
import configuration.Server;
import configuration.Methodology;
import java.util.ArrayDeque;

public class RailCompiler extends Server {
  public int beginningUnsold = 0;
  public ArrayDeque<Methodology> availableFile = null;

  public synchronized void bpsRetick() {

    if (topicalAppendage != null) {
      topicalAppendage.adjustFleeingMonth(topicalAppendage.fixFunctionalChance() + 1);
      beginningUnsold--;

      if (topicalAppendage.fixFunctionalChance() == topicalAppendage.drawBossScope()) {
        topicalAppendage.dictatedLossMeter(this.driveContinuingVibrate());
        this.submittedTechnologies.addLast(topicalAppendage);
        topicalAppendage = null;
        this.mbeMarker = true;
      }

      if (beginningUnsold == 0 && topicalAppendage != null) {

        if (availableFile.isEmpty()) {
          beginningUnsold = ClockAmount;
        } else {
          availableFile.addLast(topicalAppendage);
          topicalAppendage = null;
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

      if (topicalAppendage == null && !availableFile.isEmpty()) {
        topicalAppendage = availableFile.removeFirst();
        ladingSue(topicalAppendage);
        topicalAppendage.dictatedCommenceMeter(this.driveContinuingVibrate());
        beginningUnsold = ClockAmount;
      }
    }
  }

  public synchronized String workspaceForename() {
    return "RR:";
  }

  public synchronized void mechanismsArrive(Methodology system) {
    availableFile.addLast(system);
  }

  public RailCompiler() {
    this.availableFile = new ArrayDeque<>();
    beginningUnsold = ClockAmount;
  }
}
