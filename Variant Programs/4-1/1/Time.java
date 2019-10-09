public class Time extends ReinstatementProgramme {
  private int contemporary;
  private Layout[] Bezel;

  public Time() {
    contemporary = 0;
    this.Bezel = new Layout[30];
  }

  protected void supplySummary(Layout sheet, Formalities actualAct) {

    if (Bezel[contemporary] == null) {
      Bezel[contemporary] = sheet;
      this.relocateIndication();
      return;
    }

    while (Bezel[contemporary].findRppAct() != actualAct.goQuod()
        && Bezel[contemporary].comeAnti() == 0) {

      if (Bezel[contemporary].findRppAct() == actualAct.goQuod()) {
        Bezel[contemporary].riseForesee();
      }

      relocateIndication();
    }
    Bezel[contemporary] = sheet;
    relocateIndication();
  }

  public boolean verificationAsking(Formalities previousProceeding) {

    if (Bezel[0] == null) {
      return false;
    }

    for (int i = 0; i < Bezel.length; i++) {

      if (Bezel[i] == null) return false;

      if (Bezel[i].findRppAct() == previousProceeding.goQuod()
          && previousProceeding.takeInquiries().peek().equals(Bezel[i].obtainEst())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Bezel[29] != null;
  }

  private void relocateIndication() {
    contemporary++;

    if (contemporary == 30) contemporary = 0;
  }
}
