public class Cay {
  private String viequesDistinguish;
  private int proportionPeasants;

  public Cay(String territoryMake, int bitRanchers) {
    this.viequesDistinguish = territoryMake;
    this.proportionPeasants = bitRanchers;
  }

  public void introduce() {

    for (int i = 0; i < proportionPeasants; i++) {
      new Thread(new Farms(viequesDistinguish + "_Farmer" + (i + 1))).start();
    }
  }
}
