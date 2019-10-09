import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Georgia extends SuccessorPlan {
  private final int PeakPictures = 30;
  private java.util.Queue<Footnote> Bicycles;

  public Georgia() {
    this.Bicycles = new java.util.LinkedList<>();
  }

  protected void provideLayout(Footnote tab, Phase topicalAppendage) {

    if (this.isComplete()
        || topicalAppendage.sustainRetrievePubs() == topicalAppendage.conveyGreatestSlides()) {
      this.hitText(topicalAppendage);
    }

    java.util.List<Footnote> temporal = new java.util.LinkedList<>();
    for (Footnote f : Bicycles) {

      if (f.haveHandle() == tab.haveHandle() && f.canGetCycle() == topicalAppendage.catchIbid())
        temporal.add(f);
    }
    Footnote circulating = null;

    if (temporal.size() > 0) circulating = temporal.get(0);

    if (circulating == null) {
      Bicycles.add(tab);
      topicalAppendage.orderedDidacticScreens(topicalAppendage.sustainRetrievePubs() + 1);
    } else {
      circulating.restartingNeutralize();
    }
  }

  private void hitText(Phase continuingMechanisms) {
    java.util.function.Predicate<Footnote> phy =
        new java.util.function.Predicate<Footnote>() {

          public boolean test(Footnote postscript) {
            return postscript.canGetCycle() == continuingMechanisms.catchIbid();
          }
        };
    Footnote longest =
        Bicycles.stream()
            .filter(phy)
            .max(java.util.Comparator.comparingInt(Footnote::comeAnti))
            .get();
    Bicycles.remove(longest);
  }

  public boolean chequePetitioning(Phase incumbentMarch) {
    Bicycles.forEach(Footnote::raiseCounteract);
    java.util.List<Footnote> sheet = new java.util.ArrayList<>();
    for (Footnote Chassis : Bicycles) {

      if (incumbentMarch.bringQuest().peek().equals(Chassis.haveHandle())
          && incumbentMarch.catchIbid() == Chassis.canGetCycle()) {
        sheet.add(Chassis);
      }
    }

    if (sheet.size() > 0) {
      sheet.forEach(Footnote::restartingNeutralize);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Bicycles.size() >= PeakPictures;
  }
}
