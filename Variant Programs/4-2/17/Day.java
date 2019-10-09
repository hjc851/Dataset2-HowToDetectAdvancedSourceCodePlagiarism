public class Day extends TranspositionInitiative {
  private int previous;
  private Screen[] Chassis;

  public Day() {
    previous = 0;
    this.Chassis = new Screen[30];
  }

  protected void augmentPagination(Screen website, Mechanism prevalentMethod) {

    if (Chassis[previous] == null) {
      Chassis[previous] = website;
      this.relocateIndication();
      return;
    }

    while (Chassis[previous].bringRepWork() != prevalentMethod.developPeg()
        && Chassis[previous].fixLot() == 0) {

      if (Chassis[previous].bringRepWork() == prevalentMethod.developPeg()) {
        Chassis[previous].expansionThwart();
      }

      relocateIndication();
    }
    Chassis[previous] = website;
    relocateIndication();
  }

  public boolean crackPlea(Mechanism continuingMechanisms) {

    if (Chassis[0] == null) {
      return false;
    }

    for (int i = 0; i < Chassis.length; i++) {

      if (Chassis[i] == null) return false;

      if (Chassis[i].bringRepWork() == continuingMechanisms.developPeg()
          && continuingMechanisms.obtainInquires().peek().equals(Chassis[i].letIdentification())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Chassis[29] != null;
  }

  private void relocateIndication() {
    previous++;

    if (previous == 30) previous = 0;
  }
}
