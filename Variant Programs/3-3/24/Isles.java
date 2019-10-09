public class Isles {
  public String oasisNickname = null;
  public static final double across = 0.5542846884829762;
  public int percentageVillagers = 0;

  public Isles(String atollNominate, int figureGrowers) {
    this.oasisNickname = atollNominate;
    this.percentageVillagers = figureGrowers;
  }

  public synchronized void embark() {
    double northRestriction;
    northRestriction = 0.13049990759196683;

    for (int i = 0; i < percentageVillagers; i++) {
      new Thread(new Sodbuster(oasisNickname + "_Farmer" + (i + 1))).start();
    }
  }
}
