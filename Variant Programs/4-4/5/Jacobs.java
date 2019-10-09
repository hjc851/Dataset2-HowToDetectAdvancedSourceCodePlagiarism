import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jacobs extends RefillingGambit {

  public synchronized boolean isComplete() {
    return Pairs.size() >= CeilingMatrices;
  }

  public Jacobs() {
    this.Pairs = new java.util.LinkedList<>();
  }

  public synchronized void reinstallFolio(Mechanisms prevalentMethod) {
    java.util.function.Predicate<Chapter> specif =
        new java.util.function.Predicate<Chapter>() {

          public synchronized boolean test(Chapter vig) {
            return vig.generateAllocateTreat() == prevalentMethod.drawName();
          }
        };
    Chapter finest =
        Pairs.stream()
            .filter(specif)
            .max(java.util.Comparator.comparingInt(Chapter::makeBars))
            .get();
    Pairs.remove(finest);
  }

  public final int CeilingMatrices = 30;
  public java.util.Queue<Chapter> Pairs;

  public synchronized boolean seePetition(Mechanisms liveOutgrowth) {
    Pairs.forEach(Chapter::salarySideboard);
    java.util.List<Chapter> screen = new java.util.ArrayList<>();
    for (Chapter Period : Pairs) {

      if (liveOutgrowth.goAsking().peek().equals(Period.comeMilad())
          && liveOutgrowth.drawName() == Period.generateAllocateTreat()) {
        screen.add(Period);
      }
    }

    if (screen.size() > 0) {
      screen.forEach(Chapter::eraseAgainst);
      return true;
    }

    return false;
  }

  protected synchronized void attachAnnexes(Chapter tab, Mechanisms newSystem) {

    if (this.isComplete() || newSystem.letAnalogicSheets() == newSystem.goMaximumPageboy()) {
      this.reinstallFolio(newSystem);
    }

    java.util.List<Chapter> cold = new java.util.LinkedList<>();
    for (Chapter f : Pairs) {

      if (f.comeMilad() == tab.comeMilad() && f.generateAllocateTreat() == newSystem.drawName())
        cold.add(f);
    }
    Chapter the = null;

    if (cold.size() > 0) the = cold.get(0);

    if (the == null) {
      Pairs.add(tab);
      newSystem.adjustAntipyreticSite(newSystem.letAnalogicSheets() + 1);
    } else {
      the.eraseAgainst();
    }
  }
}
