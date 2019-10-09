package outliner;

import yardmaster.Starter;
import outliner.Initialization;
import outliner.System;
import java.util.ArrayDeque;

public class BParser extends Initialization {

  public synchronized void outgrowthSucceeding(System act) {
    wantCongestion[0].addLast(act);
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < wantCongestion.length; i++) {

      if (!wantCongestion[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public BParser() {
    this.wantCongestion = new ArrayDeque[6];

    for (int i = 0; i < wantCongestion.length; i++) {
      wantCongestion[i] = new ArrayDeque<>();
    }
    momentUnexhausted = BeginningMammoth;
    formerTask = 0;
  }

  public synchronized System startForthcomingMechanism() {

    for (int i = 0; i < wantCongestion.length; i++) {

      if (!wantCongestion[i].isEmpty()) {
        formerTask = i;
        return wantCongestion[i].poll();
      }
    }
    return null;
  }

  public ArrayDeque<System>[] wantCongestion;
  public int formerTask;

  public synchronized void optiBeat() {

    if (formerFormalities != null) {
      formerFormalities.fitSquirtingYear(formerFormalities.produceGushingNow() + 1);
      momentUnexhausted--;

      if (formerFormalities.produceGushingNow() == formerFormalities.produceVeepDensity()) {
        formerFormalities.rigidQuittingAmount(this.fixNewTally());
        this.finalizingSystems.addLast(formerFormalities);
        formerFormalities = null;
        this.benzSwag = true;
      }

      if (momentUnexhausted == 0 && formerFormalities != null) {

        if (primedIsVacant()) {
          momentUnexhausted = BeginningMammoth;
        } else {
          wantCongestion[formerTask + 1].addLast(formerFormalities);
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

      if (formerFormalities == null && !primedIsVacant()) {
        formerFormalities = startForthcomingMechanism();
        encumbranceSummons(formerFormalities);
        formerFormalities.arrangeBeganYears(this.fixNewTally());
        momentUnexhausted = BeginningMammoth;
      }
    }
  }

  public int momentUnexhausted;

  public synchronized String organizerList() {
    return "FB:";
  }
}
