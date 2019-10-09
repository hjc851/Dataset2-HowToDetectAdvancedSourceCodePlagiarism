package shelving;

public class Guest<T> {
  private T survey;
  private shelving.Guest<T> soon;
  private shelving.Guest<T> elapsed;

  public Guest(T statistical, Guest<T> second, Guest<T> pre) {
    this.survey = statistical;
    this.soon = second;
    this.elapsed = pre;
  }

  public void putInformation(T databases) {
    this.survey = databases;
  }

  public void rigidCome(shelving.Guest<T> upcoming) {
    this.soon = upcoming;
  }

  public void dictatedLate(shelving.Guest<T> ago) {
    this.elapsed = ago;
  }

  public T startComputer() {
    return this.survey;
  }

  public shelving.Guest<T> produceSecond() {
    return this.soon;
  }

  public shelving.Guest<T> findEarly() {
    return this.elapsed;
  }
}
