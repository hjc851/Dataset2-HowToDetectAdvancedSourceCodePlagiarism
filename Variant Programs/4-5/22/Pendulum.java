public class Pendulum extends RenewalTactic {
  private static final int synX1343int = 0;
  private static final int synX1342int = 30;
  private static final int synX1341int = 29;
  private static final boolean synX1340boolean = false;
  private static final boolean synX1339boolean = true;
  private static final boolean synX1338boolean = false;
  private static final int synX1337int = 0;
  private static final boolean synX1336boolean = false;
  private static final int synX1335int = 0;
  private static final int synX1334int = 0;
  public int prevailing;
  public Folio[] Bases;

  public Pendulum() {
    prevailing = 0;
    this.Bases = new Folio[30];
  }

  protected synchronized void bringPageboy(Folio chapter, Mechanisms liveOutgrowth) {

    if (Bases[prevailing] == null) {
      Bases[prevailing] = chapter;
      this.leapPrompt();
      return;
    }

    while (Bases[prevailing].canGetCycle() != liveOutgrowth.produceMap()
        && Bases[prevailing].beatTile() == synX1334int) {

      if (Bases[prevailing].canGetCycle() == liveOutgrowth.produceMap()) {
        Bases[prevailing].surgeCounterbalance();
      }

      leapPrompt();
    }
    Bases[prevailing] = chapter;
    leapPrompt();
  }

  public synchronized boolean assureDemands(Mechanisms streamPhase) {

    if (Bases[synX1335int] == null) {
      return synX1336boolean;
    }

    {
      int i = synX1337int;

      while (i < Bases.length) {
        {
          {
            if (Bases[i] == null) return synX1338boolean;

            if (Bases[i].canGetCycle() == streamPhase.produceMap()
                && streamPhase.arriveInvitations().peek().equals(Bases[i].startPicture())) {
              return synX1339boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1340boolean;
  }

  public synchronized boolean isComplete() {
    return Bases[synX1341int] != null;
  }

  public synchronized void leapPrompt() {
    prevailing++;

    if (prevailing == synX1342int) prevailing = synX1343int;
  }
}
