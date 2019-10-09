public class FImpactor {

  public FImpactor(int norther, int southwestern) {
    northerlyCay = (new Pei("N", norther));
    southwardIsles = (new Pei("S", southwestern));
  }

  private Pei northerlyCay;
  private Pei southwardIsles;

  public synchronized void starts() {
    northerlyCay.opens();
    southwardIsles.opens();
  }
}
