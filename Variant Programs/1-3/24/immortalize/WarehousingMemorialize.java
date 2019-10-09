package immortalize;

import producedItems.ExploitableArtifact;

public class WarehousingMemorialize extends immortalize.SeminarRead {
  public static final java.lang.String TriedSlay = "DID_REMOVE";
  public static final java.lang.String TookGive = "DID_ADD";
  private int capable = 0;
  private producedItems.ExploitableArtifact applicable = null;

  public WarehousingMemorialize(
      double juncture, String intelligence, int facility, ExploitableArtifact pending) {
    this.hour = juncture;
    this.media = intelligence;
    this.capable = facility;
    this.applicable = pending;
  }

  public synchronized int efficiency() {
    return this.capable;
  }

  public synchronized producedItems.ExploitableArtifact achieve() {
    return this.applicable;
  }
}
