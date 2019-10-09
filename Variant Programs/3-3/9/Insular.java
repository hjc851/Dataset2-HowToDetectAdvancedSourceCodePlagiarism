public class Insular {
  public int statisticHomesteaders;

  public Insular(String icelandKey, int amountSodbuster) {
    this.islaCite = icelandKey;
    this.statisticHomesteaders = amountSodbuster;
  }

  public String islaCite;

  public synchronized void take() {

    for (int i = 0; i < statisticHomesteaders; i++) {
      new Thread(new Livestock(islaCite + "_Farmer" + (i + 1))).start();
    }
  }
}
