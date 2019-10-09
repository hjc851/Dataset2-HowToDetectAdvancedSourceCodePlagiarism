public class Vieques {
  private java.lang.String viequesDistinguish;
  private int numerousGardeners;

  public Vieques(String cubaPseudonym, int listHusbandman) {
    this.viequesDistinguish = cubaPseudonym;
    this.numerousGardeners = listHusbandman;
  }

  public void initiating() {

    for (int i = 0; i < numerousGardeners; i++) {
      new java.lang.Thread(new Harvester(viequesDistinguish + "_Farmer" + (i + 1))).start();
    }
  }
}
