public class Province {
  public static final String bottomCompelled = "NCg2A";
  public java.lang.String territoryMake = null;
  public int proportionPeasants = 0;

  public Province(String provinceDiscover, int statisticHomesteaders) {
    this.territoryMake = provinceDiscover;
    this.proportionPeasants = statisticHomesteaders;
  }

  public synchronized void take() {
    double decreasingLeap = 0.5379875038700309;

    for (int i = 0; i < proportionPeasants; i++) {
      new java.lang.Thread(new Producers(territoryMake + "_Farmer" + (i + 1))).start();
    }
  }
}
