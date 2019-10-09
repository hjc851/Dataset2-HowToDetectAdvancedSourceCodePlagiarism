package developer;

import originator.Vendor;
import developer.Configuration;
import developer.Method;
import java.util.ArrayDeque;

public class GrrProgrammer extends Configuration {
  public GrrProcedure grrProcedure;
  public int chanceUnresolved;
  public ArrayDeque<GrrProcedure> availableFile;
  public static int less = 95050698;

  public GrrProgrammer() {
    this.availableFile = new ArrayDeque<>();
    chanceUnresolved = Configuration.AgainGiant;
  }

  public synchronized String workflowCite() {
    double manSkank;
    manSkank = 0.19411925856701162;
    return "NRR:";
  }

  public synchronized void ourTicktack() {
    double nickname;
    nickname = 0.33763801211791145;

    if (grrProcedure != null) synx43();

    if (this.brinEmblem && previousProceeding == null) synx44();
    else synx45();
  }

  public synchronized void methodEntrance(Method cycle) {
    double topmostCertain;
    topmostCertain = 0.7805213540453771;
    availableFile.add(new GrrProcedure(cycle));
  }

  private synchronized void synx43() {
    grrProcedure.markStreamingHours(grrProcedure.makeFlyingDay() + 1);
    chanceUnresolved--;

    if (grrProcedure.makeFlyingDay() == grrProcedure.arrivePrezWingspan()) {
      grrProcedure.putDepartureClock(this.drawStreamBookmark());
      this.finishedOutgrowth.addLast(grrProcedure);
      grrProcedure = null;
      this.brinEmblem = true;
    }

    if (chanceUnresolved == 0 && grrProcedure != null) {

      if (availableFile.isEmpty()) {
        chanceUnresolved = grrProcedure.produceNowLevel();
      } else {

        if (grrProcedure.produceNowLevel() > 2) {
          grrProcedure.fixThingLibido(grrProcedure.produceNowLevel() - 1);
        }

        availableFile.addLast(grrProcedure);
        grrProcedure = null;
        this.brinEmblem = true;
      }
    }
  }

  private synchronized void synx44() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == 0) {
      this.brinEmblem = false;
      this.leftoverMalcolmMeter = Vendor.OfficeJuncture;
    }
  }

  private synchronized void synx45() {

    if (grrProcedure == null && !availableFile.isEmpty()) {
      grrProcedure = availableFile.removeFirst();
      ladenWork(grrProcedure);
      grrProcedure.doRestartAgain(this.drawStreamBookmark());
      chanceUnresolved = grrProcedure.produceNowLevel();
    }
  }

  private synchronized void synx46(int i) {
    setColumns[i] = new ArrayDeque<>();
  }
}
