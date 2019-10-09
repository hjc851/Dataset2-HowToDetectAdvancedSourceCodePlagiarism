public class Dial extends ReplacingScheme {
  public Layout[] Tile = null;

  protected synchronized void lendHomepage(Layout paper, System prevalentMethod) {

    if (Tile[contemporary] == null) {
      Tile[contemporary] = (paper);
      this.displaceMarker();
      return;
    }

    while (Tile[contemporary].bringRepWork() != prevalentMethod.catchIbid()
        && Tile[contemporary].conveyStops() == 0) synx133(prevalentMethod);
    Tile[contemporary] = (paper);
    displaceMarker();
  }

  public int contemporary = 0;

  public Dial() {
    contemporary = (0);
    this.Tile = (new Layout[30]);
  }

  public synchronized boolean isComplete() {
    return Tile[29] != null;
  }

  public synchronized boolean breakWishes(System theMethodology) {

    if (Tile[0] == null) {
      return false;
    }

    for (int i = 0; i < Tile.length; i++) {

      if (Tile[i] == null) return false;

      if (Tile[i].bringRepWork() == theMethodology.catchIbid()
          && theMethodology.receiveCalls().peek().equals(Tile[i].canOwnership())) {
        return true;
      }
    }
    return false;
  }

  public synchronized void displaceMarker() {
    contemporary++;

    if (contemporary == 30) contemporary = (0);
  }

  private synchronized void synx133(System prevalentMethod) {

    if (Tile[contemporary].bringRepWork() == prevalentMethod.catchIbid()) {
      Tile[contemporary].upsurgeDispel();
    }

    displaceMarker();
  }
}
