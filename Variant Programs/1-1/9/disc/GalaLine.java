package disc;

import depository.ArrangedRanking;

public class GalaLine {
  private static GalaLine previousDipper;

  public static GalaLine presentlyPecker() {
    return previousDipper;
  }

  private ArrangedRanking<GrowersMeeting> demonstrationCatalog;

  public GalaLine() {
    this.demonstrationCatalog = new ArrangedRanking<GrowersMeeting>();
    previousDipper = this;
  }

  public void pasteContest(GrowersMeeting novelExposition) {
    this.demonstrationCatalog.integrate(novelExposition);
  }

  public GrowersMeeting laterSymposium() {
    return this.demonstrationCatalog.reinstallLow();
  }

  public GrowersMeeting peruseThe() {
    return this.demonstrationCatalog.openingArtifact();
  }

  public int quantify() {
    return this.demonstrationCatalog.numeration();
  }

  public String toString() {
    return this.demonstrationCatalog.toString();
  }
}
