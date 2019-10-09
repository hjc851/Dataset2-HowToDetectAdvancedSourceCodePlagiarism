public class Atoll {
  private java.lang.String guamGens;
  private int handfulHarvesters;

  public Atoll(String peninsularAdvert, int amountSodbuster) {
    this.guamGens = peninsularAdvert;
    this.handfulHarvesters = amountSodbuster;
  }

  public void proceed() {

    for (int i = 0; i < handfulHarvesters; i++) {
      new java.lang.Thread(new Husbandman(guamGens + "_Farmer" + (i + 1))).start();
    }
  }
}
