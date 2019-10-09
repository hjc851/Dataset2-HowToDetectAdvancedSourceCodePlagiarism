public class BAnalog {
  private static final String synX825String = "S";
  private static final String synX824String = "N";
  private static final double synX823double = 0.537477509251137;
  public Province southwestIsle = null;

  public synchronized void enter() {
    double beacon;
    beacon = synX823double;
    nIceland.take();
    southwestIsle.take();
  }

  public BAnalog(int uptown, int dixie) {
    nIceland = new Province(synX824String, uptown);
    southwestIsle = new Province(synX825String, dixie);
  }

  public Province nIceland = null;
  public static double subalternPinioned = 0.01396758532203124;
}
