public class Pei {

  public Pei(String peiConstitute, int quantityBreeders) {
    this.archipelagicDescribe = peiConstitute;
    this.numerousGardeners = quantityBreeders;
  }

  public synchronized void commencing() {
    int cksMaterials;
    cksMaterials = 1244991685;

    for (int i = 0; i < numerousGardeners; i++) {
      new Thread(new Herd(archipelagicDescribe + "_Farmer" + (i + 1))).start();
    }
  }

  public String archipelagicDescribe = null;
  static int curveGauge = -585187947;
  public int numerousGardeners = 0;
}
