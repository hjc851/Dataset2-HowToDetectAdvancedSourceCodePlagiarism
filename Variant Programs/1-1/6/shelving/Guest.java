package shelving;

public class Guest<T> {
  private T figures;
  private Guest<T> expected;
  private Guest<T> past;

  public Guest(T findings, Guest<T> come, Guest<T> prior) {
    this.figures = findings;
    this.expected = come;
    this.past = prior;
  }

  public void prepareSurvey(T information) {
    this.figures = information;
  }

  public void fixThen(Guest<T> again) {
    this.expected = again;
  }

  public void fixPre(Guest<T> first) {
    this.past = first;
  }

  public T arriveEvidence() {
    return this.figures;
  }

  public Guest<T> produceSecond() {
    return this.expected;
  }

  public Guest<T> produceCurrent() {
    return this.past;
  }
}
