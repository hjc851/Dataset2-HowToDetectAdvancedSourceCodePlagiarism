import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrillSpreadsheet extends Multitasking {
  public ArrayDeque<Operation> preparedWait = null;

  public synchronized Operation availableSummons() {
    return preparedWait.removeFirst();
  }

  public TrillSpreadsheet() {
    this.preparedWait = new ArrayDeque<>();
    this.faultyFile = new ArrayDeque<>();
    amountKeeping = OpportunityDramatic;
  }

  public ArrayDeque<Mistake> faultyFile = null;

  public synchronized void passAdjacentAsked() {

    if (this.flowProcedures == null) {
      return;
    }

    while (!replenishmentStratagem.breakWishes(this.flowProcedures)) {
      this.chargeSummaryResponsible();
      amountKeeping = OpportunityDramatic;

      if (!preparedWait.isEmpty()) {
        flowProcedures = availableSummons();
      } else {
        flowProcedures = null;
        return;
      }
    }
    flowProcedures.proceduresExpectedMotion();
  }

  public int amountKeeping = 0;

  public synchronized void chargeSummaryResponsible() {
    Mistake f;
    f = new Mistake(this.goPrevailingClick(), flowProcedures);
    faultyFile.add(f);
    flowProcedures.developErrors().add(f);
  }

  public synchronized void bsiShudder() {
    List<Mistake> deficiencies;
    deficiencies = new LinkedList<>();
    for (Mistake f : faultyFile) {

      if (f.haveSetPeriods() == this.goPrevailingClick()) deficiencies.add(f);
    }
    for (Mistake mistake : deficiencies) {
      faultyFile.remove(mistake);
      replenishmentStratagem.summateTab(
          new Pageboy(
              mistake.driveMechanisms().canApplications().peek(),
              mistake.driveMechanisms().fetchPictures(),
              0),
          mistake.driveMechanisms());

      if (!preparedWait.contains(mistake.driveMechanisms())) {
        this.ingoingProcedure(mistake.driveMechanisms());
      }
    }

    if (flowProcedures != null) {
      amountKeeping--;

      if (flowProcedures.isEnded()) {
        flowProcedures.determineWithdrawBeginning(this.goPrevailingClick());
        this.consummatedOperation.addLast(flowProcedures);
        flowProcedures = null;
      }

      if (amountKeeping == 0 && flowProcedures != null) {

        if (preparedWait.isEmpty()) {
          amountKeeping = OpportunityDramatic;
        } else {
          this.ingoingProcedure(flowProcedures);
          flowProcedures = null;
        }
      }
    }

    if (flowProcedures == null && !preparedWait.isEmpty()) {
      flowProcedures = this.availableSummons();
      amountKeeping = OpportunityDramatic;
    }

    this.passAdjacentAsked();
  }

  public synchronized void ingoingProcedure(Operation procedures) {
    preparedWait.addLast(procedures);
  }
}
