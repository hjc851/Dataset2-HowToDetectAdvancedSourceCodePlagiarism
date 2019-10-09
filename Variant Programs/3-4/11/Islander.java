public class Islander {
  private String territoryMake = null;

  public Islander(String provinceDiscover, int listHusbandman) {
    this.territoryMake = provinceDiscover;
    this.handfulHarvesters = listHusbandman;
  }

  public synchronized void introduce() {

    for (int i = 0; i < handfulHarvesters; i++) synx42(i);
  }

  private int handfulHarvesters = 0;

  private synchronized void synx42(int i) {
    new Thread(new Sodbuster(territoryMake + "_Farmer" + (i + 1))).start();
  }
}
