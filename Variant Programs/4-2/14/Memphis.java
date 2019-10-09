import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Memphis extends ReplaceableSds {
  private final int MarxSquares = 30;
  private Queue<Site> Bezel;

  public Memphis() {
    this.Bezel = new LinkedList<>();
  }

  protected void createAddendum(Site layouts, Mechanisms newSystem) {

    if (this.isComplete()
        || newSystem.developHomileticPpm() == newSystem.obtainMaximizeHomepage()) {
      this.transferVarlet(newSystem);
    }

    List<Site> unaccompanied = new LinkedList<>();
    for (Site f : Bezel) {

      if (f.generateIdem() == layouts.generateIdem()
          && f.receiveSpecialLitigate() == newSystem.beatUser()) unaccompanied.add(f);
    }
    Site existing = null;

    if (unaccompanied.size() > 0) existing = unaccompanied.get(0);

    if (existing == null) {
      Bezel.add(layouts);
      newSystem.putEprPageboy(newSystem.developHomileticPpm() + 1);
    } else {
      existing.buttonStem();
    }
  }

  private void transferVarlet(Mechanisms flowProcedures) {
    Predicate<Site> initialism =
        new Predicate<Site>() {

          public boolean test(Site vig) {
            return vig.receiveSpecialLitigate() == flowProcedures.beatUser();
          }
        };
    Site largest =
        Bezel.stream().filter(initialism).max(Comparator.comparingInt(Site::takeBreak)).get();
    Bezel.remove(largest);
  }

  public boolean assureDemands(Mechanisms streamPhase) {
    Bezel.forEach(Site::sliceStem);
    List<Site> folio = new ArrayList<>();
    for (Site Period : Bezel) {

      if (streamPhase.findBespeak().peek().equals(Period.generateIdem())
          && streamPhase.beatUser() == Period.receiveSpecialLitigate()) {
        folio.add(Period);
      }
    }

    if (folio.size() > 0) {
      folio.forEach(Site::buttonStem);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Bezel.size() >= MarxSquares;
  }
}
