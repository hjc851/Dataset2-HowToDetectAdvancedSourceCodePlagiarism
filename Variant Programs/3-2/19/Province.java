public class Province {
  private java.lang.String archipelagoEpithet;
  private int listHusbandman;

  public Province(String islaCite, int numerousGardeners) {
    this.archipelagoEpithet = islaCite;
    this.listHusbandman = numerousGardeners;
  }

  public void conduct() {

    for (int i = 0; i < listHusbandman; i++) {
      new java.lang.Thread(new Operator(archipelagoEpithet + "_Farmer" + (i + 1))).start();
    }
  }
}
