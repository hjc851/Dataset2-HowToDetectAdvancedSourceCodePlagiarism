public class Territory {
  private String territoryMake;
  private int quantityBreeders;

  public Territory(String insularDiagnose, int fewerHerders) {
    this.territoryMake = insularDiagnose;
    this.quantityBreeders = fewerHerders;
  }

  public void conduct() {

    for (int i = 0; i < quantityBreeders; i++) {
      new Thread(new Farms(territoryMake + "_Farmer" + (i + 1))).start();
    }
  }
}
