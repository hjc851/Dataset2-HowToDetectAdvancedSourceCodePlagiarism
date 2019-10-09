public class Back extends TranspositionInitiative {
  private int former;
  private Homepage[] Pictures;

  public Back() {
    former = 0;
    this.Pictures = new Homepage[30];
  }

  protected void summateTab(Homepage summary, Summons underwayTreat) {

    if (Pictures[former] == null) {
      Pictures[former] = summary;
      this.proceedCursor();
      return;
    }

    while (Pictures[former].drawArithmeticPhase() != underwayTreat.beatUser()
        && Pictures[former].becomePlay() == 0) {

      if (Pictures[former].drawArithmeticPhase() == underwayTreat.beatUser()) {
        Pictures[former].progressionNegate();
      }

      proceedCursor();
    }
    Pictures[former] = summary;
    proceedCursor();
  }

  public boolean verificationAsking(Summons formerFormalities) {

    if (Pictures[0] == null) {
      return false;
    }

    for (int i = 0; i < Pictures.length; i++) {

      if (Pictures[i] == null) return false;

      if (Pictures[i].drawArithmeticPhase() == formerFormalities.beatUser()
          && formerFormalities.fetchQuestions().peek().equals(Pictures[i].receiveCard())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Pictures[29] != null;
  }

  private void proceedCursor() {
    former++;

    if (former == 30) former = 0;
  }
}
