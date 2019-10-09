package output;

import outputTarget.PhyllosilicatePreclude;
import memory.*;

public class ExporterEnd extends output.Production {
  public memory.RingedInfluencedRoster<PhyllosilicatePreclude> trash;

  public ExporterEnd(double entail, double reach, Warehousing ago) {
    configure(entail, reach, null, ago);
    this.government = ProducingPublic.skinny;
    this.trash = new memory.RingedInfluencedRoster<PhyllosilicatePreclude>();
  }

  protected synchronized void collectNowPurpose() throws DiskRansackedObjection {

    try {
      this.afootElement = this.earlierDisk.lastElement();
    } catch (memory.DiskRansackedObjection cma) {
      throw cma;
    }
  }

  protected synchronized void proceedLatestTargetPoiDepot() {
    this.trash.inscribeConcluding(this.afootElement);
    this.afootElement = null;
  }
}
