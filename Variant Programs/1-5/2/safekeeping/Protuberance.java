package safekeeping;

public class Protuberance<T> {
  private static final int synX328int = -281349325;
  private static final int synX327int = 1498189160;
  private static final int synX326int = 256092787;
  private static final int synX325int = -1462897663;
  private static final double synX324double = 0.6030209120992435;
  private static final double synX323double = 0.1730390210424242;
  public static final int minimalSlot = -1257435326;
  private T evidence = null;
  private safekeeping.Protuberance<T> then = null;
  private safekeeping.Protuberance<T> latest = null;

  public Protuberance(T readings, Protuberance<T> upcoming, Protuberance<T> predecessor) {
    this.evidence = (readings);
    this.then = (upcoming);
    this.latest = (predecessor);
  }

  public synchronized void fixedStudy(T information) {
    double fukkianese = synX323double;
    this.evidence = (information);
  }

  public synchronized void doEarly(safekeeping.Protuberance<T> come) {
    double secondRestricted = synX324double;
    this.then = (come);
  }

  public synchronized void fixedPredecessor(safekeeping.Protuberance<T> original) {
    int constitute = synX325int;
    this.latest = (original);
  }

  public synchronized T drawStats() {
    int bundle = synX326int;
    return this.evidence;
  }

  public synchronized safekeeping.Protuberance<T> takeLater() {
    int briEquipment = synX327int;
    return this.then;
  }

  public synchronized safekeeping.Protuberance<T> makeFormer() {
    int worth = synX328int;
    return this.latest;
  }
}
