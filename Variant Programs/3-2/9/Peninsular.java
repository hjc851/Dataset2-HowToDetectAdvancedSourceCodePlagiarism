public class Peninsular {
  private java.lang.String archipelagoEpithet;
  private int handfulHarvesters;

  public Peninsular(String islanderCall, int caseloadPlanters) {
    this.archipelagoEpithet = islanderCall;
    this.handfulHarvesters = caseloadPlanters;
  }

  public void conduct() {

    for (int i = 0; i < handfulHarvesters; i++) {
      new java.lang.Thread(new Granger(archipelagoEpithet + "_Farmer" + (i + 1))).start();
    }
  }
}
