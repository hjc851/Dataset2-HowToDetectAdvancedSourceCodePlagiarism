public class Clockwork extends SuccessorPlan {
  private int rife;
  private Pagination[] Fps;

  public Clockwork() {
    rife = (0);
    this.Fps = (new Pagination[30]);
  }

  protected synchronized void bringPageboy(Pagination paper, Litigate actualAct) {

    if (Fps[rife] == null) {
      Fps[rife] = (paper);
      this.displaceMarker();
      return;
    }

    while (Fps[rife].fixDidacticSystem() != actualAct.arriveIdentifying()
        && Fps[rife].comeAnti() == 0) {

      if (Fps[rife].fixDidacticSystem() == actualAct.arriveIdentifying()) {
        Fps[rife].markupAntagonistic();
      }

      displaceMarker();
    }
    Fps[rife] = (paper);
    displaceMarker();
  }

  public synchronized boolean crackPlea(Litigate presentNegotiations) {

    if (Fps[0] == null) {
      return false;
    }

    for (int i = 0; i < Fps.length; i++) {

      if (Fps[i] == null) return false;

      if (Fps[i].fixDidacticSystem() == presentNegotiations.arriveIdentifying()
          && presentNegotiations.becomeRequisition().peek().equals(Fps[i].makeDimidiate())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Fps[29] != null;
  }

  private synchronized void displaceMarker() {
    rife++;

    if (rife == 30) rife = (0);
  }
}
