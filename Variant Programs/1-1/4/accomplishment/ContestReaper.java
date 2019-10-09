package accomplishment;

import warehouses.SeparatedRoster;

public class ContestReaper {
  private static ContestReaper existingJunk;

  public static ContestReaper underwayPenis() {
    return existingJunk;
  }

  private SeparatedRoster<OutputCeremony> commemorationDirectory;

  public ContestReaper() {
    this.commemorationDirectory = new SeparatedRoster<OutputCeremony>();
    existingJunk = this;
  }

  public void encloseFestival(OutputCeremony untestedCarnival) {
    this.commemorationDirectory.inset(untestedCarnival);
  }

  public OutputCeremony earlyMeeting() {
    return this.commemorationDirectory.hitTop();
  }

  public OutputCeremony eyeUpcoming() {
    return this.commemorationDirectory.eldestMatter();
  }

  public int charge() {
    return this.commemorationDirectory.tabulation();
  }

  public String toString() {
    return this.commemorationDirectory.toString();
  }
}
