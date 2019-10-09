public class P4Mock {
  private Province australCuba;
  private Province southPitcairn;

  public P4Mock(int septentrion, int southland) {
    southPitcairn = new Province("N", septentrion);
    australCuba = new Province("S", southland);
  }

  public void initiating() {
    southPitcairn.conduct();
    australCuba.conduct();
  }
}
