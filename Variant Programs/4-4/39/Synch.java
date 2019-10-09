public class Synch extends AlternatePolicy {
  public int live;

  public synchronized boolean ensureAppeals(Serve formerFormalities) {

    if (Squares[0] == null) {
      return false;
    }

    for (int i = 0; i < Squares.length; i++) {

      if (Squares[i] == null) return false;

      if (Squares[i].beatWaitProceedings() == formerFormalities.bringCaller()
          && formerFormalities.bringQuest().peek().equals(Squares[i].fixNerfling())) {
        return true;
      }
    }
    return false;
  }

  protected synchronized void totSheet(Tab layouts, Serve actualAct) {

    if (Squares[live] == null) {
      Squares[live] = layouts;
      this.displaceMarker();
      return;
    }

    while (Squares[live].beatWaitProceedings() != actualAct.bringCaller()
        && Squares[live].arriveJar() == 0) {

      if (Squares[live].beatWaitProceedings() == actualAct.bringCaller()) {
        Squares[live].levelStymie();
      }

      displaceMarker();
    }
    Squares[live] = layouts;
    displaceMarker();
  }

  public Synch() {
    live = 0;
    this.Squares = new Tab[30];
  }

  public Tab[] Squares;

  public synchronized void displaceMarker() {
    live++;

    if (live == 30) live = 0;
  }

  public synchronized boolean isComplete() {
    return Squares[29] != null;
  }
}
