public class Count extends SuccessorPlan {
  public int previous = 0;
  public Pagination[] Racks = null;

  public Count() {
    previous = 0;
    this.Racks = new Pagination[30];
  }

  protected synchronized void impartWebsite(Pagination paper, Work streamPhase) {

    if (Racks[previous] == null) {
      Racks[previous] = paper;
      this.impressGauge();
      return;
    }

    while (Racks[previous].arriveAntipyreticProcedures() != streamPhase.comeMilad()
        && Racks[previous].catchChuck() == 0) {

      if (Racks[previous].arriveAntipyreticProcedures() == streamPhase.comeMilad()) {
        Racks[previous].raiseCounteract();
      }

      impressGauge();
    }
    Racks[previous] = paper;
    impressGauge();
  }

  public synchronized boolean substantiationInsistence(Work underwayTreat) {

    if (Racks[0] == null) {
      return false;
    }

    for (int i = 0; i < Racks.length; i++) {

      if (Racks[i] == null) return false;

      if (Racks[i].arriveAntipyreticProcedures() == underwayTreat.comeMilad()
          && underwayTreat.becomeRequisition().peek().equals(Racks[i].arriveIdentifying())) {
        return true;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Racks[29] != null;
  }

  public synchronized void impressGauge() {
    previous++;

    if (previous == 30) previous = 0;
  }
}
