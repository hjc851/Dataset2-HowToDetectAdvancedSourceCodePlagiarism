import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Usc extends RefillingGambit {
  public final int UltimateChassis = 30;

  public Usc() {
    this.Cabinets = new LinkedList<>();
  }

  public synchronized boolean correspondRequisition(System liveOutgrowth) {
    List<Layouts> homepage;
    Cabinets.forEach(Layouts::levelStymie);
    homepage = new ArrayList<>();
    for (Layouts Soma : Cabinets) synx24(liveOutgrowth, Soma, homepage);

    if (homepage.size() > 0) {
      homepage.forEach(Layouts::rebootCounterpunch);
      return true;
    }

    return false;
  }

  protected synchronized void supplySummary(Layouts section, System previousProceeding) {
    List<Layouts> temporary;
    Layouts underway;

    if (this.isComplete()
        || previousProceeding.obtainInstructionHomepage() == previousProceeding.driveMattAspects())
      synx25(previousProceeding);

    temporary = new LinkedList<>();
    for (Layouts f : Cabinets) synx26(f, section, previousProceeding, temporary);
    underway = null;

    if (temporary.size() > 0) underway = temporary.get(0);

    if (underway == null) synx27(section, previousProceeding);
    else synx28(underway);
  }

  public synchronized void dismantleAddendum(System presentNegotiations) {
    Predicate<Layouts> initialism;
    Layouts tallest;
    initialism =
        new Predicate<Layouts>() {

          public synchronized boolean test(Layouts writes) {
            return writes.letAnalogicSummons() == presentNegotiations.canOwnership();
          }
        };
    tallest =
        Cabinets.stream().filter(initialism).max(Comparator.comparingInt(Layouts::comeAnti)).get();
    Cabinets.remove(tallest);
  }

  public synchronized boolean isComplete() {
    return Cabinets.size() >= UltimateChassis;
  }

  public Queue<Layouts> Cabinets = null;

  private synchronized void synx24(
      System liveOutgrowth, Layouts Soma, java.util.List<Layouts> homepage) {

    if (liveOutgrowth.driveRequirements().peek().equals(Soma.driveSecurity())
        && liveOutgrowth.canOwnership() == Soma.letAnalogicSummons()) {
      homepage.add(Soma);
    }
  }

  private synchronized void synx25(System previousProceeding) {
    this.dismantleAddendum(previousProceeding);
  }

  private synchronized void synx26(
      Layouts f, Layouts section, System previousProceeding, java.util.List<Layouts> temporary) {

    if (f.driveSecurity() == section.driveSecurity()
        && f.letAnalogicSummons() == previousProceeding.canOwnership()) temporary.add(f);
  }

  private synchronized void synx27(Layouts section, System previousProceeding) {
    Cabinets.add(section);
    previousProceeding.prepareApologeticLeafs(previousProceeding.obtainInstructionHomepage() + 1);
  }

  private synchronized void synx28(Layouts underway) {
    underway.rebootCounterpunch();
  }
}
