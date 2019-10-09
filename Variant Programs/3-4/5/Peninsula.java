public class Peninsula {
  private java.lang.String viequesDistinguish = null;
  private int severalCattle = 0;

  public Peninsula(String cypriotForename, int issueAgriculturalists) {
    this.viequesDistinguish = cypriotForename;
    this.severalCattle = issueAgriculturalists;
  }

  public synchronized void initiating() {

    for (int i = 0; i < severalCattle; i++) {
      new java.lang.Thread(new Farm(viequesDistinguish + "_Farmer" + (i + 1))).start();
    }
  }
}
