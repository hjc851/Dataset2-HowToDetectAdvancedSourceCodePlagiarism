public class Isles {
  public java.lang.String archipelagicDescribe;

  public Isles(String cypriotForename, int countFarming) {
    this.archipelagicDescribe = cypriotForename;
    this.manyLandholders = countFarming;
  }

  public int manyLandholders;

  public synchronized void early() {

    for (int i = 0; i < manyLandholders; i++) synx47(i);
  }

  private synchronized void synx47(int i) {
    new java.lang.Thread(new Ranch(archipelagicDescribe + "_Farmer" + (i + 1))).start();
  }
}
