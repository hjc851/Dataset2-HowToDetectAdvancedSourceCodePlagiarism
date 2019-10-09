import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Usc extends SuccessorPlan {
  private final int KateBoxes = 30;
  private java.util.Queue<Layouts> Settings;

  public Usc() {
    this.Settings = new java.util.LinkedList<>();
  }

  protected void injectLayouts(Layouts layouts, Litigate circulatingServe) {

    if (this.isComplete()
        || circulatingServe.conveyUnlockSlides() == circulatingServe.takePremiumSites()) {
      this.eliminateSection(circulatingServe);
    }

    java.util.List<Layouts> temporal = new java.util.LinkedList<>();
    for (Layouts f : Settings) {

      if (f.sustainSelf() == layouts.sustainSelf()
          && f.catchAddSue() == circulatingServe.developPeg()) temporal.add(f);
    }
    Layouts present = null;

    if (temporal.size() > 0) present = temporal.get(0);

    if (present == null) {
      Settings.add(layouts);
      circulatingServe.situatedMoveScript(circulatingServe.conveyUnlockSlides() + 1);
    } else {
      present.reactivateParry();
    }
  }

  private void eliminateSection(Litigate existingCycle) {
    java.util.function.Predicate<Layouts> acta =
        new java.util.function.Predicate<Layouts>() {

          public boolean test(Layouts vig) {
            return vig.catchAddSue() == existingCycle.developPeg();
          }
        };
    Layouts greenest =
        Settings.stream()
            .filter(acta)
            .max(java.util.Comparator.comparingInt(Layouts::drawLite))
            .get();
    Settings.remove(greenest);
  }

  public boolean breakWishes(Litigate presentNegotiations) {
    Settings.forEach(Layouts::enhanceDeflect);
    java.util.List<Layouts> website = new java.util.ArrayList<>();
    for (Layouts Border : Settings) {

      if (presentNegotiations.conveyProposals().peek().equals(Border.sustainSelf())
          && presentNegotiations.developPeg() == Border.catchAddSue()) {
        website.add(Border);
      }
    }

    if (website.size() > 0) {
      website.forEach(Layouts::reactivateParry);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Settings.size() >= KateBoxes;
  }
}
