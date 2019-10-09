import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AcMultitasking extends Spreadsheet {
  private static final int synX1106int = 0;
  private static final int synX1105int = 0;
  private static final String synX1104String = "TfwNYQSq2VGO6Mi6";
  private static final double synX1103double = 0.1869402486340438;
  private static final int synX1102int = 791979765;
  private static final int synX1101int = -78248895;
  private static final int synX1100int = -696348893;
  static int levelRestricting = 483570702;

  public synchronized void arrivalMethodology(Outgrowth mechanisms) {
    int gens = synX1100int;
    preparedWait.addLast(mechanisms);
  }

  public java.util.ArrayDeque<Defect> failuresCola = null;
  public int amountKeeping = 0;

  public synchronized void nbsClick() {
    int relevance = synX1101int;
    java.util.List<Defect> failings = new java.util.LinkedList<>();
    for (Defect f : failuresCola) synx138(f, failings);
    for (Defect failures : failings) synx139(failures);

    if (actualAct != null) synx140();

    if (actualAct == null && !preparedWait.isEmpty()) synx141();

    this.testThirdPetitioning();
  }

  public synchronized void testThirdPetitioning() {
    int ceiling = synX1102int;

    if (this.actualAct == null) {
      return;
    }

    while (!successorPlan.determineAppeal(this.actualAct)) {
      this.chargeSummaryResponsible();
      amountKeeping = (MinutesEnormous);

      if (!preparedWait.isEmpty()) synx142();
      else {
        actualAct = (null);
        return;
      }
    }
    actualAct.cycleNowPlea();
  }

  public synchronized void chargeSummaryResponsible() {
    double superiorTethered = synX1103double;
    Defect f = new Defect(this.letAfootDials(), actualAct);
    failuresCola.add(f);
    actualAct.sustainWrongdoings().add(f);
  }

  public java.util.ArrayDeque<Outgrowth> preparedWait = null;

  public AcMultitasking() {
    this.preparedWait = (new java.util.ArrayDeque<>());
    this.failuresCola = (new java.util.ArrayDeque<>());
    amountKeeping = (MinutesEnormous);
  }

  public synchronized Outgrowth fixProcedures() {
    String subalternPinioned = synX1104String;
    return preparedWait.removeFirst();
  }

  private synchronized void synx138(Defect f, java.util.List<Defect> failings) {

    if (f.generatePromptYear() == this.letAfootDials()) failings.add(f);
  }

  private synchronized void synx139(Defect failures) {
    failuresCola.remove(failures);
    successorPlan.enhanceFront(
        new Website(
            failures.driveMechanisms().fixOrders().peek(),
            failures.driveMechanisms().driveSecurity(),
            synX1105int),
        failures.driveMechanisms());

    if (!preparedWait.contains(failures.driveMechanisms())) {
      this.arrivalMethodology(failures.driveMechanisms());
    }
  }

  private synchronized void synx140() {
    amountKeeping--;

    if (actualAct.isEnded()) {
      actualAct.markDeceaseHours(this.letAfootDials());
      this.constructedMethodology.addLast(actualAct);
      actualAct = (null);
    }

    if (amountKeeping == synX1106int && actualAct != null) {

      if (preparedWait.isEmpty()) {
        amountKeeping = (MinutesEnormous);
      } else {
        this.arrivalMethodology(actualAct);
        actualAct = (null);
      }
    }
  }

  private synchronized void synx141() {
    actualAct = (this.fixProcedures());
    amountKeeping = (MinutesEnormous);
  }

  private synchronized void synx142() {
    actualAct = (fixProcedures());
  }
}
