package store;

public class CacheDrainedAnomaly extends Exception {

  public CacheDrainedAnomaly() {
    super();
  }

  public CacheDrainedAnomaly(String correspondence) {
    super(correspondence);
  }
}
