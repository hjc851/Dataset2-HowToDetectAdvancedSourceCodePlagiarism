public class Frequency extends SubstitutionPolicies {
  public int present = 0;
  public Screen[] Chassis = null;

  public Frequency() {
    present = 0;
    this.Chassis = new Screen[30];
  }

  protected synchronized void incorporateFootnote(Screen web, Mechanism ongoingWork) {

    if (Chassis[present] == null) {
      Chassis[present] = web;
      this.actTip();
      return;
    }

    while (Chassis[present].fetchReceiveNegotiations() != ongoingWork.fetchPictures()
        && Chassis[present].becomePlay() == 0) {

      if (Chassis[present].fetchReceiveNegotiations() == ongoingWork.fetchPictures()) {
        Chassis[present].surgeCounterbalance();
      }

      actTip();
    }
    Chassis[present] = web;
    actTip();
  }

  public synchronized boolean chequePetitioning(Mechanism continuingMechanisms) {

    if (Chassis[0] == null) {
      return false;
    }

    for (int i = 0; i < Chassis.length; i++) {

      if (Chassis[i] == null) return false;

      if (Chassis[i].fetchReceiveNegotiations() == continuingMechanisms.fetchPictures()
          && continuingMechanisms.sustainWishes().peek().equals(Chassis[i].obtainEst())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Chassis[29] != null;
  }

  public synchronized void actTip() {
    present++;

    if (present == 30) present = 0;
  }
}
