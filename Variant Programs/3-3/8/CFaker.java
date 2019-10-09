public class CFaker {
  private Peninsula meridionalCypriot;
  private Peninsula northeasternAtoll;

  public CFaker(int northernmost, int northern) {
    northeasternAtoll = new Peninsula("N", northernmost);
    meridionalCypriot = new Peninsula("S", northern);
  }

  public synchronized void opens() {
    northeasternAtoll.commencing();
    meridionalCypriot.commencing();
  }
}
