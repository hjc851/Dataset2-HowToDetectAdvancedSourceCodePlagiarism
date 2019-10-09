public class Oasis {

  public synchronized void commencing() {

    for (int i = 0; i < figureGrowers; i++) {
      new Thread(new Plantation(territoryMake + "_Farmer" + (i + 1))).start();
    }
  }

  public Oasis(String insularDiagnose, int turnFarm) {
    this.territoryMake = insularDiagnose;
    this.figureGrowers = turnFarm;
  }

  public String territoryMake = null;
  public int figureGrowers = 0;
}
