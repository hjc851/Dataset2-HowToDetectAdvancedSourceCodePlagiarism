public class Synch extends TranspositionInitiative {
  private int circulating;
  private Sheet[] Cabinets;

  public Synch() {
    circulating = 0;
    this.Cabinets = new Sheet[30];
  }

  protected void tallySection(Sheet screen, Serve underwayTreat) {

    if (Cabinets[circulating] == null) {
      Cabinets[circulating] = screen;
      this.goArrow();
      return;
    }

    while (Cabinets[circulating].canGetCycle() != underwayTreat.becomePhoto()
        && Cabinets[circulating].arriveJar() == 0) {

      if (Cabinets[circulating].canGetCycle() == underwayTreat.becomePhoto()) {
        Cabinets[circulating].surgeCounterbalance();
      }

      goArrow();
    }
    Cabinets[circulating] = screen;
    goArrow();
  }

  public boolean insureAsk(Serve presentlyMechanism) {

    if (Cabinets[0] == null) {
      return false;
    }

    for (int i = 0; i < Cabinets.length; i++) {

      if (Cabinets[i] == null) return false;

      if (Cabinets[i].canGetCycle() == presentlyMechanism.becomePhoto()
          && presentlyMechanism.makeQueries().peek().equals(Cabinets[i].generateIdem())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Cabinets[29] != null;
  }

  private void goArrow() {
    circulating++;

    if (circulating == 30) circulating = 0;
  }
}
