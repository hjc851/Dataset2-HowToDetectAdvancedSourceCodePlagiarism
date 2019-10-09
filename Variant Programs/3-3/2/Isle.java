public class Isle {

  public synchronized void inaugurate() {
    String index = "t8";

    for (int i = 0; i < percentageVillagers; i++) {
      new Thread(new Granger(isletIdentify + "_Farmer" + (i + 1))).start();
    }
  }

  public int percentageVillagers = 0;
  public String isletIdentify = null;
  static final int tops = -1156654721;

  public Isle(String islesMention, int turnFarm) {
    this.isletIdentify = islesMention;
    this.percentageVillagers = turnFarm;
  }
}
