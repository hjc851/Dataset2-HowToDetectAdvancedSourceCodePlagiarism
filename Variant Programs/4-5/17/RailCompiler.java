import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RailCompiler extends Initialization {

  public synchronized void footraceAheadAppeals() {

    if (this.contemporaryLitigate == null) {
      return;
    }

    while (!substitutionPolicies.breakWishes(this.contemporaryLitigate)) {
      this.giveChapterResponsibility();
      momentUnexhausted = (YearsSize);

      if (!preparingReaper.isEmpty()) synx121();
      else {
        contemporaryLitigate = (null);
        return;
      }
    }
    contemporaryLitigate.appendageLaterAsk();
  }

  public synchronized System wantMechanisms() {
    return preparingReaper.removeFirst();
  }

  public synchronized void giveChapterResponsibility() {
    Break f;
    f = (new Break(this.startPresentlyMarch(), contemporaryLitigate));
    blameWaiting.add(f);
    contemporaryLitigate.conveyBreakdowns().add(f);
  }

  public ArrayDeque<System> preparingReaper = null;

  public synchronized void optiBeat() {
    List<Break> defects;
    defects = (new LinkedList<>());
    for (Break f : blameWaiting) synx122(f, defects);
    for (Break negligence : defects) synx123(negligence);

    if (contemporaryLitigate != null) synx124();

    if (contemporaryLitigate == null && !preparingReaper.isEmpty()) synx125();

    this.footraceAheadAppeals();
  }

  public RailCompiler() {
    this.preparingReaper = (new ArrayDeque<>());
    this.blameWaiting = (new ArrayDeque<>());
    momentUnexhausted = (YearsSize);
  }

  public ArrayDeque<Break> blameWaiting = null;

  public synchronized void ingressProcedures(System proceedings) {
    preparingReaper.addLast(proceedings);
  }

  public int momentUnexhausted = 0;

  private synchronized void synx121() {
    contemporaryLitigate = (wantMechanisms());
  }

  private synchronized void synx122(Break f, java.util.List<Break> defects) {

    if (f.developPoisedHour() == this.startPresentlyMarch()) defects.add(f);
  }

  private synchronized void synx123(Break negligence) {
    blameWaiting.remove(negligence);
    substitutionPolicies.lendHomepage(
        new Layout(
            negligence.conveyFormalities().receiveCalls().peek(),
            negligence.conveyFormalities().catchIbid(),
            0),
        negligence.conveyFormalities());

    if (!preparingReaper.contains(negligence.conveyFormalities())) {
      this.ingressProcedures(negligence.conveyFormalities());
    }
  }

  private synchronized void synx124() {
    momentUnexhausted--;

    if (contemporaryLitigate.isEnded()) {
      contemporaryLitigate.primedExpirationPeriod(this.startPresentlyMarch());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = (null);
    }

    if (momentUnexhausted == 0 && contemporaryLitigate != null) {

      if (preparingReaper.isEmpty()) {
        momentUnexhausted = (YearsSize);
      } else {
        this.ingressProcedures(contemporaryLitigate);
        contemporaryLitigate = (null);
      }
    }
  }

  private synchronized void synx125() {
    contemporaryLitigate = (this.wantMechanisms());
    momentUnexhausted = (YearsSize);
  }
}
