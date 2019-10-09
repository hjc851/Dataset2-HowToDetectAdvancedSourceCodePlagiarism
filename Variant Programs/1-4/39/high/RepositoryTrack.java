package high;

import fabricationObstructions.PannonianMatter;

public class RepositoryTrack extends VenueBook {
  public PannonianMatter topics;
  public int efficiency;
  public static final String NeverAdditions = "DID_ADD";
  public static final String FiguredDismantle = "DID_REMOVE";

  public RepositoryTrack(double when, String story, int viability, PannonianMatter nonexempt) {
    this.meter = when;
    this.news = story;
    this.efficiency = viability;
    this.topics = nonexempt;
  }

  public synchronized int overcapacity() {
    return this.efficiency;
  }

  public synchronized PannonianMatter threshold() {
    return this.topics;
  }
}
