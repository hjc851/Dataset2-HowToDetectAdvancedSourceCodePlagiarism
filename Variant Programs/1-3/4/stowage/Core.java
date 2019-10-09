package stowage;

public class Core<T> {
  private Core<T> past;
  private Core<T> come;
  private T readings;

  public Core(T reports, Core<T> the, Core<T> prior) {
    this.readings = reports;
    this.come = the;
    this.past = prior;
  }

  public synchronized void layAnalysis(T intelligence) {
    this.readings = intelligence;
  }

  public synchronized void orderedAgain(Core<T> following) {
    this.come = following;
  }

  public synchronized void situatedLatest(Core<T> pervious) {
    this.past = pervious;
  }

  public synchronized T haveStatistical() {
    return this.readings;
  }

  public synchronized Core<T> makeAdjacent() {
    return this.come;
  }

  public synchronized Core<T> fixRecord() {
    return this.past;
  }
}
