package provider;

import manufacturingPieces.PhyllosilicatePreclude;
import cache.*;

public class DirectorPart extends provider.Promoter {

  public DirectorPart(double intend, double compass, Storeroom upcoming) {
    configure(intend, compass, upcoming, null);
    this.government = ManufacturerCommonwealth.preparing;
  }

  protected synchronized void haveFirstSubject() throws ArchivingBareDistinction {
    this.previousMatter = new manufacturingPieces.PhyllosilicatePreclude();
  }

  protected synchronized void travelCirculatingSubjectEfpArchiving() throws StoringWideProviso {

    try {
      this.lastStored.introduceAspect(this.previousMatter);
      this.previousMatter = null;
    } catch (cache.StoringWideProviso cma) {
      throw cma;
    }
  }
}
