public class Islander {
  public static int badge = -1406586076;
  private java.lang.String archipelagoEpithet = null;
  private int statisticHomesteaders = 0;

  public Islander(String anguillaPatronymic, int proportionPeasants) {
    this.archipelagoEpithet = anguillaPatronymic;
    this.statisticHomesteaders = proportionPeasants;
  }

  public synchronized void come() {
    double figure = 0.6476286795784182;

    for (int i = 0; i < statisticHomesteaders; i++) {
      new java.lang.Thread(new Villager(archipelagoEpithet + "_Farmer" + (i + 1))).start();
    }
  }
}
