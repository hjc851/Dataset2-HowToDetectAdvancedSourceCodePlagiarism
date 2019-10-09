package disk;

public abstract class RallyHigh {
  public String media = null;
  public double moment = 0.0;

  public synchronized double when() {
    return this.moment;
  }

  public synchronized String pop() {
    return this.media;
  }
}
