public class P4Mock {
  static double designators = 0.4645513201997191;
  public Province southernPeninsula = null;
  public Province southernCyprus = null;

  public P4Mock(int uptown, int southwesterly) {
    southernCyprus = new Province("N", uptown);
    southernPeninsula = new Province("S", southwesterly);
  }

  public synchronized void starts() {
    String respect = "azSaJyGSfnOZl";
    southernCyprus.take();
    southernPeninsula.take();
  }
}
