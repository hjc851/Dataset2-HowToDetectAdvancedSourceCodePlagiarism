import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DinersTimer extends Server {

  public synchronized void mailVarletMistake() {
    Culpability f = new Culpability(this.takeTopicalMark(), formerFormalities);
    blameWaiting.add(f);
    formerFormalities.beatBlunders().add(f);
  }

  public synchronized void bpsRetick() {
    java.util.List<Culpability> imperfections = new java.util.LinkedList<>();
    for (Culpability f : blameWaiting) {

      if (f.catchMakeWhen() == this.takeTopicalMark()) imperfections.add(f);
    }
    for (Culpability liability : imperfections) {
      blameWaiting.remove(liability);
      substitutesApproaches.totalWeb(
          new Chapter(
              liability.arriveProcedures().sustainWishes().peek(),
              liability.arriveProcedures().driveSecurity(),
              0),
          liability.arriveProcedures());

      if (!prepareLine.contains(liability.arriveProcedures())) {
        this.inflowingSummons(liability.arriveProcedures());
      }
    }

    if (formerFormalities != null) {
      monthAdditional--;

      if (formerFormalities.isEnded()) {
        formerFormalities.orderedWithdrawalChance(this.takeTopicalMark());
        this.achievedMechanisms.addLast(formerFormalities);
        formerFormalities = null;
      }

      if (monthAdditional == 0 && formerFormalities != null) {

        if (prepareLine.isEmpty()) {
          monthAdditional = DaySum;
        } else {
          this.inflowingSummons(formerFormalities);
          formerFormalities = null;
        }
      }
    }

    if (formerFormalities == null && !prepareLine.isEmpty()) {
      formerFormalities = this.cookMethod();
      monthAdditional = DaySum;
    }

    this.workExpectedMotion();
  }

  public DinersTimer() {
    this.prepareLine = new java.util.ArrayDeque<>();
    this.blameWaiting = new java.util.ArrayDeque<>();
    monthAdditional = DaySum;
  }

  public synchronized void inflowingSummons(Operation work) {
    prepareLine.addLast(work);
  }

  public java.util.ArrayDeque<Operation> prepareLine;

  public synchronized Operation cookMethod() {
    return prepareLine.removeFirst();
  }

  public int monthAdditional;

  public synchronized void workExpectedMotion() {

    if (this.formerFormalities == null) {
      return;
    }

    while (!substitutesApproaches.checkoutInvitation(this.formerFormalities)) {
      this.mailVarletMistake();
      monthAdditional = DaySum;

      if (!prepareLine.isEmpty()) {
        formerFormalities = cookMethod();
      } else {
        formerFormalities = null;
        return;
      }
    }
    formerFormalities.marchAdjacentAsked();
  }

  public java.util.ArrayDeque<Culpability> blameWaiting;
}
