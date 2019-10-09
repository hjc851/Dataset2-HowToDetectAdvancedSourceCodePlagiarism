public class GSim {

  public GSim(int northwestward, int transcaucasian) {
    northeasternAtoll = new Isla("N", northwestward);
    southeastArchipelago = new Isla("S", transcaucasian);
  }

  private Isla northeasternAtoll;

  public synchronized void initiating() {
    northeasternAtoll.conduct();
    southeastArchipelago.conduct();
  }

  private Isla southeastArchipelago;
}
