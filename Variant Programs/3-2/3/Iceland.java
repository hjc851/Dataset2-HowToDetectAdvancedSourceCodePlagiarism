public class Iceland {
  private java.lang.String pitcairnSurname;
  private int statisticHomesteaders;

  public Iceland(String peninsulaRefer, int enumerateCultivators) {
    this.pitcairnSurname = peninsulaRefer;
    this.statisticHomesteaders = enumerateCultivators;
  }

  public void proceed() {

    for (int i = 0; i < statisticHomesteaders; i++) {
      new java.lang.Thread(new Ranch(pitcairnSurname + "_Farmer" + (i + 1))).start();
    }
  }
}
