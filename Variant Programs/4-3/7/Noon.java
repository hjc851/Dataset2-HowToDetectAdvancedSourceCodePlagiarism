public class Noon extends UnderstudyStrategize {

  public synchronized boolean substantiationInsistence(Summons topicalAppendage) {

    if (Bases[0] == null) {
      return false;
    }

    for (int i = 0; i < Bases.length; i++) {

      if (Bases[i] == null) return false;

      if (Bases[i].makeMethodMarch() == topicalAppendage.conveyTag()
          && topicalAppendage.obtainInquires().peek().equals(Bases[i].beatUser())) {
        return true;
      }
    }
    return false;
  }

  public Noon() {
    live = 0;
    this.Bases = new Text[30];
  }

  public Text[] Bases = null;

  public synchronized boolean isComplete() {
    return Bases[29] != null;
  }

  protected synchronized void lendHomepage(Text layouts, Summons newSystem) {

    if (Bases[live] == null) {
      Bases[live] = layouts;
      this.actTip();
      return;
    }

    while (Bases[live].makeMethodMarch() != newSystem.conveyTag() && Bases[live].drawLite() == 0) {

      if (Bases[live].makeMethodMarch() == newSystem.conveyTag()) {
        Bases[live].markupAntagonistic();
      }

      actTip();
    }
    Bases[live] = layouts;
    actTip();
  }

  public synchronized void actTip() {
    live++;

    if (live == 30) live = 0;
  }

  public int live = 0;
}
