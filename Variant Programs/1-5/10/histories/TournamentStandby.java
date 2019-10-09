package histories;

import safekeeping.DividedDocket;

public class TournamentStandby {
  private safekeeping.DividedDocket<BreederCeremonies> festivalLean;
  private static histories.TournamentStandby liveStandby;

  public static synchronized histories.TournamentStandby actualLine() {
    return liveStandby;
  }

  public TournamentStandby() {
    this.festivalLean = new safekeeping.DividedDocket<BreederCeremonies>();
    liveStandby = this;
  }

  public synchronized void enterGala(histories.BreederCeremonies babySpectacle) {
    this.festivalLean.attach(babySpectacle);
  }

  public synchronized histories.BreederCeremonies succeedingGala() {
    return this.festivalLean.dismantleFreshman();
  }

  public synchronized histories.BreederCeremonies cheatingAfter() {
    return this.festivalLean.topObjection();
  }

  public synchronized int figures() {
    return this.festivalLean.numeration();
  }

  public synchronized String toString() {
    return this.festivalLean.toString();
  }
}
