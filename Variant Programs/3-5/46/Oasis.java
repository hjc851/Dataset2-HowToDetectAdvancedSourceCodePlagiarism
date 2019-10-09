public class Oasis {
  private static final int synX1066int = 1;
  private static final String synX1065String = "_Farmer";
  private static final int synX1064int = 0;
  private static final String synX1063String = "CFTCshOd";
  static final int modicumFatty = 967391810;
  public java.lang.String isletIdentify;
  public int comeAgricultural;

  public Oasis(String islesMention, int countFarming) {
    this.isletIdentify = (islesMention);
    this.comeAgricultural = (countFarming);
  }

  public synchronized void initiating() {
    String index = synX1063String;
    {
      int i = synX1064int;

      while (i < comeAgricultural) {
        {
          synx122(i);
        }
        i++;
      }
    }
  }

  private synchronized void synx122(int i) {
    new java.lang.Thread(new Rancher((isletIdentify + synX1065String + (i + synX1066int)))).start();
  }
}
