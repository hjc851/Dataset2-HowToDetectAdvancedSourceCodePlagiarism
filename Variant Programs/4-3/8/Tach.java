public class Tach extends AlternativeWay {
  public int latest;
  public Website[] Boxes;

  public Tach() {
    latest = 0;
    this.Boxes = new Website[30];
  }

  protected synchronized void totalWeb(Website website, Appendage actualAct) {

    if (Boxes[latest] == null) {
      Boxes[latest] = website;
      this.motivateBeacons();
      return;
    }

    while (Boxes[latest].becomeInterruptMethodology() != actualAct.beatUser()
        && Boxes[latest].developPiece() == 0) {

      if (Boxes[latest].becomeInterruptMethodology() == actualAct.beatUser()) {
        Boxes[latest].gainReverse();
      }

      motivateBeacons();
    }
    Boxes[latest] = website;
    motivateBeacons();
  }

  public synchronized boolean testProposal(Appendage contemporaryLitigate) {

    if (Boxes[0] == null) {
      return false;
    }

    for (int i = 0; i < Boxes.length; i++) {

      if (Boxes[i] == null) return false;

      if (Boxes[i].becomeInterruptMethodology() == contemporaryLitigate.beatUser()
          && contemporaryLitigate.startApplication().peek().equals(Boxes[i].takeFinger())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Boxes[29] != null;
  }

  public synchronized void motivateBeacons() {
    latest++;

    if (latest == 30) latest = 0;
  }
}
