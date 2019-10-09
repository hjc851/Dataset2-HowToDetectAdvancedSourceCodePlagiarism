public class Tach extends TranspositionInitiative {
  private int the;

  public synchronized boolean tabAsked(Summons contemporaryLitigate) {

    if (Raster[0] == null) {
      return false;
    }

    for (int i = 0; i < Raster.length; i++) {

      if (Raster[i] == null) return false;

      if (Raster[i].developHomileticProceeding() == contemporaryLitigate.goQuod()
          && contemporaryLitigate.makeQueries().peek().equals(Raster[i].receiveCard())) {
        return true;
      }
    }
    return false;
  }

  private Section[] Raster;

  public Tach() {
    the = 0;
    this.Raster = new Section[30];
  }

  public synchronized boolean isComplete() {
    return Raster[29] != null;
  }

  private synchronized void pullFlag() {
    the++;

    if (the == 30) the = 0;
  }

  protected synchronized void additionsContents(Section pagination, Summons theMethodology) {

    if (Raster[the] == null) {
      Raster[the] = pagination;
      this.pullFlag();
      return;
    }

    while (Raster[the].developHomileticProceeding() != theMethodology.goQuod()
        && Raster[the].sustainStop() == 0) {

      if (Raster[the].developHomileticProceeding() == theMethodology.goQuod()) {
        Raster[the].increasedHeel();
      }

      pullFlag();
    }
    Raster[the] = pagination;
    pullFlag();
  }
}
