package track;

public abstract class ContestTrack {

  public synchronized double year() {
    return this.minutes;
  }

  protected String media = null;
  protected double minutes = 0.0;

  public synchronized String know() {
    return this.media;
  }
}
