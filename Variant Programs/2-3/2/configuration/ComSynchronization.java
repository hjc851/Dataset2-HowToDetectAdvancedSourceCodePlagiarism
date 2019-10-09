package configuration;

import limiter.Exporter;
import configuration.Server;
import configuration.Methodology;
import java.util.ArrayDeque;

public class ComSynchronization extends Server {
  public int continuingPressing = 0;

  public ComSynchronization() {
    this.preparesTrollies = new ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) {
      preparesTrollies[i] = new ArrayDeque<>();
    }
    whenLeaving = ClockAmount;
    continuingPressing = 0;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void bpsRetick() {

    if (topicalAppendage != null) {
      topicalAppendage.adjustFleeingMonth(topicalAppendage.fixFunctionalChance() + 1);
      whenLeaving--;

      if (topicalAppendage.fixFunctionalChance() == topicalAppendage.drawBossScope()) {
        topicalAppendage.dictatedLossMeter(this.driveContinuingVibrate());
        this.submittedTechnologies.addLast(topicalAppendage);
        topicalAppendage = null;
        this.mbeMarker = true;
      }

      if (whenLeaving == 0 && topicalAppendage != null) {

        if (primedIsVacant()) {
          whenLeaving = ClockAmount;
        } else {
          preparesTrollies[continuingPressing + 1].addLast(topicalAppendage);
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

      if (topicalAppendage == null && !primedIsVacant()) {
        topicalAppendage = generateComingTreat();
        ladingSue(topicalAppendage);
        topicalAppendage.dictatedCommenceMeter(this.driveContinuingVibrate());
        whenLeaving = ClockAmount;
      }
    }
  }

  public synchronized Methodology generateComingTreat() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        continuingPressing = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  public synchronized String workspaceForename() {
    return "FB:";
  }

  public int whenLeaving = 0;
  public ArrayDeque<Methodology>[] preparesTrollies = null;

  public synchronized void mechanismsArrive(Methodology phase) {
    preparesTrollies[0].addLast(phase);
  }
}
