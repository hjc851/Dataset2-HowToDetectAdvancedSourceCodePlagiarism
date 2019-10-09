public class Contents {
  private int stem = 0;
  private int abortAppendage = 0;
  private int caller = 0;

  public Contents(int map, int apologeticMethod, int bar) {
    this.caller = map;
    this.abortAppendage = apologeticMethod;
    this.stem = bar;
  }

  public synchronized int bringCaller() {
    return caller;
  }

  public synchronized int catchAddSue() {
    return abortAppendage;
  }

  public synchronized int fixLot() {
    return stem;
  }

  public synchronized void increasesBuffet() {
    this.stem++;
  }

  public synchronized void rebootCounterpunch() {
    this.stem = 0;
  }
}
