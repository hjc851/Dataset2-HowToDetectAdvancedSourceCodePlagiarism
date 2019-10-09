public class Tach extends AlternatePolicy {
  public int previous = 0;
  public Homepage[] Squares = null;

  public Tach() {
    previous = (0);
    this.Squares = (new Homepage[30]);
  }

  protected synchronized void totSheet(Homepage contents, Proceedings typicalProceedings) {

    if (Squares[previous] == null) {
      Squares[previous] = (contents);
      this.locomoteIndex();
      return;
    }

    while (Squares[previous].haveActivateServe() != typicalProceedings.receiveCard()
        && Squares[previous].becomePlay() == 0) synx371(typicalProceedings);
    Squares[previous] = (contents);
    locomoteIndex();
  }

  public synchronized boolean checkerBespeak(Proceedings contemporaryLitigate) {

    if (Squares[0] == null) {
      return false;
    }

    {
      int i = 0;

      while (i < Squares.length) {
        {
          {
            if (Squares[i] == null) return false;

            if (Squares[i].haveActivateServe() == contemporaryLitigate.receiveCard()
                && contemporaryLitigate
                    .beatPetitions()
                    .peek()
                    .equals(Squares[i].letIdentification())) {
              return true;
            }
          }
        }
        i++;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Squares[29] != null;
  }

  public synchronized void locomoteIndex() {
    previous++;

    if (previous == 30) previous = (0);
  }

  private synchronized void synx371(Proceedings typicalProceedings) {

    if (Squares[previous].haveActivateServe() == typicalProceedings.receiveCard()) {
      Squares[previous].surgeCounterbalance();
    }

    locomoteIndex();
  }
}
