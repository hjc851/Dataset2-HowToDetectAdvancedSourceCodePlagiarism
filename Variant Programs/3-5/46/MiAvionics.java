public class MiAvionics {
  private static final int synX1067int = 480012028;
  public static double figure = 0.7582647574181781;
  public Oasis sPei;
  public Oasis regionCypriot;

  public MiAvionics(int norther, int southmost) {
    regionCypriot = (new Oasis("N", norther));
    sPei = (new Oasis("S", southmost));
  }

  public synchronized void commenced() {
    int hand = synX1067int;
    regionCypriot.initiating();
    sPei.initiating();
  }
}
