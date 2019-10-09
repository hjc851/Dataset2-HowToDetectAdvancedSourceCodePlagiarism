package mark;

import warehouse.CategorizedShortlist;

public class ExtravaganzaWait {
  private static mark.ExtravaganzaWait latestWait;

  public static mark.ExtravaganzaWait prevailingWaiting() {
    return latestWait;
  }

  private warehouse.CategorizedShortlist<DirectorSeminar> ceremonyLitany;

  public ExtravaganzaWait() {
    this.ceremonyLitany = new warehouse.CategorizedShortlist<DirectorSeminar>();
    latestWait = this;
  }

  public void addCommemoration(mark.DirectorSeminar unusedGathering) {
    this.ceremonyLitany.incorporated(unusedGathering);
  }

  public mark.DirectorSeminar nowRace() {
    return this.ceremonyLitany.dismantleFreshman();
  }

  public mark.DirectorSeminar pokeCome() {
    return this.ceremonyLitany.maidenItem();
  }

  public int numbers() {
    return this.ceremonyLitany.reckoning();
  }

  public String toString() {
    return this.ceremonyLitany.toString();
  }
}
