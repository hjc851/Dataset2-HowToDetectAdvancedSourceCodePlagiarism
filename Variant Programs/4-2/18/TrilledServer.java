import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrilledServer extends Callback {
  private ArrayDeque<Procedure> preppedDragon;
  private ArrayDeque<Defect> errorLine;
  private int clockLeft;

  public TrilledServer() {
    this.preppedDragon = new ArrayDeque<>();
    this.errorLine = new ArrayDeque<>();
    clockLeft = AmountMarkers;
  }

  public void addTock() {
    List<Defect> flaw = new LinkedList<>();
    for (Defect f : errorLine) {

      if (f.findPrepareSentence() == this.receiveContemporaryTicktack()) flaw.add(f);
    }
    for (Defect blame : flaw) {
      errorLine.remove(blame);
      refillingGambit.extendFolio(
          new Tab(
              blame.developProceeding().makeQueries().peek(),
              blame.developProceeding().generateIdem(),
              0),
          blame.developProceeding());

      if (!preppedDragon.contains(blame.developProceeding())) {
        this.designateAct(blame.developProceeding());
      }
    }

    if (topicalAppendage != null) {
      clockLeft--;

      if (topicalAppendage.isEnded()) {
        topicalAppendage.layPassingMoment(this.receiveContemporaryTicktack());
        this.implementedSummons.addLast(topicalAppendage);
        topicalAppendage = null;
      }

      if (clockLeft == 0 && topicalAppendage != null) {

        if (preppedDragon.isEmpty()) {
          clockLeft = AmountMarkers;
        } else {
          this.designateAct(topicalAppendage);
          topicalAppendage = null;
        }
      }
    }

    if (topicalAppendage == null && !preppedDragon.isEmpty()) {
      topicalAppendage = this.fitMarch();
      clockLeft = AmountMarkers;
    }

    this.scarperComeMotions();
  }

  public void designateAct(Procedure procedure) {
    preppedDragon.addLast(procedure);
  }

  public Procedure fitMarch() {
    return preppedDragon.removeFirst();
  }

  private void scarperComeMotions() {

    if (this.topicalAppendage == null) {
      return;
    }

    while (!refillingGambit.testProposal(this.topicalAppendage)) {
      this.carryAnnexesGlitch();
      clockLeft = AmountMarkers;

      if (!preppedDragon.isEmpty()) {
        topicalAppendage = fitMarch();
      } else {
        topicalAppendage = null;
        return;
      }
    }
    topicalAppendage.summonsAheadAppeals();
  }

  private void carryAnnexesGlitch() {
    Defect f = new Defect(this.receiveContemporaryTicktack(), topicalAppendage);
    errorLine.add(f);
    topicalAppendage.canAnomalies().add(f);
  }
}
