public class Frequency extends SuccessorPlan {
  private int typical;
  private Footnote[] Setups;

  public Frequency() {
    typical = 0;
    this.Setups = new Footnote[30];
  }

  protected void provideLayout(Footnote paper, Phase typicalProceedings) {

    if (Setups[typical] == null) {
      Setups[typical] = paper;
      this.pushHint();
      return;
    }

    while (Setups[typical].canGetCycle() != typicalProceedings.catchIbid()
        && Setups[typical].comeAnti() == 0) {

      if (Setups[typical].canGetCycle() == typicalProceedings.catchIbid()) {
        Setups[typical].raiseCounteract();
      }

      pushHint();
    }
    Setups[typical] = paper;
    pushHint();
  }

  public boolean chequePetitioning(Phase actualAct) {

    if (Setups[0] == null) {
      return false;
    }

    for (int i = 0; i < Setups.length; i++) {

      if (Setups[i] == null) return false;

      if (Setups[i].canGetCycle() == actualAct.catchIbid()
          && actualAct.bringQuest().peek().equals(Setups[i].haveHandle())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Setups[29] != null;
  }

  private void pushHint() {
    typical++;

    if (typical == 30) typical = 0;
  }
}
