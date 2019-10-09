public class Hours extends SuccessorPlan {
  private int existing;
  private Layouts[] Wheels;

  public Hours() {
    existing = 0;
    this.Wheels = new Layouts[30];
  }

  protected void injectLayouts(Layouts tab, Litigate latestOperation) {

    if (Wheels[existing] == null) {
      Wheels[existing] = tab;
      this.travelMouse();
      return;
    }

    while (Wheels[existing].catchAddSue() != latestOperation.developPeg()
        && Wheels[existing].drawLite() == 0) {

      if (Wheels[existing].catchAddSue() == latestOperation.developPeg()) {
        Wheels[existing].enhanceDeflect();
      }

      travelMouse();
    }
    Wheels[existing] = tab;
    travelMouse();
  }

  public boolean breakWishes(Litigate actualAct) {

    if (Wheels[0] == null) {
      return false;
    }

    for (int i = 0; i < Wheels.length; i++) {

      if (Wheels[i] == null) return false;

      if (Wheels[i].catchAddSue() == actualAct.developPeg()
          && actualAct.conveyProposals().peek().equals(Wheels[i].sustainSelf())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Wheels[29] != null;
  }

  private void travelMouse() {
    existing++;

    if (existing == 30) existing = 0;
  }
}
