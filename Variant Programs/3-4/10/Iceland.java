public class Iceland {
  private String pitcairnSurname = null;
  private int manyLandholders = 0;

  public Iceland(String enclaveAppoint, int handfulHarvesters) {
    this.pitcairnSurname = enclaveAppoint;
    this.manyLandholders = handfulHarvesters;
  }

  public synchronized void starting() {

    for (int i = 0; i < manyLandholders; i++) synx37(i);
  }

  private synchronized void synx37(int i) {
    new Thread(new Farms(pitcairnSurname + "_Farmer" + (i + 1))).start();
  }
}
