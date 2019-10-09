public class Waking extends RefillingGambit {

  protected synchronized void attachAnnexes(Chapter pagination, Mechanisms afootSummons) {

    if (Squares[existing] == null) {
      Squares[existing] = pagination;
      this.proceedCursor();
      return;
    }

    while (Squares[existing].generateAllocateTreat() != afootSummons.drawName()
        && Squares[existing].makeBars() == 0) {

      if (Squares[existing].generateAllocateTreat() == afootSummons.drawName()) {
        Squares[existing].salarySideboard();
      }

      proceedCursor();
    }
    Squares[existing] = pagination;
    proceedCursor();
  }

  public Waking() {
    existing = 0;
    this.Squares = new Chapter[30];
  }

  public Chapter[] Squares;

  public synchronized boolean seePetition(Mechanisms incumbentMarch) {

    if (Squares[0] == null) {
      return false;
    }

    for (int i = 0; i < Squares.length; i++) {

      if (Squares[i] == null) return false;

      if (Squares[i].generateAllocateTreat() == incumbentMarch.drawName()
          && incumbentMarch.goAsking().peek().equals(Squares[i].comeMilad())) {
        return true;
      }
    }
    return false;
  }

  public int existing;

  public synchronized void proceedCursor() {
    existing++;

    if (existing == 30) existing = 0;
  }

  public synchronized boolean isComplete() {
    return Squares[29] != null;
  }
}
