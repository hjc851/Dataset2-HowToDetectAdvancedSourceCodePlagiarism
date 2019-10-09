public class Alarm extends SubstituteStrategic {
  private static final boolean synX244boolean = false;
  private static final boolean synX243boolean = true;
  private static final boolean synX242boolean = false;
  private static final int synX241int = 0;
  private static final boolean synX240boolean = false;
  private static final int synX239int = 0;
  private static final double synX238double = 0.08476015478247001;
  private static final int synX237int = 0;
  private static final int synX236int = 30;
  private static final int synX235int = 1127055936;
  private static final int synX234int = 0;
  private static final double synX233double = 0.10778275568730522;
  private static final int synX232int = 30;
  private static final int synX231int = 0;
  private static final int synX230int = 29;
  private static final double synX229double = 0.6533080417752668;
  private int present = 0;
  public static final double depressShackled = 0.4028078523947658;

  public synchronized boolean isComplete() {
    double chained;
    chained = synX229double;
    return Tires[synX230int] != null;
  }

  public Alarm() {
    present = synX231int;
    this.Tires = new Annexes[synX232int];
  }

  private Annexes[] Tires = null;

  protected synchronized void enhanceFront(Annexes addendum, Operation prevalentMethod) {
    double kesThings;
    kesThings = synX233double;

    if (Tires[present] == null) {
      Tires[present] = addendum;
      this.propelPoint();
      return;
    }

    while (Tires[present].conveyUnlockFormalities() != prevalentMethod.catchIbid()
        && Tires[present].findBar() == synX234int) {

      if (Tires[present].conveyUnlockFormalities() == prevalentMethod.catchIbid()) {
        Tires[present].echelonUndercut();
      }

      propelPoint();
    }
    Tires[present] = addendum;
    propelPoint();
  }

  private synchronized void propelPoint() {
    int matt;
    matt = synX235int;
    present++;

    if (present == synX236int) present = synX237int;
  }

  public synchronized boolean tabAsked(Operation previousProceeding) {
    double critical;
    critical = synX238double;

    if (Tires[synX239int] == null) {
      return synX240boolean;
    }

    for (int i = synX241int; i < Tires.length; i++) {

      if (Tires[i] == null) return synX242boolean;

      if (Tires[i].conveyUnlockFormalities() == previousProceeding.catchIbid()
          && previousProceeding.haveDemands().peek().equals(Tires[i].makeDimidiate())) {
        return synX243boolean;
      }
    }
    return synX244boolean;
  }
}
