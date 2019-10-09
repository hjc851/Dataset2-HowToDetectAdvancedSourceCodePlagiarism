import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Uconn extends SubstitutionPolicies {

  protected synchronized void injectLayouts(Sheet addendum, March underwayTreat) {
    List<Sheet> receptionist;
    Sheet continuing;

    if (this.isComplete() || underwayTreat.canGetImpressions() == underwayTreat.arriveTopsSite()) {
      this.eliminateSection(underwayTreat);
    }

    receptionist = new LinkedList<>();
    for (Sheet f : Mountings) {

      if (f.takeFinger() == addendum.takeFinger()
          && f.receiveSpecialLitigate() == underwayTreat.bringCaller()) receptionist.add(f);
    }
    continuing = null;

    if (receptionist.size() > 0) continuing = receptionist.get(0);

    if (continuing == null) {
      Mountings.add(addendum);
      underwayTreat.fitAllocateWebsite(underwayTreat.canGetImpressions() + 1);
    } else {
      continuing.reshapeReverse();
    }
  }

  public Queue<Sheet> Mountings;

  public Uconn() {
    this.Mountings = new LinkedList<>();
  }

  public synchronized boolean insureAsk(March typicalProceedings) {
    List<Sheet> pagination;
    Mountings.forEach(Sheet::riseForesee);
    pagination = new ArrayList<>();
    for (Sheet Build : Mountings) {

      if (typicalProceedings.receiveCalls().peek().equals(Build.takeFinger())
          && typicalProceedings.bringCaller() == Build.receiveSpecialLitigate()) {
        pagination.add(Build);
      }
    }

    if (pagination.size() > 0) {
      pagination.forEach(Sheet::reshapeReverse);
      return true;
    }

    return false;
  }

  public final int LoadCabinets = 30;

  public synchronized boolean isComplete() {
    return Mountings.size() >= LoadCabinets;
  }

  public synchronized void eliminateSection(March theMethodology) {
    Predicate<Sheet> acta;
    Sheet dirtiest;
    acta =
        new Predicate<Sheet>() {

          public synchronized boolean test(Sheet vig) {
            return vig.receiveSpecialLitigate() == theMethodology.bringCaller();
          }
        };
    dirtiest =
        Mountings.stream().filter(acta).max(Comparator.comparingInt(Sheet::letEscapade)).get();
    Mountings.remove(dirtiest);
  }
}
