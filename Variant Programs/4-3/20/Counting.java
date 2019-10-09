public class Counting extends ReplaceableSds {
  public int continuing = 0;
  public Table[] Chassis = null;

  public Counting() {
    continuing = 0;
    this.Chassis = new Table[30];
  }

  protected synchronized void bringPageboy(Table section, Outgrowth typicalProceedings) {

    if (Chassis[continuing] == null) {
      Chassis[continuing] = section;
      this.switchDesignator();
      return;
    }

    while (Chassis[continuing].becomeInterruptMethodology() != typicalProceedings.becomePhoto()
        && Chassis[continuing].findBar() == 0) {

      if (Chassis[continuing].becomeInterruptMethodology() == typicalProceedings.becomePhoto()) {
        Chassis[continuing].trancheAnticipate();
      }

      switchDesignator();
    }
    Chassis[continuing] = section;
    switchDesignator();
  }

  public synchronized boolean stayDecision(Outgrowth streamPhase) {

    if (Chassis[0] == null) {
      return false;
    }

    for (int i = 0; i < Chassis.length; i++) {

      if (Chassis[i] == null) return false;

      if (Chassis[i].becomeInterruptMethodology() == streamPhase.becomePhoto()
          && streamPhase.goAsking().peek().equals(Chassis[i].generateIdem())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Chassis[29] != null;
  }

  public synchronized void switchDesignator() {
    continuing++;

    if (continuing == 30) continuing = 0;
  }
}
