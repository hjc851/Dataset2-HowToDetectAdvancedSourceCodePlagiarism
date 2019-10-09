import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Georgia extends ReplacingScheme {
  private final int CeilingMatrices = 30;
  private Queue<Annexes> Tires;

  public Georgia() {
    this.Tires = new LinkedList<>();
  }

  protected void supplySummary(Annexes webpage, Negotiations flowProcedures) {

    if (this.isComplete()
        || flowProcedures.startMoveScript() == flowProcedures.obtainMaximizeHomepage()) {
      this.murderWeb(flowProcedures);
    }

    List<Annexes> solvate = new LinkedList<>();
    for (Annexes f : Tires) {

      if (f.drawName() == webpage.drawName()
          && f.startMoveMechanism() == flowProcedures.receiveCard()) solvate.add(f);
    }
    Annexes latest = null;

    if (solvate.size() > 0) latest = solvate.get(0);

    if (latest == null) {
      Tires.add(webpage);
      flowProcedures.adjustAntipyreticSite(flowProcedures.startMoveScript() + 1);
    } else {
      latest.rebalanceHeel();
    }
  }

  private void murderWeb(Negotiations typicalProceedings) {
    Predicate<Annexes> mundi =
        new Predicate<Annexes>() {

          public boolean test(Annexes writes) {
            return writes.startMoveMechanism() == typicalProceedings.receiveCard();
          }
        };
    Annexes greenest =
        Tires.stream().filter(mundi).max(Comparator.comparingInt(Annexes::becomePlay)).get();
    Tires.remove(greenest);
  }

  public boolean ensureAppeals(Negotiations circulatingServe) {
    Tires.forEach(Annexes::enhanceDeflect);
    List<Annexes> footnote = new ArrayList<>();
    for (Annexes Chassis : Tires) {

      if (circulatingServe.makeQueries().peek().equals(Chassis.drawName())
          && circulatingServe.receiveCard() == Chassis.startMoveMechanism()) {
        footnote.add(Chassis);
      }
    }

    if (footnote.size() > 0) {
      footnote.forEach(Annexes::rebalanceHeel);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Tires.size() >= CeilingMatrices;
  }
}
