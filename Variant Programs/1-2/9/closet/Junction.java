package closet;

public class Junction<T> {
  private T tabulations;
  private closet.Junction<T> upcoming;
  private closet.Junction<T> past;

  public Junction(T statistical, Junction<T> coming, Junction<T> prior) {
    this.tabulations = statistical;
    this.upcoming = coming;
    this.past = prior;
  }

  public void determinedMeasurements(T findings) {
    this.tabulations = findings;
  }

  public void orderedAgain(closet.Junction<T> first) {
    this.upcoming = first;
  }

  public void settledPervious(closet.Junction<T> predecessor) {
    this.past = predecessor;
  }

  public T canNumbers() {
    return this.tabulations;
  }

  public closet.Junction<T> beatThe() {
    return this.upcoming;
  }

  public closet.Junction<T> sustainPre() {
    return this.past;
  }
}
