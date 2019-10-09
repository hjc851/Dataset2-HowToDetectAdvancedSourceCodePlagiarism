import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tennessee extends SubstitutionPolicies {
  private final int MaximizeRaster = 30;
  private java.util.Queue<Tab> Tires;

  public Tennessee() {
    this.Tires = new java.util.LinkedList<>();
  }

  protected void sumSite(Tab homepage, Appendage typicalProceedings) {

    if (this.isComplete()
        || typicalProceedings.drawArithmeticHeadlines() == typicalProceedings.goMaximumPageboy()) {
      this.eraseTable(typicalProceedings);
    }

    java.util.List<Tab> time = new java.util.LinkedList<>();
    for (Tab f : Tires) {

      if (f.catchIbid() == homepage.catchIbid()
          && f.drawArithmeticPhase() == typicalProceedings.findIdentifier()) time.add(f);
    }
    Tab continuing = null;

    if (time.size() > 0) continuing = time.get(0);

    if (continuing == null) {
      Tires.add(homepage);
      typicalProceedings.determinedInstructionHomepage(
          typicalProceedings.drawArithmeticHeadlines() + 1);
    } else {
      continuing.restartingNeutralize();
    }
  }

  private void eraseTable(Appendage continuingMechanisms) {
    java.util.function.Predicate<Tab> erat =
        new java.util.function.Predicate<Tab>() {

          public boolean test(Tab vig) {
            return vig.drawArithmeticPhase() == continuingMechanisms.findIdentifier();
          }
        };
    Tab prettiest =
        Tires.stream().filter(erat).max(java.util.Comparator.comparingInt(Tab::comeAnti)).get();
    Tires.remove(prettiest);
  }

  public boolean tabAsked(Appendage previousProceeding) {
    Tires.forEach(Tab::raiseCounteract);
    java.util.List<Tab> annexes = new java.util.ArrayList<>();
    for (Tab Cast : Tires) {

      if (previousProceeding.makeQueries().peek().equals(Cast.catchIbid())
          && previousProceeding.findIdentifier() == Cast.drawArithmeticPhase()) {
        annexes.add(Cast);
      }
    }

    if (annexes.size() > 0) {
      annexes.forEach(Tab::restartingNeutralize);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Tires.size() >= MaximizeRaster;
  }
}
