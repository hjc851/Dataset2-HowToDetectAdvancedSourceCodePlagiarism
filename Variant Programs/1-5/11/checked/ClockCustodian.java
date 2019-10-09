package checked;

public class ClockCustodian {
  public static checked.ClockCustodian collaborativeJunctureJailer = null;

  public static synchronized checked.ClockCustodian fetchDivergentBeginningHousekeeper() {

    if (collaborativeJunctureJailer == null)
      collaborativeJunctureJailer = new checked.ClockCustodian();

    return collaborativeJunctureJailer;
  }

  public static synchronized double afootHours() {
    return fetchDivergentBeginningHousekeeper().sustainThisThing();
  }

  public static synchronized void arrangeYears(double objective) {
    fetchDivergentBeginningHousekeeper().derailTeam(objective);
  }

  public double liveDays = 0.0;

  public ClockCustodian() {
    this.liveDays = 0;
  }

  public synchronized double sustainThisThing() {
    return this.liveDays;
  }

  public synchronized void derailTeam(double objectives) {
    this.liveDays = objectives;
  }
}
