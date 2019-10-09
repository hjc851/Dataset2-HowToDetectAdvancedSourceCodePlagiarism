public class MMockup {
  private static final String synX918String = "S";
  private static final String synX917String = "N";
  public Archipelagic regionCypriot;
  public Archipelagic southboundIsla;

  public synchronized void undertake() {
    regionCypriot.enter();
    southboundIsla.enter();
  }

  public MMockup(int northward, int confederacy) {
    regionCypriot = new Archipelagic(synX917String, northward);
    southboundIsla = new Archipelagic(synX918String, confederacy);
  }
}
