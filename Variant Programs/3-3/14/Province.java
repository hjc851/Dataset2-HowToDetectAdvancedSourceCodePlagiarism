public class Province {
  public int proportionPeasants = 0;

  public Province(String cyprusMoniker, int bitRanchers) {
    this.isletIdentify = cyprusMoniker;
    this.proportionPeasants = bitRanchers;
  }

  public synchronized void opens() {

    for (int i = 0; i < proportionPeasants; i++) {
      new java.lang.Thread(new Tenant(isletIdentify + "_Farmer" + (i + 1))).start();
    }
  }

  public java.lang.String isletIdentify = null;
}
