package memorialize;

public abstract class CommemorationHistory {

  public synchronized String learn() {
    return this.media;
  }

  protected double year = 0.0;

  public synchronized double when() {
    return this.year;
  }

  protected String media = null;
}
