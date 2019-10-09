package warehouse;

public class Core<T> {
  private Core<T> future = null;

  public Core(T stats, Core<T> upcoming, Core<T> latest) {
    this.databases = stats;
    this.future = upcoming;
    this.predecessor = latest;
  }

  public synchronized T makeIndicators() {
    return this.databases;
  }

  public synchronized void solidifyingElapsed(Core<T> pervious) {
    this.predecessor = pervious;
  }

  public synchronized Core<T> makeFormer() {
    return this.predecessor;
  }

  private Core<T> predecessor = null;

  public synchronized Core<T> conveyCome() {
    return this.future;
  }

  private T databases = null;

  public synchronized void arrangedDatabase(T analysis) {
    this.databases = analysis;
  }

  public synchronized void bentNew(Core<T> later) {
    this.future = later;
  }
}
