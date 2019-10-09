public class Noon extends RenewalTactic {
  private int prevailing;
  private Layouts[] Setups;

  public Noon() {
    prevailing = 0;
    this.Setups = new Layouts[30];
  }

  protected void injectLayouts(Layouts table, Outgrowth contemporaryLitigate) {

    if (Setups[prevailing] == null) {
      Setups[prevailing] = table;
      this.pushHint();
      return;
    }

    while (Setups[prevailing].canGetCycle() != contemporaryLitigate.receiveCard()
        && Setups[prevailing].comeAnti() == 0) {

      if (Setups[prevailing].canGetCycle() == contemporaryLitigate.receiveCard()) {
        Setups[prevailing].salarySideboard();
      }

      pushHint();
    }
    Setups[prevailing] = table;
    pushHint();
  }

  public boolean correspondRequisition(Outgrowth existingCycle) {

    if (Setups[0] == null) {
      return false;
    }

    for (int i = 0; i < Setups.length; i++) {

      if (Setups[i] == null) return false;

      if (Setups[i].canGetCycle() == existingCycle.receiveCard()
          && existingCycle.findBespeak().peek().equals(Setups[i].bringCaller())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Setups[29] != null;
  }

  private void pushHint() {
    prevailing++;

    if (prevailing == 30) prevailing = 0;
  }
}
