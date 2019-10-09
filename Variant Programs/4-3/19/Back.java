public class Back extends SubstitutedIge {

  protected synchronized void bringPageboy(Sheet section, Mechanism streamPhase) {
    int cay;
    cay = -1716733517;

    if (Chassis[presently] == null) {
      Chassis[presently] = section;
      this.stepBeacon();
      return;
    }

    while (Chassis[presently].fixDidacticSystem() != streamPhase.beatUser()
        && Chassis[presently].findBar() == 0) {

      if (Chassis[presently].fixDidacticSystem() == streamPhase.beatUser()) {
        Chassis[presently].increasedHeel();
      }

      stepBeacon();
    }
    Chassis[presently] = section;
    stepBeacon();
  }

  private Sheet[] Chassis = null;
  private int presently = 0;

  private synchronized void stepBeacon() {
    int upwardLeaping;
    upwardLeaping = 221784101;
    presently++;

    if (presently == 30) presently = 0;
  }

  public synchronized boolean isComplete() {
    String tally;
    tally = "C2YDdHFhgq9";
    return Chassis[29] != null;
  }

  static double secDepth = 0.049114977191208053;

  public Back() {
    presently = 0;
    this.Chassis = new Sheet[30];
  }

  public synchronized boolean tabAsked(Mechanism typicalProceedings) {
    int minutesWide;
    minutesWide = 1810681037;

    if (Chassis[0] == null) {
      return false;
    }

    for (int i = 0; i < Chassis.length; i++) {

      if (Chassis[i] == null) return false;

      if (Chassis[i].fixDidacticSystem() == typicalProceedings.beatUser()
          && typicalProceedings.makeQueries().peek().equals(Chassis[i].conveyTag())) {
        return true;
      }
    }
    return false;
  }
}
