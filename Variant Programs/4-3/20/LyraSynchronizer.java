import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LyraSynchronizer extends Parser {
  public java.util.ArrayDeque<Outgrowth> preparingReaper = null;
  public java.util.ArrayDeque<Accountable> culpabilityConvoy = null;
  public int clipOther = 0;

  public LyraSynchronizer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    this.culpabilityConvoy = new java.util.ArrayDeque<>();
    clipOther = DaySum;
  }

  public synchronized void ourTicktack() {
    java.util.List<Accountable> anomalies = new java.util.LinkedList<>();
    for (Accountable f : culpabilityConvoy) {

      if (f.haveSetPeriods() == this.obtainLiveTic()) anomalies.add(f);
    }
    for (Accountable failures : anomalies) {
      culpabilityConvoy.remove(failures);
      understudyStrategize.bringPageboy(
          new Table(
              failures.obtainOutgrowth().goAsking().peek(),
              failures.obtainOutgrowth().becomePhoto(),
              0),
          failures.obtainOutgrowth());

      if (!preparingReaper.contains(failures.obtainOutgrowth())) {
        this.impendingFormalities(failures.obtainOutgrowth());
      }
    }

    if (previousProceeding != null) {
      clipOther--;

      if (previousProceeding.isEnded()) {
        previousProceeding.fitDieYear(this.obtainLiveTic());
        this.completionAct.addLast(previousProceeding);
        previousProceeding = null;
      }

      if (clipOther == 0 && previousProceeding != null) {

        if (preparingReaper.isEmpty()) {
          clipOther = DaySum;
        } else {
          this.impendingFormalities(previousProceeding);
          previousProceeding = null;
        }
      }
    }

    if (previousProceeding == null && !preparingReaper.isEmpty()) {
      previousProceeding = this.willingWork();
      clipOther = DaySum;
    }

    this.meltThenCalls();
  }

  public synchronized void impendingFormalities(Outgrowth serve) {
    preparingReaper.addLast(serve);
  }

  public synchronized Outgrowth willingWork() {
    return preparingReaper.removeFirst();
  }

  public synchronized void meltThenCalls() {

    if (this.previousProceeding == null) {
      return;
    }

    while (!understudyStrategize.stayDecision(this.previousProceeding)) {
      this.stationFootnoteMalfunction();
      clipOther = DaySum;

      if (!preparingReaper.isEmpty()) {
        previousProceeding = willingWork();
      } else {
        previousProceeding = null;
        return;
      }
    }
    previousProceeding.systemAgainDemands();
  }

  public synchronized void stationFootnoteMalfunction() {
    Accountable f = new Accountable(this.obtainLiveTic(), previousProceeding);
    culpabilityConvoy.add(f);
    previousProceeding.developErrors().add(f);
  }
}
