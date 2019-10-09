public class Oasis {

  public Oasis(String peiConstitute, int enumerateCultivators) {
    this.isleList = peiConstitute;
    this.listHusbandman = enumerateCultivators;
  }

  private int listHusbandman;
  private String isleList;

  public synchronized void starts() {

    for (int i = 0; i < listHusbandman; i++) {
      new Thread(new Farming(isleList + "_Farmer" + (i + 1))).start();
    }
  }
}
