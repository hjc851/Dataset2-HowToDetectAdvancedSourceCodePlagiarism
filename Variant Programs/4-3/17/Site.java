public class Site {
  private int picture;
  private int didacticSystem;
  private int play;

  public Site(int ownership, int antipyreticProcedures, int stem) {
    this.picture = ownership;
    this.didacticSystem = antipyreticProcedures;
    this.play = stem;
  }

  public synchronized int canOwnership() {
    return picture;
  }

  public synchronized int generateAllocateTreat() {
    return didacticSystem;
  }

  public synchronized int goAct() {
    return play;
  }

  public synchronized void markupAntagonistic() {
    this.play++;
  }

  public synchronized void rebootCounterpunch() {
    this.play = 0;
  }
}
