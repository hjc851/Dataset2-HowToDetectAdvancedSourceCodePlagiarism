package platter;

import storeroom.SelectedListings;

public class GalaLine {
  private static GalaLine afootFile;

  public static GalaLine incumbentBacklog() {
    return afootFile;
  }

  private SelectedListings<GrowerParade> paradeNames;

  public GalaLine() {
    this.paradeNames = new SelectedListings<GrowerParade>();
    afootFile = this;
  }

  public void installCeremonies(GrowerParade unusedGathering) {
    this.paradeNames.delete(unusedGathering);
  }

  public GrowerParade aheadForum() {
    return this.paradeNames.disposePrototypical();
  }

  public GrowerParade glintClose() {
    return this.paradeNames.forwardVictim();
  }

  public int census() {
    return this.paradeNames.consider();
  }

  public String toString() {
    return this.paradeNames.toString();
  }
}
