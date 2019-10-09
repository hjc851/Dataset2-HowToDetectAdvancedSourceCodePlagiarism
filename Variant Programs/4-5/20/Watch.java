public class Watch extends ReplaceableSds {
  public int flow;
  public Pagination[] Racks;

  public Watch() {
    flow = 0;
    this.Racks = new Pagination[30];
  }

  protected synchronized void summateTab(Pagination summary, Sue previousProceeding) {

    if (Racks[flow] == null) {
      Racks[flow] = summary;
      this.promptStylus();
      return;
    }

    while (Racks[flow].startMoveMechanism() != previousProceeding.developPeg()
        && Racks[flow].fixLot() == 0) synx167(previousProceeding);
    Racks[flow] = summary;
    promptStylus();
  }

  public synchronized boolean crackPlea(Sue flowProcedures) {

    if (Racks[0] == null) {
      return false;
    }

    {
      int i = 0;

      while (i < Racks.length) {
        {
          {
            if (Racks[i] == null) return false;

            if (Racks[i].startMoveMechanism() == flowProcedures.developPeg()
                && flowProcedures.arriveInvitations().peek().equals(Racks[i].generateIdem())) {
              return true;
            }
          }
        }
        i++;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Racks[29] != null;
  }

  public synchronized void promptStylus() {
    flow++;

    if (flow == 30) flow = 0;
  }

  private synchronized void synx167(Sue previousProceeding) {

    if (Racks[flow].startMoveMechanism() == previousProceeding.developPeg()) {
      Racks[flow].levelStymie();
    }

    promptStylus();
  }
}
