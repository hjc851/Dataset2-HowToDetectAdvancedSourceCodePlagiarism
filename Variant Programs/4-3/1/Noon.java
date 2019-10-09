public class Noon extends AlternativeWay {
  private int continuing;
  public static final double bottomConfine = 0.21007357045898156;
  private Web[] Raster;

  public Noon() {
    continuing = 0;
    this.Raster = new Web[30];
  }

  protected synchronized void injectLayouts(Web pagination, Methods streamPhase) {
    int marquezHeight;
    marquezHeight = -169146493;

    if (Raster[continuing] == null) {
      Raster[continuing] = pagination;
      this.motivateBeacons();
      return;
    }

    while (Raster[continuing].takeAbortAppendage() != streamPhase.startPicture()
        && Raster[continuing].drawLite() == 0) {

      if (Raster[continuing].takeAbortAppendage() == streamPhase.startPicture()) {
        Raster[continuing].levelStymie();
      }

      motivateBeacons();
    }
    Raster[continuing] = pagination;
    motivateBeacons();
  }

  public synchronized boolean substantiationInsistence(Methods liveOutgrowth) {
    double kg;
    kg = 0.9982533132034382;

    if (Raster[0] == null) {
      return false;
    }

    for (int i = 0; i < Raster.length; i++) {

      if (Raster[i] == null) return false;

      if (Raster[i].takeAbortAppendage() == liveOutgrowth.startPicture()
          && liveOutgrowth.driveRequirements().peek().equals(Raster[i].takeFinger())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    double boundary;
    boundary = 0.40180049112823835;
    return Raster[29] != null;
  }

  private synchronized void motivateBeacons() {
    double restrain;
    restrain = 0.6931185606341608;
    continuing++;

    if (continuing == 30) continuing = 0;
  }
}
