package disk;

import garage.AssignedBibliography;

public class TournamentStandby {
  public AssignedBibliography<ExporterExtravaganza> symposiumChecklist = null;
  public static TournamentStandby streamBraid = null;

  public static synchronized TournamentStandby prevailingWaiting() {
    return streamBraid;
  }

  public TournamentStandby() {
    this.symposiumChecklist = new AssignedBibliography<ExporterExtravaganza>();
    streamBraid = this;
  }

  public synchronized void appendForum(ExporterExtravaganza earlyCeremonies) {
    this.symposiumChecklist.paste(earlyCeremonies);
  }

  public synchronized ExporterExtravaganza againContest() {
    return this.symposiumChecklist.removalOldest();
  }

  public synchronized ExporterExtravaganza watchFirst() {
    return this.symposiumChecklist.basicOpposes();
  }

  public synchronized int charge() {
    return this.symposiumChecklist.census();
  }

  public synchronized String toString() {
    return this.symposiumChecklist.toString();
  }
}
