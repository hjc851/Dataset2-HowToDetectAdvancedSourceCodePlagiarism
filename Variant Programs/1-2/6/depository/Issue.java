package depository;

public class Issue<T> {
  private T readings;
  private depository.Issue<T> forthcoming;
  private depository.Issue<T> pervious;

  public Issue(T indicators, Issue<T> third, Issue<T> preceding) {
    this.readings = indicators;
    this.forthcoming = third;
    this.pervious = preceding;
  }

  public void fixedStudy(T database) {
    this.readings = database;
  }

  public void fixThen(depository.Issue<T> succeeding) {
    this.forthcoming = succeeding;
  }

  public void readyFormer(depository.Issue<T> early) {
    this.pervious = early;
  }

  public T goInformation() {
    return this.readings;
  }

  public depository.Issue<T> developNew() {
    return this.forthcoming;
  }

  public depository.Issue<T> driveFinal() {
    return this.pervious;
  }
}
