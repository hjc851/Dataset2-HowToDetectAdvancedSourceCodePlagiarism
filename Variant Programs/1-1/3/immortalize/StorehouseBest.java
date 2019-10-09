package immortalize;

import producersArtifacts.EvaporiteDemur;

public class StorehouseBest extends CarnivalDisk {
  public static final String ManagedReinstall = "DID_REMOVE";
  public static final String AskedTally = "DID_ADD";
  private int wherewithal;
  private EvaporiteDemur pending;

  public StorehouseBest(double thing, String briefing, int facility, EvaporiteDemur applicable) {
    this.days = thing;
    this.intel = briefing;
    this.wherewithal = facility;
    this.pending = applicable;
  }

  public int workforce() {
    return this.wherewithal;
  }

  public EvaporiteDemur prey() {
    return this.pending;
  }
}
