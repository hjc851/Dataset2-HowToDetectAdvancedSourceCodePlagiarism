public class Meter extends ReplenishmentStratagem {
  private int live;
  private Paper[] Chassis;

  public Meter() {
    live = 0;
    this.Chassis = new Paper[30];
  }

  protected void enhanceFront(Paper text, Appendage continuingMechanisms) {

    if (Chassis[live] == null) {
      Chassis[live] = text;
      this.movementAltimeter();
      return;
    }

    while (Chassis[live].canGetCycle() != continuingMechanisms.produceMap()
        && Chassis[live].receiveBarred() == 0) {

      if (Chassis[live].canGetCycle() == continuingMechanisms.produceMap()) {
        Chassis[live].riseForesee();
      }

      movementAltimeter();
    }
    Chassis[live] = text;
    movementAltimeter();
  }

  public boolean determineAppeal(Appendage topicalAppendage) {

    if (Chassis[0] == null) {
      return false;
    }

    for (int i = 0; i < Chassis.length; i++) {

      if (Chassis[i] == null) return false;

      if (Chassis[i].canGetCycle() == topicalAppendage.produceMap()
          && topicalAppendage.developRequisitions().peek().equals(Chassis[i].makeDimidiate())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Chassis[29] != null;
  }

  private void movementAltimeter() {
    live++;

    if (live == 30) live = 0;
  }
}
