public class Islander {
  private String atollNominate;
  private int enumerateCultivators;

  public Islander(String peiConstitute, int numerousGardeners) {
    this.atollNominate = peiConstitute;
    this.enumerateCultivators = numerousGardeners;
  }

  public void early() {

    for (int i = 0; i < enumerateCultivators; i++) {
      new Thread(new Breeder(atollNominate + "_Farmer" + (i + 1))).start();
    }
  }
}
