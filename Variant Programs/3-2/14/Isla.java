public class Isla {
  private java.lang.String viequesDistinguish;
  private int actAgriculture;

  public Isla(String archipelagoEpithet, int statisticHomesteaders) {
    this.viequesDistinguish = archipelagoEpithet;
    this.actAgriculture = statisticHomesteaders;
  }

  public void proceed() {

    for (int i = 0; i < actAgriculture; i++) {
      new java.lang.Thread(new Peasant(viequesDistinguish + "_Farmer" + (i + 1))).start();
    }
  }
}
