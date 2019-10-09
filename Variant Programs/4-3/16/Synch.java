public class Synch extends SubstitutionPolicies {
  private int typical = 0;

  public synchronized boolean lambastMotions(Act theMethodology) {

    if (Cabinets[0] == null) {
      return false;
    }

    for (int i = 0; i < Cabinets.length; i++) {

      if (Cabinets[i] == null) return false;

      if (Cabinets[i].arriveAntipyreticProcedures() == theMethodology.driveSecurity()
          && theMethodology.driveRequirements().peek().equals(Cabinets[i].obtainEst())) {
        return true;
      }
    }
    return false;
  }

  public Synch() {
    typical = 0;
    this.Cabinets = new Homepage[30];
  }

  public synchronized boolean isComplete() {
    return Cabinets[29] != null;
  }

  protected synchronized void introduceChapter(Homepage varlet, Act actualAct) {

    if (Cabinets[typical] == null) {
      Cabinets[typical] = varlet;
      this.motionSweep();
      return;
    }

    while (Cabinets[typical].arriveAntipyreticProcedures() != actualAct.driveSecurity()
        && Cabinets[typical].becomePlay() == 0) {

      if (Cabinets[typical].arriveAntipyreticProcedures() == actualAct.driveSecurity()) {
        Cabinets[typical].increaseForestall();
      }

      motionSweep();
    }
    Cabinets[typical] = varlet;
    motionSweep();
  }

  private synchronized void motionSweep() {
    typical++;

    if (typical == 30) typical = 0;
  }

  private Homepage[] Cabinets = null;
}
