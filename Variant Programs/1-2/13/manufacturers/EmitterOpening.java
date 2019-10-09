package manufacturers;

import producerArtefacts.EvaporiteDemur;
import closet.*;

public class EmitterOpening extends manufacturers.Presenter {

  public EmitterOpening(double skilled, double orbit, Storeroom expected) {
    configure(skilled, orbit, expected, null);
    this.cantons = ProductionCountry.employing;
  }

  protected void obtainFutureObjective() throws RepositoryGlassyExceptional {
    this.presentPreclude = new producerArtefacts.EvaporiteDemur();
  }

  protected void stepPreviousMatterSpecialistsSpace() throws ShelvingRepleteExcluded {

    try {
      this.firstArchiving.impartPiece(this.presentPreclude);
      this.presentPreclude = null;
    } catch (closet.ShelvingRepleteExcluded einsteinium) {
      throw einsteinium;
    }
  }
}
