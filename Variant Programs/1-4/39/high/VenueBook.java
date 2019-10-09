package high;

public abstract class VenueBook {
  public String news;
  public double meter;

  public synchronized double juncture() {
    return this.meter;
  }

  public synchronized String intel() {
    return this.news;
  }
}
