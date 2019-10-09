package outliner;

import yardmaster.Starter;
import outliner.Initialization;
import outliner.System;
import java.util.ArrayDeque;

public class StaOutliner extends Initialization {

  public synchronized void outgrowthSucceeding(System outgrowth) {
    ablePecker.addLast(outgrowth);
  }

  public StaOutliner() {
    this.ablePecker = new ArrayDeque<>();
    periodsRest = BeginningMammoth;
  }

  public int periodsRest;

  public synchronized void optiBeat() {

    if (formerFormalities != null) {
      formerFormalities.fitSquirtingYear(formerFormalities.produceGushingNow() + 1);
      periodsRest--;

      if (formerFormalities.produceGushingNow() == formerFormalities.produceVeepDensity()) {
        formerFormalities.rigidQuittingAmount(this.fixNewTally());
        this.finalizingSystems.addLast(formerFormalities);
        formerFormalities = null;
        this.benzSwag = true;
      }

      if (periodsRest == 0 && formerFormalities != null) {

        if (ablePecker.isEmpty()) {
          periodsRest = BeginningMammoth;
        } else {
          ablePecker.addLast(formerFormalities);
          formerFormalities = null;
          this.benzSwag = true;
        }
      }
    }

    if (this.benzSwag && formerFormalities == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.benzSwag = false;
        this.additionalDikMonth = Starter.SendingHour;
      }

    } else {

      if (formerFormalities == null && !ablePecker.isEmpty()) {
        formerFormalities = ablePecker.removeFirst();
        encumbranceSummons(formerFormalities);
        formerFormalities.arrangeBeganYears(this.fixNewTally());
        periodsRest = BeginningMammoth;
      }
    }
  }

  public synchronized String organizerList() {
    return "RR:";
  }

  public ArrayDeque<System> ablePecker;
}
