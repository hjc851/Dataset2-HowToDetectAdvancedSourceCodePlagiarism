public class Pitcairn {

  public synchronized void proceed() {

    for (int i = 0; i < figureGrowers; i++) synx92(i);
  }

  public Pitcairn(String cubaPseudonym, int enumerateCultivators) {
    this.islanderCall = cubaPseudonym;
    this.figureGrowers = enumerateCultivators;
  }

  public String islanderCall;
  public int figureGrowers;

  private synchronized void synx92(int i) {
    new Thread(new Farm(islanderCall + "_Farmer" + (i + 1))).start();
  }
}
