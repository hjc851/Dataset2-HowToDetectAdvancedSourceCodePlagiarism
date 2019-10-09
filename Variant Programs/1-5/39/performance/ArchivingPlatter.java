package performance;

import manufactureOrnaments.NeocomianElement;

public class ArchivingPlatter extends RallyHigh {
  public int efficiency;
  public NeocomianElement relate;

  public ArchivingPlatter(double juncture, String media, int power, NeocomianElement required) {
    this.when = juncture;
    this.intel = media;
    this.efficiency = power;
    this.relate = required;
  }

  public synchronized int capacitance() {
    return this.efficiency;
  }

  public static final String TriedLend = "DID_ADD";
  public static final String ManagedReinstall = "DID_REMOVE";

  public synchronized NeocomianElement butt() {
    return this.relate;
  }
}
