public class Back extends SwitchApproach {
  private int circulating = 0;
  private Front[] Raster = null;

  public Back() {
    circulating = 0;
    this.Raster = new Front[30];
  }

  protected synchronized void supplySummary(Front front, Work typicalProceedings) {

    if (Raster[circulating] == null) {
      Raster[circulating] = front;
      this.incitePresenter();
      return;
    }

    while (Raster[circulating].catchAddSue() != typicalProceedings.canOwnership()
        && Raster[circulating].fixLot() == 0) {

      if (Raster[circulating].catchAddSue() == typicalProceedings.canOwnership()) {
        Raster[circulating].levelStymie();
      }

      incitePresenter();
    }
    Raster[circulating] = front;
    incitePresenter();
  }

  public synchronized boolean ascertainApplication(Work thisMethods) {

    if (Raster[0] == null) {
      return false;
    }

    for (int i = 0; i < Raster.length; i++) {

      if (Raster[i] == null) return false;

      if (Raster[i].catchAddSue() == thisMethods.canOwnership()
          && thisMethods.developRequisitions().peek().equals(Raster[i].driveSecurity())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Raster[29] != null;
  }

  private synchronized void incitePresenter() {
    circulating++;

    if (circulating == 30) circulating = 0;
  }
}
