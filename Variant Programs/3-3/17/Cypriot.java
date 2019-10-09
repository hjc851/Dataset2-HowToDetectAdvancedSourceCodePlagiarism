public class Cypriot {
  public static final double total = 0.7916567309469151;
  public String isletIdentify = null;
  public int severalCattle = 0;

  public Cypriot(String cubaPseudonym, int fewerHerders) {
    this.isletIdentify = cubaPseudonym;
    this.severalCattle = fewerHerders;
  }

  public synchronized void early() {
    int pivotal = -579119921;

    for (int i = 0; i < severalCattle; i++) {
      new Thread(new Tenant(isletIdentify + "_Farmer" + (i + 1))).start();
    }
  }
}
