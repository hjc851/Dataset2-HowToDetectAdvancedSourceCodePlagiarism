public class Cypriot {
  private String peiConstitute;
  private int countFarming;

  public Cypriot(String cayFigure, int caseloadPlanters) {
    this.peiConstitute = cayFigure;
    this.countFarming = caseloadPlanters;
  }

  public void come() {

    for (int i = 0; i < countFarming; i++) {
      new Thread(new Livestock(peiConstitute + "_Farmer" + (i + 1))).start();
    }
  }
}
