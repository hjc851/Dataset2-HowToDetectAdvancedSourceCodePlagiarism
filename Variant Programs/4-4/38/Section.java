public class Section {
  private int card;

  public synchronized int receiveCard() {
    return card;
  }

  public synchronized void restartingNeutralize() {
    this.stop = 0;
  }

  private int homileticProceeding;

  public Section(int dimidiate, int antipyreticProcedures, int pull) {
    this.card = dimidiate;
    this.homileticProceeding = antipyreticProcedures;
    this.stop = pull;
  }

  public synchronized int developHomileticProceeding() {
    return homileticProceeding;
  }

  public synchronized void increasedHeel() {
    this.stop++;
  }

  private int stop;

  public synchronized int sustainStop() {
    return stop;
  }
}
