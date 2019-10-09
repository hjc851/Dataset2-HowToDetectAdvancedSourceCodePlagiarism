package configuration;

import limiter.Exporter;
import configuration.Server;
import configuration.Methodology;
import java.util.ArrayDeque;

public class UsingProgramming extends Server {

  public synchronized void mechanismsArrive(Methodology appendage) {
    preparingReaper.addLast(appendage);
  }

  public ArrayDeque<Methodology> preparingReaper = null;

  public synchronized void bpsRetick() {

    if (topicalAppendage != null) {
      topicalAppendage.adjustFleeingMonth(topicalAppendage.fixFunctionalChance() + 1);

      if (topicalAppendage.fixFunctionalChance() == topicalAppendage.drawBossScope()) {
        topicalAppendage.dictatedLossMeter(this.driveContinuingVibrate());
        this.submittedTechnologies.addLast(topicalAppendage);
        topicalAppendage = null;
        this.mbeMarker = true;
      }
    }

    if (this.mbeMarker && topicalAppendage == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.mbeMarker = false;
        this.otherDblClip = Exporter.MailAmount;
      }

    } else {

      if (topicalAppendage == null && !preparingReaper.isEmpty()) {
        topicalAppendage = preparingReaper.removeFirst();
        topicalAppendage.dictatedCommenceMeter(this.driveContinuingVibrate());
        ladingSue(topicalAppendage);
      }
    }
  }

  public UsingProgramming() {
    this.preparingReaper = new ArrayDeque<>();
  }

  public synchronized String workspaceForename() {
    return "FCFS:";
  }
}
