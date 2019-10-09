public class Pendulum extends RenewalTactic {
  public int afoot;
  public Pagination[] Tiles;

  public Pendulum() {
    afoot = 0;
    this.Tiles = new Pagination[30];
  }

  protected synchronized void sumSite(Pagination paper, Methods theMethodology) {

    if (Tiles[afoot] == null) {
      Tiles[afoot] = paper;
      this.travelMouse();
      return;
    }

    while (Tiles[afoot].becomeInterruptMethodology() != theMethodology.sustainSelf()
        && Tiles[afoot].driveStem() == 0) {

      if (Tiles[afoot].becomeInterruptMethodology() == theMethodology.sustainSelf()) {
        Tiles[afoot].growthCounterpunch();
      }

      travelMouse();
    }
    Tiles[afoot] = paper;
    travelMouse();
  }

  public synchronized boolean chequePetitioning(Methods thisMethods) {

    if (Tiles[0] == null) {
      return false;
    }

    for (int i = 0; i < Tiles.length; i++) {

      if (Tiles[i] == null) return false;

      if (Tiles[i].becomeInterruptMethodology() == thisMethods.sustainSelf()
          && thisMethods.letEntreaties().peek().equals(Tiles[i].driveSecurity())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Tiles[29] != null;
  }

  public synchronized void travelMouse() {
    afoot++;

    if (afoot == 30) afoot = 0;
  }
}
