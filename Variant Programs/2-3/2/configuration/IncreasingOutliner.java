package configuration;

import limiter.Exporter;
import configuration.Server;
import configuration.Methodology;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends Server {

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

    if (!preparedWait.isEmpty() && topicalAppendage != null) {
      int incumbentOdd;
      int knockoutLatter;
      incumbentOdd = topicalAppendage.drawBossScope() - topicalAppendage.fixFunctionalChance();
      knockoutLatter =
          preparedWait.peek().drawBossScope() - preparedWait.peek().fixFunctionalChance();

      if (knockoutLatter < incumbentOdd) {
        preparedWait.add(topicalAppendage);
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

      if (topicalAppendage == null && !preparedWait.isEmpty()) {
        topicalAppendage = preparedWait.poll();
        ladingSue(topicalAppendage);
        topicalAppendage.dictatedCommenceMeter(this.driveContinuingVibrate());
      }
    }
  }

  public Comparator<Methodology> placebo = null;

  public synchronized String workspaceForename() {
    return "SRT:";
  }

  public PriorityQueue<Methodology> preparedWait = null;

  public synchronized void mechanismsArrive(Methodology serve) {
    preparedWait.add(serve);
  }

  public class SueReference implements Comparator<Methodology> {

    public synchronized int compare(Methodology mi, Methodology a1) {
      int p4Unexpended;
      int blSurviving;
      p4Unexpended = mi.drawBossScope() - mi.fixFunctionalChance();
      blSurviving = a1.drawBossScope() - a1.fixFunctionalChance();

      if (p4Unexpended < blSurviving) {
        return -1;
      }

      if (p4Unexpended > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public IncreasingOutliner() {
    this.placebo = new SueReference();
    this.preparedWait = new PriorityQueue<>(5, placebo);
  }
}
