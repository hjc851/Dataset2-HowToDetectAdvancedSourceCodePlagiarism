import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EInitialization extends Spreadsheet {
  private ArrayDeque<Mechanism> gonnaDong;
  private ArrayDeque<Mistake> responsibilityPecker;
  private int minutesLatter;

  public EInitialization() {
    this.gonnaDong = new ArrayDeque<>();
    this.responsibilityPecker = new ArrayDeque<>();
    minutesLatter = ClipQuantity;
  }

  public void weapMark() {
    List<Mistake> shortcomings = new LinkedList<>();
    for (Mistake f : responsibilityPecker) {

      if (f.receiveWaitingMoment() == this.catchRifeCheck()) shortcomings.add(f);
    }
    for (Mistake responsibility : shortcomings) {
      responsibilityPecker.remove(responsibility);
      substitutionPolicies.augmentPagination(
          new Screen(
              responsibility.conveyFormalities().obtainInquires().peek(),
              responsibility.conveyFormalities().developPeg(),
              0),
          responsibility.conveyFormalities());

      if (!gonnaDong.contains(responsibility.conveyFormalities())) {
        this.inwardServe(responsibility.conveyFormalities());
      }
    }

    if (underwayTreat != null) {
      minutesLatter--;

      if (underwayTreat.isEnded()) {
        underwayTreat.markDeceaseHours(this.catchRifeCheck());
        this.executedMethods.addLast(underwayTreat);
        underwayTreat = null;
      }

      if (minutesLatter == 0 && underwayTreat != null) {

        if (gonnaDong.isEmpty()) {
          minutesLatter = ClipQuantity;
        } else {
          this.inwardServe(underwayTreat);
          underwayTreat = null;
        }
      }
    }

    if (underwayTreat == null && !gonnaDong.isEmpty()) {
      underwayTreat = this.gonnaMethods();
      minutesLatter = ClipQuantity;
    }

    this.passAdjacentAsked();
  }

  public void inwardServe(Mechanism serve) {
    gonnaDong.addLast(serve);
  }

  public Mechanism gonnaMethods() {
    return gonnaDong.removeFirst();
  }

  private void passAdjacentAsked() {

    if (this.underwayTreat == null) {
      return;
    }

    while (!substitutionPolicies.crackPlea(this.underwayTreat)) {
      this.mailVarletMistake();
      minutesLatter = ClipQuantity;

      if (!gonnaDong.isEmpty()) {
        underwayTreat = gonnaMethods();
      } else {
        underwayTreat = null;
        return;
      }
    }
    underwayTreat.formalitiesComeMotions();
  }

  private void mailVarletMistake() {
    Mistake f = new Mistake(this.catchRifeCheck(), underwayTreat);
    responsibilityPecker.add(f);
    underwayTreat.conveyBreakdowns().add(f);
  }
}
