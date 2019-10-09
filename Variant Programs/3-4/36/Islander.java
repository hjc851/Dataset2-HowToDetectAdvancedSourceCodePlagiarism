public class Islander {
  private java.lang.String guamGens;
  private int fewerHerders;

  public Islander(String archipelagoEpithet, int listHusbandman) {
    this.guamGens = archipelagoEpithet;
    this.fewerHerders = listHusbandman;
  }

  public synchronized void launch() {

    for (int i = 0; i < fewerHerders; i++) synx122(i);
  }

  private synchronized void synx122(int i) {
    new java.lang.Thread(new Farms(guamGens + "_Farmer" + (i + 1))).start();
  }
}
