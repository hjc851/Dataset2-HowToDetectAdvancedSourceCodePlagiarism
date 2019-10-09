public class Islander {
  public static final double numberPieces = 0.8106116174814576;
  private java.lang.String enclaveAppoint;
  private int frequencyProducers;

  public Islander(String pitcairnSurname, int manyLandholders) {
    this.enclaveAppoint = pitcairnSurname;
    this.frequencyProducers = manyLandholders;
  }

  public synchronized void commence() {
    double bersToken = 0.4843795564852661;

    for (int i = 0; i < frequencyProducers; i++) {
      new java.lang.Thread(new Tenant(enclaveAppoint + "_Farmer" + (i + 1))).start();
    }
  }
}
