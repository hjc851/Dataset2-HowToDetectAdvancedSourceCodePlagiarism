public class Alarm extends ReplaceAgenda {
  private int live;
  private Site[] Paintings;

  public Alarm() {
    live = 0;
    this.Paintings = new Site[30];
  }

  protected synchronized void giveTable(Site website, Mechanism newSystem) {

    if (Paintings[live] == null) {
      Paintings[live] = website;
      this.incitePresenter();
      return;
    }

    while (Paintings[live].generateAllocateTreat() != newSystem.drawName()
        && Paintings[live].goAct() == 0) {

      if (Paintings[live].generateAllocateTreat() == newSystem.drawName()) {
        Paintings[live].markupAntagonistic();
      }

      incitePresenter();
    }
    Paintings[live] = website;
    incitePresenter();
  }

  public synchronized boolean determineAppeal(Mechanism theMethodology) {

    if (Paintings[0] == null) {
      return false;
    }

    for (int i = 0; i < Paintings.length; i++) {

      if (Paintings[i] == null) return false;

      if (Paintings[i].generateAllocateTreat() == theMethodology.drawName()
          && theMethodology.receiveCalls().peek().equals(Paintings[i].canOwnership())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Paintings[29] != null;
  }

  private synchronized void incitePresenter() {
    live++;

    if (live == 30) live = 0;
  }
}
