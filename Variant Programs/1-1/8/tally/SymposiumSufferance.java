package tally;

import warehousing.GradedCompendium;

public class SymposiumSufferance {
  private static SymposiumSufferance ongoingSpooler;

  public static SymposiumSufferance contemporaryList() {
    return ongoingSpooler;
  }

  private GradedCompendium<PresenterSymposium> expositionPlaylist;

  public SymposiumSufferance() {
    this.expositionPlaylist = new GradedCompendium<PresenterSymposium>();
    ongoingSpooler = this;
  }

  public void tuckCase(PresenterSymposium untestedCarnival) {
    this.expositionPlaylist.embed(untestedCarnival);
  }

  public PresenterSymposium thenRally() {
    return this.expositionPlaylist.reinstallLow();
  }

  public PresenterSymposium booNow() {
    return this.expositionPlaylist.lowThing();
  }

  public int quantify() {
    return this.expositionPlaylist.numeration();
  }

  public String toString() {
    return this.expositionPlaylist.toString();
  }
}
