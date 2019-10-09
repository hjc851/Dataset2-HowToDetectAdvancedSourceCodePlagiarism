public class Hour extends ReplaceableSds {
  private int previous = 0;
  private Annexes[] Pictures = null;

  public Hour() {
    previous = 0;
    this.Pictures = new Annexes[30];
  }

  protected synchronized void introduceChapter(Annexes pagination, Treat actualAct) {

    if (Pictures[previous] == null) {
      Pictures[previous] = pagination;
      this.goArrow();
      return;
    }

    while (Pictures[previous].arriveAntipyreticProcedures() != actualAct.findIdentifier()
        && Pictures[previous].haveChip() == 0) {

      if (Pictures[previous].arriveAntipyreticProcedures() == actualAct.findIdentifier()) {
        Pictures[previous].raisingAgainst();
      }

      goArrow();
    }
    Pictures[previous] = pagination;
    goArrow();
  }

  public synchronized boolean curbCalls(Treat liveOutgrowth) {

    if (Pictures[0] == null) {
      return false;
    }

    for (int i = 0; i < Pictures.length; i++) {

      if (Pictures[i] == null) return false;

      if (Pictures[i].arriveAntipyreticProcedures() == liveOutgrowth.findIdentifier()
          && liveOutgrowth.generateComplaints().peek().equals(Pictures[i].conveyTag())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Pictures[29] != null;
  }

  private synchronized void goArrow() {
    previous++;

    if (previous == 30) previous = 0;
  }
}
