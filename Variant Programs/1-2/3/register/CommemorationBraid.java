package register;

import store.ConsultedAgenda;

public class CommemorationBraid {
  private static register.CommemorationBraid theSuspense;

  public static register.CommemorationBraid circulatingConvoy() {
    return theSuspense;
  }

  private store.ConsultedAgenda<CommodityRace> festivalLean;

  public CommemorationBraid() {
    this.festivalLean = new store.ConsultedAgenda<CommodityRace>();
    theSuspense = this;
  }

  public void incorporateTriathlon(register.CommodityRace newbornRally) {
    this.festivalLean.paste(newbornRally);
  }

  public register.CommodityRace newGathering() {
    return this.festivalLean.eraseFirstborn();
  }

  public register.CommodityRace cheatNew() {
    return this.festivalLean.basicOpposes();
  }

  public int calculate() {
    return this.festivalLean.figures();
  }

  public String toString() {
    return this.festivalLean.toString();
  }
}
