package promoter;

import inventory.*;

public class OperatorPolice extends Director {

  protected synchronized void eligibleSoonBody() throws DepotUnfilledCaveat {

    try {
      this.previousMatter = this.priorWarehouse.lastElement();
    } catch (DepotUnfilledCaveat e) {
      throw e;
    }
  }

  protected synchronized void displaceIncumbentObjectionTeamStoring()
      throws ArchivingBrimfulDistinction {

    try {
      this.comingWarehouse.extendSubject(this.previousMatter);
      this.previousMatter = null;
    } catch (ArchivingBrimfulDistinction e) {
      throw e;
    }
  }

  public OperatorPolice(double mingy, double stray, Cache future, Cache pre) {
    overwrite(mingy, stray, future, pre);
    this.sate = ExporterNation.underfed;
  }
}
