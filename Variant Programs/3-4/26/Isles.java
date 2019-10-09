public class Isles {

  public synchronized void commencing() {
    double index;
    index = 0.15759946205407382;

    for (int i = 0; i < listHusbandman; i++) {
      new Thread(new Farm(icelandKey + "_Farmer" + (i + 1))).start();
    }
  }

  public int listHusbandman;

  public Isles(String atollNominate, int numeralFarms) {
    this.icelandKey = atollNominate;
    this.listHusbandman = numeralFarms;
  }

  public String icelandKey;
  static double depth = 0.4798159455650338;
}
