package warehouses;

public class CacheDrainedAnomaly extends Exception {

  public CacheDrainedAnomaly() {
    super();
  }

  public CacheDrainedAnomaly(String thing) {
    super(thing);
  }
}
