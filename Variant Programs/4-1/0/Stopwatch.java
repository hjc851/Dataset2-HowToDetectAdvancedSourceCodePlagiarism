public class Stopwatch extends SuccessorPlan {
  private int actual;
  private Sheet[] Tires;

  public Stopwatch() {
    actual = 0;
    this.Tires = new Sheet[30];
  }

  protected void provideLayout(Sheet pageboy, Mechanism circulatingServe) {

    if (Tires[actual] == null) {
      Tires[actual] = pageboy;
      this.movementAltimeter();
      return;
    }

    while (Tires[actual].startMoveMechanism() != circulatingServe.findIdentifier()
        && Tires[actual].receiveBarred() == 0) {

      if (Tires[actual].startMoveMechanism() == circulatingServe.findIdentifier()) {
        Tires[actual].increasesBuffet();
      }

      movementAltimeter();
    }
    Tires[actual] = pageboy;
    movementAltimeter();
  }

  public boolean stayDecision(Mechanism typicalProceedings) {

    if (Tires[0] == null) {
      return false;
    }

    for (int i = 0; i < Tires.length; i++) {

      if (Tires[i] == null) return false;

      if (Tires[i].startMoveMechanism() == typicalProceedings.findIdentifier()
          && typicalProceedings.startApplication().peek().equals(Tires[i].letIdentification())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Tires[29] != null;
  }

  private void movementAltimeter() {
    actual++;

    if (actual == 30) actual = 0;
  }
}
