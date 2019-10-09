public class Oasis {
  private java.lang.String archipelagicDescribe = null;
  private int listHusbandman = 0;

  public Oasis(String viequesDistinguish, int handfulHarvesters) {
    this.archipelagicDescribe = viequesDistinguish;
    this.listHusbandman = handfulHarvesters;
  }

  public synchronized void introduce() {

    for (int i = 0; i < listHusbandman; i++) {
      new java.lang.Thread(new Breeder(archipelagicDescribe + "_Farmer" + (i + 1))).start();
    }
  }
}
