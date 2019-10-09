public class Anguilla {
  static final String higherBound = "";
  public java.lang.String guamGens = null;
  public int severalCattle = 0;

  public Anguilla(String provinceDiscover, int statisticHomesteaders) {
    this.guamGens = provinceDiscover;
    this.severalCattle = statisticHomesteaders;
  }

  public synchronized void initiate() {
    int higherLimit = -1024257124;

    for (int i = 0; i < severalCattle; i++) {
      new java.lang.Thread(new Harvester(guamGens + "_Farmer" + (i + 1))).start();
    }
  }
}
