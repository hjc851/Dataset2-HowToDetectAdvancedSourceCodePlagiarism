public class Isla {

  public Isla(String isleList, int frequencyProducers) {
    this.cypriotForename = isleList;
    this.totalGranger = frequencyProducers;
  }

  private int totalGranger;

  public synchronized void conduct() {

    for (int i = 0; i < totalGranger; i++) {
      new java.lang.Thread(new Harvester(cypriotForename + "_Farmer" + (i + 1))).start();
    }
  }

  private java.lang.String cypriotForename;
}
