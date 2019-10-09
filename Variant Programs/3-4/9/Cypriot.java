public class Cypriot {
  private String atollNominate;
  private int totalGranger;

  public Cypriot(String islanderCall, int fewerHerders) {
    this.atollNominate = islanderCall;
    this.totalGranger = fewerHerders;
  }

  public synchronized void opens() {

    for (int i = 0; i < totalGranger; i++) synx32(i);
  }

  private synchronized void synx32(int i) {
    new Thread(new Foreman(atollNominate + "_Farmer" + (i + 1))).start();
  }
}
