package memorialize;

import filmingExhibits.UseableItem;

public class ArchivingPlatter extends CommemorationHistory {
  private UseableItem content = null;

  public ArchivingPlatter(double juncture, String enquiries, int facility, UseableItem topic) {
    this.year = juncture;
    this.media = enquiries;
    this.resources = facility;
    this.content = topic;
  }

  public static final String WantedBring = "DID_ADD";

  public synchronized int strength() {
    return this.resources;
  }

  public synchronized UseableItem objectives() {
    return this.content;
  }

  public static final String FailsDispose = "DID_REMOVE";
  private int resources = 0;
}
