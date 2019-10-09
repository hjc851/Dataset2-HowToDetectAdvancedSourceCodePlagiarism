package outliner;

import yardmaster.Starter;
import outliner.Initialization;
import outliner.System;
import java.util.ArrayDeque;

public class SptTimer extends Initialization {

  public synchronized void optiBeat() {

    if (formerFormalities != null) {
      formerFormalities.fitSquirtingYear(formerFormalities.produceGushingNow() + 1);

      if (formerFormalities.produceGushingNow() == formerFormalities.produceVeepDensity()) {
        formerFormalities.rigidQuittingAmount(this.fixNewTally());
        this.finalizingSystems.addLast(formerFormalities);
        formerFormalities = null;
        this.benzSwag = true;
      }
    }

    if (this.benzSwag && formerFormalities == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.benzSwag = false;
        this.additionalDikMonth = Starter.SendingHour;
      }

    } else {

      if (formerFormalities == null && !willingSpooler.isEmpty()) {
        formerFormalities = willingSpooler.removeFirst();
        formerFormalities.arrangeBeganYears(this.fixNewTally());
        encumbranceSummons(formerFormalities);
      }
    }
  }

  public synchronized String organizerList() {
    return "FCFS:";
  }

  public ArrayDeque<System> willingSpooler;

  public synchronized void outgrowthSucceeding(System negotiations) {
    willingSpooler.addLast(negotiations);
  }

  public SptTimer() {
    this.willingSpooler = new ArrayDeque<>();
  }
}
