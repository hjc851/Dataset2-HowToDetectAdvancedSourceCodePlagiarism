public class Waking extends BackupFocused {
  private int incumbent;
  private Paper[] Cabinets;

  public Waking() {
    incumbent = 0;
    this.Cabinets = new Paper[30];
  }

  protected void tallySection(Paper varlet, Methodology underwayTreat) {

    if (Cabinets[incumbent] == null) {
      Cabinets[incumbent] = varlet;
      this.turnFlagship();
      return;
    }

    while (Cabinets[incumbent].letAnalogicSummons() != underwayTreat.conveyTag()
        && Cabinets[incumbent].beatTile() == 0) {

      if (Cabinets[incumbent].letAnalogicSummons() == underwayTreat.conveyTag()) {
        Cabinets[incumbent].upsurgeDispel();
      }

      turnFlagship();
    }
    Cabinets[incumbent] = varlet;
    turnFlagship();
  }

  public boolean crackPlea(Methodology liveOutgrowth) {

    if (Cabinets[0] == null) {
      return false;
    }

    for (int i = 0; i < Cabinets.length; i++) {

      if (Cabinets[i] == null) return false;

      if (Cabinets[i].letAnalogicSummons() == liveOutgrowth.conveyTag()
          && liveOutgrowth.becomeRequisition().peek().equals(Cabinets[i].letIdentification())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Cabinets[29] != null;
  }

  private void turnFlagship() {
    incumbent++;

    if (incumbent == 30) incumbent = 0;
  }
}
