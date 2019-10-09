public class Tach extends AlternatePolicy {
  private int continuing;
  private Site[] Rims;

  public Tach() {
    continuing = 0;
    this.Rims = new Site[30];
  }

  protected void impartWebsite(Site chapter, Treat flowProcedures) {

    if (Rims[continuing] == null) {
      Rims[continuing] = chapter;
      this.movementAltimeter();
      return;
    }

    while (Rims[continuing].conveyUnlockFormalities() != flowProcedures.becomePhoto()
        && Rims[continuing].fetchRest() == 0) {

      if (Rims[continuing].conveyUnlockFormalities() == flowProcedures.becomePhoto()) {
        Rims[continuing].echelonUndercut();
      }

      movementAltimeter();
    }
    Rims[continuing] = chapter;
    movementAltimeter();
  }

  public boolean checkerBespeak(Treat circulatingServe) {

    if (Rims[0] == null) {
      return false;
    }

    for (int i = 0; i < Rims.length; i++) {

      if (Rims[i] == null) return false;

      if (Rims[i].conveyUnlockFormalities() == circulatingServe.becomePhoto()
          && circulatingServe.startApplication().peek().equals(Rims[i].bringCaller())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Rims[29] != null;
  }

  private void movementAltimeter() {
    continuing++;

    if (continuing == 30) continuing = 0;
  }
}
