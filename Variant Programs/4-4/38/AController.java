import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AController extends Programmer {
  private ArrayDeque<Shortcoming> defectiveDragon;

  public AController() {
    this.primedWaiting = new ArrayDeque<>();
    this.defectiveDragon = new ArrayDeque<>();
    amountKeeping = OpportunityDramatic;
  }

  private int amountKeeping;

  public synchronized void ingoingProcedure(Summons proceedings) {
    primedWaiting.addLast(proceedings);
  }

  private synchronized void giveChapterResponsibility() {
    Shortcoming f;
    f = new Shortcoming(this.developPreviousAnswer(), prevailingProcedure);
    defectiveDragon.add(f);
    prevailingProcedure.bringFlaw().add(f);
  }

  private synchronized void extendComingAppeal() {

    if (this.prevailingProcedure == null) {
      return;
    }

    while (!substitutionPolicies.tabAsked(this.prevailingProcedure)) {
      this.giveChapterResponsibility();
      amountKeeping = OpportunityDramatic;

      if (!primedWaiting.isEmpty()) {
        prevailingProcedure = ripeOutgrowth();
      } else {
        prevailingProcedure = null;
        return;
      }
    }
    prevailingProcedure.procedureFutureAsking();
  }

  public synchronized Summons ripeOutgrowth() {
    return primedWaiting.removeFirst();
  }

  private ArrayDeque<Summons> primedWaiting;

  public synchronized void weapMark() {
    List<Shortcoming> malfunctions;
    malfunctions = new LinkedList<>();
    for (Shortcoming f : defectiveDragon) {

      if (f.drawIntelligentWeek() == this.developPreviousAnswer()) malfunctions.add(f);
    }
    for (Shortcoming accountable : malfunctions) {
      defectiveDragon.remove(accountable);
      substitutionPolicies.additionsContents(
          new Section(
              accountable.developProceeding().makeQueries().peek(),
              accountable.developProceeding().goQuod(),
              0),
          accountable.developProceeding());

      if (!primedWaiting.contains(accountable.developProceeding())) {
        this.ingoingProcedure(accountable.developProceeding());
      }
    }

    if (prevailingProcedure != null) {
      amountKeeping--;

      if (prevailingProcedure.isEnded()) {
        prevailingProcedure.solidifyingLeavingJuncture(this.developPreviousAnswer());
        this.submittedTechnologies.addLast(prevailingProcedure);
        prevailingProcedure = null;
      }

      if (amountKeeping == 0 && prevailingProcedure != null) {

        if (primedWaiting.isEmpty()) {
          amountKeeping = OpportunityDramatic;
        } else {
          this.ingoingProcedure(prevailingProcedure);
          prevailingProcedure = null;
        }
      }
    }

    if (prevailingProcedure == null && !primedWaiting.isEmpty()) {
      prevailingProcedure = this.ripeOutgrowth();
      amountKeeping = OpportunityDramatic;
    }

    this.extendComingAppeal();
  }
}
