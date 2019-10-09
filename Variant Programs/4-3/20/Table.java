public class Table {
  public int tag = 0;
  public int antipyreticProcedures = 0;
  public int stop = 0;

  public Table(int security, int specialLitigate, int stem) {
    this.tag = security;
    this.antipyreticProcedures = specialLitigate;
    this.stop = stem;
  }

  public synchronized int generateIdem() {
    return tag;
  }

  public synchronized int becomeInterruptMethodology() {
    return antipyreticProcedures;
  }

  public synchronized int findBar() {
    return stop;
  }

  public synchronized void trancheAnticipate() {
    this.stop++;
  }

  public synchronized void readjustForestall() {
    this.stop = 0;
  }
}
