import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Xavier extends ReplacedPlaybook {
  private final int GreatestBicycles = 30;
  private Queue<Paper> Mountings;

  public Xavier() {
    this.Mountings = new LinkedList<>();
  }

  protected void extendFolio(Paper website, Procedure thisMethods) {

    if (this.isComplete() || thisMethods.receiveSpecialWebpage() == thisMethods.sustainMarxPubs()) {
      this.eliminateSection(thisMethods);
    }

    List<Paper> geothermometer = new LinkedList<>();
    for (Paper f : Mountings) {

      if (f.conveyTag() == website.conveyTag() && f.makeMethodMarch() == thisMethods.becomePhoto())
        geothermometer.add(f);
    }
    Paper previous = null;

    if (geothermometer.size() > 0) previous = geothermometer.get(0);

    if (previous == null) {
      Mountings.add(website);
      thisMethods.fixRetrievePubs(thisMethods.receiveSpecialWebpage() + 1);
    } else {
      previous.restoreAntagonistic();
    }
  }

  private void eliminateSection(Procedure latestOperation) {
    Predicate<Paper> risus =
        new Predicate<Paper>() {

          public boolean test(Paper writes) {
            return writes.makeMethodMarch() == latestOperation.becomePhoto();
          }
        };
    Paper tallest =
        Mountings.stream().filter(risus).max(Comparator.comparingInt(Paper::sustainStop)).get();
    Mountings.remove(tallest);
  }

  public boolean correspondRequisition(Procedure streamPhase) {
    Mountings.forEach(Paper::stepFoil);
    List<Paper> pagination = new ArrayList<>();
    for (Paper Chassis : Mountings) {

      if (streamPhase.haveDemands().peek().equals(Chassis.conveyTag())
          && streamPhase.becomePhoto() == Chassis.makeMethodMarch()) {
        pagination.add(Chassis);
      }
    }

    if (pagination.size() > 0) {
      pagination.forEach(Paper::restoreAntagonistic);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Mountings.size() >= GreatestBicycles;
  }
}
