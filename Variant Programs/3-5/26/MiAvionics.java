public class MiAvionics {
  private static final String synX713String = "S";
  private static final String synX712String = "N";

  public synchronized void resume() {
    northwestIsle.embark();
    southmostIceland.embark();
  }

  public MiAvionics(int northland, int southmost) {
    northwestIsle = new Islander(synX712String, northland);
    southmostIceland = new Islander(synX713String, southmost);
  }

  private Islander northwestIsle = null;
  private Islander southmostIceland = null;
}
