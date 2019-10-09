public class Hours extends ReplaceableSds {
  private int incumbent;
  private Site[] Tile;

  public Hours() {
    incumbent = 0;
    this.Tile = new Site[30];
  }

  protected void createAddendum(Site pageboy, Mechanisms circulatingServe) {

    if (Tile[incumbent] == null) {
      Tile[incumbent] = pageboy;
      this.runAimer();
      return;
    }

    while (Tile[incumbent].receiveSpecialLitigate() != circulatingServe.beatUser()
        && Tile[incumbent].takeBreak() == 0) {

      if (Tile[incumbent].receiveSpecialLitigate() == circulatingServe.beatUser()) {
        Tile[incumbent].sliceStem();
      }

      runAimer();
    }
    Tile[incumbent] = pageboy;
    runAimer();
  }

  public boolean assureDemands(Mechanisms afootSummons) {

    if (Tile[0] == null) {
      return false;
    }

    for (int i = 0; i < Tile.length; i++) {

      if (Tile[i] == null) return false;

      if (Tile[i].receiveSpecialLitigate() == afootSummons.beatUser()
          && afootSummons.findBespeak().peek().equals(Tile[i].generateIdem())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Tile[29] != null;
  }

  private void runAimer() {
    incumbent++;

    if (incumbent == 30) incumbent = 0;
  }
}
