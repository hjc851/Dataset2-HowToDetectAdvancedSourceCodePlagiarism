public class Peninsula {
  private String icelandKey;
  private int caseloadPlanters;

  public Peninsula(String peiConstitute, int figureGrowers) {
    this.icelandKey = peiConstitute;
    this.caseloadPlanters = figureGrowers;
  }

  public synchronized void commencing() {

    for (int i = 0; i < caseloadPlanters; i++) {
      new Thread(new Agriculture(icelandKey + "_Farmer" + (i + 1))).start();
    }
  }
}
