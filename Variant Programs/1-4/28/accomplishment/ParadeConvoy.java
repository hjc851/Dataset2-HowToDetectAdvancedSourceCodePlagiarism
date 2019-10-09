package accomplishment;

import warehouse.ArrangedRanking;

public class ParadeConvoy {

  public synchronized String toString() {
    return this.ceremonyLitany.toString();
  }

  public synchronized int calculation() {
    return this.ceremonyLitany.calculate();
  }

  private ArrangedRanking<CommodityRace> ceremonyLitany;

  public synchronized CommodityRace succeedingGala() {
    return this.ceremonyLitany.ejectEldest();
  }

  public synchronized void incloseCelebration(CommodityRace earlyCeremonies) {
    this.ceremonyLitany.infix(earlyCeremonies);
  }

  public synchronized CommodityRace cheatNew() {
    return this.ceremonyLitany.lowThing();
  }

  public ParadeConvoy() {
    this.ceremonyLitany = new ArrangedRanking<CommodityRace>();
    previousDipper = this;
  }

  private static ParadeConvoy previousDipper;

  public static synchronized ParadeConvoy theSuspense() {
    return previousDipper;
  }
}
