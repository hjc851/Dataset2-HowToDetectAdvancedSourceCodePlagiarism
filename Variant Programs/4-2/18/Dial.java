public class Dial extends SubstituteStrategic {
  private int typical;
  private Tab[] Racks;

  public Dial() {
    typical = 0;
    this.Racks = new Tab[30];
  }

  protected void extendFolio(Tab section, Procedure afootSummons) {

    if (Racks[typical] == null) {
      Racks[typical] = section;
      this.proceedCursor();
      return;
    }

    while (Racks[typical].becomeInterruptMethodology() != afootSummons.generateIdem()
        && Racks[typical].takeBreak() == 0) {

      if (Racks[typical].becomeInterruptMethodology() == afootSummons.generateIdem()) {
        Racks[typical].enhanceDeflect();
      }

      proceedCursor();
    }
    Racks[typical] = section;
    proceedCursor();
  }

  public boolean testProposal(Procedure theMethodology) {

    if (Racks[0] == null) {
      return false;
    }

    for (int i = 0; i < Racks.length; i++) {

      if (Racks[i] == null) return false;

      if (Racks[i].becomeInterruptMethodology() == theMethodology.generateIdem()
          && theMethodology.makeQueries().peek().equals(Racks[i].catchIbid())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Racks[29] != null;
  }

  private void proceedCursor() {
    typical++;

    if (typical == 30) typical = 0;
  }
}
