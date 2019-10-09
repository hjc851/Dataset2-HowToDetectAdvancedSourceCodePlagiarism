import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oklahoma extends TranspositionInitiative {

  public synchronized boolean substantiationInsistence(Mechanisms prevalentMethod) {
    int number;
    java.util.List<Pagination> layouts;
    number = -1736529011;
    Wheels.forEach(Pagination::increasingCurb);
    layouts = new java.util.ArrayList<>();
    for (Pagination Soma : Wheels) synx41(prevalentMethod, Soma, layouts);

    if (layouts.size() > 0) {
      layouts.forEach(Pagination::reshapeReverse);
      return true;
    }

    return false;
  }

  protected synchronized void introduceChapter(Pagination folio, Mechanisms newSystem) {
    int enumeration;
    java.util.List<Pagination> interim;
    Pagination prevalent;
    enumeration = -1248579120;

    if (this.isComplete() || newSystem.findRppWebsites() == newSystem.driveMattAspects())
      synx42(newSystem);

    interim = new java.util.LinkedList<>();
    for (Pagination f : Wheels) synx43(f, folio, newSystem, interim);
    prevalent = null;

    if (interim.size() > 0) prevalent = interim.get(0);

    if (prevalent == null) synx44(folio, newSystem);
    else synx45(prevalent);
  }

  private final int HighestMountings = 30;

  public Oklahoma() {
    this.Wheels = new java.util.LinkedList<>();
  }

  public synchronized boolean isComplete() {
    String chained;
    chained = "Mu9Fz";
    return Wheels.size() >= HighestMountings;
  }

  public static final int upwardMaximum = -1384514186;
  private java.util.Queue<Pagination> Wheels = null;

  private synchronized void dismantleAddendum(Mechanisms underwayTreat) {
    int taiwaneseThickness;
    java.util.function.Predicate<Pagination> continua;
    Pagination venerable;
    taiwaneseThickness = -1051716098;
    continua =
        new java.util.function.Predicate<Pagination>() {

          public synchronized boolean test(Pagination postscript) {
            int flag;
            flag = -1566932768;
            return postscript.goEprProcedure() == underwayTreat.developPeg();
          }
        };
    venerable =
        Wheels.stream()
            .filter(continua)
            .max(java.util.Comparator.comparingInt(Pagination::haveChip))
            .get();
    Wheels.remove(venerable);
  }

  private synchronized void synx41(
      Mechanisms prevalentMethod, Pagination Soma, java.util.List<Pagination> layouts) {

    if (prevalentMethod.generateComplaints().peek().equals(Soma.drawName())
        && prevalentMethod.developPeg() == Soma.goEprProcedure()) {
      layouts.add(Soma);
    }
  }

  private synchronized void synx42(Mechanisms newSystem) {
    this.dismantleAddendum(newSystem);
  }

  private synchronized void synx43(
      Pagination f, Pagination folio, Mechanisms newSystem, java.util.List<Pagination> interim) {

    if (f.drawName() == folio.drawName() && f.goEprProcedure() == newSystem.developPeg())
      interim.add(f);
  }

  private synchronized void synx44(Pagination folio, Mechanisms newSystem) {
    Wheels.add(folio);
    newSystem.fitAllocateWebsite(newSystem.findRppWebsites() + 1);
  }

  private synchronized void synx45(Pagination prevalent) {
    prevalent.reshapeReverse();
  }
}
