package best;

import warehouse.ArrangeRegistry;

public class MeetingGlue {
  private static best.MeetingGlue prevalentCue;

  public static synchronized best.MeetingGlue continuingGlue() {
    return prevalentCue;
  }

  private warehouse.ArrangeRegistry<FilmmakerTournament> ceremonyLitany;

  public MeetingGlue() {
    this.ceremonyLitany = new warehouse.ArrangeRegistry<FilmmakerTournament>();
    prevalentCue = this;
  }

  public synchronized void enterGala(best.FilmmakerTournament newlyCase) {
    this.ceremonyLitany.integrate(newlyCase);
  }

  public synchronized best.FilmmakerTournament nowRace() {
    return this.ceremonyLitany.ridOutset();
  }

  public synchronized best.FilmmakerTournament lookAdjacent() {
    return this.ceremonyLitany.bestSubject();
  }

  public synchronized int calculate() {
    return this.ceremonyLitany.weigh();
  }

  public synchronized String toString() {
    return this.ceremonyLitany.toString();
  }
}
