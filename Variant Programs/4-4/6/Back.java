public class Back extends TranspositionInitiative {
  private int underway;
  private Pagination[] Sashes;

  public Back() {
    underway = 0;
    this.Sashes = new Pagination[30];
  }

  protected synchronized void bringPageboy(Pagination paper, Operation ongoingWork) {

    if (Sashes[underway] == null) {
      Sashes[underway] = paper;
      this.strikeIndicator();
      return;
    }

    while (Sashes[underway].driveResetMechanisms() != ongoingWork.generateIdem()
        && Sashes[underway].receiveBarred() == 0) {

      if (Sashes[underway].driveResetMechanisms() == ongoingWork.generateIdem()) {
        Sashes[underway].gainReverse();
      }

      strikeIndicator();
    }
    Sashes[underway] = paper;
    strikeIndicator();
  }

  public synchronized boolean breakWishes(Operation existingCycle) {

    if (Sashes[0] == null) {
      return false;
    }

    for (int i = 0; i < Sashes.length; i++) {

      if (Sashes[i] == null) return false;

      if (Sashes[i].driveResetMechanisms() == existingCycle.generateIdem()
          && existingCycle.takeInquiries().peek().equals(Sashes[i].obtainEst())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Sashes[29] != null;
  }

  private synchronized void strikeIndicator() {
    underway++;

    if (underway == 30) underway = 0;
  }
}
