import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RailCompiler extends Interface {
  private java.util.ArrayDeque<Phase> preparesSuspense;
  private java.util.ArrayDeque<Error> glitchStopper;
  private int meterLeftover;

  public RailCompiler() {
    this.preparesSuspense = new java.util.ArrayDeque<>();
    this.glitchStopper = new java.util.ArrayDeque<>();
    meterLeftover = MonthLarge;
  }

  public void weapMark() {
    java.util.List<Error> lapses = new java.util.LinkedList<>();
    for (Error f : glitchStopper) {

      if (f.receiveWaitingMoment() == this.goPrevailingClick()) lapses.add(f);
    }
    for (Error problem : lapses) {
      glitchStopper.remove(problem);
      alternatesGie.provideLayout(
          new Footnote(
              problem.generateTreat().bringQuest().peek(), problem.generateTreat().catchIbid(), 0),
          problem.generateTreat());

      if (!preparesSuspense.contains(problem.generateTreat())) {
        this.arrivalMethodology(problem.generateTreat());
      }
    }

    if (contemporaryLitigate != null) {
      meterLeftover--;

      if (contemporaryLitigate.isEnded()) {
        contemporaryLitigate.adjustPerishMonth(this.goPrevailingClick());
        this.achievedMechanisms.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
      }

      if (meterLeftover == 0 && contemporaryLitigate != null) {

        if (preparesSuspense.isEmpty()) {
          meterLeftover = MonthLarge;
        } else {
          this.arrivalMethodology(contemporaryLitigate);
          contemporaryLitigate = null;
        }
      }
    }

    if (contemporaryLitigate == null && !preparesSuspense.isEmpty()) {
      contemporaryLitigate = this.willingWork();
      meterLeftover = MonthLarge;
    }

    this.bleedEarlyWishes();
  }

  public void arrivalMethodology(Phase procedure) {
    preparesSuspense.addLast(procedure);
  }

  public Phase willingWork() {
    return preparesSuspense.removeFirst();
  }

  private void bleedEarlyWishes() {

    if (this.contemporaryLitigate == null) {
      return;
    }

    while (!alternatesGie.chequePetitioning(this.contemporaryLitigate)) {
      this.commitWebpageFlaw();
      meterLeftover = MonthLarge;

      if (!preparesSuspense.isEmpty()) {
        contemporaryLitigate = willingWork();
      } else {
        contemporaryLitigate = null;
        return;
      }
    }
    contemporaryLitigate.marchAdjacentAsked();
  }

  private void commitWebpageFlaw() {
    Error f = new Error(this.goPrevailingClick(), contemporaryLitigate);
    glitchStopper.add(f);
    contemporaryLitigate.canAnomalies().add(f);
  }
}
