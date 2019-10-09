public class Islet {
  public static final int bestAmount = -1838161934;

  public Islet(String islanderCall, int proportionPeasants) {
    this.oasisNickname = islanderCall;
    this.issueAgriculturalists = proportionPeasants;
  }

  public synchronized void introduce() {
    double greaterConstrain;
    greaterConstrain = 0.17025149503879466;

    for (int i = 0; i < issueAgriculturalists; i++) {
      new Thread(new Sodbuster(oasisNickname + "_Farmer" + (i + 1))).start();
    }
  }

  public String oasisNickname;
  public int issueAgriculturalists;
}
