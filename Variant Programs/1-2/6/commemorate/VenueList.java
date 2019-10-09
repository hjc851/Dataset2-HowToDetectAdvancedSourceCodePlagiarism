package commemorate;

import depository.PlacedPlaylist;

public class VenueList {
  private static commemorate.VenueList rifeRow;

  public static commemorate.VenueList afootFile() {
    return rifeRow;
  }

  private depository.PlacedPlaylist<FarmExposition> festivalLean;

  public VenueList() {
    this.festivalLean = new depository.PlacedPlaylist<FarmExposition>();
    rifeRow = this;
  }

  public void incorporateTriathlon(commemorate.FarmExposition recentlyTournament) {
    this.festivalLean.integrate(recentlyTournament);
  }

  public commemorate.FarmExposition newGathering() {
    return this.festivalLean.eliminateBest();
  }

  public commemorate.FarmExposition spyComing() {
    return this.festivalLean.forwardVictim();
  }

  public int tabulation() {
    return this.festivalLean.quantify();
  }

  public String toString() {
    return this.festivalLean.toString();
  }
}
