package database;

import database.Organizer;
import database.Negotiations;

public class GrrProcedure extends database.Negotiations {
  private int weekVolume;

  public GrrProcedure(Negotiations p) {
    super(p);
    this.weekVolume = Organizer.BeginningMammoth;
  }

  public synchronized int catchWhenValue() {
    return weekVolume;
  }

  public synchronized void arrangedSentenceTeleportation(int clipQuantity) {
    this.weekVolume = clipQuantity;
  }
}
