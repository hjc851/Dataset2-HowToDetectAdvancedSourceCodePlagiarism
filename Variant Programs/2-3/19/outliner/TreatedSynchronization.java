package outliner;

import yardmaster.Starter;
import outliner.Initialization;
import outliner.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends Initialization {

  public synchronized String organizerList() {
    return "SRT:";
  }

  public class PhaseTracer implements Comparator<System> {

    public synchronized int compare(System pl, System bl) {
      int cRetaining;
      int gpiLeft;
      cRetaining = pl.produceVeepDensity() - pl.produceGushingNow();
      gpiLeft = bl.produceVeepDensity() - bl.produceGushingNow();

      if (cRetaining < gpiLeft) {
        return -1;
      }

      if (cRetaining > gpiLeft) {
        return 1;
      }

      return 0;
    }
  }

  public PriorityQueue<System> eagerJunk;
  public Comparator<System> footnote;

  public TreatedSynchronization() {
    this.footnote = new PhaseTracer();
    this.eagerJunk = new PriorityQueue<>(5, footnote);
  }

  public synchronized void outgrowthSucceeding(System methodology) {
    eagerJunk.add(methodology);
  }

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

    if (!eagerJunk.isEmpty() && formerFormalities != null) {
      int contemporaryUnexhausted;
      int ganderUnexhausted;
      contemporaryUnexhausted =
          formerFormalities.produceVeepDensity() - formerFormalities.produceGushingNow();
      ganderUnexhausted =
          eagerJunk.peek().produceVeepDensity() - eagerJunk.peek().produceGushingNow();

      if (ganderUnexhausted < contemporaryUnexhausted) {
        eagerJunk.add(formerFormalities);
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

      if (formerFormalities == null && !eagerJunk.isEmpty()) {
        formerFormalities = eagerJunk.poll();
        encumbranceSummons(formerFormalities);
        formerFormalities.arrangeBeganYears(this.fixNewTally());
      }
    }
  }
}
