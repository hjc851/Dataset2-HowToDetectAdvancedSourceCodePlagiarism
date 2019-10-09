package read;

public abstract class GalaTape {
  public double clock;

  public synchronized double periods() {
    return this.clock;
  }

  public String intelligence;

  public synchronized String learn() {
    return this.intelligence;
  }
}
