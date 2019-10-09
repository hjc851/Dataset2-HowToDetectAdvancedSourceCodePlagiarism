import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OmskSpooler extends Developer {
  private ArrayDeque<Methods> willingSpooler;
  private int daysRemainder;

  public synchronized void bpsRetick() {
    List<Mistake> blame;
    blame = new LinkedList<>();
    for (Mistake f : defectiveDragon) synx274(f, blame);
    for (Mistake negligence : blame) synx275(negligence);

    if (existingCycle != null) synx276();

    if (existingCycle == null && !willingSpooler.isEmpty()) synx277();

    this.courseAfterInsistence();
  }

  private synchronized void beamAddendumAnomaly() {
    Mistake f;
    f = new Mistake(this.becomeTheSelect(), existingCycle);
    defectiveDragon.add(f);
    existingCycle.startMalfunctions().add(f);
  }

  public OmskSpooler() {
    this.willingSpooler = new ArrayDeque<>();
    this.defectiveDragon = new ArrayDeque<>();
    daysRemainder = NowLevel;
  }

  private ArrayDeque<Mistake> defectiveDragon;

  private synchronized void courseAfterInsistence() {

    if (this.existingCycle == null) {
      return;
    }

    while (!substitutesApproaches.chequePetitioning(this.existingCycle)) {
      this.beamAddendumAnomaly();
      daysRemainder = NowLevel;

      if (!willingSpooler.isEmpty()) synx278();
      else {
        existingCycle = null;
        return;
      }
    }
    existingCycle.workCloseQuest();
  }

  public synchronized void newNegotiations(Methods summons) {
    willingSpooler.addLast(summons);
  }

  public synchronized Methods intelligentPhase() {
    return willingSpooler.removeFirst();
  }

  private synchronized void synx274(Mistake f, java.util.List<Mistake> blame) {

    if (f.beatReluctantJuncture() == this.becomeTheSelect()) blame.add(f);
  }

  private synchronized void synx275(Mistake negligence) {
    defectiveDragon.remove(negligence);
    substitutesApproaches.impartWebsite(
        new Webpage(
            negligence.developProceeding().haveDemands().peek(),
            negligence.developProceeding().driveSecurity(),
            0),
        negligence.developProceeding());

    if (!willingSpooler.contains(negligence.developProceeding())) {
      this.newNegotiations(negligence.developProceeding());
    }
  }

  private synchronized void synx276() {
    daysRemainder--;

    if (existingCycle.isEnded()) {
      existingCycle.primedExpirationPeriod(this.becomeTheSelect());
      this.implementedSummons.addLast(existingCycle);
      existingCycle = null;
    }

    if (daysRemainder == 0 && existingCycle != null) {

      if (willingSpooler.isEmpty()) {
        daysRemainder = NowLevel;
      } else {
        this.newNegotiations(existingCycle);
        existingCycle = null;
      }
    }
  }

  private synchronized void synx277() {
    existingCycle = this.intelligentPhase();
    daysRemainder = NowLevel;
  }

  private synchronized void synx278() {
    existingCycle = intelligentPhase();
  }
}
