import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OximeWorkflow extends Timer {
  private java.util.ArrayDeque<Formalities> cookCue;
  private java.util.ArrayDeque<Failures> fractureBacklog;
  private int periodsRest;

  public OximeWorkflow() {
    this.cookCue = new java.util.ArrayDeque<>();
    this.fractureBacklog = new java.util.ArrayDeque<>();
    periodsRest = MeterMeasure;
  }

  public void bpsRetick() {
    java.util.List<Failures> flaws = new java.util.LinkedList<>();
    for (Failures f : fractureBacklog) {

      if (f.letAvailableHours() == this.makeIncumbentTock()) flaws.add(f);
    }
    for (Failures failures : flaws) {
      fractureBacklog.remove(failures);
      replaceAgenda.enhanceFront(
          new Folio(
              failures.developProceeding().becomeRequisition().peek(),
              failures.developProceeding().receiveCard(),
              0),
          failures.developProceeding());

      if (!cookCue.contains(failures.developProceeding())) {
        this.inCycle(failures.developProceeding());
      }
    }

    if (flowProcedures != null) {
      periodsRest--;

      if (flowProcedures.isEnded()) {
        flowProcedures.rigidQuittingAmount(this.makeIncumbentTock());
        this.attainedProces.addLast(flowProcedures);
        flowProcedures = null;
      }

      if (periodsRest == 0 && flowProcedures != null) {

        if (cookCue.isEmpty()) {
          periodsRest = MeterMeasure;
        } else {
          this.inCycle(flowProcedures);
          flowProcedures = null;
        }
      }
    }

    if (flowProcedures == null && !cookCue.isEmpty()) {
      flowProcedures = this.quickAppendage();
      periodsRest = MeterMeasure;
    }

    this.endureNewRequisition();
  }

  public void inCycle(Formalities procedure) {
    cookCue.addLast(procedure);
  }

  public Formalities quickAppendage() {
    return cookCue.removeFirst();
  }

  private void endureNewRequisition() {

    if (this.flowProcedures == null) {
      return;
    }

    while (!replaceAgenda.curbCalls(this.flowProcedures)) {
      this.mailVarletMistake();
      periodsRest = MeterMeasure;

      if (!cookCue.isEmpty()) {
        flowProcedures = quickAppendage();
      } else {
        flowProcedures = null;
        return;
      }
    }
    flowProcedures.methodSecondDecision();
  }

  private void mailVarletMistake() {
    Failures f = new Failures(this.makeIncumbentTock(), flowProcedures);
    fractureBacklog.add(f);
    flowProcedures.canAnomalies().add(f);
  }
}
