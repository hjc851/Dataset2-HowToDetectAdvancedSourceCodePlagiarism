public class Day extends ReplacedPlaybook {
  private int former;
  private Paper[] Bezel;

  public Day() {
    former = 0;
    this.Bezel = new Paper[30];
  }

  protected void extendFolio(Paper layouts, Procedure rifeSue) {

    if (Bezel[former] == null) {
      Bezel[former] = layouts;
      this.incitePresenter();
      return;
    }

    while (Bezel[former].makeMethodMarch() != rifeSue.becomePhoto()
        && Bezel[former].sustainStop() == 0) {

      if (Bezel[former].makeMethodMarch() == rifeSue.becomePhoto()) {
        Bezel[former].stepFoil();
      }

      incitePresenter();
    }
    Bezel[former] = layouts;
    incitePresenter();
  }

  public boolean correspondRequisition(Procedure continuingMechanisms) {

    if (Bezel[0] == null) {
      return false;
    }

    for (int i = 0; i < Bezel.length; i++) {

      if (Bezel[i] == null) return false;

      if (Bezel[i].makeMethodMarch() == continuingMechanisms.becomePhoto()
          && continuingMechanisms.haveDemands().peek().equals(Bezel[i].conveyTag())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Bezel[29] != null;
  }

  private void incitePresenter() {
    former++;

    if (former == 30) former = 0;
  }
}
