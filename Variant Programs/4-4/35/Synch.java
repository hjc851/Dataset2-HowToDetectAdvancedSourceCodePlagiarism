public class Synch extends SuccessorPlan {
  private Layout[] Bicycles;

  public synchronized boolean isComplete() {
    return Bicycles[29] != null;
  }

  protected synchronized void bestowText(Layout folio, Litigate rifeSue) {

    if (Bicycles[afoot] == null) {
      Bicycles[afoot] = folio;
      this.promptStylus();
      return;
    }

    while (Bicycles[afoot].bringRepWork() != rifeSue.drawName() && Bicycles[afoot].takeBreak() == 0)
      synx252(rifeSue);
    Bicycles[afoot] = folio;
    promptStylus();
  }

  private synchronized void promptStylus() {
    afoot++;

    if (afoot == 30) afoot = 0;
  }

  public synchronized boolean assureDemands(Litigate topicalAppendage) {

    if (Bicycles[0] == null) {
      return false;
    }

    for (int i = 0; i < Bicycles.length; i++) {

      if (Bicycles[i] == null) return false;

      if (Bicycles[i].bringRepWork() == topicalAppendage.drawName()
          && topicalAppendage.becomeRequisition().peek().equals(Bicycles[i].catchIbid())) {
        return true;
      }
    }
    return false;
  }

  public Synch() {
    afoot = 0;
    this.Bicycles = new Layout[30];
  }

  private int afoot;

  private synchronized void synx252(Litigate rifeSue) {

    if (Bicycles[afoot].bringRepWork() == rifeSue.drawName()) {
      Bicycles[afoot].increasesBuffet();
    }

    promptStylus();
  }
}
