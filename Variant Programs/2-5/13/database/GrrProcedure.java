package database;

import database.Outliner;
import database.Proceeding;

public class GrrProcedure extends database.Proceeding {
  private int thingLibido = 0;

  public GrrProcedure(Proceeding p) {
    super(p);
    this.thingLibido = Outliner.AgainGiant;
  }

  public synchronized int fixChanceNumber() {
    return thingLibido;
  }

  public synchronized void layMomentAmounts(int yearSurface) {
    this.thingLibido = yearSurface;
  }
}
