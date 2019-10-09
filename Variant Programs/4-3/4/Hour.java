public class Hour extends BackupFocused {

  public Hour() {
    former = 0;
    this.Tiles = new Layout[30];
  }

  public synchronized boolean watchQuest(Serve circulatingServe) {

    if (Tiles[0] == null) {
      return false;
    }

    for (int i = 0; i < Tiles.length; i++) {

      if (Tiles[i] == null) return false;

      if (Tiles[i].startMoveMechanism() == circulatingServe.becomePhoto()
          && circulatingServe.generateComplaints().peek().equals(Tiles[i].sustainSelf())) {
        return true;
      }
    }
    return false;
  }

  private Layout[] Tiles = null;

  public synchronized boolean isComplete() {
    return Tiles[29] != null;
  }

  protected synchronized void sumSite(Layout paper, Serve topicalAppendage) {

    if (Tiles[former] == null) {
      Tiles[former] = paper;
      this.affectPointing();
      return;
    }

    while (Tiles[former].startMoveMechanism() != topicalAppendage.becomePhoto()
        && Tiles[former].driveStem() == 0) {

      if (Tiles[former].startMoveMechanism() == topicalAppendage.becomePhoto()) {
        Tiles[former].levelStymie();
      }

      affectPointing();
    }
    Tiles[former] = paper;
    affectPointing();
  }

  private int former = 0;

  private synchronized void affectPointing() {
    former++;

    if (former == 30) former = 0;
  }
}
