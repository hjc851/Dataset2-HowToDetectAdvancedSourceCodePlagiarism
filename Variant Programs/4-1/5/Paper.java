public class Paper {
  private int user;
  private int getCycle;
  private int stem;

  public Paper(int self, int didacticSystem, int act) {
    this.user = self;
    this.getCycle = didacticSystem;
    this.stem = act;
  }

  public int conveyTag() {
    return user;
  }

  public int makeMethodMarch() {
    return getCycle;
  }

  public int sustainStop() {
    return stem;
  }

  public void stepFoil() {
    this.stem++;
  }

  public void restoreAntagonistic() {
    this.stem = 0;
  }
}
