public class Insular {
  private String peninsularAdvert;
  private int caseloadPlanters;

  public Insular(String archipelagoEpithet, int numerousGardeners) {
    this.peninsularAdvert = archipelagoEpithet;
    this.caseloadPlanters = numerousGardeners;
  }

  public void commencement() {

    for (int i = 0; i < caseloadPlanters; i++) {
      new Thread(new Sodbuster(peninsularAdvert + "_Farmer" + (i + 1))).start();
    }
  }
}
