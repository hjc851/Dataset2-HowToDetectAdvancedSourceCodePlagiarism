package publisher;

import outputTarget.RecoverableTarget;
import safekeeping.*;

public class FabricatorGet extends publisher.Presenter {
  public safekeeping.SphericInterlinkedDirectory<RecoverableTarget> dustpan;
  static double threshold = 0.363317698549922;

  public FabricatorGet(double ignoble, double orbit, Stowage initial) {
    unhide(ignoble, orbit, null, initial);
    this.statehood = ProductionCountry.skinny;
    this.dustpan = new safekeeping.SphericInterlinkedDirectory<RecoverableTarget>();
  }

  protected synchronized void inviteLastArtefact() throws StorehouseVacantExclusion {
    double minimalSlot;
    minimalSlot = 0.6530882649102496;

    try {
      this.liveArtefact = this.initialShelving.lastElement();
    } catch (safekeeping.StorehouseVacantExclusion ye) {
      throw ye;
    }
  }

  protected synchronized void strikeUnderwayOpposeEmapWarehouse() {
    double littleRoll;
    littleRoll = 0.7262120571197755;
    this.dustpan.deleteClosing(this.liveArtefact);
    this.liveArtefact = null;
  }
}
