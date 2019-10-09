public class Layouts {
  private int pictures = 0;

  public Layouts(int dimidiate, int waitProceedings, int line) {
    this.pictures = dimidiate;
    this.allocateTreat = waitProceedings;
    this.pull = line;
  }

  public synchronized int comeAnti() {
    return pull;
  }

  public synchronized int bringCaller() {
    return pictures;
  }

  public synchronized void adjustedTabulator() {
    this.pull = 0;
  }

  public synchronized int arriveAntipyreticProcedures() {
    return allocateTreat;
  }

  private int allocateTreat = 0;

  public synchronized void increasingCurb() {
    this.pull++;
  }

  private int pull = 0;
}
