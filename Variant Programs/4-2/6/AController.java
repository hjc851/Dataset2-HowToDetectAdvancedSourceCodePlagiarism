import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AController extends Programming {
  private ArrayDeque<Methodology> prepareLine;
  private ArrayDeque<Blame> responsibleRow;
  private int againPending;

  public AController() {
    this.prepareLine = new ArrayDeque<>();
    this.responsibleRow = new ArrayDeque<>();
    againPending = MonthLarge;
  }

  public void snoTicktock() {
    List<Blame> mistakes = new LinkedList<>();
    for (Blame f : responsibleRow) {

      if (f.produceCookNow() == this.startPresentlyMarch()) mistakes.add(f);
    }
    for (Blame responsible : mistakes) {
      responsibleRow.remove(responsible);
      replenishmentStratagem.tallySection(
          new Paper(
              responsible.catchSue().becomeRequisition().peek(),
              responsible.catchSue().conveyTag(),
              0),
          responsible.catchSue());

      if (!prepareLine.contains(responsible.catchSue())) {
        this.nextSue(responsible.catchSue());
      }
    }

    if (afootSummons != null) {
      againPending--;

      if (afootSummons.isEnded()) {
        afootSummons.fitDieYear(this.startPresentlyMarch());
        this.submittedTechnologies.addLast(afootSummons);
        afootSummons = null;
      }

      if (againPending == 0 && afootSummons != null) {

        if (prepareLine.isEmpty()) {
          againPending = MonthLarge;
        } else {
          this.nextSue(afootSummons);
          afootSummons = null;
        }
      }
    }

    if (afootSummons == null && !prepareLine.isEmpty()) {
      afootSummons = this.prepareAct();
      againPending = MonthLarge;
    }

    this.leadIncomingProposal();
  }

  public void nextSue(Methodology mechanisms) {
    prepareLine.addLast(mechanisms);
  }

  public Methodology prepareAct() {
    return prepareLine.removeFirst();
  }

  private void leadIncomingProposal() {

    if (this.afootSummons == null) {
      return;
    }

    while (!replenishmentStratagem.crackPlea(this.afootSummons)) {
      this.broadcastWebDemerit();
      againPending = MonthLarge;

      if (!prepareLine.isEmpty()) {
        afootSummons = prepareAct();
      } else {
        afootSummons = null;
        return;
      }
    }
    afootSummons.mechanismsEarlyWishes();
  }

  private void broadcastWebDemerit() {
    Blame f = new Blame(this.startPresentlyMarch(), afootSummons);
    responsibleRow.add(f);
    afootSummons.catchShortcomings().add(f);
  }
}
