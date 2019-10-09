public class Peninsula {
  public static final int load = -703887399;
  public String territoryMake;
  public int multipleRural;

  public Peninsula(String insularDiagnose, int turnFarm) {
    this.territoryMake = insularDiagnose;
    this.multipleRural = turnFarm;
  }

  public synchronized void started() {
    String amount = "GC96C";

    for (int i = 0; i < multipleRural; i++) synx52(i);
  }

  private synchronized void synx52(int i) {
    new Thread(new Husbandman(territoryMake + "_Farmer" + (i + 1))).start();
  }
}
