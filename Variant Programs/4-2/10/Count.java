public class Count extends SubstitutionPolicies {
  private int former;
  private Tab[] Squares;

  public Count() {
    former = 0;
    this.Squares = new Tab[30];
  }

  protected void sumSite(Tab table, Appendage topicalAppendage) {

    if (Squares[former] == null) {
      Squares[former] = table;
      this.turnFlagship();
      return;
    }

    while (Squares[former].drawArithmeticPhase() != topicalAppendage.findIdentifier()
        && Squares[former].comeAnti() == 0) {

      if (Squares[former].drawArithmeticPhase() == topicalAppendage.findIdentifier()) {
        Squares[former].raiseCounteract();
      }

      turnFlagship();
    }
    Squares[former] = table;
    turnFlagship();
  }

  public boolean tabAsked(Appendage flowProcedures) {

    if (Squares[0] == null) {
      return false;
    }

    for (int i = 0; i < Squares.length; i++) {

      if (Squares[i] == null) return false;

      if (Squares[i].drawArithmeticPhase() == flowProcedures.findIdentifier()
          && flowProcedures.makeQueries().peek().equals(Squares[i].catchIbid())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Squares[29] != null;
  }

  private void turnFlagship() {
    former++;

    if (former == 30) former = 0;
  }
}
