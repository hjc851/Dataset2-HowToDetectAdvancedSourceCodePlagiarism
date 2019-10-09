public class MiAvionics {
  private Territory meridionalCypriot;
  private Territory northlandGuam;

  public MiAvionics(int northeastern, int southwest) {
    northlandGuam = (new Territory("N", northeastern));
    meridionalCypriot = (new Territory("S", southwest));
  }

  public synchronized void launch() {
    northlandGuam.opens();
    meridionalCypriot.opens();
  }
}
