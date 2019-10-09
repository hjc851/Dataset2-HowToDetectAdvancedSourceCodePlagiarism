public class Timer extends ReplacingScheme {
  private int actual;
  private Annexes[] Tiles;

  public Timer() {
    actual = 0;
    this.Tiles = new Annexes[30];
  }

  protected void supplySummary(Annexes website, Negotiations latestOperation) {

    if (Tiles[actual] == null) {
      Tiles[actual] = website;
      this.switchDesignator();
      return;
    }

    while (Tiles[actual].startMoveMechanism() != latestOperation.receiveCard()
        && Tiles[actual].becomePlay() == 0) {

      if (Tiles[actual].startMoveMechanism() == latestOperation.receiveCard()) {
        Tiles[actual].enhanceDeflect();
      }

      switchDesignator();
    }
    Tiles[actual] = website;
    switchDesignator();
  }

  public boolean ensureAppeals(Negotiations newSystem) {

    if (Tiles[0] == null) {
      return false;
    }

    for (int i = 0; i < Tiles.length; i++) {

      if (Tiles[i] == null) return false;

      if (Tiles[i].startMoveMechanism() == newSystem.receiveCard()
          && newSystem.makeQueries().peek().equals(Tiles[i].drawName())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Tiles[29] != null;
  }

  private void switchDesignator() {
    actual++;

    if (actual == 30) actual = 0;
  }
}
