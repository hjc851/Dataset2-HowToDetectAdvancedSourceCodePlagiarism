package disk;

public class Hitch<T> {
  private T stats;
  private Hitch<T> soon;
  private Hitch<T> original;

  public Hitch(T findings, Hitch<T> later, Hitch<T> ago) {
    this.stats = findings;
    this.soon = later;
    this.original = ago;
  }

  public void putInformation(T indicators) {
    this.stats = indicators;
  }

  public void settledFirst(Hitch<T> after) {
    this.soon = after;
  }

  public void arrangedEarly(Hitch<T> recent) {
    this.original = recent;
  }

  public T driveIntelligence() {
    return this.stats;
  }

  public Hitch<T> startForthcoming() {
    return this.soon;
  }

  public Hitch<T> makeFormer() {
    return this.original;
  }
}
