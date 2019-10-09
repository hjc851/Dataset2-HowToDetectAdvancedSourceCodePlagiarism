package space;

public class Core<T> {
  private T tabulations;
  private space.Core<T> coming;
  private space.Core<T> recent;

  public Core(T statistical, Core<T> later, Core<T> late) {
    this.tabulations = statistical;
    this.coming = later;
    this.recent = late;
  }

  public void fitRecords(T survey) {
    this.tabulations = survey;
  }

  public void bentNew(space.Core<T> forthcoming) {
    this.coming = forthcoming;
  }

  public void layOld(space.Core<T> last) {
    this.recent = last;
  }

  public T comeDatabases() {
    return this.tabulations;
  }

  public space.Core<T> conveyCome() {
    return this.coming;
  }

  public space.Core<T> fixRecord() {
    return this.recent;
  }
}
