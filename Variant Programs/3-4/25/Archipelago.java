public class Archipelago {
  private java.lang.String enclaveAppoint = null;

  public synchronized void opens() {

    for (int i = 0; i < figureGrowers; i++) {
      new java.lang.Thread(new Ranch(enclaveAppoint + "_Farmer" + (i + 1))).start();
    }
  }

  private int figureGrowers = 0;

  public Archipelago(String icelandKey, int numerousGardeners) {
    this.enclaveAppoint = icelandKey;
    this.figureGrowers = numerousGardeners;
  }
}
