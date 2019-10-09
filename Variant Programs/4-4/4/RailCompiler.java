import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RailCompiler extends Callback {
  private int clockLeft = 0;
  private java.util.ArrayDeque<Negligence> defectList = null;
  private java.util.ArrayDeque<Work> happyStopper = null;

  public RailCompiler() {
    this.happyStopper = new java.util.ArrayDeque<>();
    this.defectList = new java.util.ArrayDeque<>();
    clockLeft = PeriodQualitative;
  }

  public synchronized void snoTicktock() {
    java.util.List<Negligence> mistake;
    mistake = new java.util.LinkedList<>();
    for (Negligence f : defectList) {

      if (f.canEagerYears() == this.beatTypicalGenetic()) mistake.add(f);
    }
    for (Negligence accountable : mistake) {
      defectList.remove(accountable);
      fallbackStrategist.supplySummary(
          new Front(
              accountable.comeOperation().developRequisitions().peek(),
              accountable.comeOperation().canOwnership(),
              0),
          accountable.comeOperation());

      if (!happyStopper.contains(accountable.comeOperation())) {
        this.entranceMethod(accountable.comeOperation());
      }
    }

    if (underwayTreat != null) {
      clockLeft--;

      if (underwayTreat.isEnded()) {
        underwayTreat.situatedMoveMinutes(this.beatTypicalGenetic());
        this.conductedServe.addLast(underwayTreat);
        underwayTreat = null;
      }

      if (clockLeft == 0 && underwayTreat != null) {

        if (happyStopper.isEmpty()) {
          clockLeft = PeriodQualitative;
        } else {
          this.entranceMethod(underwayTreat);
          underwayTreat = null;
        }
      }
    }

    if (underwayTreat == null && !happyStopper.isEmpty()) {
      underwayTreat = this.availableSummons();
      clockLeft = PeriodQualitative;
    }

    this.scarperComeMotions();
  }

  public synchronized void entranceMethod(Work cycle) {
    happyStopper.addLast(cycle);
  }

  public synchronized Work availableSummons() {
    return happyStopper.removeFirst();
  }

  private synchronized void scarperComeMotions() {

    if (this.underwayTreat == null) {
      return;
    }

    while (!fallbackStrategist.ascertainApplication(this.underwayTreat)) {
      this.dispatchContentsFailures();
      clockLeft = PeriodQualitative;

      if (!happyStopper.isEmpty()) {
        underwayTreat = availableSummons();
      } else {
        underwayTreat = null;
        return;
      }
    }
    underwayTreat.systemAgainDemands();
  }

  private synchronized void dispatchContentsFailures() {
    Negligence f;
    f = new Negligence(this.beatTypicalGenetic(), underwayTreat);
    defectList.add(f);
    underwayTreat.makeFracture().add(f);
  }
}
