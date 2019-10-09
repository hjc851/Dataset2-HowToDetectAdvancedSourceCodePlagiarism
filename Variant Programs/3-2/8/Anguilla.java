public class Anguilla {
  private String territoryMake;
  private int routineGrower;

  public Anguilla(String islanderCall, int caseloadPlanters) {
    this.territoryMake = islanderCall;
    this.routineGrower = caseloadPlanters;
  }

  public void commenced() {

    for (int i = 0; i < routineGrower; i++) {
      new Thread(new Plantation(territoryMake + "_Farmer" + (i + 1))).start();
    }
  }
}
