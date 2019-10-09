import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Boise extends SubstituteStrategic {
  private final int BundleRims = 30;
  private Queue<Paper> Enclosures;

  public Boise() {
    this.Enclosures = new LinkedList<>();
  }

  protected void lendHomepage(Paper varlet, Summons newSystem) {

    if (this.isComplete() || newSystem.letAnalogicSheets() == newSystem.letHighestSheets()) {
      this.banishTab(newSystem);
    }

    List<Paper> solvate = new LinkedList<>();
    for (Paper f : Enclosures) {

      if (f.fixNerfling() == varlet.fixNerfling()
          && f.sustainRetrieveMethods() == newSystem.startPicture()) solvate.add(f);
    }
    Paper prevalent = null;

    if (solvate.size() > 0) prevalent = solvate.get(0);

    if (prevalent == null) {
      Enclosures.add(varlet);
      newSystem.orderedDidacticScreens(newSystem.letAnalogicSheets() + 1);
    } else {
      prevalent.restoreAntagonistic();
    }
  }

  private void banishTab(Summons circulatingServe) {
    Predicate<Paper> effet =
        new Predicate<Paper>() {

          public boolean test(Paper vig) {
            return vig.sustainRetrieveMethods() == circulatingServe.startPicture();
          }
        };
    Paper longest =
        Enclosures.stream().filter(effet).max(Comparator.comparingInt(Paper::drawLite)).get();
    Enclosures.remove(longest);
  }

  public boolean ascertainApplication(Summons liveOutgrowth) {
    Enclosures.forEach(Paper::augmentationParry);
    List<Paper> text = new ArrayList<>();
    for (Paper Build : Enclosures) {

      if (liveOutgrowth.haveDemands().peek().equals(Build.fixNerfling())
          && liveOutgrowth.startPicture() == Build.sustainRetrieveMethods()) {
        text.add(Build);
      }
    }

    if (text.size() > 0) {
      text.forEach(Paper::restoreAntagonistic);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Enclosures.size() >= BundleRims;
  }
}
