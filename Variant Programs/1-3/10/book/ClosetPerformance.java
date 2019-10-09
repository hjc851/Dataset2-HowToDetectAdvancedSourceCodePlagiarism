package book;

import manufacturingPieces.PannonianMatter;

public class ClosetPerformance extends book.CommemorationHistory {
  public manufacturingPieces.PannonianMatter pertaining = null;
  public int facility = 0;
  public static final java.lang.String LikedProvide = "DID_ADD";
  public static final java.lang.String GotRid = "DID_REMOVE";

  public ClosetPerformance(double clip, String nicky, int throughput, PannonianMatter applicable) {
    this.minutes = clip;
    this.zip = nicky;
    this.facility = throughput;
    this.pertaining = applicable;
  }

  public synchronized int overcapacity() {
    return this.facility;
  }

  public synchronized manufacturingPieces.PannonianMatter pinpoint() {
    return this.pertaining;
  }
}
