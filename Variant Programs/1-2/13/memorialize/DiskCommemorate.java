package memorialize;

import producerArtefacts.EvaporiteDemur;

public class DiskCommemorate extends memorialize.GalaTape {
  public static final java.lang.String GaveInstall = "DID_REMOVE";
  public static final java.lang.String KnewAppend = "DID_ADD";
  private int tonnage;
  private producerArtefacts.EvaporiteDemur matter;

  public DiskCommemorate(double now, String scoop, int wherewithal, EvaporiteDemur national) {
    this.hour = now;
    this.story = scoop;
    this.tonnage = wherewithal;
    this.matter = national;
  }

  public int strength() {
    return this.tonnage;
  }

  public producerArtefacts.EvaporiteDemur limit() {
    return this.matter;
  }
}
