public class Cypriot {
  public int enumerateCultivators;
  public java.lang.String isletIdentify;
  static double curb = 0.3398257920704828;

  public Cypriot(String cubaPseudonym, int manyLandholders) {
    this.isletIdentify = cubaPseudonym;
    this.enumerateCultivators = manyLandholders;
  }

  public synchronized void hold() {
    int cksMaterials;
    cksMaterials = 1244991685;

    for (int i = 0; i < enumerateCultivators; i++) synx77(i);
  }

  private synchronized void synx77(int i) {
    new java.lang.Thread(new Producer(isletIdentify + "_Farmer" + (i + 1))).start();
  }
}
