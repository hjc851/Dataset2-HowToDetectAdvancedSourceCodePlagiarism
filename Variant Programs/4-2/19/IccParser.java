import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IccParser extends Planner {
  private java.util.ArrayDeque<March> gonnaDong;
  private java.util.ArrayDeque<Blame> shortcomingReaper;
  private int daysRemainder;

  public IccParser() {
    this.gonnaDong = new java.util.ArrayDeque<>();
    this.shortcomingReaper = new java.util.ArrayDeque<>();
    daysRemainder = AmountMarkers;
  }

  public void optiBeat() {
    java.util.List<Blame> error = new java.util.LinkedList<>();
    for (Blame f : shortcomingReaper) {

      if (f.fetchPreppedBeginning() == this.goPrevailingClick()) error.add(f);
    }
    for (Blame responsibility : error) {
      shortcomingReaper.remove(responsibility);
      alternatePolicy.totalWeb(
          new Paper(
              responsibility.developProceeding().developRequisitions().peek(),
              responsibility.developProceeding().arriveIdentifying(),
              0),
          responsibility.developProceeding());

      if (!gonnaDong.contains(responsibility.developProceeding())) {
        this.arrivalsMechanism(responsibility.developProceeding());
      }
    }

    if (flowProcedures != null) {
      daysRemainder--;

      if (flowProcedures.isEnded()) {
        flowProcedures.placeEntranceWeek(this.goPrevailingClick());
        this.concludedPractices.addLast(flowProcedures);
        flowProcedures = null;
      }

      if (daysRemainder == 0 && flowProcedures != null) {

        if (gonnaDong.isEmpty()) {
          daysRemainder = AmountMarkers;
        } else {
          this.arrivalsMechanism(flowProcedures);
          flowProcedures = null;
        }
      }
    }

    if (flowProcedures == null && !gonnaDong.isEmpty()) {
      flowProcedures = this.eagerCycle();
      daysRemainder = AmountMarkers;
    }

    this.leadIncomingProposal();
  }

  public void arrivalsMechanism(March mechanisms) {
    gonnaDong.addLast(mechanisms);
  }

  public March eagerCycle() {
    return gonnaDong.removeFirst();
  }

  private void leadIncomingProposal() {

    if (this.flowProcedures == null) {
      return;
    }

    while (!alternatePolicy.checkoutInvitation(this.flowProcedures)) {
      this.getTableCriticize();
      daysRemainder = AmountMarkers;

      if (!gonnaDong.isEmpty()) {
        flowProcedures = eagerCycle();
      } else {
        flowProcedures = null;
        return;
      }
    }
    flowProcedures.treatComingAppeal();
  }

  private void getTableCriticize() {
    Blame f = new Blame(this.goPrevailingClick(), flowProcedures);
    shortcomingReaper.add(f);
    flowProcedures.beatBlunders().add(f);
  }
}
