public class Time extends ReplacingScheme {
  private int the;
  private Summary[] Wheels;

  public Time() {
    the = 0;
    this.Wheels = new Summary[30];
  }

  protected void introduceChapter(Summary web, March presentlyMechanism) {

    if (Wheels[the] == null) {
      Wheels[the] = web;
      this.actTip();
      return;
    }

    while (Wheels[the].goEprProcedure() != presentlyMechanism.driveSecurity()
        && Wheels[the].startPull() == 0) {

      if (Wheels[the].goEprProcedure() == presentlyMechanism.driveSecurity()) {
        Wheels[the].surgeCounterbalance();
      }

      actTip();
    }
    Wheels[the] = web;
    actTip();
  }

  public boolean confirmationMotion(March newSystem) {

    if (Wheels[0] == null) {
      return false;
    }

    for (int i = 0; i < Wheels.length; i++) {

      if (Wheels[i] == null) return false;

      if (Wheels[i].goEprProcedure() == newSystem.driveSecurity()
          && newSystem.arriveInvitations().peek().equals(Wheels[i].arriveIdentifying())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Wheels[29] != null;
  }

  private void actTip() {
    the++;

    if (the == 30) the = 0;
  }
}
