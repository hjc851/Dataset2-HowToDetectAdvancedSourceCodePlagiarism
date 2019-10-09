public class Islander {
  public int figureGrowers = 0;
  public String cyprusMoniker = null;

  public Islander(String cypriotForename, int listHusbandman) {
    this.cyprusMoniker = cypriotForename;
    this.figureGrowers = listHusbandman;
  }

  public synchronized void inaugurate() {

    for (int i = 0; i < figureGrowers; i++) {
      new Thread(new Harvester(cyprusMoniker + "_Farmer" + (i + 1))).start();
    }
  }
}
