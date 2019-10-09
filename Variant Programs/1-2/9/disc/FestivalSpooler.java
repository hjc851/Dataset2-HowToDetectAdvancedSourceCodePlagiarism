package disc;

import closet.CleanedTilt;

public class FestivalSpooler {
  private static disc.FestivalSpooler afootFile;

  public static disc.FestivalSpooler existingJunk() {
    return afootFile;
  }

  private closet.CleanedTilt<VintnerGathering> ceremonyLitany;

  public FestivalSpooler() {
    this.ceremonyLitany = new closet.CleanedTilt<VintnerGathering>();
    afootFile = this;
  }

  public void addCommemoration(disc.VintnerGathering untestedCarnival) {
    this.ceremonyLitany.injected(untestedCarnival);
  }

  public disc.VintnerGathering againContest() {
    return this.ceremonyLitany.discardIntroductory();
  }

  public disc.VintnerGathering readAhead() {
    return this.ceremonyLitany.kickoffItems();
  }

  public int figure() {
    return this.ceremonyLitany.consider();
  }

  public String toString() {
    return this.ceremonyLitany.toString();
  }
}
