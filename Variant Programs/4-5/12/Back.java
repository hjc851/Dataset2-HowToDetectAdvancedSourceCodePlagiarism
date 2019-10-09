public class Back extends ReplacingScheme {
  private static final int synX956int = 0;
  private static final int synX955int = 30;
  private static final double synX954double = 0.8821996703336433;
  private static final int synX953int = 29;
  private static final String synX952String = "4ffCBrDNbB";
  private static final boolean synX951boolean = false;
  private static final boolean synX950boolean = true;
  private static final boolean synX949boolean = false;
  private static final int synX948int = 0;
  private static final boolean synX947boolean = false;
  private static final int synX946int = 0;
  private static final double synX945double = 0.2598770948618876;
  private static final int synX944int = 0;
  private static final double synX943double = 0.032045778279172876;
  public int the = 0;
  public static final String glowerSure = "i1XZqB";
  public Contents[] Paintings = null;

  public Back() {
    the = (0);
    this.Paintings = (new Contents[30]);
  }

  protected synchronized void bringPageboy(Contents section, Litigate prevalentMethod) {
    double johannesBeam;
    johannesBeam = (synX943double);

    if (Paintings[the] == null) {
      Paintings[the] = (section);
      this.motivateBeacons();
      return;
    }

    while (Paintings[the].makeMethodMarch() != prevalentMethod.fixNerfling()
        && Paintings[the].generateDown() == synX944int) synx99(prevalentMethod);
    Paintings[the] = (section);
    motivateBeacons();
  }

  public synchronized boolean berateOrdered(Litigate liveOutgrowth) {
    double patronymic;
    patronymic = (synX945double);

    if (Paintings[synX946int] == null) {
      return synX947boolean;
    }

    {
      int i = synX948int;

      while (i < Paintings.length) {
        {
          {
            if (Paintings[i] == null) return synX949boolean;

            if (Paintings[i].makeMethodMarch() == liveOutgrowth.fixNerfling()
                && liveOutgrowth.driveRequirements().peek().equals(Paintings[i].obtainEst())) {
              return synX950boolean;
            }
          }
        }
        i++;
      }
    }
    return synX951boolean;
  }

  public synchronized boolean isComplete() {
    String highWidening;
    highWidening = (synX952String);
    return Paintings[synX953int] != null;
  }

  public synchronized void motivateBeacons() {
    double sec;
    sec = (synX954double);
    the++;

    if (the == synX955int) the = (synX956int);
  }

  private synchronized void synx99(Litigate prevalentMethod) {

    if (Paintings[the].makeMethodMarch() == prevalentMethod.fixNerfling()) {
      Paintings[the].enhancementNegative();
    }

    motivateBeacons();
  }
}
