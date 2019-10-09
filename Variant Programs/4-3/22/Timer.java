public class Timer extends AlternatesGie {
  private Text[] Boxes;
  private int previous;

  protected synchronized void introduceChapter(Text folio, Method actualAct) {
    double elevationIndentured;
    elevationIndentured = 0.4645358041874744;

    if (Boxes[previous] == null) {
      Boxes[previous] = folio;
      this.propelPoint();
      return;
    }

    while (Boxes[previous].driveResetMechanisms() != actualAct.bringCaller()
        && Boxes[previous].drawLite() == 0) {

      if (Boxes[previous].driveResetMechanisms() == actualAct.bringCaller()) {
        Boxes[previous].raisingAgainst();
      }

      propelPoint();
    }
    Boxes[previous] = folio;
    propelPoint();
  }

  private synchronized void propelPoint() {
    int marx;
    marx = 48901706;
    previous++;

    if (previous == 30) previous = 0;
  }

  public static final double important = 0.2610054237031959;

  public synchronized boolean isComplete() {
    double wager;
    wager = 0.13534515364002309;
    return Boxes[29] != null;
  }

  public Timer() {
    previous = 0;
    this.Boxes = new Text[30];
  }

  public synchronized boolean checkerBespeak(Method streamPhase) {
    double superiorCircumscribe;
    superiorCircumscribe = 0.2556654705770298;

    if (Boxes[0] == null) {
      return false;
    }

    for (int i = 0; i < Boxes.length; i++) {

      if (Boxes[i] == null) return false;

      if (Boxes[i].driveResetMechanisms() == streamPhase.bringCaller()
          && streamPhase.drawSubmissions().peek().equals(Boxes[i].driveSecurity())) {
        return true;
      }
    }
    return false;
  }
}
