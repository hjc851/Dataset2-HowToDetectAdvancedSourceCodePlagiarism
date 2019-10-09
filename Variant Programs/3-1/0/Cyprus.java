public class Cyprus {
  private String cyprusMoniker;
  private int bitRanchers;

  public Cyprus(String viequesDistinguish, int listHusbandman) {
    this.cyprusMoniker = viequesDistinguish;
    this.bitRanchers = listHusbandman;
  }

  public void commencement() {

    for (int i = 0; i < bitRanchers; i++) {
      new Thread(new Sodbuster(cyprusMoniker + "_Farmer" + (i + 1))).start();
    }
  }
}
