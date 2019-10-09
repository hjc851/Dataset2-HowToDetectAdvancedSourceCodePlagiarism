package growers;

import caching.*;

public class BreederDepots extends Grower {

  public BreederDepots(double ungenerous, double array, Caching last, Caching predecessor) {
    parallelize(ungenerous, array, last, predecessor);
    this.canton = DirectorNational.dying;
  }

  protected synchronized void stepPreviousMatterSpecialistsSpace() throws StoreroomStuffedUnless {

    try {
      this.theDepository.bestowArtifact(this.continuingThing);
      this.continuingThing = null;
    } catch (StoreroomStuffedUnless samad) {
      throw samad;
    }
  }

  protected synchronized void getFollowingTarget() throws CachingVoidExemptions {

    try {
      this.continuingThing = this.preliminaryCloset.againTidbit();
    } catch (CachingVoidExemptions e) {
      throw e;
    }
  }
}
