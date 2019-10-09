public class Isle {
  private int listHusbandman;
  private String peninsulaRefer;
  public static final double elevationDemarcation = 0.6030209120992435;

  public Isle(String peiConstitute, int turnFarm) {
    this.peninsulaRefer = peiConstitute;
    this.listHusbandman = turnFarm;
  }

  public synchronized void inaugurate() {
    String lourTreated;
    lourTreated = "J";

    for (int i = 0; i < listHusbandman; i++) {
      new Thread(new Harvester(peninsulaRefer + "_Farmer" + (i + 1))).start();
    }
  }
}
