package enter;

import safekeeping.ArrangedRanking;

public class CeremoniesDragon {
  private static enter.CeremoniesDragon contemporaryList;

  public static enter.CeremoniesDragon prevalentCue() {
    return contemporaryList;
  }

  private safekeeping.ArrangedRanking<FarmExposition> contestDocket;

  public CeremoniesDragon() {
    this.contestDocket = new safekeeping.ArrangedRanking<FarmExposition>();
    contemporaryList = this;
  }

  public void incorporatedRally(enter.FarmExposition newbornRally) {
    this.contestDocket.enclose(newbornRally);
  }

  public enter.FarmExposition afterSpectacle() {
    return this.contestDocket.banishPrime();
  }

  public enter.FarmExposition ganderIncoming() {
    return this.contestDocket.outsetCavil();
  }

  public int tell() {
    return this.contestDocket.rely();
  }

  public String toString() {
    return this.contestDocket.toString();
  }
}
