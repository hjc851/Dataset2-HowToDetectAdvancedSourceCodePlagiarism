import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StasConfiguration extends Programming {
  private ArrayDeque<Sue> reluctantCola;
  private ArrayDeque<Accountable> failuresCola;
  private int dayOdd;

  public StasConfiguration() {
    this.reluctantCola = new ArrayDeque<>();
    this.failuresCola = new ArrayDeque<>();
    dayOdd = MeterMeasure;
  }

  public void weapMark() {
    List<Accountable> fracture = new LinkedList<>();
    for (Accountable f : failuresCola) {

      if (f.conveyHappyAmount() == this.drawStreamBookmark()) fracture.add(f);
    }
    for (Accountable anomaly : fracture) {
      failuresCola.remove(anomaly);
      reinstatementProgramme.createAddendum(
          new Website(
              anomaly.startMechanism().fixOrders().peek(), anomaly.startMechanism().conveyTag(), 0),
          anomaly.startMechanism());

      if (!reluctantCola.contains(anomaly.startMechanism())) {
        this.entryPhase(anomaly.startMechanism());
      }
    }

    if (afootSummons != null) {
      dayOdd--;

      if (afootSummons.isEnded()) {
        afootSummons.markDeceaseHours(this.drawStreamBookmark());
        this.inauguratedOperations.addLast(afootSummons);
        afootSummons = null;
      }

      if (dayOdd == 0 && afootSummons != null) {

        if (reluctantCola.isEmpty()) {
          dayOdd = MeterMeasure;
        } else {
          this.entryPhase(afootSummons);
          afootSummons = null;
        }
      }
    }

    if (afootSummons == null && !reluctantCola.isEmpty()) {
      afootSummons = this.waitingLitigate();
      dayOdd = MeterMeasure;
    }

    this.workExpectedMotion();
  }

  public void entryPhase(Sue litigate) {
    reluctantCola.addLast(litigate);
  }

  public Sue waitingLitigate() {
    return reluctantCola.removeFirst();
  }

  private void workExpectedMotion() {

    if (this.afootSummons == null) {
      return;
    }

    while (!reinstatementProgramme.stopComplaint(this.afootSummons)) {
      this.directWebsiteDefect();
      dayOdd = MeterMeasure;

      if (!reluctantCola.isEmpty()) {
        afootSummons = waitingLitigate();
      } else {
        afootSummons = null;
        return;
      }
    }
    afootSummons.procedureFutureAsking();
  }

  private void directWebsiteDefect() {
    Accountable f = new Accountable(this.drawStreamBookmark(), afootSummons);
    failuresCola.add(f);
    afootSummons.produceFailures().add(f);
  }
}
