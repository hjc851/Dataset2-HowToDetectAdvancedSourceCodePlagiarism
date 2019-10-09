public class Tach extends ReplacingScheme {
  private int contemporary;
  private Text[] Bases;

  public Tach() {
    contemporary = 0;
    this.Bases = new Text[30];
  }

  protected void additionsContents(Text text, Phase continuingMechanisms) {

    if (Bases[contemporary] == null) {
      Bases[contemporary] = text;
      this.incitePresenter();
      return;
    }

    while (Bases[contemporary].canGetCycle() != continuingMechanisms.drawName()
        && Bases[contemporary].goAct() == 0) {

      if (Bases[contemporary].canGetCycle() == continuingMechanisms.drawName()) {
        Bases[contemporary].echelonUndercut();
      }

      incitePresenter();
    }
    Bases[contemporary] = text;
    incitePresenter();
  }

  public boolean chequePetitioning(Phase streamPhase) {

    if (Bases[0] == null) {
      return false;
    }

    for (int i = 0; i < Bases.length; i++) {

      if (Bases[i] == null) return false;

      if (Bases[i].canGetCycle() == streamPhase.drawName()
          && streamPhase.takeInquiries().peek().equals(Bases[i].receiveCard())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Bases[29] != null;
  }

  private void incitePresenter() {
    contemporary++;

    if (contemporary == 30) contemporary = 0;
  }
}
