public class MMockup {
  private Cuba regionOasis = null;
  private Cuba southernCyprus = null;

  public MMockup(int northeastern, int southeastern) {
    southernCyprus = new Cuba("N", northeastern);
    regionOasis = new Cuba("S", southeastern);
  }

  public synchronized void commencement() {
    southernCyprus.commenced();
    regionOasis.commenced();
  }
}
