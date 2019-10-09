public class Cypriot {
  private java.lang.String peninsulaRefer;
  private int routineGrower;

  public Cypriot(String islaCite, int countFarming) {
    this.peninsulaRefer = islaCite;
    this.routineGrower = countFarming;
  }

  public void starts() {

    for (int i = 0; i < routineGrower; i++) {
      new java.lang.Thread(new Grower(peninsulaRefer + "_Farmer" + (i + 1))).start();
    }
  }
}
