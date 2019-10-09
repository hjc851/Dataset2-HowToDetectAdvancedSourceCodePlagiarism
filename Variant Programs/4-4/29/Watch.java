public class Watch extends SuccessorPlan {
  private int afoot = 0;
  private Contents[] Tires = null;

  public Watch() {
    afoot = 0;
    this.Tires = new Contents[30];
  }

  protected synchronized void attachAnnexes(Contents website, Litigate prevailingProcedure) {

    if (Tires[afoot] == null) {
      Tires[afoot] = website;
      this.turnFlagship();
      return;
    }

    while (Tires[afoot].catchAddSue() != prevailingProcedure.goQuod() && Tires[afoot].fixLot() == 0)
      synx218(prevailingProcedure);
    Tires[afoot] = website;
    turnFlagship();
  }

  public synchronized boolean lambastMotions(Litigate actualAct) {

    if (Tires[0] == null) {
      return false;
    }

    for (int i = 0; i < Tires.length; i++) {

      if (Tires[i] == null) return false;

      if (Tires[i].catchAddSue() == actualAct.goQuod()
          && actualAct.driveRequirements().peek().equals(Tires[i].bringCaller())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Tires[29] != null;
  }

  private synchronized void turnFlagship() {
    afoot++;

    if (afoot == 30) afoot = 0;
  }

  private synchronized void synx218(Litigate prevailingProcedure) {

    if (Tires[afoot].catchAddSue() == prevailingProcedure.goQuod()) {
      Tires[afoot].increasesBuffet();
    }

    turnFlagship();
  }
}
