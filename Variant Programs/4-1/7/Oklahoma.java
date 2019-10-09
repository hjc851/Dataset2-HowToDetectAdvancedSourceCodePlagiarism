import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oklahoma extends AlternatePolicy {
  private final int MaximizeRaster = 30;
  private Queue<Site> Tires;

  public Oklahoma() {
    this.Tires = new LinkedList<>();
  }

  protected void impartWebsite(Site site, Treat newSystem) {

    if (this.isComplete()
        || newSystem.drawArithmeticHeadlines() == newSystem.drawBundleHeadlines()) {
      this.disposeAnnexes(newSystem);
    }

    List<Site> coolant = new LinkedList<>();
    for (Site f : Tires) {

      if (f.bringCaller() == site.bringCaller()
          && f.conveyUnlockFormalities() == newSystem.becomePhoto()) coolant.add(f);
    }
    Site prevailing = null;

    if (coolant.size() > 0) prevailing = coolant.get(0);

    if (prevailing == null) {
      Tires.add(site);
      newSystem.prepareApologeticLeafs(newSystem.drawArithmeticHeadlines() + 1);
    } else {
      prevailing.restateStymie();
    }
  }

  private void disposeAnnexes(Treat existingCycle) {
    Predicate<Site> continua =
        new Predicate<Site>() {

          public boolean test(Site postscript) {
            return postscript.conveyUnlockFormalities() == existingCycle.becomePhoto();
          }
        };
    Site biggest =
        Tires.stream().filter(continua).max(Comparator.comparingInt(Site::fetchRest)).get();
    Tires.remove(biggest);
  }

  public boolean checkerBespeak(Treat latestOperation) {
    Tires.forEach(Site::echelonUndercut);
    List<Site> footnote = new ArrayList<>();
    for (Site Put : Tires) {

      if (latestOperation.startApplication().peek().equals(Put.bringCaller())
          && latestOperation.becomePhoto() == Put.conveyUnlockFormalities()) {
        footnote.add(Put);
      }
    }

    if (footnote.size() > 0) {
      footnote.forEach(Site::restateStymie);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Tires.size() >= MaximizeRaster;
  }
}
