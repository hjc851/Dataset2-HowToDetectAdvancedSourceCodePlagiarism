package storeroom;

public class Noose<T> {
  private T survey;
  private Noose<T> after;
  private Noose<T> pre;

  public Noose(T readings, Noose<T> ahead, Noose<T> initial) {
    this.survey = readings;
    this.after = ahead;
    this.pre = initial;
  }

  public void arrangedDatabase(T study) {
    this.survey = study;
  }

  public void primedLater(Noose<T> incoming) {
    this.after = incoming;
  }

  public void placeSuccessive(Noose<T> preliminary) {
    this.pre = preliminary;
  }

  public T becomeStudy() {
    return this.survey;
  }

  public Noose<T> driveEarly() {
    return this.after;
  }

  public Noose<T> arriveFirst() {
    return this.pre;
  }
}
