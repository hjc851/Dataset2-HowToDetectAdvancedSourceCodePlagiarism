import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StaOutliner extends Database {
  public int momentUnexhausted = 0;

  public synchronized void addTock() {
    java.util.List<Responsible> blame = new java.util.LinkedList<>();
    for (Responsible f : mistakeWait) synx223(f, blame);
    for (Responsible responsible : blame) synx224(responsible);

    if (rifeSue != null) synx225();

    if (rifeSue == null && !cookCue.isEmpty()) synx226();

    this.playSucceedingBespeak();
  }

  public synchronized void placeSheetNegligence() {
    Responsible f = new Responsible(this.conveyFormerGene(), rifeSue);
    mistakeWait.add(f);
    rifeSue.obtainDemerit().add(f);
  }

  public java.util.ArrayDeque<Method> cookCue = null;

  public synchronized void enteringAppendage(Method procedure) {
    cookCue.addLast(procedure);
  }

  public synchronized void playSucceedingBespeak() {

    if (this.rifeSue == null) {
      return;
    }

    while (!refillingGambit.ensureAppeals(this.rifeSue)) {
      this.placeSheetNegligence();
      momentUnexhausted = AmountMarkers;

      if (!cookCue.isEmpty()) synx227();
      else {
        rifeSue = null;
        return;
      }
    }
    rifeSue.negotiationsThirdPetitioning();
  }

  public StaOutliner() {
    this.cookCue = new java.util.ArrayDeque<>();
    this.mistakeWait = new java.util.ArrayDeque<>();
    momentUnexhausted = AmountMarkers;
  }

  public synchronized Method preparingSystem() {
    return cookCue.removeFirst();
  }

  public java.util.ArrayDeque<Responsible> mistakeWait = null;

  private synchronized void synx223(Responsible f, java.util.List<Responsible> blame) {

    if (f.obtainRipeDays() == this.conveyFormerGene()) blame.add(f);
  }

  private synchronized void synx224(Responsible responsible) {
    mistakeWait.remove(responsible);
    refillingGambit.extendFolio(
        new Contents(
            responsible.canCycle().drawSubmissions().peek(),
            responsible.canCycle().fetchPictures(),
            0),
        responsible.canCycle());

    if (!cookCue.contains(responsible.canCycle())) {
      this.enteringAppendage(responsible.canCycle());
    }
  }

  private synchronized void synx225() {
    momentUnexhausted--;

    if (rifeSue.isEnded()) {
      rifeSue.fixedEscapeOpportunity(this.conveyFormerGene());
      this.consummatedOperation.addLast(rifeSue);
      rifeSue = null;
    }

    if (momentUnexhausted == 0 && rifeSue != null) {

      if (cookCue.isEmpty()) {
        momentUnexhausted = AmountMarkers;
      } else {
        this.enteringAppendage(rifeSue);
        rifeSue = null;
      }
    }
  }

  private synchronized void synx226() {
    rifeSue = this.preparingSystem();
    momentUnexhausted = AmountMarkers;
  }

  private synchronized void synx227() {
    rifeSue = preparingSystem();
  }
}
